<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>果蔬地生产滴灌监控系统</title>
    <link rel="stylesheet" type="text/css" href="${csspath}/themes/black/easyui.css">  
    <link href="${csspath}/themes/icon.css" rel="stylesheet" type="text/css" />
    <script src="${jspath}/jquery-1.7.2.min.js" type="text/javascript"></script>
    <script src="${jspath}/jquery.easyui.min.js" type="text/javascript"></script>
    <link href="${csspath}/IndexCss.css" rel="stylesheet" type="text/css" />
    <link href="${csspath}/default.css" rel="stylesheet" type="text/css" />
    
    <script src="${jspath}/Charts/highcharts.js" type="text/javascript"></script>
    <script src="${jspath}/Charts/exporting.js" type="text/javascript"></script>
     <style type="text/css">
       p{
            line-height:150%;
        }
        .panel-title{
            text-align:center;
            font-size:14px;
            font-weight:bold;
            text-shadow:0 -1px rgba(0,0,0,0.3);
        }
        .datagrid-row,.datagrid-header-row{
            height:35px;
        }
        .datagrid-body td{  
            border-right:1px dotted transparent;  
            border-bottom:1px dotted transparent;  
        }  
    </style>
    <script>
        /* var data =     [
            {"productid":"FI-SW-01","productname":"Koi","unitcost":10.00,"status":"P","listprice":36.50,"attr1":"Large","itemid":"EST-1"},
            {"productid":"K9-DL-01","productname":"Dalmation","unitcost":12.00,"status":"P","listprice":18.50,"attr1":"Spotted Adult Female","itemid":"EST-10"},
            {"productid":"RP-SN-01","productname":"Rattlesnake","unitcost":12.00,"status":"P","listprice":38.50,"attr1":"Venomless","itemid":"EST-11"},
            {"productid":"RP-SN-01","productname":"Rattlesnake","unitcost":12.00,"status":"P","listprice":26.50,"attr1":"Rattleless","itemid":"EST-12"},
            {"productid":"RP-LI-02","productname":"Iguana","unitcost":12.00,"status":"P","listprice":35.50,"attr1":"Green Adult","itemid":"EST-13"},
            {"productid":"FL-DSH-01","productname":"Manx","unitcost":12.00,"status":"P","listprice":158.50,"attr1":"Tailless","itemid":"EST-14"},
            {"productid":"FL-DSH-01","productname":"Manx","unitcost":12.00,"status":"P","listprice":83.50,"attr1":"With tail","itemid":"EST-15"},
            {"productid":"FL-DLH-02","productname":"Persian","unitcost":12.00,"status":"P","listprice":23.50,"attr1":"Adult Female","itemid":"EST-16"},
            {"productid":"FL-DLH-02","productname":"Persian","unitcost":12.00,"status":"P","listprice":89.50,"attr1":"Adult Male","itemid":"EST-17"},
            {"productid":"AV-CB-01","productname":"Amazon Parrot","unitcost":92.00,"status":"P","listprice":63.50,"attr1":"Adult Male","itemid":"EST-18"}
        ]; */
         
        var dataEq = ${resultEqDto};
        $(function(){
             $('#ec').datagrid({
                data: dataEq
            }); 
        }); 
        
        function formatterdate(val, row) {
        	if(val==undefined){
        		return "";
        	}
        	var date = new Date(val.time);
            return date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate()+" "+ date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
        }
        
        function onSwitchAction(rowid,index){
        	$("#onswitch"+rowid).linkbutton({disabled:true});
        	$("#offswitch"+rowid).linkbutton({disabled:false});
        	$.post("${webcontext}/greenhouse/updateSwitchOnOff",{'equipmentId':rowid,'switchOnoff':1 },function(data){
        		alert("成功发送闭合指令!");
        	});
        }

        function offSwitchAction(rowid,index){
        	$("#onswitch"+rowid).linkbutton({disabled:false});
        	$("#offswitch"+rowid).linkbutton({disabled:true});
        	$.post("${webcontext}/greenhouse/updateSwitchOnOff",{'equipmentId':rowid,'switchOnoff':2 },function(data){
        		alert("成功发送断开指令!");
        	});
        }
        
        function rowformater(value,row,index)
        {
        	if(value == 2){
        		//当前状态为断开，显示闭合可用
        		return "<a href='javascript:void(0);' id=onswitch"+row.id+" class='startenablecls' onclick='onSwitchAction("+row.id+","+ index +");'>闭合</a>" 
        	     + "<a href='javascript:void(0);' id=offswitch"+row.id+"  class='stopdisablecls' onclick='offSwitchAction("+row.id+","+ index +");'>断开</a>";
        	}else{
        		return "<a href='javascript:void(0);' id=onswitch"+row.id+" class='startdisablecls' onclick='onSwitchAction("+row.id+","+ index +");'>闭合</a>" 
        	     + "<a href='javascript:void(0);' id=offswitch"+row.id+" class='stopenablecls' onclick='offSwitchAction("+row.id+","+ index +");'>断开</a>";
        	}
        	
        }
        
        //chart below
        
        $(function () {
        var dataList = ${resultDtoChart};	
        var xAxisList = ${xAxisList};
        $('#container').highcharts({
            title: {
                text: '实时温度监控',
                x: -20 //center
            },
            subtitle: {
                text: 'Source: GreenHouse.com',
                x: -20
            },
             /* xAxis: {
                categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
                    'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
            }, */
            xAxis: {
                categories: xAxisList
            }, 
            yAxis: {
                title: {
                    text: 'Temperature (°C)'
                },
                plotLines: [{
                    value: 0,
                    width: 1,
                    color: '#808080'
                }]
            },
            tooltip: {
                valueSuffix: '°C'
            },
            legend: {
                layout: 'vertical',
                align: 'right',
                verticalAlign: 'middle',
                borderWidth: 0
            },
            /* series: [{
                name: 'Tokyo',
                data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6]
            }, {
                name: 'New York',
                data: [-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5]
            }, {
                name: 'Berlin',
                data: [-0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0]
            }, {
                name: 'London',
                data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8]
            }] */
            
            series:dataList
        });
    });
        
        $(function(){
        	$('.startenablecls').linkbutton({text:'闭合',plain:true,iconCls:'icon-ok'});  
			$('.stopenablecls').linkbutton({text:'断开',plain:true,iconCls:'icon-cancel'}); 
			$('.startdisablecls').linkbutton({text:'闭合',plain:true,disabled:true,iconCls:'icon-ok'});  
			$('.stopdisablecls').linkbutton({text:'断开',plain:true,disabled:true,iconCls:'icon-cancel'}); 
        }); 
    </script>
