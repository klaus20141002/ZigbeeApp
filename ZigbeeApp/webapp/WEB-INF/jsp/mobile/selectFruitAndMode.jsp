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
width:160px;
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
</style>

<script src="${jspath}/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="${jspath}/jquery.easyui.min.js" type="text/javascript"></script>
<script src="${jspath}/grayscale.js" type="text/javascript"></script>

<script type="text/javascript">

</script>

</head>

<body>
	<div class="easyui-panel" title="选择大棚和模式" style="width:985px; height:560px; ">
		<div style="padding:60px 60px 60px 60px">
			<form id="ff" method="post">
				<table cellpadding="5">
				<tr>
					<td class="image"  style="text-align:center;padding:5px 60px;">
					<a href="#">
						<img id="caomei" src="${imagepath}/caomei.jpg"/>
					</a>
					</td>
					<td class="image"  style="text-align:center;padding:5px 60px;">
						<img id="xigua" src="${imagepath}/xigua_gray.jpg"/>
					</td>
					<td class="image"  style="text-align:center;padding:5px 60px;">
						<img id="xihongshi" src="${imagepath}/xihongshi_gray.jpg"/>
					</td>
				</tr>
				<tr>
					<td class="image"  style="text-align:center;padding:5px 60px;">
						<img id="putao" src="${imagepath}/putao_gray.jpg"/>
					</td>
				</tr>
				<tr>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td class="image"  style="text-align:center;padding:5px">
					<a href="javascript:void(0)">
						<img id="linklight1" onclick="changeLight1()" src="${imagepath}/btn_auto.jpg"/>
					  	<img id="linklight2" onclick="changeLight2()" src="${imagepath}/btn_manual.jpg"  style="display:none;"/>
					</a>
					</td>
				</tr>
				</table>
			</form>
		</div>
	</div>
	
<script>
var controlMode = 1;//自动控制
function changeLight1(){
	$("#linklight1").hide();
	$("#linklight2").show();
	controlMode=2;
}

function changeLight2(){
	$("#linklight2").hide();
	$("#linklight1").show();
	controlMode=1;
}

$(function(){
	$("#caomei").click(
		function(){
			if(controlMode==1){
				location.href = "${webcontext}/greenhousemobile/toAutoControlPage";
			}else{
				location.href = "${webcontext}/greenhousemobile/toManualControlPage";
			}
		}
	);
	
	
});
</script>
</body>
</html>