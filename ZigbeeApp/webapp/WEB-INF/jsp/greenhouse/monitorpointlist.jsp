<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="keywords" content="jquery,ui,easy,easyui,web">
<meta name="description" content="easyui help you build your web page easily!">
<title>web monitor</title>
<link href="${csspath}/easyui.css" rel="stylesheet" type="text/css">
<link href="${csspath}/icon.css" rel="stylesheet" type="text/css">
<script src="${jspath}/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="${jspath}/jquery.easyui.min.js" type="text/javascript"></script>
<script src="${jspath}/datagrid-detailview.js" type="text/javascript"></script>
<style type="text/css">
*{
	font-size:12px;
}
body {
    font-family:verdana,helvetica,arial,sans-serif;
    padding:20px;
    font-size:12px;
    margin:0;
}
h2 {
    font-size:18px;
    font-weight:bold;
    margin:0;
    margin-bottom:15px;
}
.demo-info{
	padding:0 0 12px 0;
}
.demo-tip{
	display:none;
}
</style>
</head>
<body>
<table id="tt" class="easyui-datagrid" style="width:900px;height:550px" url="${webcontext}/greenhouse/getPointJsonData" title="大棚监控列表" iconCls="icon-search"
rownumbers="false" pagination="true" singleSelect="true" toolbar="#tb">
<thead>
<tr>
	<th field="id" hidden="true"></th>
	<th field="equipmentId" width="80" align="left">设备ID</th>
	<th field="name" width="100" align="left">检测点名称</th>
	<th field="isOnline" width="40" align="center" formatter="onoffline">在线</th>
	<th field="airTemperatureValue" width="60" align="center">温度<br>-℃</th>
	<th field="airWetnessValue" width="60" align="center">湿度</br>-%RH</th>
	<th field="lightValue" width="60" align="center">光照</br>-Lux</th>
	<th field="cO2Value" width="60" align="center">CO2</br>-PPM</th>
	<th field="soilTemperatureValue" width="60" align="center">土壤温度</br>-Lux</th>
	<th field="soilWetnessValue" width="60" align="center">土壤水分</br>-%RH</th>
	<th field="uploadDate" width="140" formatter="formatterdate" align="center">更新时刻</th>
</tr>
</thead>
</table>
<div id="tb" style="padding:5px;height:auto">
	<div style="margin-bottom:5px">
		<a href="#" id="listenBtn" class="easyui-linkbutton" iconCls="icon-remove" plain="true">开始监听</a>
		<a href="#" id="stopListenBtn" class="easyui-linkbutton" iconCls="icon-no" plain="true" disabled="true">停止监听</a>
		<a href="#" id="manualRefreshBtn" class="easyui-linkbutton" iconCls="icon-reload" plain="true">手动刷新</a>
	</div>
</div>

<script type="text/javascript">
var islisten = 0; //是否自动监听，初始是0；
var refreshObj; //自动监听object

function autoRefreshData(){
	if(islisten==1){
		$('#tt').datagrid('reload');
		refreshObj=setTimeout("autoRefreshData()",10000);//setTimeout会有一个返回值
	}
}

function stopListen(){
	refreshObj && clearTimeout(refreshObj);//如果refreshObj 不是 null，NaN 就调用clearTime（refreshObj），则会终止
}

$('#listenBtn').click(
		function(){
			if(islisten==0){
				//开始监听
				islisten = 1;
				$('#listenBtn').linkbutton('disable'); 
				$('#stopListenBtn').linkbutton('enable');
				autoRefreshData();
			}
		}
);

$('#stopListenBtn').click(
		function(){
			var listenBtn = $('#listenBtn');
			if(islisten==1){
				//停止监听
				islisten = 0;
				$('#stopListenBtn').linkbutton('disable');
				$('#listenBtn').linkbutton('enable'); 
				stopListen();
			}
		}
);

$('#manualRefreshBtn').click(
		function(){
			if($(this).linkbutton('options').disabled){
				return false;
			}
			$('#tt').datagrid('reload');
		}
);

function changeP(){
	var dg = $('#tt');
	dg.datagrid('loadData',[]);
	dg.datagrid({pagePosition:'bottom'});
		
	var p = $('#tt').datagrid('getPager'); 
	p.pagination({
	layout:['list','sep','first','prev','sep','manual','sep','next','last','sep','refresh'],
	pageSize: 10,//每页显示的记录条数，默认为10  
	pageList: [5, 10, 15],//可以设置每页记录条数的列表  
	beforePageText: '第',//页数文本框前显示的汉字  
	afterPageText: '页    共 {pages} 页',  
	displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录' 
	});
}