</head>
<body>

<div region="north" border="true" style="background: #2E2528; height: 60px; width: 100%;float:left;overflow: hidden;">
        <div style="float: left;">
            <div style="float: left;">
                <span id="tit" style="float: left; padding: 10px; font-family: 幼圆; font-size: 24px; color: White;">果蔬地生产滴灌监控系统</span></div>
            
        </div>
        <!-- <div style="float: right; width: 255px; height: 85px; margin-top: -23px; overflow: hidden;">
                <iframe src="http://www.thinkpage.cn/weather/weather.aspx?uid=&cid=101010100&l=zh-CHS&p=CMA&a=1&u=C&s=31&m=1&x=1&d=0&fc=FFFFFF&bgc=&bc=&ti=1&in=1&li=2&ct=iframe"
                    frameborder="0" scrolling="no" width="300" height="90" allowtransparency="true">
                </iframe>
            </div>
            <div style="float: right; height: 20px; margin-right: 40px; padding-top: 15px; display:none;">
                <ul class="ui-skin-nav">
                    <li class="li-skinitem" title="blue"><span class="blue" rel="blue"></span></li>
                    <li class="li-skinitem" title="gray"><span class="gray" rel="gray"></span></li>
                    <li class="li-skinitem" title="pepper-grinder"><span class="pepper-grinder" rel="pepper-grinder">
                    </span></li>
                    <li class="li-skinitem" title="cupertino"><span class="cupertino" rel="cupertino"></span>
                    </li>
                    <li class="li-skinitem" title="sunny"><span class="sunny" rel="sunny"></span></li>
                </ul>
            </div> -->
    </div>

    <div class="easyui-tabs" data-options="fit:true,border:false,plain:true">
    
    
    
        <div title="实时监控" style="padding:10px">
        <iframe src="${webcontext}/greenhousemobile/equipmonitor" width="100%" id="ifrmid" height="100%">
        </iframe>
        </div>
        <div title="数据曲线" style="padding:10px">
           <div id="container" style="min-width: 310px; height: 350px; margin: 0 auto"></div>
        </div>
        
        <div title="设备控制" style="padding:10px">
             <table id="ec" title="设备控制" 
            data-options="singleSelect:true,border:false,fit:true,fitColumns:true,scrollbarSize:0" title="Load Data">  
        <thead>  
            
            <tr>  
                <th data-options="field:'id',hidden:true"></th>
                <th data-options="field:'equipSeq',width:25">编号</th>  
                <th data-options="field:'equipName',width:50,align:'left'">控制点</th>  
                <th data-options="field:'equipTypeText',width:50,align:'left'">设备类型</th>
                <th data-options="field:'monitorPointName',width:55,align:'left'">所属监测点</th>              
                <th data-options="field:'uploadDate',width:80,align:'left',formatter:formatterdate" >操作时间</th>
                <th data-options="field:'switchOnoff',width:130,align:'left',formatter:rowformater">控制操作</th>  
            </tr>
        </thead>  
    	</table>   
        </div>
        <div title="参数设置" style="padding:10px">
            <p>Perl is a family of high-level, general-purpose, interpreted, dynamic programming languages. The languages in this family include Perl 5 and Perl 6.</p>
            <p>Though Perl is not officially an acronym, there are various backronyms in use, such as: Practical Extraction and Reporting Language. Perl was originally developed by Larry Wall in 1987 as a general-purpose Unix scripting language to make report processing easier. Since then, it has undergone many changes and revisions.</p>
        </div>
    </div>
   
</body>    
</html>