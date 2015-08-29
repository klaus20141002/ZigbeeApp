package org.apache.jsp.WEB_002dINF.jsp.mobile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class monitorDetailPageMobile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/mobile/../include/include.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.release();
    _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
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
      out.write("<meta name=\"description\"\r\n");
      out.write("\tcontent=\"easyui help you build your web page easily!\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${csspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/easyui.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${csspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/icon.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("select,input\r\n");
      out.write("{\r\n");
      out.write("font-size:1em;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("td {\r\n");
      out.write("height:24px;\r\n");
      out.write("border:1px solid #fff;\r\n");
      out.write("word-warp:break-word;\r\n");
      out.write("color:#4d4c4c;\r\n");
      out.write("font-size:24px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td.label {\r\n");
      out.write("width:160px;\r\n");
      out.write("text-align:right;\r\n");
      out.write("font-weight:bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a.l-btn span span.l-btn-text {\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    font-weight:bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input.readonly {\r\n");
      out.write("background-color:#f2fcff;\r\n");
      out.write("width:160px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div.panel-header {\r\n");
      out.write("text-align:center; \r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-1.7.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery.easyui.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var refreshObj; //自动监听object\r\n");
      out.write("\r\n");
      out.write("function autoRefreshData(){\r\n");
      out.write("\twindow.location.reload();\r\n");
      out.write("\trefreshObj=setTimeout(\"autoRefreshData()\",600000);//setTimeout会有一个返回值\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("setTimeout(\"autoRefreshData()\",600000);\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"easyui-panel\" title=\"\" style=\"width:985px; height:560px; \">\r\n");
      out.write("\t\t<div style=\"padding:10px 60px 20px 60px\">\r\n");
      out.write("\t\t\t<form id=\"ff\" method=\"post\">\r\n");
      out.write("\t\t\t\t<table cellpadding=\"5\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" style=\"text-align:center;padding:5px\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"window.location.reload()\" iconCls=\"icon-reload\">刷新</a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td class=\"label\">控制模式:</td>\r\n");
      out.write("\t\t\t\t<td>");
      if (_jspx_meth_core_005fif_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_core_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"6\" class=\"spliterInput_Line\">\r\n");
      out.write("\t\t\t\t\t  <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imagepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/spliterInfo_line_03.gif\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"label\">测量温度:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" readonly=\"readonly\" class=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.airTemperatureValue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t<td class=\"label\">测量湿度:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" readonly=\"readonly\" class=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.airWetnessValue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"label\">光 照 度:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" readonly=\"readonly\" class=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.lightValue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t<td class=\"label\">最后更新:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" readonly=\"readonly\" class=\"readonly\" \r\n");
      out.write("\t\t\t\t\tvalue=\"");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"6\" class=\"spliterInput_Line\">\r\n");
      out.write("\t\t\t\t\t  <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imagepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/spliterInfo_line_03.gif\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\"  style=\"text-align:center;padding:5px\">\r\n");
      out.write("\t\t\t\t\t  <img id=\"light1Off\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imagepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/circle_red.jpg\" ");
      if (_jspx_meth_core_005fif_005f2(_jspx_page_context))
        return;
      out.write("/>\r\n");
      out.write("\t\t\t\t\t  <img id=\"light1On\"  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imagepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/circle_green.jpg\" ");
      if (_jspx_meth_core_005fif_005f3(_jspx_page_context))
        return;
      out.write("/>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\"  style=\"text-align:center;padding:5px\">\r\n");
      out.write("\t\t\t\t\t  <img id=\"lineLight2Off\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imagepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/rec_red.jpg\" ");
      if (_jspx_meth_core_005fif_005f4(_jspx_page_context))
        return;
      out.write("/>\r\n");
      out.write("\t\t\t\t\t  <img id=\"lineLight2On\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imagepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/rec_green.jpg\" ");
      if (_jspx_meth_core_005fif_005f5(_jspx_page_context))
        return;
      out.write("/>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" style=\"text-align:center;padding:5px\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"changeLight1()\" id=\"linklight1\">闭合</a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" style=\"text-align:center;padding:5px\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"changeLight2()\" id=\"linklight2\">断开</a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("<script>\r\n");
      out.write("var light1Onoff = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.light1Onoff}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("var lineLight2Onoff = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.lineLight2Onoff}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\r\n");
      out.write("if(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.curMode==1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("){\r\n");
      out.write("\t$(\"#linklight1\").linkbutton({disabled:true});\r\n");
      out.write("\t$(\"#linklight2\").linkbutton({disabled:true});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("if(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.light1Onoff==1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("){\r\n");
      out.write("\t$(\"#linklight1\").linkbutton({text:'断开',plain:false,iconCls:'icon-cancel'});\r\n");
      out.write("}else{\r\n");
      out.write("\t$(\"#linklight1\").linkbutton({text:'闭合',plain:false,iconCls:'icon-ok'});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("if(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.lineLight2Onoff==1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("){\r\n");
      out.write("\t$(\"#linklight2\").linkbutton({text:'断开',plain:false,iconCls:'icon-cancel'});\r\n");
      out.write("}else{\r\n");
      out.write("\t$(\"#linklight2\").linkbutton({text:'闭合',plain:false,iconCls:'icon-ok'});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function changeLight1(){\r\n");
      out.write("\tvar switchOnoff = 1;\r\n");
      out.write("\tif(light1Onoff==1){\r\n");
      out.write("\t\t$(\"#linklight1\").linkbutton({text:'闭合',plain:false,iconCls:'icon-ok',disabled:true});\r\n");
      out.write("\t\tswitchOnoff = 2;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t$(\"#linklight1\").linkbutton({text:'断开',plain:false,iconCls:'icon-cancel',disabled:true});\r\n");
      out.write("\t\tswitchOnoff = 1;\r\n");
      out.write("\t}\r\n");
      out.write("\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/updateSwitchOnOff\",{'equipmentId':'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.light1EquipId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("','switchOnoff':switchOnoff},function(data){\r\n");
      out.write("\t\tif(data =='success'){\r\n");
      out.write("\t\t\tif(switchOnoff==2){\r\n");
      out.write("\t\t\t\t$(\"#light1On\").hide();\r\n");
      out.write("\t\t\t\t$(\"#light1Off\").show();\r\n");
      out.write("\t\t\t\t$(\"#linklight1\").linkbutton({disabled:false});\r\n");
      out.write("\t\t\t\tlight1Onoff = 2;\r\n");
      out.write("\t\t\t\talert(\"断开设备成功!\");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$(\"#light1On\").show();\r\n");
      out.write("\t\t\t\t$(\"#light1Off\").hide();\r\n");
      out.write("\t\t\t\t$(\"#linklight1\").linkbutton({disabled:false});\r\n");
      out.write("\t\t\t\tlight1Onoff = 1;\r\n");
      out.write("\t\t\t\talert(\"闭合设备成功!\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tif(switchOnoff==2){\r\n");
      out.write("\t\t\t\talert(\"断开设备失败!\");\r\n");
      out.write("\t\t\t\t$(\"#linklight1\").linkbutton({text:'断开',plain:false,iconCls:'icon-cancel',disabled:false});\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert(\"闭合设备失败!\");\r\n");
      out.write("\t\t\t\t$(\"#linklight1\").linkbutton({text:'闭合',plain:false,iconCls:'icon-ok',disabled:false});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function changeLight2(){\r\n");
      out.write("\tvar switchOnoff2 = 1;\r\n");
      out.write("\tif(lineLight2Onoff==1){\r\n");
      out.write("\t\t$(\"#linklight2\").linkbutton({text:'闭合',plain:false,iconCls:'icon-ok',disabled:true});\r\n");
      out.write("\t\tswitchOnoff2 = 2;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t$(\"#linklight2\").linkbutton({text:'断开',plain:false,iconCls:'icon-cancel',disabled:true});\r\n");
      out.write("\t\tswitchOnoff2 = 1;\r\n");
      out.write("\t}\r\n");
      out.write("\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/updateSwitchOnOff\",{'equipmentId':'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.lineLight2EquipId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("','switchOnoff':switchOnoff2},function(data){\r\n");
      out.write("\t\tif(data =='success'){\r\n");
      out.write("\t\t\tif(switchOnoff2==2){\r\n");
      out.write("\t\t\t\t$(\"#lineLight2On\").hide();\r\n");
      out.write("\t\t\t\t$(\"#lineLight2Off\").show();\r\n");
      out.write("\t\t\t\t$(\"#linklight2\").linkbutton({disabled:false});\r\n");
      out.write("\t\t\t\tlineLight2Onoff = 2;\r\n");
      out.write("\t\t\t\talert(\"断开设备成功!\");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$(\"#lineLight2On\").show();\r\n");
      out.write("\t\t\t\t$(\"#lineLight2Off\").hide();\r\n");
      out.write("\t\t\t\t$(\"#linklight2\").linkbutton({disabled:false});\r\n");
      out.write("\t\t\t\tlineLight2Onoff = 1;\r\n");
      out.write("\t\t\t\talert(\"闭合设备成功!\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tif(switchOnoff2==2){\r\n");
      out.write("\t\t\t\talert(\"断开设备失败!\");\r\n");
      out.write("\t\t\t\t$(\"#linklight2\").linkbutton({text:'断开',plain:false,iconCls:'icon-cancel',disabled:false});\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert(\"闭合设备失败!\");\r\n");
      out.write("\t\t\t\t$(\"#linklight2\").linkbutton({text:'闭合',plain:false,iconCls:'icon-ok',disabled:false});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
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
    // /WEB-INF/jsp/mobile/../include/include.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f0.setVar("webcontext");
    // /WEB-INF/jsp/mobile/../include/include.jsp(5,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f0.setScope("request");
    // /WEB-INF/jsp/mobile/../include/include.jsp(5,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/mobile/../include/include.jsp(5,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
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
    // /WEB-INF/jsp/mobile/../include/include.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f1.setVar("imagepath");
    // /WEB-INF/jsp/mobile/../include/include.jsp(6,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f1.setScope("request");
    // /WEB-INF/jsp/mobile/../include/include.jsp(6,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/mobile/../include/include.jsp(6,0) '${webcontext}/images'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${webcontext}/images",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
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
    // /WEB-INF/jsp/mobile/../include/include.jsp(7,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f2.setVar("csspath");
    // /WEB-INF/jsp/mobile/../include/include.jsp(7,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f2.setScope("request");
    // /WEB-INF/jsp/mobile/../include/include.jsp(7,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f2.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/mobile/../include/include.jsp(7,0) '${webcontext}/styles'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${webcontext}/styles",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
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
    // /WEB-INF/jsp/mobile/../include/include.jsp(8,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f3.setVar("jspath");
    // /WEB-INF/jsp/mobile/../include/include.jsp(8,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f3.setScope("request");
    // /WEB-INF/jsp/mobile/../include/include.jsp(8,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f3.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/mobile/../include/include.jsp(8,0) '${webcontext}/scripts'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${webcontext}/scripts",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
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
    // /WEB-INF/jsp/mobile/../include/include.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f4.setVar("jsppath");
    // /WEB-INF/jsp/mobile/../include/include.jsp(9,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f4.setScope("request");
    // /WEB-INF/jsp/mobile/../include/include.jsp(9,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f4.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/mobile/../include/include.jsp(9,0) '${webcontext}/jsp'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${webcontext}/jsp",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
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
    // /WEB-INF/jsp/mobile/../include/include.jsp(10,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f5.setVar("htmlpath");
    // /WEB-INF/jsp/mobile/../include/include.jsp(10,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f5.setScope("request");
    // /WEB-INF/jsp/mobile/../include/include.jsp(10,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f5.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/mobile/../include/include.jsp(10,0) '${webcontext}/html'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${webcontext}/html",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_core_005fset_005f5 = _jspx_th_core_005fset_005f5.doStartTag();
    if (_jspx_th_core_005fset_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_core_005fset_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_core_005fset_005f5);
    return false;
  }

  private boolean _jspx_meth_core_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_core_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_core_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_core_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/mobile/monitorDetailPageMobile.jsp(75,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.curMode==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_core_005fif_005f0 = _jspx_th_core_005fif_005f0.doStartTag();
    if (_jspx_eval_core_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('自');
        out.write('动');
        int evalDoAfterBody = _jspx_th_core_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_core_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.reuse(_jspx_th_core_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.reuse(_jspx_th_core_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_core_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_core_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_core_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_core_005fif_005f1.setParent(null);
    // /WEB-INF/jsp/mobile/monitorDetailPageMobile.jsp(75,54) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.curMode==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_core_005fif_005f1 = _jspx_th_core_005fif_005f1.doStartTag();
    if (_jspx_eval_core_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('手');
        out.write('动');
        int evalDoAfterBody = _jspx_th_core_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_core_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.reuse(_jspx_th_core_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.reuse(_jspx_th_core_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent(null);
    // /WEB-INF/jsp/mobile/monitorDetailPageMobile.jsp(94,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.uploadDate}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/mobile/monitorDetailPageMobile.jsp(94,12) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("MM-dd HH:mm:ss");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_core_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_core_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_core_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_core_005fif_005f2.setParent(null);
    // /WEB-INF/jsp/mobile/monitorDetailPageMobile.jsp(104,61) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.light1Onoff==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_core_005fif_005f2 = _jspx_th_core_005fif_005f2.doStartTag();
    if (_jspx_eval_core_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("style=\"display:none;\" ");
        int evalDoAfterBody = _jspx_th_core_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_core_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.reuse(_jspx_th_core_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.reuse(_jspx_th_core_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_core_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_core_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_core_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_core_005fif_005f3.setParent(null);
    // /WEB-INF/jsp/mobile/monitorDetailPageMobile.jsp(105,63) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.light1Onoff==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_core_005fif_005f3 = _jspx_th_core_005fif_005f3.doStartTag();
    if (_jspx_eval_core_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("style=\"display:none;\" ");
        int evalDoAfterBody = _jspx_th_core_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_core_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.reuse(_jspx_th_core_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.reuse(_jspx_th_core_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_core_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_core_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_core_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_core_005fif_005f4.setParent(null);
    // /WEB-INF/jsp/mobile/monitorDetailPageMobile.jsp(108,62) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.lineLight2Onoff==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_core_005fif_005f4 = _jspx_th_core_005fif_005f4.doStartTag();
    if (_jspx_eval_core_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("style=\"display:none;\" ");
        int evalDoAfterBody = _jspx_th_core_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_core_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.reuse(_jspx_th_core_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.reuse(_jspx_th_core_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_core_005fif_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  core:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_core_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_core_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_core_005fif_005f5.setParent(null);
    // /WEB-INF/jsp/mobile/monitorDetailPageMobile.jsp(109,63) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.lineLight2Onoff==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_core_005fif_005f5 = _jspx_th_core_005fif_005f5.doStartTag();
    if (_jspx_eval_core_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("style=\"display:none;\" ");
        int evalDoAfterBody = _jspx_th_core_005fif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_core_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.reuse(_jspx_th_core_005fif_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.reuse(_jspx_th_core_005fif_005f5);
    return false;
  }
}
