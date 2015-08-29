package org.apache.jsp.WEB_002dINF.jsp.mobile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class config_005fmobile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/mobile/../include/include.jsp");
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
      out.write("\t\r\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("    <title>智慧生态种植系统</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${csspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/themes/black/easyui.css\">  \r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${csspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/themes/icon.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-1.7.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery.easyui.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${csspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/IndexCss.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${csspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/default.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/Charts/highcharts.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/Charts/exporting.js\" type=\"text/javascript\"></script>\r\n");
      out.write("     <style type=\"text/css\">\r\n");
      out.write("       p{\r\n");
      out.write("            line-height:150%;\r\n");
      out.write("        }\r\n");
      out.write("        .panel-title{\r\n");
      out.write("            text-align:center;\r\n");
      out.write("            font-size:14px;\r\n");
      out.write("            font-weight:bold;\r\n");
      out.write("            text-shadow:0 -1px rgba(0,0,0,0.3);\r\n");
      out.write("        }\r\n");
      out.write("        .datagrid-row,.datagrid-header-row{\r\n");
      out.write("            height:35px;\r\n");
      out.write("        }\r\n");
      out.write("        .datagrid-body td{  \r\n");
      out.write("            border-right:1px dotted;  \r\n");
      out.write("            border-bottom:1px dotted; \r\n");
      out.write("            border-color: #222;\r\n");
      out.write("        }  \r\n");
      out.write("    </style>\r\n");
      out.write("    <script>\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div region=\"north\" border=\"true\" style=\"background: #2E2528; height: 60px; width: 100%;float:left;overflow: hidden;\">\r\n");
      out.write("        <div style=\"float: left;\">\r\n");
      out.write("            <div style=\"float: left;\">\r\n");
      out.write("                <span id=\"tit\" style=\"float: left; padding: 10px; font-family: 幼圆; font-size: 24px; color: White;\">智慧生态种植系统</span></div>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"easyui-tabs\" data-options=\"fit:true,border:false,plain:true\">\r\n");
      out.write("        <div title=\"运行模式\" style=\"padding:10px\">\r\n");
      out.write("        \t<iframe src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/toeditschedule\" width=\"100%\" id=\"chartfr\" height=\"100%\" frameborder=\"0\">\r\n");
      out.write("           </iframe>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div title=\"时间设置\" style=\"padding:10px\">\r\n");
      out.write("        \t<iframe src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/toThresholdConfig?cfgType=3\" width=\"100%\" id=\"chartfr\" height=\"100%\" frameborder=\"0\">\r\n");
      out.write("           </iframe>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div title=\"光照度设置\" style=\"padding:10px\">\r\n");
      out.write("        \t<iframe src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/toLightTriggerConfig\" width=\"100%\" id=\"chartfr\" height=\"100%\" frameborder=\"0\">\r\n");
      out.write("           </iframe>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div title=\"返回控制页\" style=\"padding:10px\">\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhousemobile/toAutoControlPage\"><img id=\"linkMode2\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imagepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/enter_auto.jpg\"/></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("   \r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("   </script>\r\n");
      out.write("</body>    \r\n");
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
}
