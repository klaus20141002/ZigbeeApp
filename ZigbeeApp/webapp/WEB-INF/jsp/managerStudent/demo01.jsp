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
    <h2>Row Editing in DataGrid</h2>
    <div class="demo-info">
        <div class="demo-tip icon-tip"></div>
        <div>Click the row to start editing.</div>
    </div>
    <div style="margin:10px 0;"></div>
    <table id="dg" class="easyui-datagrid" title="Row Editing in DataGrid" style="width:700px;height:auto"
            data-options="
                iconCls: 'icon-edit',
                singleSelect: true,
                toolbar: '#tb',
                url: '${webcontext}/studentController/listForEasyUiDemo01',
                method: 'get',
                onClickRow: onClickRow
            ">
        <thead>
            <tr>
                <th data-options="field:'itemid',width:80">Item ID</th>
                <th data-options="field:'productid',width:100,
                        formatter:function(value,row){
                            return row.productname;
                        },
                        editor:{
                            type:'combobox',
                            options:{
                                valueField:'productid',
                                textField:'productname',
                                url:'products.json',
                                required:true
                            }
                        }">Product</th>
                <th data-options="field:'listprice',width:80,align:'right',editor:{type:'numberbox',options:{precision:1}}">List Price</th>
                <th data-options="field:'unitcost',width:80,align:'right',editor:'numberbox'">Unit Cost</th>
                <th data-options="field:'attr1',width:250,editor:'text'">Attribute</th>
                <th data-options="field:'status',width:60,align:'center',editor:{type:'checkbox',options:{on:'P',off:''}}">Status</th>
            </tr>
        </thead>
    </table>
 
    <div id="tb" style="height:auto">
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="append()">Append</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="removeit()">Remove</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" onclick="accept()">Accept</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-undo',plain:true" onclick="reject()">Reject</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="getChanges()">GetChanges</a>
    </div>
    
    <script type="text/javascript">
        var editIndex = undefined;
        function endEditing(){
            if (editIndex == undefined){return true}
            if ($('#dg').datagrid('validateRow', editIndex)){
                var ed = $('#dg').datagrid('getEditor', {index:editIndex,field:'productid'});
                var productname = $(ed.target).combobox('getText');
                $('#dg').datagrid('getRows')[editIndex]['productname'] = productname;
                $('#dg').datagrid('endEdit', editIndex);
                editIndex = undefined;
                return true;
            } else {
                return false;
            }
        }
        function onClickRow(index){
            if (editIndex != index){
                if (endEditing()){
                    $('#dg').datagrid('selectRow', index)
                            .datagrid('beginEdit', index);
                    editIndex = index;
                } else {
                    $('#dg').datagrid('selectRow', editIndex);
                }
            }
        }
        function append(){
            if (endEditing()){
                $('#dg').datagrid('appendRow',{status:'P'});
                editIndex = $('#dg').datagrid('getRows').length-1;
                $('#dg').datagrid('selectRow', editIndex)
                        .datagrid('beginEdit', editIndex);
            }
        }
        function removeit(){
            if (editIndex == undefined){return}
            $('#dg').datagrid('cancelEdit', editIndex)
                    .datagrid('deleteRow', editIndex);
            editIndex = undefined;
        }
        function accept(){
            if (endEditing()){
                $('#dg').datagrid('acceptChanges');
            }
        }
        function reject(){
            $('#dg').datagrid('rejectChanges');
            editIndex = undefined;
        }
        function getChanges(){
            var rows = $('#dg').datagrid('getChanges');
            alert(rows.length+' rows are changed!');
        }
    </script>
</body>
</html>