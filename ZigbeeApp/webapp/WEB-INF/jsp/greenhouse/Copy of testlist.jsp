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
<table id="tt" class="easyui-datagrid" style="width:900px;height:550px" url="${webcontext}/greenhouse/getJsonData" title="大棚监控列表" iconCls="icon-search"
rownumbers="false" pagination="true" singleSelect="true" toolbar="#tb">
<thead>
<tr>
	<th field="id" hidden="true"></th>
	<th field="equipmentId" width="80" align="left">设备ID</th>
	<th field="name" width="100" align="left">检测点名称</th>
	<th field="usage" width="40" align="center" formatter="onoffline">在线</th>
	<th field="temperatureValue" width="60" align="center">温度<br>-℃</th>
	<th field="temperatureValue" width="60" align="center">湿度</br>-%RH</th>
	<th field="temperatureValue" width="60" align="center">光照</br>-Lux</th>
	<th field="temperatureValue" width="60" align="center">CO2</br>-PPM</th>
	<th field="temperatureValue" width="60" align="center">土壤温度</br>-Lux</th>
	<th field="temperatureValue" width="60" align="center">土壤水分</br>-%RH</th>
	<th field="uploadDate" width="140" formatter="formatterdate" align="center">更新时刻</th>
</tr>
</thead>
</table>
<div id="tb" style="padding:5px;height:auto">
	<div style="margin-bottom:5px">
		<a href="#" id="listenBtn" class="easyui-linkbutton" iconCls="icon-remove" plain="true">开始监听</a>
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
			var listenBtn = $('#listenBtn');
			if(islisten==1){
				//停止监听
				islisten = 0;
				listenBtn.linkbutton({text:'开始监听',plain:true,iconCls:'icon-remove'}); 
				$('#manualRefreshBtn').linkbutton({disabled:true});
				stopListen();
			}else{
				//开始监听
				islisten = 1;
				listenBtn.linkbutton({text:'停止监听',plain:true,iconCls:'icon-no'}); 
				$('#manualRefreshBtn').linkbutton({disabled:false});
				autoRefreshData();
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
	pageSize: 5,//每页显示的记录条数，默认为10  
	pageList: [5, 10, 15],//可以设置每页记录条数的列表  
	beforePageText: '第',//页数文本框前显示的汉字  
	afterPageText: '页    共 {pages} 页',  
	displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录' 
	});
}

function formatterdate(val, row) {
	var date = new Date(val);
    return date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + " "+ date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
}

function rowformater(value,row,index)
{
	return "<a href='javascript:void(0);' class='startcls' onclick='startAction("+row.id+")'>闭合</a>" 
	     + "<a href='javascript:void(0);' class='stopcls' onclick='alert("+ row.id+");'>断开</a>";
}
	
function onoffline(value,row,index)
{
	return "YES";
}

function startAction(row){
	alert(row);
}

function getSelected(){
	var row = $('#tt').datagrid('getSelected');
	if (row){
		alert(row.id+":"+row.equipmentId+":");
	}
}
	
$(function(){
	changeP();
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
				url:'${webcontext}/greenhouse/getSubJson?equipmentId='+row.id,
				fitColumns:true,
				singleSelect:true,
				rownumbers:false,
				loadMsg:'',
				height:'auto',
				columns:[[
					{field:'id',hidden:true},
					{field:'equipmentId',title:'设备ID',width:80,align:'right'},
					{field:'port',title:'编号',width:60,align:'right'},
					{field:'name',title:'控制点名称',width:100,align:'right'},
					{field:'usage',title:'设备类型',width:80,align:'right'},
					{field:'wetnessValue',title:'在线',width:60,align:'right',formatter:onoffline},
					{field:'uploadDate',title:'更新时刻',width:120,align:'right',formatter:formatterdate},
					{field:'haha',title:'控制操作',width:100,align:'center',formatter:rowformater}
				]],
				onResize:function(){
					$('#tt').datagrid('fixDetailRowHeight',index);
				},
				onLoadSuccess:function(){
					$('.startcls').linkbutton({text:'闭合',plain:true,iconCls:'icon-ok'});  
					$('.stopcls').linkbutton({text:'断开',plain:true,iconCls:'icon-cancel'});  
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
});
</script>
</body>
</html>