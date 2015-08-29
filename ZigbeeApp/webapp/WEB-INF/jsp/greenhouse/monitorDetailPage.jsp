<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../include/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="keywords" content="jquery,ui,easy,easyui,web">
<meta name="description"
	content="easyui help you build your web page easily!">
<title>Insert title here</title>
<link href="${csspath}/easyui.css" rel="stylesheet" type="text/css"/>
<link href="${csspath}/icon.css" rel="stylesheet" type="text/css"/>
<style type="text/css">

td {
height： 24；
border:1px solid #fff;
word-warp:break-word;
color:#4d4c4c;
font-size:14px;
}

td.label {
width:85px;
text-align:right;
font-weight:bold;
}

a.l-btn span span.l-btn-text {
    font-size: 14px;
    font-weight:bold;
}

input.readonly {
background-color:#f2fcff;
width:85px;
}

div.panel-header {
text-align:center; 
}
</style>

<script src="${jspath}/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="${jspath}/jquery.easyui.min.js" type="text/javascript"></script>
<script type="text/javascript">
var refreshObj; //自动监听object

function autoRefreshData(){
	window.location.reload();
	refreshObj=setTimeout("autoRefreshData()",600000);//setTimeout会有一个返回值
}

setTimeout("autoRefreshData()",600000);

</script>

</head>

<body>
	<div class="easyui-panel" title="大棚监测点1实时监控" style="width:600px">
		<div style="padding:10px 60px 20px 60px">
			<form id="ff" method="post">
				<table cellpadding="5">
				<tr>
				<td colspan="2" style="text-align:center;padding:5px">
					<a href="javascript:void(0)" class="easyui-linkbutton" onclick="window.location.reload()" iconCls="icon-reload">刷新</a>
				</td>
				<td class="label">控制模式:</td>
				<td><core:if test="${dto.curMode==1}">自动</core:if><core:if test="${dto.curMode==2}">手动</core:if>
				</td>
				</tr>
				<tr>
					<td colspan="6" class="spliterInput_Line">
					  <img src="${imagepath}/spliterInfo_line_03_short.gif" />
					</td>
				</tr>
				<tr>
					<td class="label">测量温度:</td>
					<td><input type="text" readonly="readonly" class="readonly" value="${dto.airTemperatureValue}" /></td>
					<td class="label">测量湿度:</td>
					<td><input type="text" readonly="readonly" class="readonly" value="${dto.airWetnessValue}" /></td>
				</tr>
				<tr>
					<td class="label">光 照 度:</td>
					<td><input type="text" readonly="readonly" class="readonly" value="${dto.lightValue}" /></td>
					<td class="label">最后更新:</td>
					<td><input type="text" readonly="readonly" class="readonly" 
					value="<fmt:formatDate value='${dto.uploadDate}' pattern='MM-dd HH:mm:ss'/>"/></td>
				</tr>
				<tr>
					<td colspan="6" class="spliterInput_Line">
					  <img src="${imagepath}/spliterInfo_line_03_short.gif" />
					</td>
				</tr>
				<tr>
				<tr>
					<td colspan="2"  style="text-align:center;padding:5px">
					  <img id="light1Off" src="${imagepath}/circle_red.jpg" <core:if test="${dto.light1Onoff==1}">style="display:none;" </core:if>/>
					  <img id="light1On"  src="${imagepath}/circle_green.jpg" <core:if test="${dto.light1Onoff==2}">style="display:none;" </core:if>/>
					</td>
					<td colspan="2"  style="text-align:center;padding:5px">
					  <img id="lineLight2Off" src="${imagepath}/rec_red.jpg" <core:if test="${dto.lineLight2Onoff==1}">style="display:none;" </core:if>/>
					  <img id="lineLight2On" src="${imagepath}/rec_green.jpg" <core:if test="${dto.lineLight2Onoff==2}">style="display:none;" </core:if>/>
					</td>
				</tr>
				<tr>
				<td colspan="2" style="text-align:center;padding:5px">
					<a href="javascript:void(0)" class="easyui-linkbutton" onclick="changeLight1()" id="linklight1">闭合</a>
				</td>
				<td colspan="2" style="text-align:center;padding:5px">
					<a href="javascript:void(0)" class="easyui-linkbutton" onclick="changeLight2()" id="linklight2">断开</a>
				</td>
				</tr>
				</table>
				
			</form>
		</div>
	</div>
	
