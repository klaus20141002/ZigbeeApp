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
select,input
{
font-size:1em;
} 

td {
height:24px;
border:1px solid #fff;
word-warp:break-word;
color:#4d4c4c;
font-size:24px;
}

td.label {
width:100px;
text-align:right;
font-weight:bold;
}

a.l-btn span span.l-btn-text {
    font-size: 24px;
    font-weight:bold;
}

input.readonly {
background-color:#f2fcff;
width:160px;
}

div.panel-header {
text-align:center; 
}

/********** #container **********/
#container {
	width: 700px;
	height: 540px;
	overflow: auto;
}

/********** #content **********/
#content {
	width: 872px;
	margin-left: 10px;
}

/********** .tag **********/
.tags {
}

.tag {
	width: 426px;
	height: 260px;
	overflow: hidden;
}

.tag_right {
	width: 300px;
	height: 500px;
	overflow: hidden;
	float: right;
}
.tag_right_1 {
	width: 300px;
	height: 100px;
	overflow: hidden;
	float: right;
}
.tag_right_2 {
	width: 300px;
	height: 300px;
	overflow: hidden;
	float: right;
}
.tag_right_3 {
	width: 300px;
	height: 100px;
	overflow: hidden;
	float: right;
}

.tag_left {
	float: left;
	width: 630px;
	height: 550px;
	overflow: hidden;
	border-right:1px solid #95B8E7 ; 
}
.tag_left_2 {
	float: left;
	height: 300px;
	width: 630px;
	overflow: hidden;
	border-bottom:1px solid #95B8E7 ;
	border-right:1px solid #95B8E7 ; 
}
.tag_left_3 {
	float: left;
	height: 250px;
	width: 630px;
	overflow: hidden;
	border-bottom:1px solid #95B8E7 ;
	padding-top:10px;
	padding-bottom:10px;
	border-right:1px solid #95B8E7 ; 
}

.tag .top,
.tag .bottom {
	width: 426px;
	height: 10px;
	font-size: 0px;
	overflow: hidden;
}

.tag .middle {
	width: 420px;
	height: 240px;
	margin-left: 3px;
	overflow: auto;
}

/********** .tag .title **********/
.tag .title {
	height: 20px;
	overflow: hidden;
}

.tag .title_l {
	float: left;
	margin-left: 10px !important;
	margin-left: 5px;
}

.tag .title_l img {
	font-size: 0px;
	vertical-align: middle;
}

.tag .title_l span {
	font-size: 14px;
	font-weight: bold;
	color: #05447a;
}

.tag .title_r {
	float: right;
	margin-right: 10px !important;
	margin-right: 5px;
}

.tag .title_r a {
	font-size: 13px;
	font-weight: bold;
	color: #333; 
	text-decoration: none;
}

.tag .title_r a:hover {
	text-decoration: underline;
}

</style>

<script src="${jspath}/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="${jspath}/jquery.easyui.min.js" type="text/javascript"></script>
<script src="${jspath}/Charts/highcharts.js" type="text/javascript"></script>
<script src="${jspath}/Charts/exporting.js" type="text/javascript"></script>
<script type="text/javascript">
var refreshObj; //自动监听object

function autoRefreshData(){
	window.location.reload();
	refreshObj=setTimeout("autoRefreshData()",600000);//setTimeout会有一个返回值
}

setTimeout("autoRefreshData()",600000);

</script>
<title>自动控制页面</title>
</head>

<body>
	<div class="easyui-panel" title="自动控制" style="width:985px; height:615px; ">
		<div style="padding:10px 10px 20px 10px">
		<div class="tag_left">
		<div class="tag_left_2">
			<div id="container" style="min-width: 310px; height: 300px; margin: 0 auto"></div>
			</div>
			<div class="tag_left_3">
			<form id="ff" method="post">
				<table cellpadding="5">
				<tr>
					<td class="label">测量温度</td>
					<td><input type="text" readonly="readonly" class="readonly" value="${dto.airTemperatureValue}" /></td>
					<td class="label">测量湿度</td>
					<td><input type="text" readonly="readonly" class="readonly" value="${dto.airWetnessValue}" /></td>
				</tr>
				<tr>
					<td class="label">光 照 度</td>
					<td><input type="text" readonly="readonly" class="readonly" value="${dto.lightValue}" /></td>
					<td class="label">最后更新</td>
					<td><input type="text" readonly="readonly" class="readonly" 
					value="<fmt:formatDate value='${dto.uploadDate}' pattern='MM-dd HH:mm:ss'/>"/></td>
				</tr>
				<tr>
					<td class="label">CO2  浓度</td>
					<td><input type="text" readonly="readonly" class="readonly" value="${dto.co2Value}" /></td>
				</tr>
				<tr>
					<td colspan="1"  style="text-align:center;">
					  <img id="light1Off" src="${imagepath}/light_off.jpg" <core:if test="${dto.light1Onoff==1}">style="display:none;" </core:if>/>
					  <img id="light1On"  src="${imagepath}/light_on.jpg" <core:if test="${dto.light1Onoff==2}">style="display:none;" </core:if>/>
					</td>
				</tr>
				</table>
			</form>
			</div>
		</div>
		<div class="tag_right">
			<div class="tag_right_1">
				<table cellpadding="5" style="float:right;">
				<tr>
					<td class="image"  style="text-align:center;padding:5px">
						<a href="${webcontext}/greenhousemobile/getSysConfigPage"><img id="linkConfigMode" src="${imagepath}/enter_config.jpg"/></a>
					</td>
				</tr>
				</table>
			</div>
			<div class="tag_right_2">
				<img src="${imagepath}/caomei-large.jpg"/>
			</div>
			<div class="tag_right_3">
				<table cellpadding="5" style="float:right;">
				<tr>
					<td class="image"  style="text-align:center;padding:5px">
						<a href="${webcontext}/greenhousemobile/toManualControlPage"><img id="linkManualMode" src="${imagepath}/enter_manual.jpg"/></a>
					</td>
				</tr>
				</table>
			</div>
			
		</div>
		</div>
	</div>
	
