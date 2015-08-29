package org.apache.jsp.WEB_002dINF.jsp.mobile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chartPageMobile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>王波果园生产控制系统</title>\r\n");
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
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("    //chart below\r\n");
      out.write("    \r\n");
      out.write("    $(function () {\r\n");
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
      out.write("        subtitle: {\r\n");
      out.write("            text: 'Source: GreenHouse.com',\r\n");
      out.write("            x: -20\r\n");
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
      out.write("    function reloadSelfPage() {\r\n");
      out.write("    \twindow.location.reload();\r\n");
      out.write("    }\r\n");
      out.write("    setInterval(reloadSelfPage,60000);\r\n");
      out.write("    \r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"container\" style=\"min-width: 310px; height: 350px; margin: 0 auto\"></div>\r\n");
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
}
