<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <%@include file="../include/include.jsp"%>
	<link href="${csspath}/main.css" rel="stylesheet" type="text/css" />
	<script src="${jspath}/jquery/jquery-1.4.4.js" type="text/javascript"></script>
	<script src="${jspath}/main.js" type="text/javascript"></script>
	<script src="${jspath}/jquery/jquery.ui.min.js" type="text/javascript"></script>
	<script src="${jspath}/public.js" type="text/javascript"></script>
	<script src="${jspath}/common.js" type="text/javascript"></script>	
	<script type="text/javascript" src="${jspath}/jquery/jquery.ui.draggable.js"></script>
	<script type="text/javascript" src="${jspath}/jquery/jquery.alerts.js"></script>
	<link rel="stylesheet" type="text/css" href="${csspath}/jquery.alerts.css" />
	<script type="text/javascript" src="${jspath}/jquery/jquery.ellipsis.js"></script>
<title>上海通用经销商管理系统</title>
    <script type="text/javascript">
       function registerShortcutEvent(){
    	   
    	   $(".shortcut").click(function(){
	   			var parentMenuName = $(this).attr("parentMenuName");
	   			var secondMenuName = $(this).attr("secondMenuName");
	   			$("#active1").text(parentMenuName);
				$("#active2").text(secondMenuName);
				
				showBoder();
	   		});
    	   
       }
       
       function showBoder(){
    	   $("#iframe_div").removeClass("iframe_divNoBod");
		   $("#iframe_div").addClass("iframe_div");
       }
       
       function hideBoder(){
    	   $("#iframe_div").removeClass("iframe_div");
		   $("#iframe_div").addClass("iframe_divNoBod");
       }
    
    
    	$(function(){
    		
    		$(".longtext").wordLimit(3);
    		
    		$(".menu_i").click(function(){
    			 showBoder();
    		});
    		
    		
    		$("#set,.set,.change,.help").click(function(){
    			showBoder();
    		}); 
    		
    		
    		$(".home").click(function(){
    			$("#iframe_div").removeClass("iframe_div");
    			$("#iframe_div").addClass("iframe_divNoBod");
    		});
    		
    		$("#homeLink").click(function(){
    			$("#iframe_div").removeClass("iframe_div");
    			$("#iframe_div").addClass("iframe_divNoBod");
    		}); 
    		
    		
    		
    		 var image = 'url("${imagepath}/logo/bui-logo.jpg") no-repeat';
    		 $("#logo").css("background", image);
    		
    		$("#exit").click(function(){
    			window.location.href = "${webcontext}/logout";
    		});
    		
    		registerShortcutEvent();
			
		});
    </script>
    <script type="text/javascript">
		
		//火狐识别innerText
		function isIE(){ //ie?
			if (window.navigator.userAgent.toLowerCase().indexOf("msie")>=1)
			return true;
			else
			return false;
			}
			
			if(!isIE()){ //firefox innerText define
			HTMLElement.prototype.__defineGetter__(     "innerText",
			function(){
			var anyString = "";
			var childS = this.childNodes;
			for(var i=0; i<childS.length; i++) {
			if(childS[i].nodeType==1)
			anyString += childS[i].tagName=="BR" ? '\n' : childS[i].textContent;
			else if(childS[i].nodeType==3)
			anyString += childS[i].nodeValue;
			}
			return anyString;
			}
			);
			HTMLElement.prototype.__defineSetter__(     "innerText",
			function(sText){
			this.textContent=sText;
			}
			);
		}
		
		// 得到一级、二级菜单值，写到active中
		$(function(){			
			$("#active1").hide();
			$("#active2").hide();			
			$(".menu_i").click(function(){
				var m1 = $(this).parent().parent(".menu_list").parent(".Mainmenu").children().eq(0).text();
				var m2 = $(this).text();
				$("#active1").text(m1);
				$("#active2").text(m2);
			});			
		})
		//lu
    		$(function(){
				   
			/*$(".menu").append("<iframe class='menu_iframe'></iframe>");*/
			
			var isIE=!!window.ActiveXObject;
			var isIE6=isIE&&!window.XMLHttpRequest;
			
				$(".Mainmenu").append("<iframe class='menu_iframe'></iframe>");
			
			
			
			$(".Mainmenu").mouseover(function(){

				
					$(this).children(".menu_iframe").show();
				
			});		
			$(".Mainmenu").mouseout(function(){		
				$(".menu_iframe").hide();
				
			});
			});
    </script>
