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
<script type="text/javascript">
function removeit(){
	alert(2);
	alert(editIndex);
    if (editIndex == undefined){return}
    $('#dg').datagrid('cancelEdit', editIndex)
            .datagrid('deleteRow', editIndex);
    editIndex = undefined;
}
		$(function(){
			
			$('#dlg').dialog('close');
			$('#test').datagrid({
				title:'student',
				//设置标题 
				align : 'center',
				iconCls:'icon-save',
				//一个css类提供背景标记 ，作为标题图标
				width:1200,
				

				//表格宽度
				height:450,
				//表格高度
				nowrap: true,
			
				//是否在一行显示数据
				//fit:ture,
				
				//允许表格自动缩放
				striped: true,
				//是否显示斑马线
				url:'${webcontext}/studentController/listForEasyUi',
				//url:'datagrid_data.json',
				//url: '${webcontext}/aop/checkVersion?time='+new Date(),'
				//从运程请求数据的地址
				method:'GET',
				//远程数据获取类型
				sortName: 'code',
				//定义哪一行可以排序
				sortOrder: 'desc',
				//排序方式  按什么排序递增（asc）或递减（desc）
				idField:'id',
				//指定哪些字段标识字段
				frozenColumns:[[
	                {field:'id',checkbox:true}
	               // {title:'targetVersion',field:'targetVersion',width:80,sortable:true}
	              //与columns属性相通，但这些列将固定在左侧，不得变动
				]],
				columns:[[
			        //{title:'Base Information',colspan:4},
			        //
			      
					
				],[
				   // {field:'version',hidden:'true' },
				    //{field:'version',title:'Duration',width:260},
				    {field:'id',title:'id',width:260,hidden:true},
					{field:'name',title:'姓名',width:260},
					{field:'age',title:'年龄',width:200,rowspan:2,sortable:true},
					{field:'address',title:'地址',width:250,rowspan:2},
					{field:'score',title:'成绩',width:250,rowspan:2},
					
					
				]],
				pagination:true,
				//是否显示底部分的工具栏
				rownumbers:true,
				//是否显示行号
				singleSelect:true
				//是否允许只选择一行
				
			});
			var p = $('#test').datagrid('getPager');
			if (p){
				$(p).pagination({
					onBeforeRefresh:function(){
						alert('before refresh');
					}
				});
			}
		});
		 var url;
	        function newUser(){
	            $('#dlg').dialog('open').dialog('setTitle','New User');
	            $('#fm').form('clear');
	            
	        }
	        function saveUser(){
	        	$("#fm").submit();
	        }
	        function editUser(){
	       
	            var row = $('#test').datagrid('getSelected');
	            alert(row);
	            if (row){
	                $('#dlg').dialog('open').dialog('setTitle','Edit User');
	                $('#fm').form('load',row);
	                $('#fm').attr("action","ssssssss");
	                
	                url = '${webcontext}/studentController/update';
	            }
	        }
		</script>
</head>
<body>
<h2>Basic DateBox</h2>
 
    <div style="margin:10px 0;"></div>
    <input class="easyui-datebox"></input>
  <div id="toolbar">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">New Student</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit Student</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove Student</a>
           <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="removeit()">Remove</a>
    </div>
	<table cellpadding="0" cellspacing="0" class="search_tab" id="test">
	
	</table>


   <div id="dlg" class="easyui-dialog panel-body panel-body-noborder window-body" style="width:400px;height:280px;padding:10px 20px"
            closed="true" buttons="#dlg-buttons">
        <div class="ftitle">Student Information</div>
        <form:form id="fm" method="post" action="${webcontext}/studentController/addStudent" modelAttribute="studentCreateDto">
            <div class="fitem">
                <label>姓名:</label>
                <input name="name" class="easyui-validatebox" required="true"></input>
            </div>
            <div class="fitem">
                <label>年龄:</label>
                <input name="age" class="easyui-validatebox" required="true"></input>
            </div>
            <div class="fitem">
                <label>地址:</label>
                <input name="address"class="easyui-validatebox"  required="true"></input>
            </div>
            <div class="fitem">
                <label>成绩:</label>
                <input name="score" class="easyui-validatebox" required="true"></input>
            </div>
        </form:form>
         <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUser()">Save</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
       </div>
    </div>
   
</body>
</html>