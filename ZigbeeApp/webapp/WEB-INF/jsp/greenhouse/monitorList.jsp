<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../include/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">
<title></title>
<link href="${csspath}/easyui.css" rel="stylesheet" type="text/css">
<link href="${csspath}/icon.css" rel="stylesheet" type="text/css">
<script src="${jspath}/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="${jspath}/jquery.easyui.min.js" type="text/javascript"></script>
<link href="${csspath}/CommcnCss.css" rel="stylesheet" type="text/css">
<script src="${jspath}/CommonJs_1.js" type="text/javascript"></script>
<script src="${jspath}/Concurrent.Thread-full-20090713.js"
	type="text/javascript"></script>
<script src="${jspath}/RealTimeControlJs.js" type="text/javascript"></script>
<style type="text/css">
#fie {
	padding: 4px 6px 2px 4px;
	border: 1px solid #AED0EA;
	margin-left: 0px;
	margin-right: 0px;
	border-bottom: 0px;
	font-family: Tahoma, Verdana, 微软雅黑, 新宋体;
	min-width: 1000px;
}
</style>
<style type="text/css">
div.datagrid-cell-c2302-EqpHD {
	width: 63px;
}

div.datagrid-cell-c2302-GPRSlive {
	width: 62px;
}

div.datagrid-cell-c2302-PostCode {
	width: 27px;
}

div.datagrid-cell-c2302-CtlerCode {
	width: 92px;
}

div.datagrid-cell-c2302-LightCode {
	width: 62px;
}

div.datagrid-cell-c2302-OpenClose {
	width: 52px;
}

div.datagrid-cell-c2302-Bright {
	width: 52px;
}

div.datagrid-cell-c2302-Voltage {
	width: 92px;
}

div.datagrid-cell-c2302-ECurrent {
	width: 92px;
}

div.datagrid-cell-c2302-Power {
	width: 72px;
}

div.datagrid-cell-c2302-Frequency {
	width: 72px;
}

div.datagrid-cell-c2302-Temperature {
	width: 72px;
}

div.datagrid-cell-c2302-RefreshTime {
	width: 142px;
}
</style>
</head>
<body>
<div style="min-width: 1050px;">
<fieldset id="fiestyle"
	style="height: 60px; width: auto; display: none;"><br>
<div style="float: left; width: auto;">
<div style="float: left;">机构名称 <select id="SelOrg" style="width: 144px; margin-left: 5px; border: 1px solid #CFCFCF;">undefined
	<option>上海极立多媒体有限公司</option>
</select>&nbsp;&nbsp;项目名称 <select id="SelPrj"
	style="width: 134px; border: 1px solid #CFCFCF;">

	undefined
	<option>极立多测试</option>
</select>&nbsp;&nbsp;网关名称 <select id="SeltEqpCode"
	style="width: 100px; margin-left: 5px; border: 1px solid #CFCFCF;">

	undefined
	<option>全部</option>
	<option value="jldceshi">jldceshi</option>
</select>&nbsp;&nbsp;<font id="LightP">灯杆编码</font><select id="SeltPostCode"
	style="width: 80px; margin-left: 5px; border: 1px solid #CFCFCF;">

	<option>全部</option>
</select><a href="javascript:void(0);" class="easyui-linkbutton l-btn"
	style="margin-left: 10px;" id="SelRealTimeControlAll"><span
	class="l-btn-left"><span class="l-btn-text">查询</span></span></a><input
	id="test" value="" type="text"></div>
