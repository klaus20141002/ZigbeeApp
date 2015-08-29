<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
.iframe_divNoBod {
	width: 338px;
	height: 372px;
	float:left;
	background: #EAEAEA;
	overflow: hidden;
	margin-left:0px;
	_margin-left:4px;
}
</style>
</head>
<body>
<div class="easyui-panel" style="padding:0px; width:340px; height:400px;">
<a href="${webcontext}/greenhouse/showCurrent" class="easyui-linkbutton"  target="mobile_inner" data-options="plain:true">数据监控</a>
<a href="#" class="easyui-menubutton"  target="mobile_inner" data-options="menu:'#mm1',iconCls:'icon-edit'">系统设置</a>
<a href="#" class="easyui-menubutton"  target="mobile_inner" data-options="menu:'#mm2',iconCls:'icon-help'">Help</a>
<div class="iframe_divNoBod">
<iframe name="mobile_inner" width="100%" height="100%"
						frameborder="0" marginwidth="0" marginheight="0"  allowtransparency="true"></iframe>
</div>
</div>
<div id="mm1" style="width:150px;">
	<div data-options="iconCls:'icon-undo'">传感器门限</div>
	<div data-options="iconCls:'icon-redo'">Led灯设置</div>
	<div data-options="iconCls:'icon-redo'">数据监控</div>
	<div data-options="iconCls:'icon-redo'">历史数据查询</div>
	<div data-options="iconCls:'icon-redo'">登录页面</div>
</div>

<div id="mm2" style="width:100px;">
	<div>Help</div>
	<div>About</div>
</div>



</body>
</html>