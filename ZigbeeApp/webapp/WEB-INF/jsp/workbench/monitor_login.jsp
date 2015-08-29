<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <title>上海通用经销商管理系统-用户登录</title>
    <%@include file="../include/include.jsp"%>
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
	<link rel="stylesheet" type="text/css" href="${csspath}/login.css"/>

	<script type="text/javascript" src="${jspath}/jquery-1.4.4.js"></script>
	<script type="text/javascript" src="${jspath}/jquery/jquery.ui.min.js"></script>
	<script type="text/javascript" src="${jspath}/jquery/jquery.blockUI.js"></script>
    <script type="text/javascript" src="${jspath}/jquery/jquery.selectAll.js"></script>
    <script type="text/javascript" src="${jspath}/jquery/jquery.ui.draggable.js"></script>   
	<script type="text/javascript" src="${jspath}/load_layer.js"></script>
	<script type="text/javascript" src="${jspath}/login.js"></script>
	<script type="text/javascript" src="${jspath}/public.js"></script>
	<script src="${jspath}/jquery/validate/jquery.validationEngine.js" type="text/javascript"></script>
	<script src="${jspath}/jquery/validate/jquery.validationEngine-zh.js" type="text/javascript"></script>
	<script type="text/javascript" src="${jspath}/jquery/jquery.alerts.js"></script>
	<link rel="stylesheet" type="text/css" href="${csspath}/jquery.alerts.css" />
	<link rel="stylesheet" type="text/css" href="${webcontext}/css/validationEngine.jquery.css"/>
    <script type="text/javascript" language="javascript">
   		
    	if(self!=top){
  	  		top.location.href= location.href;
    	}
    
	  $(function(){
		  $("#login_form").validationEngine();
		  $("#forget").click(function(){
			  loadLayer(this,"${webcontext}/ge/dealer/resetpasswd/toResetPwd",751,132,250,600);					   
		  });	 
	   });
	  
   </script>
    
	
</head>

<body style="background-color:#ebebeb;">
 <form:form id="login_form" action="${webcontext}/monitorLogin" name ="login_form_monitor" method="post" modelAttribute="loginDto">
	<core:choose>
		<core:when test="${isForceLogout == true}">
		<script>
			$(function(){
				jAlert("由于您的账号在其它客户端登录，系统自动登出。","提示信息", function(){
					$.get("${webcontext}/login/resetForceLogoutFlag?timestamp="+Date.parse(new Date()));
				});
			});
		</script>
		</core:when>
	</core:choose>
	
	<table id="layoutTable">
	
		<tr>
		    <td class="middle" valign="top"><div id="container">
		        <div id="logo"> <img src="images/login/logo.jpg"/> </div>
		        <div id="login">
		          <table class="loginTab">
		            <tr>
		              <td><span style="font-size:16px;">登&nbsp;&nbsp;&nbsp;录</span></td>
		              <td class="info_div">						
							<form:errors path="userCode" /><form:errors path="passwd" /><form:errors path="errorMsg" />							
						
					  </td>
		            </tr>
		            <tr>
		              <td align="right">用户名：</td>
		              <td><div class="username_div">
		                  <form:input path="userCode"/>			
		                </div></td>
		            </tr>
		            <tr>
		              <td align="right">密码：</td>
		              <td><div class="password_div">
		                 <form:password path="passwd"/>
		                </div></td>
		            </tr>
		            <tr>
		              <td></td>
		              <td><div class="check_div">
		                  <input type="checkbox" id="remember_me"/>
		                  <label for="remember_me">记住我</label>
		                </div>
		                <div class="forget_div"> <a href="#" id="forget">密码重置</a> </div>
		              <td>
		            </tr>
		            <tr>
		              <td></td>
		              <td><div class="submit_div">
		                  
		                 <input type="submit" value="" id="loginbt" class="loginbt" onclick="login()"/>
		                </div>
		              </td>
		            </tr>
		          </table>
		        </div>
		        <div class="loginFooter">Copyright @ 1997-2012 Shanghai General Motors Co., Ltd. All Rights Reserved  
		</div>
		      </div>
     	 </td>
  		</tr> 
		<tr>
			<td class="bottom">&nbsp;</td>
		</tr>
	</table>
</form:form>
	<!-- 遮罩显示层 - 默认不显示 -->
	<div id="screen" class="block">
		<p>
			<span>您当前使用的分辨率为：</span>
			<span id="screen_value">&nbsp;</span>
		</p>
		<p>
			<span>请重新设置并且不小于：</span>
			<span id="base_value">&nbsp;</span>
		</p>
		<p>
			<input type="button" class="confirm" value="确定" onclick="refreshPage();"/>
			
		</p>
	</div>
	<!-- /遮罩显示层 -->

	<!-- 遮罩显示层 - 默认不显示 -->
	<div id="borwser" class="block">
		<p>
			<span>您当前使用的浏览器类型：</span>
			<span id="browser_type">&nbsp;</span>
		</p>
		<p>
			<span>请使用系统支持的以下类型浏览器：</span>
		</p>
		<p>
			<span id="browser_support">IE6、IE7、IE8、Firefox3.0+</span>
		</p>
	</div>
	<!-- /遮罩显示层 -->

  </body>
</html>
