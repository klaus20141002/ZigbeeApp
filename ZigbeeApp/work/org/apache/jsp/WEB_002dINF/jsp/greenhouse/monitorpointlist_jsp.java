package org.apache.jsp.WEB_002dINF.jsp.greenhouse;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class monitorpointlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/greenhouse/../include/include.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_core_005fset_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_core_005fset_005f1(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_core_005fset_005f2(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_core_005fset_005f3(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_core_005fset_005f4(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_core_005fset_005f5(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"keywords\" content=\"jquery,ui,easy,easyui,web\">\r\n");
      out.write("<meta name=\"description\" content=\"easyui help you build your web page easily!\">\r\n");
      out.write("<title>web monitor</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${csspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/easyui.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${csspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/icon.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-1.7.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery.easyui.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/datagrid-detailview.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("*{\r\n");
      out.write("\tfont-size:12px;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("    font-family:verdana,helvetica,arial,sans-serif;\r\n");
      out.write("    padding:20px;\r\n");
      out.write("    font-size:12px;\r\n");
      out.write("    margin:0;\r\n");
      out.write("}\r\n");
      out.write("h2 {\r\n");
      out.write("    font-size:18px;\r\n");
      out.write("    font-weight:bold;\r\n");
      out.write("    margin:0;\r\n");
      out.write("    margin-bottom:15px;\r\n");
      out.write("}\r\n");
      out.write(".demo-info{\r\n");
      out.write("\tpadding:0 0 12px 0;\r\n");
      out.write("}\r\n");
      out.write(".demo-tip{\r\n");
      out.write("\tdisplay:none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table id=\"tt\" class=\"easyui-datagrid\" style=\"width:900px;height:550px\" url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/getPointJsonData\" title=\"大棚监控列表\" iconCls=\"icon-search\"\r\n");
      out.write("rownumbers=\"false\" pagination=\"true\" singleSelect=\"true\" toolbar=\"#tb\">\r\n");
      out.write("<thead>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<th field=\"id\" hidden=\"true\"></th>\r\n");
      out.write("\t<th field=\"equipmentId\" width=\"80\" align=\"left\">设备ID</th>\r\n");
      out.write("\t<th field=\"name\" width=\"100\" align=\"left\">检测点名称</th>\r\n");
      out.write("\t<th field=\"isOnline\" width=\"40\" align=\"center\" formatter=\"onoffline\">在线</th>\r\n");
      out.write("\t<th field=\"airTemperatureValue\" width=\"60\" align=\"center\">温度<br>-℃</th>\r\n");
      out.write("\t<th field=\"airWetnessValue\" width=\"60\" align=\"center\">湿度</br>-%RH</th>\r\n");
      out.write("\t<th field=\"lightValue\" width=\"60\" align=\"center\">光照</br>-Lux</th>\r\n");
      out.write("\t<th field=\"cO2Value\" width=\"60\" align=\"center\">CO2</br>-PPM</th>\r\n");
      out.write("\t<th field=\"soilTemperatureValue\" width=\"60\" align=\"center\">土壤温度</br>-Lux</th>\r\n");
      out.write("\t<th field=\"soilWetnessValue\" width=\"60\" align=\"center\">土壤水分</br>-%RH</th>\r\n");
      out.write("\t<th field=\"uploadDate\" width=\"140\" formatter=\"formatterdate\" align=\"center\">更新时刻</th>\r\n");
      out.write("</tr>\r\n");
      out.write("</thead>\r\n");
      out.write("</table>\r\n");
      out.write("<div id=\"tb\" style=\"padding:5px;height:auto\">\r\n");
      out.write("\t<div style=\"margin-bottom:5px\">\r\n");
      out.write("\t\t<a href=\"#\" id=\"listenBtn\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\">开始监听</a>\r\n");
      out.write("\t\t<a href=\"#\" id=\"stopListenBtn\" class=\"easyui-linkbutton\" iconCls=\"icon-no\" plain=\"true\" disabled=\"true\">停止监听</a>\r\n");
      out.write("\t\t<a href=\"#\" id=\"manualRefreshBtn\" class=\"easyui-linkbutton\" iconCls=\"icon-reload\" plain=\"true\">手动刷新</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var islisten = 0; //是否自动监听，初始是0；\r\n");
      out.write("var refreshObj; //自动监听object\r\n");
      out.write("\r\n");
      out.write("function autoRefreshData(){\r\n");
      out.write("\tif(islisten==1){\r\n");
      out.write("\t\t$('#tt').datagrid('reload');\r\n");
      out.write("\t\trefreshObj=setTimeout(\"autoRefreshData()\",10000);//setTimeout会有一个返回值\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function stopListen(){\r\n");
      out.write("\trefreshObj && clearTimeout(refreshObj);//如果refreshObj 不是 null，NaN 就调用clearTime（refreshObj），则会终止\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$('#listenBtn').click(\r\n");
      out.write("\t\tfunction(){\r\n");
      out.write("\t\t\tif(islisten==0){\r\n");
      out.write("\t\t\t\t//开始监听\r\n");
      out.write("\t\t\t\tislisten = 1;\r\n");
      out.write("\t\t\t\t$('#listenBtn').linkbutton('disable'); \r\n");
      out.write("\t\t\t\t$('#stopListenBtn').linkbutton('enable');\r\n");
      out.write("\t\t\t\tautoRefreshData();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write(");\r\n");
      out.write("\r\n");
      out.write("$('#stopListenBtn').click(\r\n");
      out.write("\t\tfunction(){\r\n");
      out.write("\t\t\tvar listenBtn = $('#listenBtn');\r\n");
      out.write("\t\t\tif(islisten==1){\r\n");
      out.write("\t\t\t\t//停止监听\r\n");
      out.write("\t\t\t\tislisten = 0;\r\n");
      out.write("\t\t\t\t$('#stopListenBtn').linkbutton('disable');\r\n");
      out.write("\t\t\t\t$('#listenBtn').linkbutton('enable'); \r\n");
      out.write("\t\t\t\tstopListen();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write(");\r\n");
      out.write("\r\n");
      out.write("$('#manualRefreshBtn').click(\r\n");
      out.write("\t\tfunction(){\r\n");
      out.write("\t\t\tif($(this).linkbutton('options').disabled){\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$('#tt').datagrid('reload');\r\n");
      out.write("\t\t}\r\n");
      out.write(");\r\n");
      out.write("\r\n");
      out.write("function changeP(){\r\n");
      out.write("\tvar dg = $('#tt');\r\n");
      out.write("\tdg.datagrid('loadData',[]);\r\n");
      out.write("\tdg.datagrid({pagePosition:'bottom'});\r\n");
      out.write("\t\t\r\n");
      out.write("\tvar p = $('#tt').datagrid('getPager'); \r\n");
      out.write("\tp.pagination({\r\n");
      out.write("\tlayout:['list','sep','first','prev','sep','manual','sep','next','last','sep','refresh'],\r\n");
      out.write("\tpageSize: 10,//每页显示的记录条数，默认为10  \r\n");
      out.write("\tpageList: [5, 10, 15],//可以设置每页记录条数的列表  \r\n");
      out.write("\tbeforePageText: '第',//页数文本框前显示的汉字  \r\n");
      out.write("\tafterPageText: '页    共 {pages} 页',  \r\n");
      out.write("\tdisplayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录' \r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function formatterdate(val, row) {\r\n");
      out.write("\tif(val==undefined){\r\n");
      out.write("\t\treturn \"\";\r\n");
      out.write("\t}\r\n");
      out.write("\tvar date = new Date(val);\r\n");
      out.write("    return date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + \" \"+ date.getHours()+\":\"+date.getMinutes()+\":\"+date.getSeconds();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function rowformater(value,row,index)\r\n");
      out.write("{\r\n");
      out.write("\tif(value == 2){\r\n");
      out.write("\t\t//当前状态为断开，显示闭合可用\r\n");
      out.write("\t\treturn \"<a href='javascript:void(0);' id=onswitch\"+row.id+\" class='startenablecls' onclick='onSwitchAction(\"+row.id+\",\"+ index +\");'>闭合</a>\" \r\n");
      out.write("\t     + \"<a href='javascript:void(0);' id=offswitch\"+row.id+\"  class='stopdisablecls' onclick='offSwitchAction(\"+row.id+\",\"+ index +\");'>断开</a>\";\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\treturn \"<a href='javascript:void(0);' id=onswitch\"+row.id+\" class='startdisablecls' onclick='onSwitchAction(\"+row.id+\",\"+ index +\");'>闭合</a>\" \r\n");
      out.write("\t     + \"<a href='javascript:void(0);' id=offswitch\"+row.id+\" class='stopenablecls' onclick='offSwitchAction(\"+row.id+\",\"+ index +\");'>断开</a>\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("function onoffline(value,row,index)\r\n");
      out.write("{\r\n");
      out.write("\treturn \"YES\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//\r\n");
      out.write("function onSwitchAction(rowid,index){\r\n");
      out.write("\t$(\"#onswitch\"+rowid).linkbutton({disabled:true});\r\n");
      out.write("\t$(\"#offswitch\"+rowid).linkbutton({disabled:false});\r\n");
      out.write("\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/updateSwitchOnOff\",{'equipmentId':rowid,'switchOnoff':1 },function(data){\r\n");
      out.write("\t\tif(data =='success'){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\talert(\"打开设备成功!\");\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\talert(\"打开设备失败!\");\r\n");
      out.write("\t\t\t$(\"#onswitch\"+rowid).linkbutton({disabled:false});\r\n");
      out.write("\t\t\t$(\"#offswitch\"+rowid).linkbutton({disabled:true});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function offSwitchAction(rowid,index){\r\n");
      out.write("\t$(\"#onswitch\"+rowid).linkbutton({disabled:false});\r\n");
      out.write("\t$(\"#offswitch\"+rowid).linkbutton({disabled:true});\r\n");
      out.write("\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/updateSwitchOnOff\",{'equipmentId':rowid,'switchOnoff':2 },function(data){\r\n");
      out.write("\t\tif(data =='success'){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\talert(\"关闭设备成功!\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\talert(\"关闭设备失败!\");\r\n");
      out.write("\t\t\t$(\"#onswitch\"+rowid).linkbutton({disabled:true});\r\n");
      out.write("\t\t\t$(\"#offswitch\"+rowid).linkbutton({disabled:false});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function getSelected(){\r\n");
      out.write("\tvar row = $('#tt').datagrid('getSelected');\r\n");
      out.write("\tif (row){\r\n");
      out.write("\t\talert(row.id+\":\"+row.equipmentId+\":\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("$(function(){\r\n");
      out.write("\t//changeP();\r\n");
      out.write("\t//$('#tt').datagrid({onSelect : getSelected});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$('#tt').datagrid({\r\n");
      out.write("\t\tview: detailview,\r\n");
      out.write("\t\tdetailFormatter:function(index,row){\r\n");
      out.write("\t\t\treturn '<div style=\"padding:2px\"><table class=\"ddv\"></table></div>';\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tonExpandRow: function(index,row){\r\n");
      out.write("\t\t\tvar ddv = $(this).datagrid('getRowDetail',index).find('table.ddv');\r\n");
      out.write("\t\t\tddv.datagrid({\r\n");
      out.write("\t\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/getEquipSubJson?equipmentId='+row.id,\r\n");
      out.write("\t\t\t\tfitColumns:true,\r\n");
      out.write("\t\t\t\tsingleSelect:true,\r\n");
      out.write("\t\t\t\trownumbers:false,\r\n");
      out.write("\t\t\t\tloadMsg:'',\r\n");
      out.write("\t\t\t\theight:'auto',\r\n");
      out.write("\t\t\t\tcolumns:[[\r\n");
      out.write("\t\t\t\t\t{field:'id',hidden:true},\r\n");
      out.write("\t\t\t\t\t{field:'equipCode',title:'设备ID',width:80,align:'center'},\r\n");
      out.write("\t\t\t\t\t{field:'equipSeq',title:'编号',width:60,align:'center'},\r\n");
      out.write("\t\t\t\t\t{field:'equipName',title:'控制点名称',width:100,align:'center'},\r\n");
      out.write("\t\t\t\t\t{field:'equipTypeText',title:'设备类型',width:80,align:'center'},\r\n");
      out.write("\t\t\t\t\t{field:'isOnline',title:'在线',width:60,align:'center',formatter:onoffline},\r\n");
      out.write("\t\t\t\t\t{field:'uploadDate',title:'更新时刻',width:120,align:'center',formatter:formatterdate},\r\n");
      out.write("\t\t\t\t\t{field:'switchOnoff',title:'控制操作',width:100,align:'center',formatter:rowformater}\r\n");
      out.write("\t\t\t\t]],\r\n");
      out.write("\t\t\t\tonResize:function(){\r\n");
      out.write("\t\t\t\t\t$('#tt').datagrid('fixDetailRowHeight',index);\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tonLoadSuccess:function(){\r\n");
      out.write("\t\t\t\t\t$('.startenablecls').linkbutton({text:'闭合',plain:true,iconCls:'icon-ok'});  \r\n");
      out.write("\t\t\t\t\t$('.stopenablecls').linkbutton({text:'断开',plain:true,iconCls:'icon-cancel'}); \r\n");
      out.write("\t\t\t\t\t$('.startdisablecls').linkbutton({text:'闭合',plain:true,disabled:true,iconCls:'icon-ok'});  \r\n");
      out.write("\t\t\t\t\t$('.stopdisablecls').linkbutton({text:'断开',plain:true,disabled:true,iconCls:'icon-cancel'}); \r\n");
      out.write("\t\t\t\t\tsetTimeout(function(){\r\n");
      out.write("\t\t\t\t\t\t$('#tt').datagrid('fixDetailRowHeight',index);\r\n");
      out.write("\t\t\t\t\t},0);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('#tt').datagrid('fixDetailRowHeight',index);\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tonLoadSuccess:function(data){  \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t    } \r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t//var dg = $('#tt');\r\n");
      out.write("\t//dg.datagrid({pagePosition:'bottom'});\r\n");
      out.write("\t\t\r\n");
      out.write("\tvar p = $('#tt').datagrid('getPager'); \r\n");
      out.write("\tp.pagination({\r\n");
      out.write("\tlayout:['list','sep','first','prev','sep','manual','sep','next','last','sep','refresh'],\r\n");
      out.write("\tpageSize: 10,//每页显示的记录条数，默认为10  \r\n");
      out.write("\tpageList: [5, 10, 15],//可以设置每页记录条数的列表  \r\n");
      out.write("\tbeforePageText: '第',//页数文本框前显示的汉字  \r\n");
      out.write("\tafterPageText: '页    共 {pages} 页',  \r\n");
      out.write("\tdisplayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录' \r\n");
      out.write("\t});\r\n");
      out.write("\t//changeP();\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_core_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_core_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_core_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_core_005fset_005f0.setParent(null);
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f0.setVar("webcontext");
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(5,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f0.setScope("request");
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(5,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/greenhouse/../include/include.jsp(5,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_core_005fset_005f0 = _jspx_th_core_005fset_005f0.doStartTag();
    if (_jspx_th_core_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_core_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_core_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_core_005fset_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_core_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_core_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_core_005fset_005f1.setParent(null);
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f1.setVar("imagepath");
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(6,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f1.setScope("request");
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(6,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/greenhouse/../include/include.jsp(6,0) '${webcontext}/images'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${webcontext}/images",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_core_005fset_005f1 = _jspx_th_core_005fset_005f1.doStartTag();
    if (_jspx_th_core_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_core_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_core_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_core_005fset_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_core_005fset_005f2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_core_005fset_005f2.setPageContext(_jspx_page_context);
    _jspx_th_core_005fset_005f2.setParent(null);
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(7,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f2.setVar("csspath");
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(7,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f2.setScope("request");
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(7,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f2.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/greenhouse/../include/include.jsp(7,0) '${webcontext}/styles'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${webcontext}/styles",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_core_005fset_005f2 = _jspx_th_core_005fset_005f2.doStartTag();
    if (_jspx_th_core_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_core_005fset_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_core_005fset_005f2);
    return false;
  }

  private boolean _jspx_meth_core_005fset_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_core_005fset_005f3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_core_005fset_005f3.setPageContext(_jspx_page_context);
    _jspx_th_core_005fset_005f3.setParent(null);
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(8,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f3.setVar("jspath");
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(8,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f3.setScope("request");
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(8,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f3.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/greenhouse/../include/include.jsp(8,0) '${webcontext}/scripts'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${webcontext}/scripts",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_core_005fset_005f3 = _jspx_th_core_005fset_005f3.doStartTag();
    if (_jspx_th_core_005fset_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_core_005fset_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_core_005fset_005f3);
    return false;
  }

  private boolean _jspx_meth_core_005fset_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_core_005fset_005f4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_core_005fset_005f4.setPageContext(_jspx_page_context);
    _jspx_th_core_005fset_005f4.setParent(null);
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f4.setVar("jsppath");
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(9,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f4.setScope("request");
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(9,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f4.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/greenhouse/../include/include.jsp(9,0) '${webcontext}/jsp'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${webcontext}/jsp",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_core_005fset_005f4 = _jspx_th_core_005fset_005f4.doStartTag();
    if (_jspx_th_core_005fset_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_core_005fset_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_core_005fset_005f4);
    return false;
  }

  private boolean _jspx_meth_core_005fset_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_core_005fset_005f5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_core_005fset_005f5.setPageContext(_jspx_page_context);
    _jspx_th_core_005fset_005f5.setParent(null);
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(10,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f5.setVar("htmlpath");
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(10,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f5.setScope("request");
    // /WEB-INF/jsp/greenhouse/../include/include.jsp(10,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f5.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/greenhouse/../include/include.jsp(10,0) '${webcontext}/html'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${webcontext}/html",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_core_005fset_005f5 = _jspx_th_core_005fset_005f5.doStartTag();
    if (_jspx_th_core_005fset_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_core_005fset_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_core_005fset_005f5);
    return false;
  }
}
