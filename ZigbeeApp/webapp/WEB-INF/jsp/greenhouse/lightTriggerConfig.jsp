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
	<div class="easyui-panel" title="关照度-时间-传感器  边界值设置" style="width: 870px">
		<div style="padding: 10px 10px 10px 10px">
			<form id="ff" method="post">
				<table cellpadding="5">
					<tr>
						<th>从时 </th>
						<th>从分 </th>
						<th>到时 </th>
						<th>到分</th>
						<th>设定值 </th>
						<th>高时开关量</th>
						<th>低时开关量</th>
					</tr>
					<core:forEach items = "${dto.itemList}" var="item" varStatus="vs">
					<tr>
					<td>
					    <input type="hidden" name="itemList[${vs.index}].id" id="itemList_${vs.index}_id" value="${item.id}"></input>
						<input class="easyui-numberspinner" data-options="min:0,max:24,required:true" style="width:80px;" 
						name="itemList[${vs.index}].fromHour" id="itemList_${vs.index}_fromHour" value="${item.fromHour}"></input>
					</td>
					<td>
						<input class="easyui-numberspinner" data-options="min:0,max:59,required:true" style="width:80px;" 
						name="itemList[${vs.index}].fromMinute" id="itemList_${vs.index}_fromMinute" value="${item.fromMinute}"></input>
					</td>
					<td>
						<input class="easyui-numberspinner" data-options="min:0,max:24,required:true" style="width:80px;" 
						name="itemList[${vs.index}].toHour"  id="itemList_${vs.index}_toHour" value="${item.toHour}"></input>
					</td>
					<td>
						<input class="easyui-numberspinner" data-options="min:0,max:59,required:true" style="width:80px;" 
						name="itemList[${vs.index}].toMinute" id="itemList_${vs.index}_toMinute" value="${item.toMinute}"></input>
					</td>
					<td>
						<input class="easyui-numberspinner" data-options="min:0,max:100,required:true" style="width:80px;" 
						name="itemList[${vs.index}].thresholdValue" id="itemList_${vs.index}_thresholdValue" value="${item.thresholdValue}"></input>
					</td>
					<td>
						<input class="easyui-numberspinner" data-options="min:0,max:100,required:true" style="width:80px;" 
						name="itemList[${vs.index}].greaterAction"  id="itemList_${vs.index}_greaterAction" value="${item.greaterAction}"></input>
					</td>
					<td>
						<input class="easyui-numberspinner" data-options="min:0,max:100,required:true" style="width:80px;" 
						name="itemList[${vs.index}].lessAction"  id="itemList_${vs.index}_lessAction" value="${item.lessAction}"></input>
					</td>
					</tr>
					</core:forEach>
					<tr>
					<td colspan="8" >
					<font size="1" color="red">开关量说明：大灯+条带灯的组合值，共四个值0-大灯断开/条带灯断开，
					1-大灯断开/条带灯闭合，10-大灯闭合/条带灯断开，11-大灯闭合/条带灯闭合</font>
					</td>
				  	</tr>
				  	<tr>
					<td colspan="8" class="spliterInput_Line">
					  <img src="${imagepath}/spliterInput_line_03.gif" />
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
		url:"${webcontext}/greenhouse/saveLightTriggerConfig",   
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