<br>
</div>
</fieldset>
<fieldset id="fie" class="datagrid-toolbar"
	style="height: 26px; font-size: 14px; width: auto;"><a id=""
	class="easyui-linkbutton l-btn l-btn-plain" iconcls="icon-reload"
	plain="true" style="font-size: 13px;"
	onclick="window.location.reload()"><span class="l-btn-left"><span
	class="l-btn-text icon-reload l-btn-icon-left">重置</span></span></a> | <a id=""
	class="easyui-linkbutton l-btn l-btn-plain"
	style="line-height: 22px; padding-left: 2px; font-size: 14x; display: none;"
	plain="true" onclick="GGridRead(this);"><span class="l-btn-left"><span
	class="l-btn-text">关闭实时更新</span></span></a><select id="SelCommType"
	style="width: 100px; margin-left: 4px; display: none;">
	<option>COM</option>
	<option selected="true">GPRS</option>
</select> &nbsp;&nbsp; 控制类型<select id="SelAddType"
	style="width: 100px; margin-left: 4px;">

	<option>群控单灯</option>
	<option selected="true">控制单灯</option>
</select>&nbsp;&nbsp; <input id="Radio1" checked="true" name="rd" type="radio"><label
	for="Radio1">读数据</label>&nbsp;&nbsp; <input id="Radio2" name="rd"
	type="radio"><font id="Open"><label for="Radio2">开灯</label></font>&nbsp;&nbsp;
<input id="Radio3" name="rd" type="radio"><font id="Close"><label
	for="Radio3">关灯</label></font>&nbsp;&nbsp; <input id="Radio4" name="rd"
	type="radio"><label for="Radio4">调光</label>&nbsp;&nbsp;<input
	id="SelBright" value="0"
	style="text-align: center; width: 50px; margin-left: 8px;"
	onkeyup="this.value=this.value.replace(/[^\.\d]/g,'');if(this.value.split('.').length>2){this.value=this.value.split('.')[0]+'.'+this.value.split('.')[1]}if(this.value > 100){this.value = 100}"
	type="text">&nbsp;&nbsp;<a href="javascript:void(0);"
	class="easyui-linkbutton l-btn" style="margin-left: 8px;"
	id="EditRealTimeControl"><span class="l-btn-left"><span
	class="l-btn-text">发送</span></span></a> &nbsp;&nbsp;&nbsp;&nbsp;<img
	src="${imagepath}/light_2.gif" style="width: 12px; height: 16px;" title="开灯">开灯&nbsp;&nbsp;<img
	src="${imagepath}/light_3.gif" style="width: 12px; height: 16px;" title="关灯">关灯&nbsp;&nbsp;<img
	src="${imagepath}/light_1.gif" style="width: 12px; height: 16px;" title="待读">待读&nbsp;&nbsp;<img
	src="${imagepath}/light_4.gif" style="width: 12px; height: 16px;" title="故障">故障
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="javascript:;"
	class="easyui-linkbutton l-btn" style="" id="QueryTime"><span
	class="l-btn-left"><span class="l-btn-text">查看策略执行情况</span></span></a></fieldset>
<div style="width: auto;" class="panel datagrid">
<div style="width: 1176px; height: auto;" title=""
	class="datagrid-wrap panel-body panel-body-noheader">
<div style="width: 1176px; height: 125px;" class="datagrid-view">

<div style="width: 0px;" class="datagrid-view1">
<div style="width: 0px; height: 24px;" class="datagrid-header">
<div style="display: block;" class="datagrid-header-inner">
<table style="height: 25px;" class="datagrid-htable" border="0"
	cellpadding="0" cellspacing="0">
	<tbody></tbody>
