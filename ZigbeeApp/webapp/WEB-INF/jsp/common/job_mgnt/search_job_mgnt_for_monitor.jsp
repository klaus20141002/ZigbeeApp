<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>定时任务运行记录查询</title>
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
	<link rel="stylesheet" type="text/css" href="${csspath}/public.css"/>
	<link rel="stylesheet" type="text/css" href="${csspath}/style_l.css"/>
	<link rel="stylesheet" type="text/css" href="${csspath}/validationEngine.jquery.css"/>
	<link rel="stylesheet" type="text/css" href="${csspath}/jquery.alerts.css" />

	<script src="${jspath}/jquery/jquery-1.4.4.js" type="text/javascript"></script>
	<script src="${jspath}/jquery/jquery.ui.min.js" type="text/javascript" ></script>
	<script src="${jspath}/jquery/jquery.blockUI.js" type="text/javascript" ></script>
    <script src="${jspath}/jquery.selectAll.js" type="text/javascript" ></script>
	<script src="${jspath}/public_ui_embed.js" type="text/javascript" ></script>
	<script src="${jspath}/jquery/jquery.alerts.js" type="text/javascript"></script>
	
    <script type="text/javascript" src="${jspath}/load_layer.js"></script>
	<script type="text/javascript" src="${jspath}/jquery/validate/jquery.validationEngine.js"></script>
    <script type="text/javascript" src="${jspath}/jquery/validate/jquery.validationEngine-zh.js"></script>
	<style type="text/css">
	.data_tab td{
		color: black;
	}
	</style>
    
    <script type="text/javascript" >
	    function onSubmit(){
	   	 
			 if(!compareDate("exeStartTime","exeEndTime","exeEndTime","执行结束时间必须晚于执行开始时间")){
					return false;
			 } 
			 return true;
	    }  
        
		$(function(){		
			$("#queryForm").validationEngine(
    				{
    	             promptPosition:"topLeft",
    	             validationEventTriggers:"change blur",
    	             success:false,
    				 failure:function(){} 
    		});
		});
		var needAlertTemp=${needAlert};
		//alert(parent.frames);
		//alert(window.frames.monitorFrame);
		//alert(parent.parent.frames.length);
		//alert(parent.parent.document.getElementById('needAlert'));
		if(needAlertTemp){			
			parent.parent.document.getElementById('needAlert').value='true';
		}
		//if(needAlertTemp){
			//setNeedAlert(needAlertTemp);
		//}//
		
    </script>
    
  </head>

  <body>
	
	<!-- content -->
	<div id="content">
	  <!-- wrap -->
	  <div id="wrap">      
      
        <!-- breadcrumb -->
        <div id="breadcrumb">
            <span>DOSS定时任务监控</span>
            <span></span>
            <span><a target="_blank" href="${webcontext}/common/job/getJobs">更多...</a></span>
        </div>
        <!-- /breadcrumb -->       
        <form:form id="queryForm" action="${webcontext}/common/job/getJobsForMonitor" method="post" modelAttribute="queryJobDto">
		 
        
	    <div class="spliter h_10"></div>         
 
        
	    <!-- data_div -->
	    <div class="data_div">
	      <table class="data_tab" style="width: 480px;">
	        <tr style="width: 480px;">
              <th class="w_15">任务名称</th>
	          <th class="w_7">执行周期</th>
	          <th class="w_5">任务状态</th>
	          <th class="w_8">执行开始时间</th>
	          <th class="w_8">执行结束时间</th>
	          <!--<th class="w_15">任务描述</th>
	          --><th class="w_5">人工处理</th>
            </tr>
            <core:forEach items="${jobs}" var="job"> 
				<tr style="background-color: red">
					  <!--<td class="">${job.jobNum}</td>
		              --><td class="">${job.jobName}</td>
			          <td>${job.jobTypeValue}</td>
			          <td>${job.jobStatusValue}</td>
			          <td><fmt:formatDate value="${job.exeStartTime}" type="date" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			          <td><fmt:formatDate value="${job.exeEndTime}" type="date" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			          <!--<td >${job.jobDesc}</td>
			          -->
			          <core:if test='${job.processStatus=="true"}'>
						<td colspan="1" >处理中...</td>
						</core:if>
					  <core:if test='${job.processStatus=="false"}'>
			          <td ><a href="${webcontext}/common/job/retryJobForMoniotr/${job.jobName}">重试</a></td>
			          </core:if>
			  </tr>
			  </core:forEach>
          </table>
        </div>
	    <!-- /data_div -->
        
	    </form:form>
      </div>
	  <!-- /wrap -->
  </div>
  <!-- /content -->

  </body>
</html>