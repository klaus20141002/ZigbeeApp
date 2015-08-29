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
    
    <script src="${jspath}/Charts/highcharts.js" type="text/javascript"></script>
    <script src="${jspath}/Charts/exporting.js" type="text/javascript"></script>
     <style type="text/css">
       p{
            line-height:150%;
        }
        .panel-title{
            text-align:center;
            font-size:14px;
            font-weight:bold;
            text-shadow:0 -1px rgba(0,0,0,0.3);
        }
        .datagrid-row,.datagrid-header-row{
            height:35px;
        }
        .datagrid-body td{  
            border-right:1px dotted;  
            border-bottom:1px dotted; 
            border-color: #222;
        }  
    </style>
    <script>
    </script>
</head>
<body>

<div region="north" border="true" style="background: #2E2528; height: 60px; width: 100%;float:left;overflow: hidden;">
        <div style="float: left;">
            <div style="float: left;">
                <span id="tit" style="float: left; padding: 10px; font-family: 幼圆; font-size: 24px; color: White;">智慧生态种植系统</span></div>
            
        </div>
    </div>

    <div class="easyui-tabs" data-options="fit:true,border:false,plain:true">
        <div title="运行模式" style="padding:10px">
        	<iframe src="${webcontext}/greenhouse/toeditschedule" width="100%" id="chartfr" height="100%" frameborder="0">
           </iframe>
        </div>
        <div title="时间设置" style="padding:10px">
        	<iframe src="${webcontext}/greenhouse/toThresholdConfig?cfgType=3" width="100%" id="chartfr" height="100%" frameborder="0">
           </iframe>
        </div>
        <div title="光照度设置" style="padding:10px">
        	<iframe src="${webcontext}/greenhouse/toLightTriggerConfig" width="100%" id="chartfr" height="100%" frameborder="0">
           </iframe>
        </div>
        <div title="返回控制页" style="padding:10px">
        <a href="${webcontext}/greenhousemobile/toAutoControlPage"><img id="linkMode2" src="${imagepath}/enter_auto.jpg"/></a>
        </div>
    </div>
   
   <script type="text/javascript">
   </script>
</body>    
</html>