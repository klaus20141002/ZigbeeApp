<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../include/include.jsp"%>
<html>

<head>
    <title>上海通用经销商管理系统</title>
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <%@include file="../include/include.jsp"%>
	<link rel="stylesheet" type="text/css" href="${csspath}/main.css"/>
	<script type="text/javascript" src="${jspath}/jquery-1.4.4.js"></script>
	<script type="text/javascript" src="${jspath}/main.js"></script>	
	<script>
        var lastSubMenuId;

        function doRecord(subMenuId){
            $('#' + subMenuId).hide();
            lastSubMenuId = subMenuId;
        }

        function hideLastSubMenu(){
            if(lastSubMenuId == undefined || lastSubMenuId == ""){
                return;
            } else{
            	$('#' + lastSubMenuId).hide();
            }
  	    }	
        
		function showSubMenu(submenu){

            //if(lastSubMenuId == submenu){
            	//$('#' + lastSubMenuId).hide();
            	//return;
            //}

            if(lastSubMenuId == undefined){
            	doRecord(submenu);
            } else {
            	hideLastSubMenu();
            	doRecord(submenu);
            }
            $('#' + submenu).show();
	    }	
	   
	</script>

</head>

<body>
	
	<!-- container -->
	<div id="container">

		<!-- logo -->
		<div id="logo">
			<div class="right">
				<div class="info">
					<span>欢迎您：</span>
					<span>张小北</span>
				</div>
				<a id="exit" href="javascript: logout();" title="退出系统"></a>
				<div class="opts">
					<a class="home" href="${webcontext}/mainpage/loginData" target="doss_inner">首页</a>
					<a class="set" href="#">设置</a>
					<a class="help" href="#">帮助</a>
				</div>
			</div>
		</div>
		<!-- /logo -->

		<!-- menu -->
		<div id="menu">
			<ul>
			  <core:forEach items="${menuItems}" var="item">	
				   <li>
				       <a href="http://doss.shanghaigm.com:8080/doss/storage" target="doss_inner" onmouseover="showSubMenu('${item.menuName}')"><span><core:out value="${item.menuName}"/></span></a>
				       <div id="${item.menuName}" style="display:none;" >
					       <core:if test="${item.subMenus != null}">
						       <ul>
						        <core:forEach items="${item.subMenus}" var="subItem">
						          <li><a><span><core:out value="${subItem.menuName}"/></span><a/></li>
						        </core:forEach>
						       </ul>
						   </core:if>       
				       </div>
				   </li>
			  </core:forEach>
			  <li>
				<a href="http://doss.shanghaigm.com:8080/doss/storage2" target="doss_inner" ><span>test2</span></a>
		      </li>
		      <li>
				<a href="${webcontext}/ge/shortcutmenu/config" target="doss_inner" ><span>快捷菜单设置</span></a>
		      </li>
		      <li>
				<a href="${webcontext}/dm/dealer/worktransfer/toWorkTransferPage" target="doss_inner" ><span>移交工作</span></a>
		      </li>
			</ul>
		</div>
		<!-- /menu -->

		<!-- warn : doing success fail -->
		<div id="warn">
			<p class="doing">
				<span>正在执行某项操作...</span>
			</p>
		</div>
		<!-- /warn -->

		<!-- content -->
		<div id="content">
			<!-- nav -->
			<div id="nav">
				<div class="top">
					<a id="set" title="设置快捷键"></a>
				</div>
				<div class="tags" id="shortMenu">
				<core:forEach items="${shortcutMenu}" var="menu">
					<a href="${menu.url}">
						<img src="${imagepath}/${menu.phoneUrl}"/>
						<span>${menu.menuName}</span>
					</a>
				</core:forEach>
				<!-- 	<a href="#">
						<img src="${imagepath}/nav/tag_ztll.jpg"/>
						<span>来电来函</span>
					</a>
					<div class="line"></div>
					<a href="#">
						<img src="${imagepath}/nav/tag_ztll.jpg"/>
						<span>展厅流量</span>
					</a>
					<div class="line"></div>
					<a href="#">
						<img src="${imagepath}/nav/tag_dsfgm.jpg"/>
						<span>第三方购买</span>
					</a>
					<div class="line"></div>
					<a href="#">
						<img src="${imagepath}/nav/tag_yhxf.jpg"/>
						<span>用户下发</span>
					</a>
					<div class="line"></div>
					<a href="#">
						<img src="${imagepath}/nav/tag_yhxf.jpg"/>
						<span>市场活动</span>
					</a>
					<div class="line"></div>
					<a href="#">
						<img src="${imagepath}/nav/tag_yhxf.jpg"/>
						<span>客户分群</span>
					</a>
					 -->
				</div>
			</div>
			<!-- /nav -->
			<!-- iframe_div -->
			<div id="iframe_div">
				<!-- iframe_top -->
				<div id="iframe_top"></div>
				<!-- /iframe_top -->
				<!-- iframe -->
				<div id="iframe">
					<iframe name="doss_inner" src="${webcontext}/mainpage/loginData" width="100%" height="100%"
						frameborder="0" marginwidth="0" marginheight="0"></iframe>
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
			<span class="role">
				<span>角色：</span>
				<span>系统管理员</span>
			</span>
			<span class="date">
				<span>登录时间：</span>
				<span>2011年3月14日</span>
			</span>
			<span class="state">
				<span>连接状态：</span>
				<span>已连接XXX</span>
			</span>
		</div>
		<!-- /info -->

	</div>
	<!-- /container -->

  </body>

</html>