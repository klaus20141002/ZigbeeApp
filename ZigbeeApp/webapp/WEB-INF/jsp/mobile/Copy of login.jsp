<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>智慧生态种植系统</title>
    <link rel="stylesheet" type="text/css" href="${csspath}/themes/black/easyui.css">  
    <link href="${csspath}/themes/icon.css" rel="stylesheet" type="text/css" />
    <script src="${jspath}/jquery-1.7.2.min.js" type="text/javascript"></script>
    <script src="${jspath}/jquery.easyui.min.js" type="text/javascript"></script>
    <link href="${csspath}/IndexCss.css" rel="stylesheet" type="text/css" />
    <link href="${csspath}/default.css" rel="stylesheet" type="text/css" />
    <style scoped>
        .panel-title{
            text-align:center;
            font-size:14px;
            font-weight:bold;
            text-shadow:0 -1px rgba(0,0,0,0.3);
        }
        .m-item{
            height:30px;
            line-height:30px;
            padding:10px;
            background:#fff;
            color:#000;
        }
        .m-label{
            float:left;
            width:100px;
            font-size:16px;
        }
        .m-input{
            height:30px;
            line-height:30px;
            font-size:16px;
            border:0;
            width:120px;
        }
    </style>
    
     <script>
     	function doLogin(){
     		$("#loginform").submit();
     	}
     </script>
   
</head>
<body>
 <div class="easyui-panel" title="智慧生态种植系统登录" data-options="fit:true,border:false">
        <div style="text-align:center;margin:20px;overflow:hidden">
            <img src="${imagepath}/login1.jpg" style="margin:0">
        </div>
        <form id="loginform" action="${webcontext}/greenhouse/login" method="post">
        <div style="padding:0 20px">
            <div class="m-item" style="border-bottom:1px solid #eee">
                <div class="m-label">账号</div>
                <div><input class="m-input" placeholder="Type username" name="userName"></div>
            </div>
            <div class="m-item">
                <div class="m-label">密码</div>
                <div><input class="m-input" type="password" placeholder="Type password" name="userPwd"></div>
            </div>
            <div style="text-align:center;margin-top:30px">
                <a href="javascript:doLogin();" class="easyui-linkbutton" style="width:40%"><span style="font-size:16px">登录</span></a>
                <a href="javascript:void(0)" class="easyui-linkbutton" style="width:40%"><span style="font-size:16px">注册</span></a> 
            </div>
        </div>
        </form>
    </div>
    
</body>    
</html>