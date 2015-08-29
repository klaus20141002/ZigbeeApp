<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="/tld/doss.tld" prefix="doss" %>
<html>
	
  <head>
  	<meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <title>消息查询</title>
	<link rel="stylesheet" type="text/css" href="${csspath}/public.css"/>
	<link rel="stylesheet" type="text/css" href="${csspath}/style_l.css"/>
    <link rel="stylesheet" type="text/css" href="${csspath}/jquery.alerts.css" />
	<script type="text/javascript" src="${jspath}/jquery/jquery-1.4.4.js"></script>
	<script type="text/javascript" src="${jspath}/jquery/jquery.ui.min.js"></script>
	<script type="text/javascript" src="${jspath}/jquery/jquery.blockUI.js"></script>
    <script type="text/javascript" src="${jspath}/jquery/jquery.ui.draggable.js"></script>
    <script type="text/javascript" src="${jspath}/jquery/jquery.alerts.js"></script>
    <script type="text/javascript" src="${jspath}/public_ui_embed.js"></script>
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
	
	var needAlertTemp=${needAlert};
	if(needAlertTemp){			
		parent.parent.document.getElementById('needAlert').value='true';
	}
	function openBlockUI(id){
		$.blockUI({
			message : $("#"+id),
			css : {
				width:		'auto',
				top:		'30%',
				left:		'30px',
				textAlign:	'left',
				color:		'#000',
				border:		'none',
				backgroundColor:'#fff',
				cursor:		'default'
			}
	 	});
	}
	
	function redoMessage(id,isUnhandle){
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
			url : "${webcontext}/common/message/redoMessage",
			type : "GET",
			data : {"logId":id,"isUnhandle":isUnhandle},
			beforeSend : function () {
				openBlockUI('request_div');
			},
			complete : function () {
				$.unblockUI();
			},
			success : function(data){
				$("#search_message").submit();
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
            <form:form id="search_message" action="${webcontext}/common/message/queryMessageForMonitorPage" method="post">
			<!-- breadcrumb -->
			<div id="breadcrumb">
				<div class="left">
					<span>DOSS消息监控</span>
					<span></span>
					<span><a target="_blank" href="${webcontext}/common/message/queryMessage">更多...</a></span>
				</div>
			</div>
			<!-- /breadcrumb -->
	        
		<div class="spliter h_10"></div>    
		
		<!-- data_div -->
	    <div class="data_div">
	      <table class="data_tab" style="width: 480px;">
	        <tr style="width: 480px;">
			  <th class="w_15">接口名称</th>
			  <th class="w_15">执行周期</th>
              <!--<th>来源</th>
	          <th>目的地</th>
	          <th>类型</th>
	          <th>状态</th>
	          -->
	          <th class="w_5">成功数</th>
	          <th class="w_5">失败数</th>
	          <th class="w_5">未处理数</th>
	          <th class="w_8">处理失败</th>
            </tr>
            <core:forEach items="${resultList}" var="result"> 
				<tr <core:if test="${result.status == 3}">style="background-color: red"</core:if>>
					<td >${result.name}</td>
					<td >${result.jmsCycleDesc}</td>
					<!--<td>${result.source}</td>
					<td>${result.target}</td>
					<td>${result.type}</td>
					<td>${result.strStatus}</td>
					--><td >${result.successCount}</td>
					<td>${result.failureCount}</td>
					<td>${result.unhandleCount}</td>
					<core:if test='${result.processStatus=="true"}'>
					<td >处理中...</td>
					</core:if>
					<core:if test='${result.processStatus=="false"}'>
                    <td style="text-align: center"><core:if test="${result.status == 3}"><input type="button" class="btn" value="重试" onclick="redoMessage('${result.id}','false');"/></core:if></td>                    
                    </core:if>
			   </tr>
			</core:forEach>
          </table>
        </div>
	    <!-- /data_div -->
		<!-- /page_div -->
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