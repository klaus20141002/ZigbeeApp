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
		   .alertWrap h1 { font-size:25px; line-height:40px; font-family:"宋体"; color:#467a9f; width:550px; float:left; padding-left:10px; }
		   .alertWrap h1 img { float:left; margin-right:15px; }
		   .alertWrap h2 { padding-top:10%; padding-left:100px; font-size:20px; line-height:40px; float:left;  }
           </style>
           <div class="alertWrap">
             <div style="float:left;"><img src="${imagepath}/logo/alert_logo.jpg" /></div><h1><span color="red">${errMsg}</span></h1>
             <br />
             <br />
             <br />

             <h2>
             <core:if test="${not empty backUrl}">
             <a href="${backUrl}">[点击此处返回上一页面]</a>
             </core:if>
             <core:if test="${empty backUrl}">
             <a onclick="history.back();">[点击此处返回上一页面]</a>
             </core:if>
             </h2>
			<br />
           </div>  
		</div>
		<!-- /wrap -->
	</div>
	<!-- /content -->

  

  </body>
</html>