package org.apache.jsp.WEB_002dINF.jsp.mobile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class autoControlPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/mobile/../include/include.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.release();
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
      out.write("width:100px;\r\n");
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
      out.write("\r\n");
      out.write("/********** #container **********/\r\n");
      out.write("#container {\r\n");
      out.write("\twidth: 700px;\r\n");
      out.write("\theight: 540px;\r\n");
      out.write("\toverflow: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/********** #content **********/\r\n");
      out.write("#content {\r\n");
      out.write("\twidth: 872px;\r\n");
      out.write("\tmargin-left: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/********** .tag **********/\r\n");
      out.write(".tags {\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tag {\r\n");
      out.write("\twidth: 426px;\r\n");
      out.write("\theight: 260px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tag_right {\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\theight: 500px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("}\r\n");
      out.write(".tag_right_1 {\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("}\r\n");
      out.write(".tag_right_2 {\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\theight: 300px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("}\r\n");
      out.write(".tag_right_3 {\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tag_left {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\twidth: 630px;\r\n");
      out.write("\theight: 500px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tborder-right:1px solid #95B8E7 ; \r\n");
      out.write("}\r\n");
      out.write(".tag_left_2 {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\theight: 300px;\r\n");
      out.write("\twidth: 630px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tborder-bottom:1px solid #95B8E7 ;\r\n");
      out.write("\tborder-right:1px solid #95B8E7 ; \r\n");
      out.write("}\r\n");
      out.write(".tag_left_3 {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\theight: 200px;\r\n");
      out.write("\twidth: 630px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tborder-bottom:1px solid #95B8E7 ;\r\n");
      out.write("\tpadding-top:10px;\r\n");
      out.write("\tpadding-bottom:10px;\r\n");
      out.write("\tborder-right:1px solid #95B8E7 ; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tag .top,\r\n");
      out.write(".tag .bottom {\r\n");
      out.write("\twidth: 426px;\r\n");
      out.write("\theight: 10px;\r\n");
      out.write("\tfont-size: 0px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tag .middle {\r\n");
      out.write("\twidth: 420px;\r\n");
      out.write("\theight: 240px;\r\n");
      out.write("\tmargin-left: 3px;\r\n");
      out.write("\toverflow: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/********** .tag .title **********/\r\n");
      out.write(".tag .title {\r\n");
      out.write("\theight: 20px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tag .title_l {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-left: 10px !important;\r\n");
      out.write("\tmargin-left: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tag .title_l img {\r\n");
      out.write("\tfont-size: 0px;\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tag .title_l span {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #05447a;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tag .title_r {\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\tmargin-right: 10px !important;\r\n");
      out.write("\tmargin-right: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tag .title_r a {\r\n");
      out.write("\tfont-size: 13px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #333; \r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tag .title_r a:hover {\r\n");
      out.write("\ttext-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-1.7.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery.easyui.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/Charts/highcharts.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/Charts/exporting.js\" type=\"text/javascript\"></script>\r\n");
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
      out.write("<title>自动控制页面</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"easyui-panel\" title=\"自动控制\" style=\"width:985px; height:560px; \">\r\n");
      out.write("\t\t<div style=\"padding:10px 10px 20px 10px\">\r\n");
      out.write("\t\t<div class=\"tag_left\">\r\n");
      out.write("\t\t<div class=\"tag_left_2\">\r\n");
      out.write("\t\t\t<div id=\"container\" style=\"min-width: 310px; height: 300px; margin: 0 auto\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"tag_left_3\">\r\n");
      out.write("\t\t\t<form id=\"ff\" method=\"post\">\r\n");
      out.write("\t\t\t\t<table cellpadding=\"5\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"label\">测量温度</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" readonly=\"readonly\" class=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.airTemperatureValue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t<td class=\"label\">测量湿度</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" readonly=\"readonly\" class=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.airWetnessValue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"label\">光 照 度</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" readonly=\"readonly\" class=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.lightValue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t<td class=\"label\">最后更新</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" readonly=\"readonly\" class=\"readonly\" \r\n");
      out.write("\t\t\t\t\tvalue=\"");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"1\"  style=\"text-align:center;\">\r\n");
      out.write("\t\t\t\t\t  <img id=\"light1Off\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imagepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/light_off.jpg\" ");
      if (_jspx_meth_core_005fif_005f0(_jspx_page_context))
        return;
      out.write("/>\r\n");
      out.write("\t\t\t\t\t  <img id=\"light1On\"  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imagepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/light_on.jpg\" ");
      if (_jspx_meth_core_005fif_005f1(_jspx_page_context))
        return;
      out.write("/>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"tag_right\">\r\n");
      out.write("\t\t\t<div class=\"tag_right_1\">\r\n");
      out.write("\t\t\t\t<table cellpadding=\"5\" style=\"float:right;\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"image\"  style=\"text-align:center;padding:5px\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhousemobile/getSysConfigPage\"><img id=\"linkConfigMode\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imagepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/enter_config.jpg\"/></a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"tag_right_2\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imagepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/caomei-large.jpg\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"tag_right_3\">\r\n");
      out.write("\t\t\t\t<table cellpadding=\"5\" style=\"float:right;\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"image\"  style=\"text-align:center;padding:5px\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhousemobile/toManualControlPage\"><img id=\"linkManualMode\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imagepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/enter_manual.jpg\"/></a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function changeLight1(){\r\n");
      out.write("\t$(\"#linklight1\").hide();\r\n");
      out.write("\t$(\"#linklight3\").show();\r\n");
      out.write("\t//发送关灯命令\r\n");
      out.write("\t//隐藏linklight1\r\n");
      out.write("\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/updateSwitchOnOff\",{'equipmentId':'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.light1EquipId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("','switchOnoff':2},function(data){\r\n");
      out.write("\t\tif(data =='success'){\r\n");
      out.write("\t\t\t$(\"#linklight1\").hide();\r\n");
      out.write("\t\t\t$(\"#linklight3\").hide();\r\n");
      out.write("\t\t\t$(\"#linklight4\").hide();\r\n");
      out.write("\t\t\t$(\"#linklight2\").show();\r\n");
      out.write("\t\t\talert(\"断开设备成功!\");\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#linklight2\").hide();\r\n");
      out.write("\t\t\t$(\"#linklight3\").hide();\r\n");
      out.write("\t\t\t$(\"#linklight4\").hide();\r\n");
      out.write("\t\t\t$(\"#linklight1\").show();\r\n");
      out.write("\t\t\talert(\"断开设备失败!\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function changeLight2(){\r\n");
      out.write("\t//发送开灯命令\r\n");
      out.write("\t//隐藏linklight2\r\n");
      out.write("\t$(\"#linklight2\").hide();\r\n");
      out.write("\t$(\"#linklight4\").show();\r\n");
      out.write("\t//发送关灯命令\r\n");
      out.write("\t//隐藏linklight1\r\n");
      out.write("\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/updateSwitchOnOff\",{'equipmentId':'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.light1EquipId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("','switchOnoff':1},function(data){\r\n");
      out.write("\t\tif(data =='success'){\r\n");
      out.write("\t\t\t$(\"#linklight2\").hide();\r\n");
      out.write("\t\t\t$(\"#linklight3\").hide();\r\n");
      out.write("\t\t\t$(\"#linklight4\").hide();\r\n");
      out.write("\t\t\t$(\"#linklight1\").show();\r\n");
      out.write("\t\t\talert(\"闭合设备成功!\");\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#linklight1\").hide();\r\n");
      out.write("\t\t\t$(\"#linklight3\").hide();\r\n");
      out.write("\t\t\t$(\"#linklight4\").hide();\r\n");
      out.write("\t\t\t$(\"#linklight2\").show();\r\n");
      out.write("\t\t\talert(\"闭合设备失败!\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function changeMode1(){\r\n");
      out.write("\t$(\"#linkMode1\").hide();\r\n");
      out.write("\t$(\"#linkMode2\").hide();\r\n");
      out.write("\t$(\"#linkMode4\").hide();\r\n");
      out.write("\t$(\"#linkMode3\").show();\r\n");
      out.write("\t//改变模式为手动saveEquipSwitchSchedule\r\n");
      out.write("\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/saveEquipSwitchSchedule\",{'id':'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.curModeId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("','curMode':2},function(data){\r\n");
      out.write("\t\tif(data =='success'){\r\n");
      out.write("\t\t\t$(\"#linkMode1\").hide();\r\n");
      out.write("\t\t\t$(\"#linkMode3\").hide();\r\n");
      out.write("\t\t\t$(\"#linkMode4\").hide();\r\n");
      out.write("\t\t\t$(\"#linkMode2\").show();\r\n");
      out.write("\t\t\tif(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.light1Onoff==1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("){\r\n");
      out.write("\t\t\t\t$(\"#linklight2\").hide();\r\n");
      out.write("\t\t\t\t$(\"#linklight3\").hide();\r\n");
      out.write("\t\t\t\t$(\"#linklight4\").hide();\r\n");
      out.write("\t\t\t\t$(\"#linklight1\").show();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$(\"#linklight1\").hide();\r\n");
      out.write("\t\t\t\t$(\"#linklight3\").hide();\r\n");
      out.write("\t\t\t\t$(\"#linklight4\").hide();\r\n");
      out.write("\t\t\t\t$(\"#linklight2\").show();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#linkMode2\").hide();\r\n");
      out.write("\t\t\t$(\"#linkMode3\").hide();\r\n");
      out.write("\t\t\t$(\"#linkMode4\").hide();\r\n");
      out.write("\t\t\t$(\"#linkMode1\").show();\r\n");
      out.write("\t\t\talert(\"调整模式失败!\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t//判断当前灯的onoff，隐藏和显示linklight1，2，3，4.\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function changeMode2(){\r\n");
      out.write("\t//改变模式为自动\r\n");
      out.write("\t//前换到自动页面\r\n");
      out.write("\t$(\"#linkMode1\").hide();\r\n");
      out.write("\t$(\"#linkMode2\").hide();\r\n");
      out.write("\t$(\"#linkMode3\").hide();\r\n");
      out.write("\t$(\"#linkMode4\").show();\r\n");
      out.write("\t//改变模式为手动saveEquipSwitchSchedule\r\n");
      out.write("\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/saveEquipSwitchSchedule\",{'id':'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.curModeId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("','curMode':1},function(data){\r\n");
      out.write("\t\tif(data =='success'){\r\n");
      out.write("\t\t\tlocation.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhousemobile/toAutoControlPage\";\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#linkMode1\").hide();\r\n");
      out.write("\t\t\t$(\"#linkMode3\").hide();\r\n");
      out.write("\t\t\t$(\"#linkMode4\").hide();\r\n");
      out.write("\t\t\t$(\"#linkMode2\").show();\r\n");
      out.write("\t\t\talert(\"调整模式失败!\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(function () {\r\n");
      out.write("    var dataList = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resultDtoChart}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\t\r\n");
      out.write("    var xAxisList = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${xAxisList}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("    $('#container').highcharts({\r\n");
      out.write("        title: {\r\n");
      out.write("            text: '实时温度监控',\r\n");
      out.write("            x: -20 //center\r\n");
      out.write("        },\r\n");
      out.write("         /* xAxis: {\r\n");
      out.write("            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',\r\n");
      out.write("                'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']\r\n");
      out.write("        }, */\r\n");
      out.write("        xAxis: {\r\n");
      out.write("            categories: xAxisList\r\n");
      out.write("        }, \r\n");
      out.write("        yAxis: {\r\n");
      out.write("            title: {\r\n");
      out.write("                text: 'Temperature (°C)'\r\n");
      out.write("            },\r\n");
      out.write("            plotLines: [{\r\n");
      out.write("                value: 0,\r\n");
      out.write("                width: 1,\r\n");
      out.write("                color: '#808080'\r\n");
      out.write("            }]\r\n");
      out.write("        },\r\n");
      out.write("        tooltip: {\r\n");
      out.write("            valueSuffix: '°C'\r\n");
      out.write("        },\r\n");
      out.write("        legend: {\r\n");
      out.write("            layout: 'vertical',\r\n");
      out.write("            align: 'right',\r\n");
      out.write("            verticalAlign: 'middle',\r\n");
      out.write("            borderWidth: 0\r\n");
      out.write("        },\r\n");
      out.write("        /* series: [{\r\n");
      out.write("            name: 'Tokyo',\r\n");
      out.write("            data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6]\r\n");
      out.write("        }, {\r\n");
      out.write("            name: 'New York',\r\n");
      out.write("            data: [-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5]\r\n");
      out.write("        }, {\r\n");
      out.write("            name: 'Berlin',\r\n");
      out.write("            data: [-0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0]\r\n");
      out.write("        }, {\r\n");
      out.write("            name: 'London',\r\n");
      out.write("            data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8]\r\n");
      out.write("        }] */\r\n");
      out.write("        \r\n");
      out.write("        series:dataList\r\n");
      out.write("    \t});\r\n");
      out.write("\t});\r\n");
      out.write("    \r\n");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent(null);
    // /WEB-INF/jsp/mobile/autoControlPage.jsp(218,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.uploadDate}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/mobile/autoControlPage.jsp(218,12) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("MM-dd HH:mm:ss");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
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
    // /WEB-INF/jsp/mobile/autoControlPage.jsp(222,60) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.light1Onoff==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_core_005fif_005f0 = _jspx_th_core_005fif_005f0.doStartTag();
    if (_jspx_eval_core_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("style=\"display:none;\" ");
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
    // /WEB-INF/jsp/mobile/autoControlPage.jsp(223,59) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.light1Onoff==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_core_005fif_005f1 = _jspx_th_core_005fif_005f1.doStartTag();
    if (_jspx_eval_core_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("style=\"display:none;\" ");
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
}