<script>
var light1Onoff = ${dto.light1Onoff};
var lineLight2Onoff = ${dto.lineLight2Onoff};

if(${dto.curMode==1}){
	$("#linklight1").linkbutton({disabled:true});
	$("#linklight2").linkbutton({disabled:true});
}

if(${dto.light1Onoff==1}){
	$("#linklight1").linkbutton({text:'断开',plain:false,iconCls:'icon-cancel'});
}else{
	$("#linklight1").linkbutton({text:'闭合',plain:false,iconCls:'icon-ok'});
}

if(${dto.lineLight2Onoff==1}){
	$("#linklight2").linkbutton({text:'断开',plain:false,iconCls:'icon-cancel'});
}else{
	$("#linklight2").linkbutton({text:'闭合',plain:false,iconCls:'icon-ok'});
}

function changeLight1(){
	var switchOnoff = 1;
	if(light1Onoff==1){
		$("#linklight1").linkbutton({text:'闭合',plain:false,iconCls:'icon-ok',disabled:true});
		switchOnoff = 2;
	}else{
		$("#linklight1").linkbutton({text:'断开',plain:false,iconCls:'icon-cancel',disabled:true});
		switchOnoff = 1;
	}
	$.post("${webcontext}/greenhouse/updateSwitchOnOff",{'equipmentId':'${dto.light1EquipId}','switchOnoff':switchOnoff},function(data){
		if(data =='success'){
			if(switchOnoff==2){
				$("#light1On").hide();
				$("#light1Off").show();
				$("#linklight1").linkbutton({disabled:false});
				light1Onoff = 2;
				alert("断开设备成功!");
			}else{
				$("#light1On").show();
				$("#light1Off").hide();
				$("#linklight1").linkbutton({disabled:false});
				light1Onoff = 1;
				alert("闭合设备成功!");
			}
		}else{
			if(switchOnoff==2){
				alert("断开设备失败!");
				$("#linklight1").linkbutton({text:'断开',plain:false,iconCls:'icon-cancel',disabled:false});
			}else{
				alert("闭合设备失败!");
				$("#linklight1").linkbutton({text:'闭合',plain:false,iconCls:'icon-ok',disabled:false});
			}
		}
	});
}

function changeLight2(){
	var switchOnoff2 = 1;
	if(lineLight2Onoff==1){
		$("#linklight2").linkbutton({text:'闭合',plain:false,iconCls:'icon-ok',disabled:true});
		switchOnoff2 = 2;
	}else{
		$("#linklight2").linkbutton({text:'断开',plain:false,iconCls:'icon-cancel',disabled:true});
		switchOnoff2 = 1;
	}
	$.post("${webcontext}/greenhouse/updateSwitchOnOff",{'equipmentId':'${dto.lineLight2EquipId}','switchOnoff':switchOnoff2},function(data){
		if(data =='success'){
			if(switchOnoff2==2){
				$("#lineLight2On").hide();
				$("#lineLight2Off").show();
				$("#linklight2").linkbutton({disabled:false});
				lineLight2Onoff = 2;
				alert("断开设备成功!");
			}else{
				$("#lineLight2On").show();
				$("#lineLight2Off").hide();
				$("#linklight2").linkbutton({disabled:false});
				lineLight2Onoff = 1;
				alert("闭合设备成功!");
			}
		}else{
			if(switchOnoff2==2){
				alert("断开设备失败!");
				$("#linklight2").linkbutton({text:'断开',plain:false,iconCls:'icon-cancel',disabled:false});
			}else{
				alert("闭合设备失败!");
				$("#linklight2").linkbutton({text:'闭合',plain:false,iconCls:'icon-ok',disabled:false});
			}
		}
	});
}

</script>
</body>
</html>