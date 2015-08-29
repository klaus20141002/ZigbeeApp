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
    <h2>Basic Accordion</h2>
    <div class="demo-info">
        <div class="demo-tip icon-tip"></div>
        <div>Click on panel header to show its content.</div>
    </div>
    <div style="margin:10px 0;"></div>
    <div class="easyui-accordion" style="width:500px;height:300px;">
        <div title="About" data-options="iconCls:'icon-ok'" style="overflow:auto;padding:10px;">
            <h3 style="color:#0099FF;">Accordion for jQuery</h3>
            <p>Accordion is a part of easyui framework for jQuery. It lets you define your accordion component on web page more easily.</p>
        </div>
        <div title="Help" data-options="iconCls:'icon-help'" style="padding:10px;">
            <p>The accordion allows you to provide multiple panels and display one at a time. Each panel has built-in support for expanding and collapsing. Clicking on a panel header to expand or collapse that panel body. The panel content can be loaded via ajax by specifying a 'href' property. Users can define a panel to be selected. If it is not specified, then the first panel is taken by default.</p>         
        </div>
        <div title="TreeMenu" data-options="iconCls:'icon-search'" style="padding:10px;">
            <ul class="easyui-tree">
                <li>
                    <span>Foods</span>
                    <ul>
                        <li>
                            <span>Fruits</span>
                            <ul>
                                <li>apple</li>
                                <li>orange</li>
                            </ul>
                        </li>
                        <li>
                            <span>Vegetables</span>
                            <ul>
                                <li>tomato</li>
                                <li>carrot</li>
                                <li>cabbage</li>
                                <li>potato</li>
                                <li>lettuce</li>
                            </ul>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</body>
</html>