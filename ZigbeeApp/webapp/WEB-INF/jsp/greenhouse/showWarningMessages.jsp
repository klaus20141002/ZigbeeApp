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
	<div class="easyui-panel" title="告警信息显示" style="width: 870px">
		<div style="padding: 10px 10px 10px 10px">
			<form id="ff" method="post">
				<table cellpadding="5" class="display" >
					<tr>
						<th width="30%" class="easyui">报警类型</th>
                        <th width="30%" class="easyui">上报时间</th>
						<th width="40%" class="easyui">报警信息</th>
                    </tr>
                  <core:forEach items="${WarningMessages}" var="WarningMessages">
					<tr>
                        <td>${WarningMessages.dataAlarmType}</td>
                        <td>${WarningMessages.timestamp}</td>
                        <td>${WarningMessages.content}</td>
                    </tr>
                 </core:forEach> 
				</table>
			</form>
		</div>
	</div>
</body>
</html>