function formatterdate(val, row) {
	if(val==undefined){
		return "";
	}
	var date = new Date(val);
    return date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + " "+ date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
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
	
function onoffline(value,row,index)
{
	return "YES";
}

//
function onSwitchAction(rowid,index){
	$("#onswitch"+rowid).linkbutton({disabled:true});
	$("#offswitch"+rowid).linkbutton({disabled:false});
	$.post("${webcontext}/greenhouse/updateSwitchOnOff",{'equipmentId':rowid,'switchOnoff':1 },function(data){
		if(data =='success'){
			
			alert("打开设备成功!");
		}else{
			alert("打开设备失败!");
			$("#onswitch"+rowid).linkbutton({disabled:false});
			$("#offswitch"+rowid).linkbutton({disabled:true});
		}
	});
}

function offSwitchAction(rowid,index){
	$("#onswitch"+rowid).linkbutton({disabled:false});
	$("#offswitch"+rowid).linkbutton({disabled:true});
	$.post("${webcontext}/greenhouse/updateSwitchOnOff",{'equipmentId':rowid,'switchOnoff':2 },function(data){
		if(data =='success'){
			
			alert("关闭设备成功!");
			
		}else{
			alert("关闭设备失败!");
			$("#onswitch"+rowid).linkbutton({disabled:true});
			$("#offswitch"+rowid).linkbutton({disabled:false});
		}
	});
}

function getSelected(){
	var row = $('#tt').datagrid('getSelected');
	if (row){
		alert(row.id+":"+row.equipmentId+":");
	}
}
	
$(function(){
	//changeP();
	//$('#tt').datagrid({onSelect : getSelected});
});
</script>
 <script type="text/javascript">
$(function(){
	$('#tt').datagrid({
		view: detailview,
		detailFormatter:function(index,row){
			return '<div style="padding:2px"><table class="ddv"></table></div>';
		},
		onExpandRow: function(index,row){
			var ddv = $(this).datagrid('getRowDetail',index).find('table.ddv');
			ddv.datagrid({
				url:'${webcontext}/greenhouse/getEquipSubJson?equipmentId='+row.id,
				fitColumns:true,
				singleSelect:true,
				rownumbers:false,
				loadMsg:'',
				height:'auto',
				columns:[[
					{field:'id',hidden:true},
					{field:'equipCode',title:'设备ID',width:80,align:'center'},
					{field:'equipSeq',title:'编号',width:60,align:'center'},
					{field:'equipName',title:'控制点名称',width:100,align:'center'},
					{field:'equipTypeText',title:'设备类型',width:80,align:'center'},
					{field:'isOnline',title:'在线',width:60,align:'center',formatter:onoffline},
					{field:'uploadDate',title:'更新时刻',width:120,align:'center',formatter:formatterdate},
					{field:'switchOnoff',title:'控制操作',width:100,align:'center',formatter:rowformater}
				]],
				onResize:function(){
					$('#tt').datagrid('fixDetailRowHeight',index);
				},
				onLoadSuccess:function(){
					$('.startenablecls').linkbutton({text:'闭合',plain:true,iconCls:'icon-ok'});  
					$('.stopenablecls').linkbutton({text:'断开',plain:true,iconCls:'icon-cancel'}); 
					$('.startdisablecls').linkbutton({text:'闭合',plain:true,disabled:true,iconCls:'icon-ok'});  
					$('.stopdisablecls').linkbutton({text:'断开',plain:true,disabled:true,iconCls:'icon-cancel'}); 
					setTimeout(function(){
						$('#tt').datagrid('fixDetailRowHeight',index);
					},0);
				}
			});
			$('#tt').datagrid('fixDetailRowHeight',index);
		},
		onLoadSuccess:function(data){  
			
	    } 
		
	});
	//var dg = $('#tt');
	//dg.datagrid({pagePosition:'bottom'});
		
	var p = $('#tt').datagrid('getPager'); 
	p.pagination({
	layout:['list','sep','first','prev','sep','manual','sep','next','last','sep','refresh'],
	pageSize: 10,//每页显示的记录条数，默认为10  
	pageList: [5, 10, 15],//可以设置每页记录条数的列表  
	beforePageText: '第',//页数文本框前显示的汉字  
	afterPageText: '页    共 {pages} 页',  
	displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录' 
	});
	//changeP();
});
</script>
</body>
</html>