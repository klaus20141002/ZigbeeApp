<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
     "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
	
  <head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <%@include file="./include/include.jsp"%>

	<link rel="stylesheet" type="text/css" href="${csspath }/public.css"/>
	<link rel="stylesheet" type="text/css" href="${csspath }/datepicker.css"/>
	<link rel="stylesheet" type="text/css" href="${csspath }/style_l.css"/>
	<script type="text/javascript" src="${jspath }/jquery-1.4.4.js"></script>
	<script type="text/javascript" src="${jspath }/jquery.ui.min.js"></script>
	<script type="text/javascript" src="${jspath }/ui.datepicker_zh-CN.js"></script>
	<script type="text/javascript" src="${jspath }/jquery.blockUI.js"></script>
	<script type="text/javascript" src="${jspath }/public.js"></script>
	
    
  </head>

  <body>
	

	
	<!-- content -->
	<div id="content">
		<!-- wrap -->
		<div id="wrap">
           <style>
           .alertWrap { padding-top:10%; padding-left:15%;}
		   .alertWrap h1 { font-size:30px; line-height:40px; }
		   .alertWrap h1 img { float:left; margin-right:15px; }
		   .alertWrap h2 { padding-top:10%; padding-left:100px; font-size:20px; line-height:40px;  }
           </style>
           <div class="alertWrap">
             <h1><img src="${imagepath}/logo/alert_logo2.jpg" />系统错误，请联系系统管理员！<br />抱歉给您带来的不便。</h1>
             
             <h2>
                管理员电话：800-820-8917<br />
                管理员邮箱：dms800hotline@shanghaigm.com
             </h2>
           </div>  
		</div>
		<!-- /wrap -->
	</div>
	<!-- /content -->

  

  </body>
</html>