</table>
</div>
</div>
<div style="width: 0px; height: 100px;" class="datagrid-body">
<div class="datagrid-body-inner"></div>
</div>
<div style="width: 0px;" class="datagrid-footer">
<div style="display: none;" class="datagrid-footer-inner"></div>
</div>
</div>
<div style="width: 1176px;" class="datagrid-view2">
<div style="width: 1176px; height: 24px;" class="datagrid-header">
<div style="display: block;" class="datagrid-header-inner">
<table style="height: 25px;" class="datagrid-htable" border="0"
	cellpadding="0" cellspacing="0">
	<tbody>
		<tr class="datagrid-header-row">
			<td field="ck">
			<div class="datagrid-header-check"><input type="checkbox"></div>
			</td>
			<td field="EqpHD">
			<div style="text-align: center; width: 63px;" class="datagrid-cell">
			<span>集中管理器</span> <span class="datagrid-sort-icon">&nbsp;</span></div>
			</td>
			<td field="GPRSlive">
			<div style="width: 62px; text-align: center;" class="datagrid-cell">
			<span>联网状态</span> <span class="datagrid-sort-icon">&nbsp;</span></div>
			</td>
			<td field="PostCode">
			<div style="text-align: center; width: 27px;" class="datagrid-cell">
			<span>灯杆</span> <span class="datagrid-sort-icon">&nbsp;</span></div>
			</td>
			<td field="CtlerCode">
			<div style="width: 92px; text-align: center;" class="datagrid-cell">
			<span>控制器地址</span> <span class="datagrid-sort-icon">&nbsp;</span></div>
			</td>
			<td field="LightCode">
			<div style="width: 62px; text-align: center;" class="datagrid-cell">
			<span>端口</span> <span class="datagrid-sort-icon">&nbsp;</span></div>
			</td>
			<td field="OpenClose">
			<div style="width: 52px; text-align: center;" class="datagrid-cell">
			<span>路灯状态</span> <span class="datagrid-sort-icon">&nbsp;</span></div>
			</td>
			<td field="Bright">
			<div style="width: 52px; text-align: center;" class="datagrid-cell">
			<span>亮度</span><span class="datagrid-sort-icon">&nbsp;</span></div>
			</td>
			<td field="Voltage">
			<div style="width: 92px; text-align: center;" class="datagrid-cell"><span>电压(V)</span><span
				class="datagrid-sort-icon">&nbsp;</span></div>
			</td>
			<td field="ECurrent">
			<div style="width: 92px; text-align: center;" class="datagrid-cell"><span>电流(A)</span><span
				class="datagrid-sort-icon">&nbsp;</span></div>
			</td>
			<td field="Power">
			<div style="width: 72px; text-align: center;" class="datagrid-cell"><span>负载功率(W)</span><span
				class="datagrid-sort-icon">&nbsp;</span></div>
			</td>
			<td field="Frequency">
			<div style="width: 72px; text-align: center;" class="datagrid-cell"><span>频率(Hz)</span><span
				class="datagrid-sort-icon">&nbsp;</span></div>
			</td>
			<td field="Temperature">
			<div style="width: 72px; text-align: center;" class="datagrid-cell"><span>温度(℃)</span><span
				class="datagrid-sort-icon">&nbsp;</span></div>
			</td>
			<td field="RefreshTime">
			<div style="width: 142px; text-align: center;" class="datagrid-cell"><span>更新时间</span><span
				class="datagrid-sort-icon">&nbsp;</span></div>
			</td>
		</tr>
	</tbody>