<style>
/* common styling */
/* set up the overall width of the menu div, the font and the margins */
.menu_iframe {
	position:absolute;
	z-index:-1;
	filter:Alpha(Opacity=0);
	margin-left:-1px;
	left:0;
	height:600px;
	width:320px;
	display:none;
}
.menu {
	font-family: arial, sans-serif;
	margin:0;
	height:30px;
	width:auto;
	background:url(images/menu/menu_bg.jpg);
}
/* remove the bullets and set the margin and padding to zero for the unordered list */
.menu ul {
	padding:0;
	margin:0;
	list-style-type: none;
}
/* float the list so that the items are in a line and their position relative so that the drop down list will appear in the right place underneath each list item */
.menu ul li {
	float:left;
	position:relative;
}
/* style the links to be 104px wide by 30px high with a top and right border 1px solid white. Set the background color and the font size. */
.menu ul li a, .menu ul li a:visited {
	display:block;
	text-align:left;
	text-decoration:none;
	height:30px;
	color:#5aa0ba;
	line-height:30px;
	font-size:12px;
	padding:0 12px 0 12px;
	float:left;
	font-weight:bold;
	background:url(images/menu/fengefu.jpg) left top no-repeat;
}
/* make the dropdown ul invisible */
.menu ul li ul {
	display: none;
}
.menu ul li a.homeMune,.menu ul li a:hover.homeMune{ background:url(images/menu/home_mune.jpg) center top no-repeat; padding-left:30px; }

/* specific to non IE browsers */
/* set the background and foreground color of the main menu li on hover */
.menu ul li:hover a {
	color:#fff;
	background:url(images/menu/menu_bg_over.jpg) left center repeat-x;
	padding-left:12px;
}
/* make the sub menu ul visible and position it beneath the main menu list item */
.menu ul li:hover ul {
	display:block;
	position:absolute;
	top:29px;
	left:0;
	z-index:100;
	border:1px solid #000;
}
/* style the background and foreground color of the submenu links */
.menu ul li:hover ul li a {
	display:block;
	background:#32647d;
	color:#fff;
	width:280px;
	text-align:left;
	padding-left:5px;
	border-top:1px solid #3e3e3e;
}
/* style the background and forground colors of the links on hover */
.menu ul li:hover ul li a:hover {
	background:#b9e1ea;
	color:#215d8d;
}

.menu ul li.homeMune a,.menu ul li.homeMune a:hover{ background:none; }
</style>
<!--[if lte IE 6]>
<style>
/* styling specific to Internet Explorer IE5.5 and IE6. Yet to see if IE7 handles li:hover */
/* Get rid of any default <span href="tag.php?name=tab" onclick="tagshow(event)" class="t_tag">tab</span>le style */
table {
border-collapse:collapse;
margin:0;
padding:0;
}
/* ignore the link used by 'other browsers' */
.menu ul li a.hide, .menu ul li a:visited.hide {
display:none;
}
/* set the background and foreground color of the main menu link on hover */
.menu ul li a:hover {
color:#fff;
background:url(images/menu/menu_bg_over.jpg) left center repeat-x;
padding-left:12px;
}
/* make the sub menu ul visible and position it beneath the main menu list item */
.menu ul li a:hover ul {
display:block;
position:absolute;
top:29px;
left:0;
border:1px solid #000;
z-index:9999;
}
/* style the background and foreground color of the submenu links */
.menu ul li a:hover ul li a {
background:#32647d;
color:#fff;
width:280px;
border-top:1px solid #3e3e3e; 
}
/* style the background and forground colors of the links on hover */
.menu ul li a:hover ul li a:hover {
background:#b9e1ea;
color:#215d8d;
}
</style>
<![endif]-->
</head>
<body>
<form:form id="toUpdatePwd" action="${webcontext}/login/toUpdate" target="doss_inner" method="get"></form:form>
<core:if test="${AboutToExpired!=null}">
	<script>
		$(function(){
			jConfirm("您的密码即将过期,是否修改密码？","操作提示",function(result){
				if(result == true){
					$("#toUpdatePwd").submit();
				}
			});
		});
	</script>
</core:if>
	<div id="active1"></div>
    <div id="active2"></div>
	<!-- container -->
	<div id="container">

		<!-- logo -->
		<div id="logo">
			<div class="right">
				<div class="info">
					<span>${currentUserGroup.userGroupName }：</span>
					<span>${currentUser.name }</span>
				</div>
				<a id="exit" href="#" title="退出系统"></a>
				<div class="opts">
					<a class="home" href="${webcontext}/mainpage/loginData" target="doss_inner">首页</a>
					<a class="set" target="doss_inner" href="${webcontext}/ge/shortcutmenu/config">系统设置</a>
					<a class="change"  target="doss_inner" href="${webcontext}/login/toUpdate">密码修改</a>
					<a class="help" href="${webcontext}/html/main_help.html" target="doss_inner">帮助</a>
				</div>
			</div>
		</div>
        
		<!-- /logo -->


