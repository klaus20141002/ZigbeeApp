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
<link href="${csspath}/easyui.css" rel="stylesheet" type="text/css">
<link href="${csspath}/icon.css" rel="stylesheet" type="text/css">
<script src="${jspath}/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="${jspath}/jquery.easyui.min.js" type="text/javascript"></script>
</head>
<body>
	<div class="easyui-panel" title="" style="width: 340px">
		<div style="padding: 10px 10px 10px 10px">
			<form id="ff" method="post">
				<table cellpadding="5">
					<tr>
						<td><label>空气温度 </label></td>
						<td><input class="easyui-numberspinner"  style="width:40px;" readonly="readonly" name="lowerAirTemperature"></input></td>
						<td><label>空气湿度</label></td>
						<td><input class="easyui-numberspinner"  style="width:40px;" readonly="readonly" name="lowerAirTemperature"></input></td>
					</tr>
					<tr>
						<td><label>空气温度高于 </label></td>
						<td><input class="easyui-numberspinner" data-options="min:1,max:100,required:true" style="width:80px;"
						 name="higherAirTemperature"></input></td>
						 <td><label>℃ 继电器1  </label></td>
						 <td><input type="radio" id="higherAirTemperatureAction1" name="higherAirTemperatureAction" value="1" checked="checked"/><label>闭合</label>
							<input type="radio" id="higherAirTemperatureAction2" name="higherAirTemperatureAction" value="0"/><label>断开</label>
						</td>
					</tr>
					<tr>
						<td><label>空气湿度低于 </label></td>
						<td><input class="easyui-numberspinner" data-options="min:1,max:100,required:true" style="width:80px;"
						 name="lowerAirWetness"></input></td>
						 <td><label>%RH 继电器2  </label></td>
						 <td><input type="radio" id="lowerAirWetnessAction1" name="lowerAirWetnessAction" value="1" checked="checked"/><label>闭合</label>
							<input type="radio" id="lowerAirWetnessAction2" name="lowerAirWetnessAction" value="0"/><label>断开</label>
						</td>
					</tr>
					<tr>
						<td><label>空气湿度高于 </label></td>
						<td><input class="easyui-numberspinner" data-options="min:1,max:100,required:true" style="width:80px;"
						 name="higherAirWetness"></input></td>
						 <td><label>%RH 继电器2  </label></td>
						 <td><input type="radio" id="higherAirWetnessAction1" name="higherAirWetnessAction" value="1" checked="checked"/><label>闭合</label>
							<input type="radio" id="higherAirWetnessAction2" name="higherAirWetnessAction" value="0"/><label>断开</label>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>