</table>
</div>
</div>
<div style="width: 1176px; height: 100px;" class="datagrid-body">
<table style="table-layout: auto;" class="datagrid-btable" border="0"
	cellpadding="0" cellspacing="0">
	<tbody>
		<tr id="datagrid-row-r2302-2-0" datagrid-row-index="0"
			class="datagrid-row">
			<td field="ck">
			<div style="" class="datagrid-cell-check "><input name="ck"
				value="" type="checkbox"></div>
			</td>
			<td field="EqpHD">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-EqpHD">jldceshi</div>
			</td>
			<td field="GPRSlive">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-GPRSlive"><img
				src="${imagepath}/red.gif" style="width: 14px; height: 14px;" title="断线"></div>
			</td>
			<td field="PostCode">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-PostCode">0004</div>
			</td>
			<td field="CtlerCode">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-CtlerCode">00000012</div>
			</td>
			<td field="LightCode">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-LightCode">05</div>
			</td>
			<td field="OpenClose">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-OpenClose"><img
				src="${imagepath}/light_1.gif" style="width: 12px; height: 16px;"
				title="待读"></div>
			</td>
			<td field="Bright">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Bright">-</div>
			</td>
			<td field="Voltage">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Voltage">-</div>
			</td>
			<td field="ECurrent">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-ECurrent">-</div>
			</td>
			<td field="Power">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Power">-</div>
			</td>
			<td field="Frequency">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Frequency">-</div>
			</td>
			<td field="Temperature">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Temperature">-</div>
			</td>
			<td field="RefreshTime">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-RefreshTime">2014/7/16
			11:02:54</div>
			</td>
		</tr>
		<tr id="datagrid-row-r2302-2-1" datagrid-row-index="1"
			class="datagrid-row datagrid-row-alt">
			<td field="ck">
			<div style="" class="datagrid-cell-check "><input name="ck"
				value="" type="checkbox"></div>
			</td>
			<td field="EqpHD">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-EqpHD">jldceshi</div>
			</td>
			<td field="GPRSlive">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-GPRSlive"><img
				src="${imagepath}/red.gif" style="width: 14px; height: 14px;" title="断线"></div>
			</td>
			<td field="PostCode">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-PostCode">0003</div>
			</td>
			<td field="CtlerCode">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-CtlerCode">0000002D</div>
			</td>
			<td field="LightCode">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-LightCode">05</div>
			</td>
			<td field="OpenClose">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-OpenClose"><img
				src="${imagepath}/light_1.gif" style="width: 12px; height: 16px;"
				title="待读"></div>
			</td>
			<td field="Bright">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Bright">-</div>
			</td>
			<td field="Voltage">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Voltage">-</div>
			</td>
			<td field="ECurrent">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-ECurrent">-</div>
			</td>
			<td field="Power">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Power">-</div>
			</td>
			<td field="Frequency">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Frequency">-</div>
			</td>
			<td field="Temperature">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Temperature">-</div>
			</td>
			<td field="RefreshTime">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-RefreshTime">2014/7/16
			11:02:54</div>
			</td>
		</tr>
		<tr id="datagrid-row-r2302-2-2" datagrid-row-index="2"
			class="datagrid-row datagrid-row-selected">
			<td field="ck">
			<div style="" class="datagrid-cell-check "><input name="ck"
				value="" type="checkbox"></div>
			</td>
			<td field="EqpHD">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-EqpHD">jldceshi</div>
			</td>
			<td field="GPRSlive">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-GPRSlive"><img
				src="${imagepath}/red.gif" style="width: 14px; height: 14px;" title="断线"></div>
			</td>
			<td field="PostCode">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-PostCode">0002</div>
			</td>
			<td field="CtlerCode">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-CtlerCode">000000BF</div>
			</td>
			<td field="LightCode">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-LightCode">05</div>
			</td>
			<td field="OpenClose">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-OpenClose"><img
				src="${imagepath}/light_1.gif" style="width: 12px; height: 16px;"
				title="待读"></div>
			</td>
			<td field="Bright">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Bright">-</div>
			</td>
			<td field="Voltage">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Voltage">-</div>
			</td>
			<td field="ECurrent">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-ECurrent">-</div>
			</td>
			<td field="Power">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Power">-</div>
			</td>
			<td field="Frequency">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Frequency">-</div>
			</td>
			<td field="Temperature">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Temperature">-</div>
			</td>
			<td field="RefreshTime">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-RefreshTime">2014/7/16
			11:02:54</div>
			</td>
		</tr>
		<tr id="datagrid-row-r2302-2-3" datagrid-row-index="3"
			class="datagrid-row datagrid-row-alt">
			<td field="ck">
			<div style="" class="datagrid-cell-check "><input name="ck"
				value="" type="checkbox"></div>
			</td>
			<td field="EqpHD">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-EqpHD">jldceshi</div>
			</td>
			<td field="GPRSlive">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-GPRSlive"><img
				src="${imagepath}/red.gif" style="width: 14px; height: 14px;" title="断线"></div>
			</td>
			<td field="PostCode">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-PostCode">0001</div>
			</td>
			<td field="CtlerCode">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-CtlerCode">000000BE</div>
			</td>
			<td field="LightCode">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-LightCode">05</div>
			</td>
			<td field="OpenClose">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-OpenClose"><img
				src="${imagepath}/light_1.gif" style="width: 12px; height: 16px;"
				title="待读"></div>
			</td>
			<td field="Bright">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Bright">-</div>
			</td>
			<td field="Voltage">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Voltage">-</div>
			</td>
			<td field="ECurrent">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-ECurrent">-</div>
			</td>
			<td field="Power">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Power">-</div>
			</td>
			<td field="Frequency">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Frequency">-</div>
			</td>
			<td field="Temperature">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-Temperature">-</div>
			</td>
			<td field="RefreshTime">
			<div style="text-align: center; height: auto;"
				class="datagrid-cell datagrid-cell-c2302-RefreshTime">2014/7/16
			11:02:54</div>
			</td>
		</tr>
	</tbody>