<!--菜单栏-->
	<div class="menu">    
        <ul>  
	        <li class="homeMune">
	        <a id="homeLink" href="${webcontext}/mainpage/loginData" target="doss_inner" title="首页">
	        	<img src="images/menu/home_mune.jpg">
	        </a>
	        </li>
        <core:forEach items="${menuItems}" var="menu">  
       
            <li class="Mainmenu"><a href="#" class="hide">${menu.menuName}</a>
                <!--[if lte IE 6]>
				<a class="Mainmenu1" href="#"><span>${menu.menuName}</span>
				<table><tr><td>
				<![endif]--> 
            	<ul class="menu_list">
            		<core:forEach items="${menu.subMenus}" var="menuItem">
                    	<li>
                    		<core:choose>
                    			<core:when test="${menuItem.absoluteUrl}">
                    				<a href="${menuItem.menuUrl}" target="doss_inner" class="menu_i">${menuItem.menuName}</a>
                    			</core:when>
                    			<core:otherwise>
                    				<a href="${webcontext}/${menuItem.menuUrl}" target="doss_inner" class="menu_i">${menuItem.menuName}</a>
                    			</core:otherwise>
                    		</core:choose>
                    	</li>
                    </core:forEach>
                </ul>
                <!--[if lte IE 6]>
				</td></tr></table>
				</a>
				<![endif]-->
             </li> 
       
      </core:forEach>  
      </ul> 
    </div>
    <!--//菜单栏-->
		

		<!-- warn : doing success fail -->
<!-- 		<div id="warn"> -->
<!-- 			<p class="doing"> -->
<!-- 				<span>正在执行某项操作...</span> -->
<!-- 			</p> -->
<!-- 		</div> -->
		<!-- /warn -->

		<!-- content -->
		<div id="content">
			<!-- nav -->
			<div id="nav">
				<div class="top">
					<a id="set" title="设置快捷键" href="${webcontext}/ge/shortcutmenu/config" target="doss_inner">设置</a>
				</div>
				<div class="tags" id="shortMenu">
				<core:forEach items="${shortcutMenu}" var="menu">
					<!--  <core:if test="${menu.url==''}"> 
							<img src="${imagepath}/${menu.phoneUrl}"/>
							<div class="longtext" style="width:70px;" title="${menu.menuName}"><span>${menu.menuName}</span></div>
						  </core:if>-->
						  <core:if test="${menu.url!=''}"></core:if>
							<a href="${menu.url}" target="doss_inner" class="shortcut" parentMenuName="${menu.parentMenuName}" secondMenuName="${menu.menuName}">
								<img src="${imagepath}/${menu.phoneUrl}"/>
								<div  style="width:68px;overflow:hidden;height:14px; height:12px\9;" title="${menu.menuName}"><span>${menu.menuName}</span></div>
							</a>
						<div class='line'></div>
						
				</core:forEach>
				
				</div>
			</div>
			<!-- /nav -->
			<!-- iframe_div -->
			<div id="iframe_div" class="iframe_divNoBod">
				<!-- iframe_top -->
				<div id="iframe_top"></div>
				<!-- /iframe_top -->
				<!-- iframe -->
				<div id="iframe">
					<iframe name="doss_inner" src="${webcontext}/mainpage/loginData" width="100%" height="100%"
						frameborder="0" marginwidth="0" marginheight="0"  allowtransparency="true"></iframe>
				</div>
				<!-- /iframe -->
				<!-- iframe_bottom -->
				<div id="iframe_bottom"></div>
				<!-- dome_bottom -->
			</div>
			<!-- /iframe_div -->
		</div>
		<!-- /content -->

		<!-- info -->
		<div id="info">
			<div class="info_left">
				<span class="role">
					<span>用户名：</span>
					<span>${currentUser.userCode }</span>
				</span>
				<span class="date">
					<span>登录时间：</span>
					<span><fmt:formatDate value="${currentUser.lastLoginTime }" pattern="yyyy-MM-dd HH:mm:ss" /></span>
				</span>
			</div>
<!-- 			<div class="info_right"> -->
<!-- 				<span class="state"> -->
<!-- 					<span>连接状态：</span> -->
<!-- 					<span>已连接SGM</span> -->
<!-- 				</span> -->
<!-- 			</div> -->
		</div>
		<!-- /info -->

	</div>
	<!-- /container -->

</body>
</html>