<script>

function changeLight1(){
	$("#linklight1").hide();
	$("#linklight3").show();
	//发送关灯命令
	//隐藏linklight1
	$.post("${webcontext}/greenhouse/updateSwitchOnOff",{'equipmentId':'${dto.light1EquipId}','switchOnoff':2},function(data){
		if(data =='success'){
			$("#linklight1").hide();
			$("#linklight3").hide();
			$("#linklight4").hide();
			$("#linklight2").show();
			alert("断开设备成功!");
		}else{
			$("#linklight2").hide();
			$("#linklight3").hide();
			$("#linklight4").hide();
			$("#linklight1").show();
			alert("断开设备失败!");
		}
	});
}

function changeLight2(){
	//发送开灯命令
	//隐藏linklight2
	$("#linklight2").hide();
	$("#linklight4").show();
	//发送关灯命令
	//隐藏linklight1
	$.post("${webcontext}/greenhouse/updateSwitchOnOff",{'equipmentId':'${dto.light1EquipId}','switchOnoff':1},function(data){
		if(data =='success'){
			$("#linklight2").hide();
			$("#linklight3").hide();
			$("#linklight4").hide();
			$("#linklight1").show();
			alert("闭合设备成功!");
		}else{
			$("#linklight1").hide();
			$("#linklight3").hide();
			$("#linklight4").hide();
			$("#linklight2").show();
			alert("闭合设备失败!");
		}
	});
}

function changeMode1(){
	$("#linkMode1").hide();
	$("#linkMode2").hide();
	$("#linkMode4").hide();
	$("#linkMode3").show();
	//改变模式为手动saveEquipSwitchSchedule
	$.post("${webcontext}/greenhouse/saveEquipSwitchSchedule",{'id':'${dto.curModeId}','curMode':2},function(data){
		if(data =='success'){
			$("#linkMode1").hide();
			$("#linkMode3").hide();
			$("#linkMode4").hide();
			$("#linkMode2").show();
			if(${dto.light1Onoff==1}){
				$("#linklight2").hide();
				$("#linklight3").hide();
				$("#linklight4").hide();
				$("#linklight1").show();
			}else{
				$("#linklight1").hide();
				$("#linklight3").hide();
				$("#linklight4").hide();
				$("#linklight2").show();
			}
		}else{
			$("#linkMode2").hide();
			$("#linkMode3").hide();
			$("#linkMode4").hide();
			$("#linkMode1").show();
			alert("调整模式失败!");
		}
	});
	//判断当前灯的onoff，隐藏和显示linklight1，2，3，4.
}

function changeMode2(){
	//改变模式为自动
	//前换到自动页面
	$("#linkMode1").hide();
	$("#linkMode2").hide();
	$("#linkMode3").hide();
	$("#linkMode4").show();
	//改变模式为手动saveEquipSwitchSchedule
	$.post("${webcontext}/greenhouse/saveEquipSwitchSchedule",{'id':'${dto.curModeId}','curMode':1},function(data){
		if(data =='success'){
			location.href = "${webcontext}/greenhousemobile/toAutoControlPage";
		}else{
			$("#linkMode1").hide();
			$("#linkMode3").hide();
			$("#linkMode4").hide();
			$("#linkMode2").show();
			alert("调整模式失败!");
		}
	});
}

$(function () {
    var dataList = ${resultDtoChart};	
    var xAxisList = ${xAxisList};
    $('#container').highcharts({
        title: {
            text: '实时温度监控',
            x: -20 //center
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
    
</script>
</body>
</html>