</table>
</div>
<div style="width: 1176px;" class="datagrid-footer">
<div style="display: none;" class="datagrid-footer-inner"></div>
</div>
</div>
<table style="display: none;" id="tbs">
</table>
</div>
<div class="datagrid-pager pagination">
<table border="0" cellpadding="0" cellspacing="0">
	<tbody>
		<tr>
			<td><select class="pagination-page-list">
				<option>15</option>
				<option>30</option>
				<option>40</option>
				<option>50</option>
			</select></td>
			<td>
			<div class="pagination-btn-separator"></div>
			</td>
			<td><a id="" class="l-btn l-btn-plain l-btn-disabled"
				href="javascript:void(0)"><span class="l-btn-left"><span
				class="l-btn-text"><span class="l-btn-empty pagination-first">&nbsp;</span></span></span></a></td>
			<td><a id="" class="l-btn l-btn-plain l-btn-disabled"
				href="javascript:void(0)"><span class="l-btn-left"><span
				class="l-btn-text"><span class="l-btn-empty pagination-prev">&nbsp;</span></span></span></a></td>
			<td>
			<div class="pagination-btn-separator"></div>
			</td>
			<td><span style="padding-left: 6px;">第 </span></td>
			<td><input class="pagination-num" value="1" size="2" type="text"></td>
			<td><span style="padding-right: 6px;"> 页,共 1 页</span></td>
			<td>
			<div class="pagination-btn-separator"></div>
			</td>
			<td><a id="" class="l-btn l-btn-plain l-btn-disabled"
				href="javascript:void(0)"><span class="l-btn-left"><span
				class="l-btn-text"><span class="l-btn-empty pagination-next">&nbsp;</span></span></span></a></td>
			<td><a id="" class="l-btn l-btn-plain l-btn-disabled"
				href="javascript:void(0)"><span class="l-btn-left"><span
				class="l-btn-text"><span class="l-btn-empty pagination-last">&nbsp;</span></span></span></a></td>
			<td>
			<div class="pagination-btn-separator"></div>
			</td>
			<td><a id="" class="l-btn l-btn-plain" href="javascript:void(0)"><span
				class="l-btn-left"><span class="l-btn-text"><span
				class="l-btn-empty pagination-load">&nbsp;</span></span></span></a></td>
		</tr>
	</tbody>
</table>
<div class="pagination-info">当前显示记录1 到 4 条, 共 4 条记录</div>
<div style="clear: both;"></div>
</div>
</div>
</div>






</div>


<div id="mm" class="easyui-menu menu-top menu"
	style="width: 120px; display: none; left: 700px; top: -7px; z-index: 110001;">
<div class="menu-line"></div>
<div style="height: 20px;" class="menu-item" href="" name=""
	onclick="view()" data-options="iconCls:'icon-search'">
