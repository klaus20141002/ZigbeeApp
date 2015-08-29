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
<script src="${jspath}/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="${jspath}/jquery.easyui.min.js" type="text/javascript"></script>
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
font-size:20px;
}

td.label {
width:160px;
text-align:right;
font-weight:bold;
}

a.l-btn span span.l-btn-text {
    font-size: 20px;
    font-weight:bold;
}

input.readonly {
background-color:#f2fcff;
width:160px;
}

div.panel-header {
text-align:center; 
font-size: 20px;
}

.panel-title {
    font-size: 20px;
}

</style>

</head>

<body>
	<div class="easyui-panel" title="" style="width:400px">
		<div style="padding:10px 60px 20px 60px">
			<form id="ff" method="post">
				<table cellpadding="5">
				<tr>
					<td>
					<input type="hidden" name="id" id="id" value="${dto.id}">
					自动控制<input type="radio" id="curMode" name="curMode" value="1" <core:if test="${dto.curMode==1}">checked="true"</core:if> />
					手动控制<input type="radio" id="curMode" name="curMode" value="2" <core:if test="${dto.curMode==2}">checked="true"</core:if> /></td>
				</tr>
				<tr>
				<td>
				<div style="text-align:center;padding:5px">
					<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
				</div>
				</td>
				</tr>
				</table>
			</form>
		</div>
	</div>
	
<script>
$('#ff').form({   
	url:"${webcontext}/greenhouse/saveEquipSwitchSchedule",   
	onSubmit: function(){   
		// 做某些检查   
        // 返回 false 来阻止提交   
    },   
	success:function(data){  
		$('#ff').form('load', data);
		alert("保存成功");   
	}   
});

function submitForm(){
	$('#ff').submit();  
}
function clearForm(){
	$('#ff').form('clear');
}
</script>
</body>
</html>