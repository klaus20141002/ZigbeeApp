<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>定时任务运行记录查询</title>
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
	<%@include file="../../include/include.jsp"%>
	<link rel="stylesheet" type="text/css" href="${csspath}/public.css"/>
	<link rel="stylesheet" type="text/css" href="${csspath}/style_l.css"/>
	<link rel="stylesheet" type="text/css" href="${csspath}/validationEngine.jquery.css"/>
	<link rel="stylesheet" type="text/css" href="${csspath}/jquery.alerts.css" />
	<link rel="stylesheet" type="text/css" href="${csspath}/datepicker.css"/>

	<script src="${jspath}/jquery/jquery-1.4.4.js" type="text/javascript"></script>
	<script src="${jspath}/jquery/jquery.ui.min.js" type="text/javascript" ></script>
	<script src="${jspath}/ui.datepicker_zh-CN.js" type="text/javascript" ></script>
	<script src="${jspath}/jquery/jquery.blockUI.js" type="text/javascript" ></script>
    <script src="${jspath}/jquery.selectAll.js" type="text/javascript" ></script>
	<script src="${jspath}/public.js" type="text/javascript" ></script>
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

    </script>
    
  </head>

  <body>
	
	<!-- content -->
	<div id="content">
	  <!-- wrap -->
	  <div id="wrap">      
      
        <!-- breadcrumb -->
        <div id="breadcrumb">
            <span>定时任务运行记录查询</span>
        </div>
        <!-- /breadcrumb -->       
        <form:form id="queryForm" action="${webcontext}/common/job/getJobs" method="post" modelAttribute="queryJobDto">
		
	    <!-- search_div -->
	    <div class="search_div">
	      <div class="spliter h_10"></div>
	      <table class="search_tab">
	        <tr>
	          <td class="label">任务名称：</td>
	          <td>
	          <form:input path="jobName" cssClass="validate[optional,length[0,100]] text"/>
	          
	          </td>
	          <td class="label">任务类型：</td>
	          <td>
	          <form:select path="jobType" cssClass="sel">
		          <option value="0">请选择</option>
		          <form:options items="${typeMap}"/>
	          </form:select>
	          
              </td>
	          <td class="label">运行状态：</td>
	          <td>
	          
	           <form:select path="jobStatus" cssClass="sel">
		          <option value="0">请选择</option>
		          <form:options items="${statusMap}"/>
	          </form:select>
	          
              </td>
	          <td class="label">&nbsp;</td>
	          <td>&nbsp;</td>
            </tr>
	        <tr>
	          <td class="label">执行开始时间：</td>
	          <td>
	          <form:input path="exeStartTime" cssClass="text date"/>
	          </td>
	          <td class="label">执行结束时间：</td>
	          <td>
	          <form:input path="exeEndTime" cssClass="text date"/>
	          </td>
	          <td class="label">&nbsp;</td>
	          <td>&nbsp;</td>
	          <td class="label">&nbsp;</td>
	          <td>&nbsp;</td>
            </tr>
          </table>
	      <div class="spliter h_5"></div>
	      <div class="btn_div">
	        <input type="submit" class="btn" onclick="return onSubmit();" value="查询"/>
	        <input type="reset" class="btn" value="重置"/>
          </div>
	      <div class="spliter h_10"></div>
        </div>
	    <!-- /search_div -->        
        
	    <div class="spliter h_10"></div>         
 
	    <!-- page_div -->
	    <div class="page_div">   
        <div class="page_info">
                   
				</div>     
	      <div class="page_opts">
				<%@include file="../../common/headerpage.jsp"%>
			</div>
        </div>
	    <!-- /page_div -->
        
	    <!-- data_div -->
	    <div class="data_div">
	      <table class="data_tab">
	        <tr>
	          <th>任务编号</th>
              <th>任务名称</th>
	          <th>执行周期</th>
	          <th>任务状态</th>
	          <th>执行开始时间</th>
	          <th>执行结束时间</th>
	          <th>任务描述</th>
	          <th>人工处理</th>
            </tr>
            <core:forEach items="${jobs}" var="job"> 
				<tr <core:if test="${job.jobStatus == 2 || job.jobStatus == 3}">style="background-color: red"</core:if>>
					  <td class="">${job.jobNum}</td>
		              <td class="">${job.jobName}</td>
			          <td>${job.jobTypeValue}</td>
			          <td>${job.jobStatusValue}</td>
			          <td><fmt:formatDate value="${job.exeStartTime}" type="date" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			          <td><fmt:formatDate value="${job.exeEndTime}" type="date" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			          <td >${job.jobDesc}</td>
					  <core:if test='${job.processStatus=="true"}'>
						<td colspan="1" >处理中...</td>
						</core:if>
					  <core:if test='${job.processStatus=="false"}'>
			          <td ><a href="${webcontext}/common/job/retryJob/${job.jobName}">重试</a></td>
			          </core:if>			          
			  </tr>
			  </core:forEach>
          </table>
        </div>
	    <!-- /data_div -->
        
	    <!-- page_div -->
	    <div class="page_div">
			<%@include file="../../common/page.jsp"%>
		</div>
	    <!-- /page_div -->
	    </form:form>
      </div>
	  <!-- /wrap -->
  </div>
  <!-- /content -->

  </body>
</html>