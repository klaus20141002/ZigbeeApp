<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
    <link rel="stylesheet" type="text/css" href="${csspath}/themes/black/easyui.css">  
    <link href="${csspath}/themes/icon.css" rel="stylesheet" type="text/css" />
    <script src="${jspath}/jquery-1.7.2.min.js" type="text/javascript"></script>
    <script src="${jspath}/jquery.easyui.min.js" type="text/javascript"></script>
    <link href="${csspath}/IndexCss.css" rel="stylesheet" type="text/css" />
    <link href="${csspath}/default.css" rel="stylesheet" type="text/css" />
    
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
            border-right:1px dotted;  
            border-bottom:1px dotted;  
            border-color: #222;
        }  
    </style>
    <script>
        var data = ${resultDto};
        $(function(){
            $('#dg').datagrid({
                data: data
            });
        }); 
        
        function formatterdate(val, row) {
        	if(val==undefined){
        		return "";
        	}
        	var date = new Date(val.time);
            return date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate()+" "+ date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
        }
        
        function reloadSelf() {
        	parent.document.getElementById('equipmonitorfr').src='${webcontext}/greenhousemobile/equipmonitor';
        }
        setInterval(reloadSelf,10000);
    </script>
</head>
<body>

       <table id="dg" title="数据监控"  
            data-options="singleSelect:true,border:false,fit:true,fitColumns:true,scrollbarSize:0" title="Load Data">  
        <thead>  
            <tr>  
                <th data-options="field:'name',width:100">检测点</th>  
                <th data-options="field:'airTemperatureValue',width:60,align:'left'">温度<br>(℃ )</th>  
                <th data-options="field:'airWetnessValue',width:60,align:'left'">湿度<br>(%RH)</th>  
                <th data-options="field:'lightValue',width:50,align:'left'">光照<br>(Lux)</th>  
                <th data-options="field:'uploadDate',width:170,align:'left',formatter:formatterdate" >上传时间</th>  
            </tr>
        </thead>  
    	</table>  
</body>    
</html>