<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../include/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" type="text/css" href="${csspath}/easyui.css"/>
<link rel="stylesheet" type="text/css" href="${csspath}/icon.css"/>
<link rel="stylesheet" type="text/css" href="${csspath}/public.css" />
<link rel="stylesheet" type="text/css" href="${csspath}/jquery-ui-1.8.6.css" />
<script type="text/javascript" src="${webcontext}/scripts/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="${jspath}/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${jspath}/jquery.ui.min.js"></script>	
<script type="text/javascript" src="${jspath}/public.js"></script>
<script type="text/javascript" src="${jspath}/jquery.blockUI.js"></script>
<script type="text/javascript" src="${jspath}/month_list.js"></script>	
<script type="text/javascript" src="${jspath}/My97DatePicker/WdatePicker.js"></script>	
<script type="text/javascript" src="${jspath}/jquery.dataTables.js"></script>

</head>
   <body>
	<h2>Basic Tree</h2>
	<div class="demo-info">
		<div class="demo-tip icon-tip"></div>
		<div>Click the arrow on the left to expand or collapse nodes.</div>
	</div>
	<div style="margin:10px 0;"></div>
	<ul class="easyui-tree">
		<li>
			<span>Documents</span>
			<ul>
				<li data-options="state:'closed'">
					<span>Photos</span>
					<ul>
						<li>
							<span>Friend</span>
						</li>
						<li>
							<span>Wife</span>
						</li>
						<li>
							<span>Company</span>
						</li>
					</ul>
				</li>
				<li>
					<span>Program Files</span>
					<ul>
						<li>Intel</li>
						<li>Java</li>
						<li>Microsoft Office</li>
						<li>Games</li>
					</ul>
				</li>
				<li>
				<span>Type</span>
				<ul>
				<li>A</li>
				<li>B</li>
				<li>C</li>
				</ul>
				
				
				</li>
				<li>about</li>
				<li>welcome</li>
			</ul>
		</li>
	</ul>
   <h2>Basic DateTimeBox</h2>
    <div class="demo-info">
        <div class="demo-tip icon-tip"></div>
        <div>Click the calendar image on the right side.</div>
    </div>
    <div style="margin:10px 0;"></div>
    <input class="easyui-datetimebox" required style="width:150px"></input>
        <h2>Basic ComboTree</h2>
    <div class="demo-info">
        <div class="demo-tip icon-tip"></div>
        <div>Click the right arrow button to show the tree panel.</div>
    </div>
    <div style="margin:10px 0"></div>
    <input class="easyui-combotree" data-options="url:'${webcontext}/studentController/listForEasyUiDemo01',method:'get',required:true" style="width:200px;">
    
    
    <h2>Basic SearchBox</h2>
	<div class="demo-info">
		<div class="demo-tip icon-tip"></div>
		<div>Click search button or press enter key in input box to do searching.</div>
	</div>
	<div style="margin:10px 0;"></div>
	<input class="easyui-searchbox" data-options="prompt:'Please Input Value',searcher:doSearch" style="width:300px"></input>
	<script>
		function doSearch(value){
			alert('You input: ' + value);
		}
	</script>
     <h2>Basic ValidateBox</h2>
    <div class="demo-info">
        <div class="demo-tip icon-tip"></div>
        <div>It's easy to add validate logic to a input box.</div>
    </div>
    <div style="margin:10px 0;"></div>
    <div class="easyui-panel" title="Register" style="width:400px;padding:10px">
        <table>
            <tr>
                <td>User Name:</td>
                <td><input class="easyui-validatebox" data-options="required:true,validType:'length[3,10]'"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input class="easyui-validatebox" data-options="required:true,validType:'email'"></td>
            </tr>
            <tr>
                <td>Birthday:</td>
                <td><input class="easyui-datebox"></td>
            </tr>
            <tr>
                <td>URL:</td>
                <td><input class="easyui-validatebox" data-options="required:true,validType:'url'"></td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td><input class="easyui-validatebox" data-options="required:true"></td>
            </tr>
        </table>
    </div>
</body>
</html>