<div class="menu-text">历史记录</div>
<div class="menu-icon icon-search"></div>
</div>
<div style="height: 20px;" class="menu-item" href="" name=""
	onclick="SendData(0)" data-options="iconCls:'icon-edit'">
<div class="menu-text">读数据</div>
<div class="menu-icon icon-edit"></div>
</div>
<div style="height: 20px;" class="menu-item" href="" name=""
	onclick="SendData(1)" data-options="iconCls:'icon-edit'">
<div class="menu-text">开灯</div>
<div class="menu-icon icon-edit"></div>
</div>
<div style="height: 20px;" class="menu-item" href="" name=""
	onclick="SendData(2)" data-options="iconCls:'icon-edit'">
<div class="menu-text">关灯</div>
<div class="menu-icon icon-edit"></div>
</div>
<div style="height: 20px;" class="menu-item" href="" name=""
	onclick="SendData(3)" data-options="iconCls:'icon-edit'">
<div class="menu-text">调光</div>
<div class="menu-icon icon-edit"></div>
</div>
</div>
<div
	style="display: none; z-index: 110000; left: 700px; top: -7px; width: 126px; height: 116px;"
	class="menu-shadow"></div>
<div style="display: none; width: 638px; left: 268px; top: -100.5px;"
	class="panel window">
<div style="width: 638px;"
	class="panel-header panel-header-noborder window-header">
<div class="panel-title panel-with-icon">New Dialog</div>
<div class="panel-icon icon-edit"></div>
<div class="panel-tool"><a class="panel-tool-close"
	href="javascript:void(0)"></a></div>
</div>
<div title="" style="overflow: hidden; width: 636px; height: 360px;"
	id="LigthHistory"
	class="easyui-dialog panel-body panel-body-noborder window-body"
	closed="true" data-options="iconCls: 'icon-edit'">
<div style="display: block; width: 636px;" class="panel">
<div id=""
	class="panel-body panel-body-noheader panel-body-noborder dialog-content"
	title=""
	style="width: 620px; height: 344px; text-align: left; padding: 8px;">
<div class="easyui-tabs1 tabs-container1">
<div class="tabs-header1 tabs-header-plain1">
<div class="tabs-wrap1" style="margin-left: 0px; margin-right: 0px;">
<ul class="tabs1">
	<li id="li_real" class="tabs-selected1"><a
		href="javascript:void(0)" class="tabs-inner1"> <span
		class="tabs-title1">历史记录</span></a></li>
	<li id="li_action" class=""><a href="javascript:void(0)"
		class="tabs-inner1"><span class="tabs-title1">操作记录</span></a></li>
</ul>
</div>
</div>
<div class="tabs-panels1" style="height: auto; padding: 3px;">
<div id="div_real" style="display: block;">
<table id="tbs_real">
</table>
</div>
<div id="div_action" style="display: none;">
<table id="tbs_action">
</table>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div style="display: none; left: 268px; top: -100.5px;"
	class="window-shadow"></div>
<div style="display: none; width: 688px; left: 251.5px; top: -70.5px;"
	class="panel window">
<div style="width: 688px;"
	class="panel-header panel-header-noborder window-header">
<div class="panel-title panel-with-icon">New Dialog</div>
<div class="panel-icon icon-save"></div>
<div class="panel-tool"><a class="panel-tool-close"
	href="javascript:void(0)"></a></div>
</div>
<div title="" style="overflow: hidden; width: 686px; height: 300px;"
	id="TimeDetail"
	class="easyui-dialog panel-body panel-body-noborder window-body"
	closed="true" data-options="iconCls:'icon-save'">
<div style="display: block; width: 686px;" class="panel">
<div id=""
	class="panel-body panel-body-noheader panel-body-noborder dialog-content"
	title=""
	style="width: 670px; height: 284px; text-align: left; padding: 8px;">
<table id="tbs_time">
</table>
</div>
</div>
</div>
</div>
<div style="display: none; left: 251.5px; top: -70.5px;"
	class="window-shadow"></div>
</body>
</html>