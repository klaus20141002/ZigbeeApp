<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="/tld/doss.tld" prefix="doss" %>
<html>
	
  <head>
  	<meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <title>消息查询</title>
	 <%@include file="../../include/include.jsp"%>
	<link rel="stylesheet" type="text/css" href="${csspath}/public.css"/>
	<link rel="stylesheet" type="text/css" href="${csspath}/style_l.css"/>
    <link rel="stylesheet" type="text/css" href="${csspath}/jquery.alerts.css" />
	<link rel="stylesheet" type="text/css" href="${csspath}/datepicker.css"/>
	<script type="text/javascript" src="${jspath}/jquery/jquery-1.4.4.js"></script>
	<script type="text/javascript" src="${jspath}/jquery/jquery.ui.min.js"></script>
	<script type="text/javascript" src="${jspath}/jquery/jquery.blockUI.js"></script>
    <script type="text/javascript" src="${jspath}/jquery/jquery.ui.draggable.js"></script>
    <script type="text/javascript" src="${jspath}/ui.datepicker_zh-CN.js"></script>
    <script type="text/javascript" src="${jspath}/jquery/jquery.alerts.js"></script>
    <script type="text/javascript" src="${jspath}/public.js"></script>
    <link rel="stylesheet" type="text/css" href="${webcontext}/css/validationEngine.jquery.css" />
    <script type="text/javascript" src="${jspath}/jquery/validate/jquery.validationEngine.js"></script>
    <script type="text/javascript" src="${jspath}/jquery/validate/jquery.validationEngine-zh.js"></script>
    <script type="text/javascript" src="${jspath}/common.js"></script>
    <script type="text/javascript" src="${jspath}/load_layer.js"></script>
    <!-- 联动设置 -->
    <script type="text/javascript" src="${jspath}/selectCascade.js"></script>
	<style type="text/css">
	.data_tab td{
		color: black;
	}
	</style>
	<script>
	
	
	function redoMessage(){
	/*
		$.get("${webcontext}/common/message/redoMessage?logId="+id,
			 function(data) {
				if (data == "true")
			    {
					$("#search_message").submit();
			    }else{
			    	jAlert("消息重发失败;","提示信息");
    			}
         });
	*/
		$.ajax({
			url : "${webcontext}/common/message/redoJmsFromMessageLog",
			type : "post",
			data : {"operationDateFrom":$("operationDateFrom").val()},
			beforeSend : function () {
				openBlockUI('request_div');
			},
			complete : function () {
				$.unblockUI();
			},
			success : function(data){
				//$("#search_message").submit();
				jAlert("消息重做成功;","提示信息");
			}
		});
	}
	function search(){
    	$("#search_message").submit();
    }
	</script>
  </head>

  <body>
	<!-- content
	<div id="content"> -->
		<!-- wrap -->
		<div id="wrap">
            <form:form id="search_message" action="${webcontext}/common/message/redoJmsFromMessageLog" method="post" modelAttribute="queryDto">
			<!-- breadcrumb -->
			<div id="breadcrumb">
				<div class="left">
					<span>消息查询</span>
					<span></span>
					<span></span>
				</div>
			</div>
			<!-- /breadcrumb -->				        
		<div class="spliter h_10"></div>  
			<div class="search_div">
				<div class="spliter h_10"></div>
				<table class="search_tab">
					<tr>
						<td class="label">消息执行日期：</td>
						<td>
							<form:input path="operationDateFrom"  cssClass="validate[custom[dateOrNull]] text date"/>
						</td>

						<td colspan="4" class="left">
							<input type="submit" class="btn" value="执行"/>
						</td>
					</tr>
				</table>
				<div class="spliter h_10"></div>
			</div>
		  
		
		<!-- data_div -->

	    <!-- /data_div -->

		</form:form>
		</div>
		<!-- /wrap -->
		<div class="block_div" id="request_div">
				<div class="title">
					<span>请求提示</span>
				</div>
                 <div class="spliter h_5"></div>
                 <div align="center" class="btn_div" style="height:50px">
                 		 <font size="3">数据处理中，请稍等.....</font>
                 </div>
		</div>
	<!--</div>
	 /content -->

  </body>
</html>