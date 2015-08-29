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
	<div class="easyui-panel" title="联动设置" style="width: 870px">
		<div style="padding: 10px 10px 10px 10px">
			<form id="ff" method="post">
				<table cellpadding="5">
					<tr>
						<td><label>空气温度低于 </label></td>
						<td><input class="easyui-numberspinner" data-options="min:1,max:100,required:true" style="width:80px;"
						 name="lowerAirTemperature" value="${dto.lowerAirTemperature}"></input></td>
						 <td><label>℃ 继电器1  </label></td>
						 <td><input type="radio" id="lowerAirTemperatureAction1" name="lowerAirTemperatureAction" value="1" checked="checked"/><label>闭合</label>
							<input type="radio" id="lowerAirTemperatureAction2" name="lowerAirTemperatureAction" value="2"/><label>断开</label>
						</td>
						<td style="padding-left:50px;"><label>CO2浓度低于 </label></td>
						<td><input class="easyui-numberspinner" data-options="min:1,max:100,required:true" style="width:80px;"
						 name="lowerCO2Conc" value="${dto.lowerCO2Conc}"></input></td>
						 <td><label>ppm 继电器4  </label></td>
						 <td><input type="radio" id="lowerCO2ConcAction1" name="lowerCO2ConcAction" value="1" checked="checked"/><label>闭合</label>
							<input type="radio" id="lowerCO2ConcAction2" name="lowerCO2ConcAction" value="2"/><label>断开</label>
						</td>
					</tr>
					<tr>
						<td><label>空气温度高于 </label></td>
						<td><input class="easyui-numberspinner" data-options="min:1,max:100,required:true" style="width:80px;"
						 name="higherAirTemperature" value="${dto.higherAirTemperature}"></input></td>
						 <td><label>℃ 继电器1  </label></td>
						 <td><input type="radio" id="higherAirTemperatureAction1" name="higherAirTemperatureAction" value="1" checked="checked"/><label>闭合</label>
							<input type="radio" id="higherAirTemperatureAction2" name="higherAirTemperatureAction" value="2"/><label>断开</label>
						</td>
						<td  style="padding-left:50px;"><label>CO2浓度高于 </label></td>
						<td><input class="easyui-numberspinner" data-options="min:1,max:100,required:true" style="width:80px;"
						 name="higherCO2Conc" value="${dto.higherCO2Conc}"></input></td>
						 <td><label>ppm 继电器4  </label></td>
						 <td><input type="radio" id="higherCO2ConcAction1" name="higherCO2ConcAction" value="1" checked="checked"/><label>闭合</label>
							<input type="radio" id="higherCO2ConcAction2" name="higherCO2ConcAction" value="2"/><label>断开</label>
						</td>
						
					</tr>
					<tr>
					<td colspan="8" class="spliterInput_Line">
					  <img src="${imagepath}/spliterInput_line_03.gif" />
					</td>
				  	</tr>
					<tr>
						<td><label>空气湿度低于 </label></td>
						<td><input class="easyui-numberspinner" data-options="min:1,max:100,required:true" style="width:80px;"
						 name="lowerAirWetness" value="${dto.lowerAirWetness}"></input></td>
						 <td><label>%RH 继电器2  </label></td>
						 <td><input type="radio" id="lowerAirWetnessAction1" name="lowerAirWetnessAction" value="1" checked="checked"/><label>闭合</label>
							<input type="radio" id="lowerAirWetnessAction2" name="lowerAirWetnessAction" value="2"/><label>断开</label>
						</td>
						<td style="padding-left:50px;"><label>土壤温度低于 </label></td>
						<td><input class="easyui-numberspinner" data-options="min:1,max:100,required:true" style="width:80px;"
						 name="lowerSoilTemperature" value="${dto.lowerSoilTemperature}"></input></td>
						 <td><label>℃ 继电器4  </label></td>
						 <td><input type="radio" id="lowerSoilTemperatureAction1" name="lowerSoilTemperatureAction" value="1" checked="checked"/><label>闭合</label>
							<input type="radio" id="lowerSoilTemperatureAction2" name="lowerSoilTemperatureAction" value="2"/><label>断开</label>
						</td>
					</tr>
					<tr>
						<td><label>空气湿度高于 </label></td>
						<td><input class="easyui-numberspinner" data-options="min:1,max:100,required:true" style="width:80px;"
						 name="higherAirWetness" value="${dto.higherAirWetness}"></input></td>
						 <td><label>%RH 继电器2  </label></td>
						 <td><input type="radio" id="higherAirWetnessAction1" name="higherAirWetnessAction" value="1" checked="checked"/><label>闭合</label>
							<input type="radio" id="higherAirWetnessAction2" name="higherAirWetnessAction" value="2"/><label>断开</label>
						</td>
						<td style="padding-left:50px;"><label>土壤温度高于 </label></td>
						<td><input class="easyui-numberspinner" data-options="min:1,max:100,required:true" style="width:80px;"
						 name="higherSoilTemperature" value="${dto.higherSoilTemperature}"></input></td>
						 <td><label>℃ 继电器4  </label></td>
						 <td><input type="radio" id="higherSoilTemperatureAction1" name="higherSoilTemperatureAction" value="1" checked="checked"/><label>闭合</label>
							<input type="radio" id="higherSoilTemperatureAction2" name="higherSoilTemperatureAction" value="2"/><label>断开</label>
						</td>
					</tr>
					<tr>
					<td colspan="8" class="spliterInput_Line">
					  <img src="${imagepath}/spliterInput_line_03.gif" />
					</td>
				  	</tr>
					<tr>
						<td><label>光照度低于 </label></td>
						<td><input class="easyui-numberspinner" data-options="min:1,max:100,required:true" style="width:80px;"
						 name="lowerLight" value="${dto.lowerLight}"></input></td>
						 <td><label>Lux 继电器3  </label></td>
						 <td><input type="radio" id="lowerLightAction1" name="lowerLightAction" value="1" checked="checked"/><label>闭合</label>
							<input type="radio" id="lowerLightAction2" name="lowerLightAction" value="2"/><label>断开</label>
						</td>
						<td style="padding-left:50px;"><label>土壤水分含量低于 </label></td>
						<td><input class="easyui-numberspinner" data-options="min:1,max:100,required:true" style="width:80px;"
						 name="lowerSoilWetness" value="${dto.lowerSoilWetness}"></input></td>
						 <td><label>% 继电器6  </label></td>
						 <td><input type="radio" id="lowerSoilWetnessAction1" name="lowerSoilWetnessAction" value="1" checked="checked"/><label>闭合</label>
							<input type="radio" id="lowerSoilWetnessAction2" name="lowerSoilWetnessAction" value="2"/><label>断开</label>
						</td>
					</tr>
					<tr>
						<td><label>光照度高于 </label></td>
						<td><input class="easyui-numberspinner" data-options="min:1,max:100,required:true" style="width:80px;"
						 name="higherLight" value="${dto.higherLight}"></input></td>
						 <td><label>Lux 继电器3  </label></td>
						 <td><input type="radio" id="higherLightAction1" name="higherLightAction" value="1" checked="checked"/><label>闭合</label>
							<input type="radio" id="higherLightAction2" name="higherLightAction" value="2"/><label>断开</label>
						</td>
						<td style="padding-left:50px;"><label>土壤水分含量高于 </label></td>
						<td><input class="easyui-numberspinner" data-options="min:1,max:100,required:true" style="width:80px;"
						 name="higherSoilWetness" value="${dto.higherSoilWetness}"></input></td>
						 <td><label>% 继电器6  </label></td>
						 <td><input type="radio" id="higherSoilWetnessAction1" name="higherSoilWetnessAction" value="1" checked="checked"/><label>闭合</label>
							<input type="radio" id="higherSoilWetnessAction2" name="higherSoilWetnessAction" value="2"/><label>断开</label>
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
		url:"${webcontext}/greenhouse/saveCascadeCfg",   
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
	//空气温度
	if (${dto.lowerAirTemperatureAction==1}){
		 $("input:radio[name=lowerAirTemperatureAction][value=1]").attr("checked", "checked");
	}else{
		 $("input:radio[name=lowerAirTemperatureAction][value=2]").attr("checked", "checked");
	};
	if (${dto.higherAirTemperatureAction==1}){
		 $("input:radio[name=higherAirTemperatureAction][value=1]").attr("checked", "checked");
	}else{
		 $("input:radio[name=higherAirTemperatureAction][value=2]").attr("checked", "checked");
	};
