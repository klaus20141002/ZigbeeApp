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
.input_tab .spliterInput_Line {
    height:15px;
	
	text-align:center;
}
.input_tab .spliterInput_Line img { cursor:auto;}

.info_tab .spliterInfo_Line {
    height:15px;
	
	text-align:center;
}
.info_tab .spliterInfo_Line img { cursor:auto; }
.block_div .spliterInput_Line {
	height:15px;
	text-align:center;
	}
.block_div .spliterInput_Line img { cursor:auto; }
</style>
</head>
<body>
	<div class="easyui-panel" title="${dto.cfgTypeText}边界值设置" style="width: 870px">
		<div style="padding: 10px 10px 10px 10px">
			<form id="ff" method="post">
				<table cellpadding="5">
					<tr>
						<th>小时 </th>
						<th>分 </th>
						<th>设定值 </th>
					</tr>
					<core:forEach items = "${dto.itemList}" var="item" varStatus="vs">
					<tr>
					<td>
						<input type="hidden" name="itemList[${vs.index}].id" id="itemList_${vs.index}_id" value="${item.id}"></input>
						<input class="easyui-numberspinner" data-options="min:0,max:23,required:true" style="width:80px;" 
						name="itemList[${vs.index}].cfgHour" id="itemList_${vs.index}_cfgHour" value="${item.cfgHour}"></input>
					</td>
					<td>
						<input class="easyui-numberspinner" data-options="min:0,max:59,required:true" style="width:80px;" 
						name="itemList[${vs.index}].cfgMinute" id="itemList_${vs.index}_cfgMinute" value="${item.cfgMinute}"></input>
					</td>
					<td>
						<input class="easyui-numberspinner" data-options="min:0,max:100,required:true" style="width:80px;" 
						name="itemList[${vs.index}].cfgValue"  id="itemList_${vs.index}_cfgValue" value="${item.cfgValue}"></input>
					</td>
					</tr>
					</core:forEach>
					<tr>
					<td colspan="8" >
					<font size="1" color="red">光照设定值说明：大灯+条带灯的组合值，共四个值0-大灯断开/条带灯断开，
					1-大灯断开/条带灯闭合，10-大灯闭合/条带灯断开，11-大灯闭合/条带灯闭合</font>
					</td>
				  	</tr>
				  	<tr>
					<td colspan="8" class="spliterInput_Line">
					  <img src="${imagepath}/spliterInput_line_03.gif" />
					</td>
					</tr>
				</table>
				<table cellpadding="6">
					<tr>
					<td style="width:80px;">
					
					<input type="hidden" name="cfgType" id="cfgType" value="${dto.cfgType}"></input>
					<input type="hidden" name="constantId" id="constantId" value="${dto.constantId}"></input>
					<input type="hidden" name="triggerModeId" id="triggerModeId" value="${dto.triggerModeId}"></input>
					<input type="hidden" name="isConstant" id="isConstant" value="${dto.isConstant}"></input>
					<input type="checkbox" name="isConstantCheck" id="isConstantCheck" value="1" <core:if test="${dto.isConstant==1}"> checked="checked" </core:if>/>恒定控制
					</td>
					<td><label>恒定值： </label></td>
					<td>
						<input class="easyui-numberspinner" data-options="min:0,max:100,required:true" style="width:80px;" 
						name="constantValue" id="constantValue" value="${dto.constantValue}"></input>
					</td>
					</tr>
					<tr>
					<td><label>浮动区间： </label></td>
					<td>
						<input class="easyui-numberspinner" data-options="min:0,max:100,required:true" style="width:80px;" 
						name="region" id="region" value="${dto.region}"></input>
					</td>
					</tr>
				</table>
			</form>
			<div style="text-align:center; margin: 20px 0;">
				<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">参数设置</a> 
				<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
			</div>
		</div>
	</div>
<script>
	$('#ff').form({   
		url:"${webcontext}/greenhouse/saveThresholdConfig",   
		onSubmit: function(){   
			// 做某些检查   
	        // 返回 false 来阻止提交   
	    },   
		success:function(data){  
			$('#ff').form('load', data);
			alert("保存成功");   
		}   
	});

	$(function(){
		$("#isConstantCheck").click(
		function(){
			if($(this).attr("checked")){
				$("#isConstant").val(1);
			}else{
				$("#isConstant").val(0);
			}
		}		
		);
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