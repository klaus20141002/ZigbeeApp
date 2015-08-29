<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<%@include file="../include/include.jsp"%>
	<link rel="stylesheet" type="text/css" href="${csspath}/login.css"/>
	<link rel="stylesheet" type="text/css" href="${csspath}/public.css"/>
	<link rel="stylesheet" type="text/css" href="${csspath}/style_l.css"/>
	<script type="text/javascript" src="${jspath}/jquery-1.4.4.js"></script>
	<script type="text/javascript" src="${jspath}/jquery.blockUI.js"></script>
	<script type="text/javascript" src="${jspath}/login.js"></script>
	<script type="text/javascript" src="${webcontext}/javascript/load_layer.js"></script>
				<script src="${jspath}/jquery/validate/jquery.validationEngine.js" type="text/javascript"></script>
<script src="${jspath}/jquery/validate/jquery.validationEngine-zh.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="${webcontext}/css/validationEngine.jquery.css"/>
	
	
	<script type="text/javascript">
		$(function() {
			$("#resetPwd").validationEngine({scroll:false});
			
			$("#set_cancel").click(function(){
				removeLayer();
			});
			//{"":"","":""}//
			$("#set_save").click(function(){
				if($("#resetPwd").validationEngine({scroll:false,returnIsValid:true})){
					if($("#errorUserCode").html()!=""){
						return false;
					}
					/*if($.trim($("#userCode").val())==""){
						$("#errorUserCode").html("请输入用户名!");
						return false;
					}
					if($.trim($("#certificateCode").val())==""){
						$("#errorCertificateCode").html("请输入证件号码");
						return false;
					}*/
					/*iif($("#certificateLabel").html()=='身份证'){
						if(!(/^(\d{15}$)|(\d{17}[0-9]|X)$/.test($.trim($("#certificateCode").val())))){
							$("#errorCertificateCode").html("身份证号长度不对，或不符合要求");
							return false;
						}
					}*/
					$.ajax({
						type:'POST',
						url: '${webcontext}/ge/dealer/resetpasswd/resetPassword',
						async: false,
						data : "userCode="+$("#userCode").val()+"&certificateCode="+$("#certificateCode").val()+"",
						dataType : 'json',
						success : function(data) {
						   if(data) {
							   $("#errorCertificateCode").html("密码重置成功，新密码会在5分钟内发送到您的手机！");
						   }else{
								$("#errorCertificateCode").html("账号不可用或证件号错误");
						   }
					    }
					});
				}
			});
			$("#certificateCode").blur(function(){
				if($("#resetPwd").validationEngine({returnIsValid:true})){
					/*if($("#certificateLabel").html()=='身份证'){
						//alert((/(^\d{15}$)|(^\d{17}(0-9]|X)$)/.test($.trim($("#certificateCode").val())));
						if(!(/^(\d{15}$)|(\d{17}[0-9]|X)$/.test($.trim($("#certificateCode").val())))){
							$("#errorCertificateCode").html("身份证号长度不对，或不符合要求");
							return false;
						}else{
							$("#errorCertificateCode").html("");
						}
					}*/
					/*if($.trim($("#userCode").val())==""){
						$("#errorUserCode").html("请输入用户名");
						return false;
					}*/
					$.ajax({
						type:'POST',
						url: '${webcontext}/ge/dealer/resetpasswd/validationUser',
						async: false,
						data : "userCode="+$("#userCode").val()+"&certificateCode="+$("#certificateCode").val()+"",
						dataType : 'json',
						success : function(data) {
						   if(data) {
							   //$("#errorCertificateCode").html("密码重置成功");
							   $("#errorCertificateCode").html("");
						   }else{
								$("#errorCertificateCode").html("账号不可用或证件号错误");
						   }
					    }
					});
				}
			});
			$("#userCode").blur(function(){
				/*if($.trim($("#userCode").val())==""){
					$("#errorUserCode").html("请输入用户名");
					return false;
				}*/
				//if($("#resetPwd").validationEngine({returnIsValid:true})){
				  $.ajax({
						type:'GET',
						url: '${webcontext}/ge/dealer/resetpasswd/getUseByCode/'+$("#userCode").val(),
						async: false,
						dataType : 'json',
						success : function(data) {
						   if(data!=null) {
							   $("#errorUserCode").html("");
							   $("#certificateLabel").html(data.certificateType);
						   }else{
							   $("#errorUserCode").html("用户名错误！");
							   $("#userCode").focus();
								return;
						   }
					    }
					});
				//}
			  });

			  
		});

	</script>
<title>Insert title here</title>
</head>
<body>
 <form:form id="resetPwd" name ="resetPwd"  method="post" modelAttribute="resetPasswordDto">
<div class="block_div" id="forget_block" style="display:block">
	<div class="title"> <span>忘记密码</span> </div>
      <div class="spliter h_5"></div>
      <div>
		<table class="block_tab">
        <tr class="search_tab">
          <td class="label">用户名：</td>
          <td>
          	<form:input path="userCode" id="userCode" cssClass="validate[required,length[0,40]] text"/>
          	<span id="errorUserCode" style="color:red;"></span>
          </td>
        </tr>
        <tr class="search_tab">
          <td class="label" ><span id="certificateLabel">证件号</span>：</td>
          <td>
          	<form:input path="certificateCode" id="certificateCode" cssClass="validate[required,length[0,40]] text long" maxlength="40"/>
          	<span id="errorCertificateCode" style="color:red;"></span>
          </td>
        </tr>
      </table>	
	  </div>
      <div class="btn_div">
        <input type="button" class="btn01" value="发送密码到手机" id="set_save"/>
        <input type="button" class="btn" value="取消" id="set_cancel"/>
      </div>
      <div class="spliter h_5" style="height:10px;"></div>
</div>
</form:form>
</body>
</html>