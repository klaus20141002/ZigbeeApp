<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>密码修改</title>
	<%@include file="../include/include.jsp"%>
	<link rel="stylesheet" type="text/css" href="${csspath}/public.css"/>
	<link rel="stylesheet" type="text/css" href="${csspath}/datepicker.css"/>
	<link rel="stylesheet" type="text/css" href="${csspath}/style_l.css"/>
	<link rel="stylesheet" type="text/css" href="${csspath}/jquery.alerts.css" />

	<script type="text/javascript" src="${jspath}/jquery-1.4.4.js"></script>
	<script type="text/javascript" src="${jspath}/jquery.ui.min.js"></script>
	<script type="text/javascript" src="${jspath}/ui.datepicker_zh-CN.js"></script>
	<script type="text/javascript" src="${jspath}/jquery.blockUI.js"></script>
	<script type="text/javascript" src="${jspath}/jquery.selectAll.js"></script>
	<script type="text/javascript" src="${jspath}/public.js"></script>
	
	<script type="text/javascript" src="${jspath}/jquery/jquery.ui.draggable.js"></script>
	<script type="text/javascript" src="${jspath}/jquery/jquery.alerts.js"></script>
	
	<script src="${jspath}/jquery/validate/jquery.validationEngine.js" type="text/javascript"></script>
	<script src="${jspath}/jquery/validate/jquery.validationEngine-zh.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="${webcontext}/css/validationEngine.jquery.css"/>
	
	<script type="text/javascript">
		var hasSub = true;
		function checkAll(type){
			var oldPwd = $("#oldPwd").val();
			$.ajax({
				type:'GET',
				url: '${webcontext}/login/checkOldPwdById/'+oldPwd+'?oldPassword='+oldPwd,
				async: false,
				dataType : 'json',
				success : function(data) {
				   if(data) {
					   //$("#errorCertificateCode").html("密码重置成功");
					   hasSub = true;
				   }else{
					   $.validationEngine.buildPrompt('#oldPwd', "原始密码错误！", 'error');
					   hasSub = false;
				   }
			    }
			});
			
			var newPwd = $("#newPwd").val();
			var newPwd2 = $("#newPwd2").val();
			
			if(hasSub){
				if(newPwd == oldPwd){
					$.validationEngine.buildPrompt('#newPwd', "新密码不能与原密码相同，请再次输入！", 'error');
					hasSub = false;
				}else{
					if(newPwd!=newPwd2){
						$.validationEngine.buildPrompt('#newPwd2', "新密码两次输入不同，请再次输入！", 'error');
						 //jAlert('新密码两次输入不同，请再次输入');
						hasSub = false;
					}else{
						hasSub = true;
					}
				}				
				
			} 
			
		}
		$(function(){
			$("#subForm").validationEngine({
				scroll:false
			});
			$("#oldPwd").blur(function(){
				var oldPwd = $("#oldPwd").val();
				$.ajax({
					type:'GET',
					url: '${webcontext}/login/checkOldPwdById/'+oldPwd+'?oldPassword='+oldPwd,
					async: false,
					dataType : 'json',
					success : function(data) {
					   if(data) {
						   //$("#errorCertificateCode").html("密码重置成功");
						  // clearValidationPromptText();
						   $.validationEngine.closePrompt('#oldPwd');
					   }else{
						   $.validationEngine.buildPrompt('#oldPwd', "原始密码错误！", 'error');
						   //hasSub = false;
					   }
				    }
				});
			});
			$("#newPwd2").blur(function(){
				var newPwd = $("#newPwd").val();
				var newPwd2 = $("#newPwd2").val();
				if(newPwd!=newPwd2){
					$.validationEngine.buildPrompt('#newPwd2', "新密码两次输入不同，请再次输入！", 'error');
					//hasSub = false;
					//return false;
				}else{
					$.validationEngine.closePrompt('#newPwd2');
				}
			});
			$("#sub").click(function(){
				if($("#subForm").validationEngine({returnIsValid:true})){
					checkAll();
					if(hasSub){
						$("#subForm").submit();
					}
				}
			});
		});
		
		function cancelBack(){
			parent.hideBoder();
			location.href="${webcontext}/mainpage/loginData";
		}
	</script>
</head>
<body>
<core:if test="${message!=null}">
	<script>
		jAlert("密码修改成功！",'提示信息',
			function(){
				parent.hideBoder();
				$("#toIndex").submit();
			}
		);
	</script>
</core:if>
<form action="${webcontext}/mainpage/loginData" id="toIndex" target="doss_inner"> </form>
<form:form action="${webcontext}/login/updatePwd" method="post" modelAttribute="userDto" id="subForm">
	<form:hidden path="userId"/>
		<!-- content -->
	<div id="content">
		<!-- wrap -->
		<div id="wrap">
 
			<!-- breadcrumb -->
			<div id="breadcrumba" style="color: #025D7B; height: 26px; line-height: 26px;">
				<span>快捷菜单设置</span>
				<span>&gt;</span>
				<span>修改密码</span>
			</div>
			<!-- /breadcrumb -->
			<!-- search_div -->
			<div class="search_div">
				<div class="spliter h_10"></div>
				<table class="search_tab">
				  <tr>
				    <td class="label">原密码：</td>
				    <td><input type="password" class="validate[required] text" id="oldPwd" value=""/></td>
				    <td class="label">&nbsp;</td>
				    <td>&nbsp;</td>
				    <td class="label">&nbsp;</td>
				    <td>&nbsp;</td>
				    <td colspan="2" class="label_width_25"></td>
			      </tr>
					
					<tr>
					  <td class="label">新密码：</td>
					  <td> <form:password path="passwd" cssClass="validate[required,length[6,100]] text" id="newPwd"/> </td>
					  <td class="label">&nbsp;</td>
					  <td>&nbsp;</td>
					  <td class="label">&nbsp;</td>
					  <td>&nbsp;</td>
					  <td colspan="2" class="label_width_25"></td>
				  </tr>
					<tr>
					  <td class="label">再输入一次：</td>
					  <td><input type="password" class="validate[required,length[6,100]] text" id="newPwd2"/></td>
                    	
                    	<td class="label">&nbsp;</td>
						<td>&nbsp;</td>
						<td class="label">&nbsp;</td>
						<td>&nbsp;</td>
						<td colspan="2" class="label_width_25"></td>
					</tr>
					<tr>
						<td colspan="8" class="center2">
							<input type="button" class="btn" id="sub" value="确认"/>
							<input type="button" class="btn" value="取消" onclick="cancelBack();" />
						</td>
					</tr>
				</table>
				<div class="spliter h_10"></div>
			</div>
			<!-- /search_div -->
			
			<div class="spliter h_10"></div>
			
		</div>
		<!-- /wrap -->
	</div>
	<!-- /content -->
	</form:form>
</body>
</html>