//空气湿度
	if (${dto.lowerAirWetnessAction==1}){
		 $("input:radio[name=lowerAirWetnessAction][value=1]").attr("checked", "checked");
	}else{
		 $("input:radio[name=lowerAirWetnessAction][value=2]").attr("checked", "checked");
	};
	if (${dto.higherAirWetnessAction==1}){
		 $("input:radio[name=higherAirWetnessAction][value=1]").attr("checked", "checked");
	}else{
		 $("input:radio[name=higherAirWetnessAction][value=2]").attr("checked", "checked");
	};
//光照度
	if (${dto.lowerLightAction==1}){
		 $("input:radio[name=lowerLightAction][value=1]").attr("checked", "checked");
	}else{
		 $("input:radio[name=lowerLightAction][value=2]").attr("checked", "checked");
	};
	if (${dto.higherLightAction==1}){
		 $("input:radio[name=higherLightAction][value=1]").attr("checked", "checked");
	}else{
		 $("input:radio[name=higherLightAction][value=2]").attr("checked", "checked");
	};
//CO2浓度
	if (${dto.lowerCO2ConcAction==1}){
		 $("input:radio[name=lowerCO2ConcAction][value=1]").attr("checked", "checked");
	}else{
		 $("input:radio[name=lowerCO2ConcAction][value=2]").attr("checked", "checked");
	};
	if (${dto.higherCO2ConcAction==1}){
		 $("input:radio[name=higherCO2ConcAction][value=1]").attr("checked", "checked");
	}else{
		 $("input:radio[name=higherCO2ConcAction][value=2]").attr("checked", "checked");
	};
//土壤温度
	if (${dto.lowerSoilTemperatureAction==1}){
		 $("input:radio[name=lowerSoilTemperatureAction][value=1]").attr("checked", "checked");
	}else{
		 $("input:radio[name=lowerSoilTemperatureAction][value=2]").attr("checked", "checked");
	};
	if (${dto.higherSoilTemperatureAction==1}){
		 $("input:radio[name=higherSoilTemperatureAction][value=1]").attr("checked", "checked");
	}else{
		 $("input:radio[name=higherSoilTemperatureAction][value=2]").attr("checked", "checked");
	};
	//土壤水分含量
	if (${dto.lowerSoilWetnessAction==1}){
		 $("input:radio[name=lowerSoilWetnessAction][value=1]").attr("checked", "checked");
	}else{
		 $("input:radio[name=lowerSoilWetnessAction][value=2]").attr("checked", "checked");
	};
	if (${dto.higherSoilWetnessAction==1}){
		 $("input:radio[name=higherSoilWetnessAction][value=1]").attr("checked", "checked");
	}else{
		 $("input:radio[name=higherSoilWetnessAction][value=2]").attr("checked", "checked");
	};
	
</script>
</body>
</html>