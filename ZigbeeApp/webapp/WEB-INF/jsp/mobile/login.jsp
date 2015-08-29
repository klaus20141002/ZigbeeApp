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
            height:42px;
            line-height:30px;
            padding:10px;
            background:#fff;
            color:#000;
        }
        .m-label{
        	margin-left:30px;
            float:left;
            width:100px;
            font-size:20px;
        }
        .m-input{
            height:50px;
            line-height:30px;
            font-size:20px;
            border:0;
            width:150px;
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
            <img src="${imagepath}/firstpage.jpg" style="margin:0">
        </div>
        <form id="loginform" action="${webcontext}/greenhouse/login" method="post">
        <div style="padding:0 20px;">
            <div class="m-item" style="border-top:1px solid #eee ; padding-top:0px;">
            <table cellpadding="5"  style="padding:0 20px; text-align:center; margin:0 auto;">
				<tr>
					<td class="image"  style="text-align:center;padding:5px">
					<span class="m-label" style="width:80px;font-size:20px;">账号</span>
					</td>
					<td>
					<input class="m-input" placeholder="Type username" name="userName" 
                style="height:30px;font-size:20px;border:0;width:120px;">
					</td>
					<td>
					<span class="m-label" style="margin-left:10px;width:80px;font-size:20px;">密码</span>
					</td>
					<td>
					<input class="m-input" type="password" placeholder="Type password" name="userPwd"  
                style="height:30px;font-size:20px;border:0;width:120px;">
					</td>
					<td>
					<a href="javascript:doLogin();" class="easyui-linkbutton" style="width:100px;height:30px;margin-left:50px;text-align:center"><span style="font-size:20px">登录</span></a>
                	<a href="javascript:void(0)" class="easyui-linkbutton" style="width:100px;height:30px;margin-left:15px;text-align:center"><span style="font-size:20px">注册</span></a> 
					</td>
				</tr>
			</table>
            </div>
        </div>
        </form>
    </div>
    
</body>    
</html>