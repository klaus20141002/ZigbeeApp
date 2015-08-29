package org.apache.jsp.WEB_002dINF.jsp.greenhouse;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class firstpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("    <link rel=\"Shortcut Icon\" href=\"Imagers/ligth-on.ico\" />\r\n");
      out.write("    <link rel=\"Bookmark\" href=\"Imagers/ligth-on.ico\" />\r\n");
      out.write("    <title>智慧生态种植系统</title>\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${csspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/easyui.css\" rel=\"stylesheet\" type=\"text/css\" id=\"swicth-style\" />\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${csspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/icon.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery-1.7.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery.easyui.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/IndexJs.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${csspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/IndexCss.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${csspath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/default.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <script type=\"text/javascript\" language=\"JavaScript\">\r\n");
      out.write(" \t// Start indexjs.js move to here\r\n");
      out.write(" \tvar mBind1 = 0, mBind2 = 0, mBind3 = 0, mBind4 = 0, mBind5 = 0, mBind6 = 0, mBind7 = 0;\r\n");
      out.write("$(document).ready(function () {\r\n");
      out.write("\t//added by zizou \r\n");
      out.write("\t//for test \r\n");
      out.write("\tsetCookie(\"AdminName\", \"adminName\");\r\n");
      out.write("    setCookie(\"AdminPass\", \"adminPass\");\r\n");
      out.write("    setCookie(\"UserName\", \"王志泽\");\r\n");
      out.write("    setCookie(\"Role\", 0);\r\n");
      out.write("    setCookie(\"OrgID\", null);\r\n");
      out.write("    setCookie(\"PrjID\", null);\r\n");
      out.write("    setCookie(\"remember\", \"是\");\r\n");
      out.write("    setCookie(\"Ckautomatic\", \"是\");\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("    var userRoleID = getCookie(\"Role\");\r\n");
      out.write("    var userRole = \"\";\r\n");
      out.write("    if (userRoleID == 0) {\r\n");
      out.write("        userRole = \"高级管理员\";\r\n");
      out.write("    }\r\n");
      out.write("    else if (userRoleID == 1) {\r\n");
      out.write("        userRole = \"管理员\";\r\n");
      out.write("    }\r\n");
      out.write("    else if (userRoleID == 2) {\r\n");
      out.write("        userRole = \"机构管理员\";\r\n");
      out.write("    }\r\n");
      out.write("    else if (userRoleID == 3) {\r\n");
      out.write("        userRole = \"项目管理员\";\r\n");
      out.write("    }\r\n");
      out.write("    else if (userRoleID == 4) {\r\n");
      out.write("        userRole = \"普通操作员\";\r\n");
      out.write("    }\r\n");
      out.write("    $(\"#lbl_Name\").html(\"欢迎您！\" + getCookie(\"UserName\"));\r\n");
      out.write("    tabCloseEven();\r\n");
      out.write("    if (getCookie(\"OrgID\") == \"7\") //徐州节能改造\r\n");
      out.write("    {\r\n");
      out.write("        //$(\"#about\").attr(\"href\",\"javascript:;\");\r\n");
      out.write("        $(\"#logo_img\").attr(\"src\", \"Imagers/gglogo_index.png\");\r\n");
      out.write("    }\r\n");
      out.write("    if (getCookie(\"OrgID\") == \"12\") //江苏芯光能源管理有限公司\r\n");
      out.write("    {\r\n");
      out.write("        //$(\"#tit\").attr(\"href\", \"javascript:;\");\r\n");
      out.write("        $(\"#logo_img\").hide();\r\n");
      out.write("        $(\"#tit\").html(\"扬州瘦西湖风景区管理处\");\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*切换主题开始*/\r\n");
      out.write("    var themes = {\r\n");
      out.write("        'gray': 'css/themes/gray/easyui.css',\r\n");
      out.write("        'pepper-grinder': 'css/themes/pepper-grinder/easyui.css',\r\n");
      out.write("        'blue': 'css/themes/default/easyui.css',\r\n");
      out.write("        'cupertino': 'css/themes/cupertino/easyui.css',\r\n");
      out.write("        'dark-hive': 'css/themes/dark-hive/easyui.css',\r\n");
      out.write("        'sunny': 'css/themes/sunny/easyui.css'\r\n");
      out.write("    };\r\n");
      out.write("    var skins = $('.li-skinitem span').click(function () {\r\n");
      out.write("        var $this = $(this);\r\n");
      out.write("        if ($this.hasClass('cs-skin-on')) return;\r\n");
      out.write("        skins.removeClass('cs-skin-on');\r\n");
      out.write("        $this.addClass('cs-skin-on');\r\n");
      out.write("        var skin = $this.attr('rel');\r\n");
      out.write("        $('#swicth-style').attr('href', themes[skin]);\r\n");
      out.write("        setCookie('cs-skin', skin);\r\n");
      out.write("        skin == 'dark-hive' ? $('.cs-north-logo').css('color', '#FFFFFF') : $('.cs-north-logo').css('color', '#000000');\r\n");
      out.write("    });\r\n");
      out.write("    if (getCookie('cs-skin')) {\r\n");
      out.write("        var skin = getCookie('cs-skin');\r\n");
      out.write("        $('#swicth-style').attr('href', themes[skin]);\r\n");
      out.write("        $this = $('.li-skinitem span[rel=' + skin + ']');\r\n");
      out.write("        $this.addClass('cs-skin-on');\r\n");
      out.write("        skin == 'dark-hive' ? $('.cs-north-logo').css('color', '#FFFFFF') : $('.cs-north-logo').css('color', '#000000');\r\n");
      out.write("    }\r\n");
      out.write("    /*切换主题结束*/\r\n");
      out.write("\r\n");
      out.write("    window.onbeforeunload = function () //author: meizz     \r\n");
      out.write("    {\r\n");
      out.write("        var n = window.event.screenX - window.screenLeft;\r\n");
      out.write("        var b = n > document.documentElement.scrollWidth - 20;\r\n");
      out.write("        if (b && window.event.clientY < 0 || window.event.altKey) {\r\n");
      out.write("            window.event.returnValue = \"确定要退出-智慧生态种植系统？\";\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    if (window.screen) {              //判断浏览器是否支持window.screen判断浏览器是否支持screen\r\n");
      out.write("        var myw = screen.availWidth;   //定义一个myw，接受到当前全屏的宽\r\n");
      out.write("        var myh = screen.availHeight;  //定义一个myw，接受到当前全屏的高\r\n");
      out.write("        window.moveTo(0, 0);           //把window放在左上脚\r\n");
      out.write("        window.resizeTo(myw, myh);     //把当前窗体的长宽跳转为myw和myh\r\n");
      out.write("    }\r\n");
      out.write("    //退出\r\n");
      out.write("    $(\"#esc\").click(function () {\r\n");
      out.write("        $.messager.confirm(\"温馨提示\", \"确定要退出智慧生态种植系统?\", function (r) {\r\n");
      out.write("            if (r) {\r\n");
      out.write("                //if ($(\"#Ckzd\").attr(\"checked\") || $(\"#Ckjz\").attr(\"checked\")) {\r\n");
      out.write("                if (getCookie(\"remember\") == \"是\" || getCookie(\"Ckautomatic\") == \"是\") {\r\n");
      out.write("                    setCookie(\"OrgID\", null);\r\n");
      out.write("                    setCookie(\"PrjID\", null);\r\n");
      out.write("                } else {\r\n");
      out.write("                    setCookie(\"AdminName\", null);\r\n");
      out.write("                    setCookie(\"AdminPass\", null);\r\n");
      out.write("                    setCookie(\"UserName\", null);\r\n");
      out.write("                    setCookie(\"Role\", null);\r\n");
      out.write("                    setCookie(\"OrgID\", null);\r\n");
      out.write("                    setCookie(\"PrjID\", null);\r\n");
      out.write("                }\r\n");
      out.write("                window.open('', '_self', '');\r\n");
      out.write("                window.close();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("    //注销\r\n");
      out.write("    $(\"#logout\").click(function () {\r\n");
      out.write("        $.messager.confirm(\"温馨提示\", \"确定要注销智慧生态种植系统，重新登录吗？\", function (r) {\r\n");
      out.write("            if (r) {\r\n");
      out.write("                setCookie(\"AdminName\", null);\r\n");
      out.write("                setCookie(\"AdminPass\", null);\r\n");
      out.write("                setCookie(\"UserName\", null);\r\n");
      out.write("                setCookie(\"Role\", null);\r\n");
      out.write("                setCookie(\"PrjID\", null);\r\n");
      out.write("                if (getCookie(\"OrgID\") == \"12\") //江苏芯光能源管理有限公司\r\n");
      out.write("                {\r\n");
      out.write("                    setCookie(\"OrgID\", null);\r\n");
      out.write("                    window.location.href = \"xglogin.htm\";\r\n");
      out.write("                }\r\n");
      out.write("                else {\r\n");
      out.write("                    setCookie(\"OrgID\", null);\r\n");
      out.write("                    window.location.href = \"Login.aspx\";\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("    //判断是否登录\r\n");
      out.write("    if (getCookie(\"UserName\") != null && getCookie(\"Role\") != null) {\r\n");
      out.write("        //BindEqpList(\"treeDiv1\", \"大棚实时监控\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/monitor\");\r\n");
      out.write("        BindEqpList(\"treeDiv1\", \"大棚监控\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/toMonitorDetailPage\");\r\n");
      out.write("        \r\n");
      out.write("        if (getCookie(\"OrgID\") == \"12\") //江苏芯光能源管理有限公司\r\n");
      out.write("        {\r\n");
      out.write("            $(\"#tabs_1\").hide();\r\n");
      out.write("            changemenu(3, \"时间设置\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    else {\r\n");
      out.write("        $.messager.alert(\"温馨提示\", \"登录已经过期，请重新登录！\", \"info\");\r\n");
      out.write("        window.location.href = \"Login.aspx\";\r\n");
      out.write("    }\r\n");
      out.write("    //    if (getCookie(\"OrgID\") == \"95\") {\r\n");
      out.write("    //        $(\"#tit\").html(\"远程视频监控智能管理系统\");\r\n");
      out.write("    //        document.title = \"远程视频监控智能管理系统\";\r\n");
      out.write("    //    } else {\r\n");
      out.write("    //        $(\"#tit\").html(\"智慧生态种植系统\");\r\n");
      out.write("    //        document.title = \"智慧生态种植系统\";\r\n");
      out.write("    //    }\r\n");
      out.write("    if (getCookie(\"OrgID\") != \"12\") //江苏芯光能源管理有限公司\r\n");
      out.write("    {\r\n");
      out.write("        //setTimeout(\"AddTab('大棚实时监控', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/monitor');\", 10);\r\n");
      out.write("        setTimeout(\"AddTab('大棚监控', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/toMonitorDetailPage');\", 10);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $(\"#menudv\").mouseover(function () {\r\n");
      out.write("        $(\"#menudv\").attr(\"src\", \"Imagers/globe grey.ico\");\r\n");
      out.write("\r\n");
      out.write("    }).mouseout(function () {\r\n");
      out.write("        $(\"#menudv\").attr(\"src\", \"Imagers/globe.ico\");\r\n");
      out.write("    }).click(function (e) {\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("        $('#mmd').menu('show', {\r\n");
      out.write("            left: e.pageX,\r\n");
      out.write("            top: e.pageY\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write(" \t\r\n");
      out.write("//根据节点排序号获取节点地址\r\n");
      out.write("function SelNode(ul) {\r\n");
      out.write("    if (ul == 22) {\r\n");
      out.write("        return 'Admin/Headoffice.aspx';\r\n");
      out.write("    } else if (ul == 20) {\r\n");
      out.write("        return 'Admin/OrganiZation.aspx';\r\n");
      out.write("    } else if (ul == 21) {\r\n");
      out.write("        return 'Admin/ProjectManager.aspx';\r\n");
      out.write("    } else if (ul == 34) {\r\n");
      out.write("        return 'Admin/UserSystemAssign.aspx';\r\n");
      out.write("    } else if (ul == 5) {\r\n");
      out.write("        return 'Admin/Privileges.aspx';\r\n");
      out.write("    } else if (ul == 24) {\r\n");
      out.write("        return 'Admin/ControlBoxType.aspx';\r\n");
      out.write("    } else if (ul == 52) {\r\n");
      out.write("        return 'Admin/SensorTypeSettings.aspx';\r\n");
      out.write("    } else if (ul == 25) {\r\n");
      out.write("        return 'Admin/LampPostType.aspx';\r\n");
      out.write("    } else if (ul == 26) {\r\n");
      out.write("        return 'Admin/ControllerTypeSettings.aspx';\r\n");
      out.write("    } else if (ul == 27) {\r\n");
      out.write("        return 'Admin/StreetlamptypeSettings.aspx';\r\n");
      out.write("    } else if (ul == 15) {\r\n");
      out.write("        return 'Admin/ControlBoxSet.aspx';\r\n");
      out.write("    } else if (ul == 47) {\r\n");
      out.write("        return 'Admin/InstrumentSettings.aspx';\r\n");
      out.write("    } else if (ul == 50) {\r\n");
      out.write("        return 'Admin/SensorSetup.aspx';\r\n");
      out.write("    } else if (ul == 16) {\r\n");
      out.write("        return 'Admin/LampPost.aspx';\r\n");
      out.write("    } else if (ul == 17) {\r\n");
      out.write("        return 'Admin/ControlsSetup.aspx';\r\n");
      out.write("    } else if (ul == 18) {\r\n");
      out.write("        return 'Admin/StreetLampSet.aspx';\r\n");
      out.write("    } else if (ul == 28) {\r\n");
      out.write("        return 'Admin/GroupCustom.aspx';\r\n");
      out.write("    } else if (ul == 29) {\r\n");
      out.write("        return 'Admin/GroupSubsidiary.aspx';\r\n");
      out.write("    } else if (ul == 30) {\r\n");
      out.write("        return 'Admin/StrategyCustom.aspx';\r\n");
      out.write("    } else if (ul == 53) {\r\n");
      out.write("        return 'Admin/SensorGroup.aspx';\r\n");
      out.write("    } else if (ul == 31) {\r\n");
      out.write("        return 'Admin/ImplementationPlan.aspx';\r\n");
      out.write("    } else if (ul == 32) {\r\n");
      out.write("        return 'Admin/ACLAssociation.aspx';\r\n");
      out.write("    } else if (ul == 12) {\r\n");
      out.write("        return 'Admin/RealTimeAlerts.aspx';\r\n");
      out.write("    } else if (ul == 42) {\r\n");
      out.write("        return 'Admin/AlertProcessing.aspx';\r\n");
      out.write("    } else if (ul == 33) {\r\n");
      out.write("        return '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/monitor';\r\n");
      out.write("    } else if (ul == 56) {\r\n");
      out.write("        return 'Admin/BaiDuiMap.aspx';\r\n");
      out.write("    } else if (ul == 58) {\r\n");
      out.write("        return \"Admin/LoopControl.aspx\";\r\n");
      out.write("    } else if (ul == 48) {\r\n");
      out.write("        return \"Admin/RealTimeMeterReading.aspx\";\r\n");
      out.write("    } else if (ul == 49) { //抄表数据统计\r\n");
      out.write("        return \"Admin/MeterStatistics.aspx\";\r\n");
      out.write("    } else {\r\n");
      out.write("        return 'Admin/NullPage.htm';\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("//查询菜单\r\n");
      out.write("var ResultNodeJson;\r\n");
      out.write("var SelectNode = function (GetResult) {\r\n");
      out.write("    var UserName = getCookie(\"UserName\");\r\n");
      out.write("    var Role = getCookie(\"Role\");\r\n");
      out.write("    var url = \"WebService.asmx/SelNodes\";\r\n");
      out.write("    //获取登录之后返回的JSON权限数据\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        type: \"GET\",\r\n");
      out.write("        async: false,\r\n");
      out.write("        url: url,\r\n");
      out.write("        data: \"&UserName=\" + UserName + \"&Role=\" + Role,\r\n");
      out.write("        success: function (msg) {\r\n");
      out.write("            var json = $(msg).find(\"string\").text();\r\n");
      out.write("            var result = eval(\"(\" + json + \")\");\r\n");
      out.write("            GetResult(result);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("var GetResult = function (result) {\r\n");
      out.write("    ResultNodeJson = result;\r\n");
      out.write("}\r\n");
      out.write("SelectNode(GetResult);\r\n");
      out.write("//菜单切换\r\n");
      out.write("function changemenu(checkid, mCheckName) {\r\n");
      out.write("    $(\"#tabs_container > div\").attr(\"class\", \"\");\r\n");
      out.write("    $(\"#tabs_\" + checkid).attr(\"class\", \"selected\");\r\n");
      out.write("    $(\"#first_title\").empty().append(mCheckName);\r\n");
      out.write("    $(\"#MenuID > div\").hide();\r\n");
      out.write("    switch (checkid) {\r\n");
      out.write("        case 1:\r\n");
      out.write("            $(\"#treeDiv1\").show();\r\n");
      out.write("            BindEqpList(\"treeDiv1\", \"大棚监控\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/toMonitorDetailPage\");\r\n");
      out.write("            AddTab('大棚监控', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/toMonitorDetailPage');\r\n");
      out.write("            break;\r\n");
      out.write("        case 2:\r\n");
      out.write("            $(\"#treeDiv2\").show();\r\n");
      out.write("            BindEqpList(\"treeDiv2\", \"大棚监控列表\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/getMonitorList\");\r\n");
      out.write("            AddTab('大棚监控列表', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/getMonitorList');\r\n");
      out.write("            break;\r\n");
      out.write("        case 3:\r\n");
      out.write("            $(\"#treeDiv3\").show();\r\n");
      out.write("            BindEqpList(\"treeDiv3\", \"时间设置\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/toThresholdConfig?cfgType=3\");\r\n");
      out.write("            AddTab('时间设置', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse//toThresholdConfig?cfgType=3');\r\n");
      out.write("            break;\r\n");
      out.write("        case 4:\r\n");
      out.write("            /* $(\"#treeDiv4\").show();\r\n");
      out.write("            if (mBind4 == 0) {\r\n");
      out.write("                mBind4 = 1;\r\n");
      out.write("                DataBindNode(\"treeDiv4\", 229, 249);\r\n");
      out.write("            } */\r\n");
      out.write("            $(\"#treeDiv4\").show();\r\n");
      out.write("            BindEqpList(\"treeDiv4\", \"数据曲线\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/toChart\");\r\n");
      out.write("            AddTab('数据曲线', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/toChart');\r\n");
      out.write("            break;\r\n");
      out.write("            break;\r\n");
      out.write("        case 5:\r\n");
      out.write("            $(\"#treeDiv5\").show();\r\n");
      out.write("            if (mBind5 == 0) {\r\n");
      out.write("                mBind5 = 1;\r\n");
      out.write("                DataBindNode(\"treeDiv5\", 259, 263);\r\n");
      out.write("            }\r\n");
      out.write("            break;\r\n");
      out.write("        case 6:\r\n");
      out.write("            $(\"#treeDiv6\").show();\r\n");
      out.write("            BindEqpList(\"treeDiv6\", \"光照度设置\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/toLightTriggerConfig\");\r\n");
      out.write("            AddTab('光照度设置', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/toLightTriggerConfig');\r\n");
      out.write("            break;\r\n");
      out.write("        case 7:\r\n");
      out.write("            $(\"#treeDiv7\").show();\r\n");
      out.write("            BindEqpList(\"treeDiv7\", \"运行模式设置\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/toeditschedule\");\r\n");
      out.write("            AddTab('运行模式设置', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webcontext}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/greenhouse/toeditschedule');\r\n");
      out.write("            break;\r\n");
      out.write("        default:\r\n");
      out.write("            break;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    // END indexjs.js move to here\r\n");
      out.write("        self.moveTo(0,0);\r\n");
      out.write("        self.resizeTo(screen.availWidth, screen.availHeight);\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("    <div region=\"north\" border=\"true\" class=\"cs-north\" style=\"overflow: hidden;\">\r\n");
      out.write("        <div style=\"float: left; width: 800px;\">\r\n");
      out.write("            <div style=\"float: left; margin: 20px 0 0 50px; width: 600px; height: 58px;\">\r\n");
      out.write("                <span style=\"float: left;\">\r\n");
      out.write("                    <!-- <img id=\"logo_img\" src=\"Imagers/logo_index.png\" alt=\"\" /> --></span> <span id=\"tit\" style=\"float: left; padding: 10px; font-family: 幼圆; font-size: 38px; color: White;\">智慧生态种植系统</span></div>\r\n");
      out.write("            <div style=\"float: left; width: 800px; height: 30px; margin-left: 50px;\">\r\n");
      out.write("                <div id=\"tabs_container\" style=\"width: 800px;\">\r\n");
      out.write("                \t<div id='tabs_1' onclick='changemenu(1,\"大棚监控\");'>\r\n");
      out.write("                        <a href='javascript:;' id='tabs_link_1' class='tab' hidefocus='hidefocus'>大棚监控</a></div>\r\n");
      out.write("                    <div id='tabs_2' onclick='changemenu(2,\"大棚监控列表\");'>\r\n");
      out.write("                        <a href='javascript:;' id='tabs_link_2' class='tab' hidefocus='hidefocus'>大棚监控列表</a></div>\r\n");
      out.write("                    <div id='tabs_3' onclick='changemenu(3,\"时间设置\");'>\r\n");
      out.write("                        <a href='javascript:;' id='tabs_link_3' class='tab' hidefocus='hidefocus'>时间设置</a></div>\r\n");
      out.write("                    <div id='tabs_5' onclick='changemenu(4,\"数据曲线\");'>\r\n");
      out.write("                        <a href='javascript:;' id='tabs_link_4' class='tab' hidefocus='hidefocus'>数据曲线</a></div>\r\n");
      out.write("                    <div id='tabs_6' onclick='changemenu(6,\"光照度设置\");'>\r\n");
      out.write("                        <a href='javascript:;' id='tabs_link_6' class='tab' hidefocus='hidefocus'>光照度设置</a></div>\r\n");
      out.write("                    <div id='tabs_7' onclick='changemenu(7,\"运行模式设置\");'>\r\n");
      out.write("                        <a href='javascript:;' id='tabs_link_7' class='tab' hidefocus='hidefocus'>运行模式设置</a></div>\r\n");
      out.write("                        \r\n");
      out.write("                    <!-- \r\n");
      out.write("                    <div id='tabs_1' class='selected' onclick='changemenu(1,\"运行监控\");'>\r\n");
      out.write("                        <a href='javascript:;' id='tabs_link_1' class='tab' hidefocus='hidefocus'>运行监控</a></div>\r\n");
      out.write("                    <div id='tabs_4' onclick='changemenu(4,\"策略控制\");'>\r\n");
      out.write("                        <a href='javascript:;' id='tabs_link_4' class='tab' hidefocus='hidefocus'>策略控制</a></div>\r\n");
      out.write("                    <div id='tabs_6' onclick='changemenu(6,\"故障告警\");'>\r\n");
      out.write("                        <a href='javascript:;' id='tabs_link_6' class='tab' hidefocus='hidefocus'>故障告警</a></div>\r\n");
      out.write("                     -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"float: right; width: 260px;\">\r\n");
      out.write("            <div style=\"float: right; width: 255px; height: 85px; margin-top: -23px; overflow: hidden;\">\r\n");
      out.write("                <iframe src=\"http://www.thinkpage.cn/weather/weather.aspx?uid=&cid=101010100&l=zh-CHS&p=CMA&a=1&u=C&s=31&m=1&x=1&d=0&fc=FFFFFF&bgc=&bc=&ti=1&in=1&li=2&ct=iframe\"\r\n");
      out.write("                    frameborder=\"0\" scrolling=\"no\" width=\"300\" height=\"90\" allowtransparency=\"true\">\r\n");
      out.write("                </iframe>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"float: right; height: 20px; margin-right: 40px; padding-top: 15px; display:none;\">\r\n");
      out.write("                <ul class=\"ui-skin-nav\">\r\n");
      out.write("                    <li class=\"li-skinitem\" title=\"blue\"><span class=\"blue\" rel=\"blue\"></span></li>\r\n");
      out.write("                    <li class=\"li-skinitem\" title=\"gray\"><span class=\"gray\" rel=\"gray\"></span></li>\r\n");
      out.write("                    <li class=\"li-skinitem\" title=\"pepper-grinder\"><span class=\"pepper-grinder\" rel=\"pepper-grinder\">\r\n");
      out.write("                    </span></li>\r\n");
      out.write("                    <li class=\"li-skinitem\" title=\"cupertino\"><span class=\"cupertino\" rel=\"cupertino\"></span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"li-skinitem\" title=\"sunny\"><span class=\"sunny\" rel=\"sunny\"></span></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"float: right; height: 30px;text-align:center; margin-top: 10px; color: White; margin-right: 43px;width:200px;\">\r\n");
      out.write("                <label id=\"lbl_Name\"></label> &nbsp;&nbsp;\r\n");
      out.write("                <a id=\"esc\" href=\"javascript:void(0);\" style=\"color: #E6F0FF;\">退出</a> | <a id=\"logout\"\r\n");
      out.write("                    href=\"javascript:void(0);\" style=\"color: #E6F0FF;\">注销</a> \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"MenuID\" region=\"west\" border=\"true\" split=\"true\" style=\"overflow-y:auto;\" iconcls=\"icon-sys\" title=\"<b style='font-size:14px;' id='first_title'>运行监控</b>\"\r\n");
      out.write("        class=\"cs-west\">\r\n");
      out.write("        <div id=\"treeDiv1\" style=\"display: block;margin-top:10px;float:left;\">\r\n");
      out.write("        <span style='float:left;width:100%;margin-left:10px;cursor:hand;'>全部</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"treeDiv2\" style=\"display: none;margin-top:10px;float:left;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"treeDiv3\" style=\"display: none;margin-top:10px;float:left;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"easyui-accordion\" fit=\"true\" border=\"false\" id=\"treeDiv4\" style=\"display: none;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"easyui-accordion\" fit=\"true\" border=\"false\" id=\"treeDiv5\" style=\"display: none;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"easyui-accordion\" fit=\"true\" border=\"false\" id=\"treeDiv6\" style=\"display: none;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"easyui-accordion\" fit=\"true\" border=\"false\" id=\"treeDiv7\" style=\"display: none;\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"mainPanle\" region=\"center\" border=\"true\" border=\"false\">\r\n");
      out.write("        <div id=\"tabs\" class=\"easyui-tabs\" fit=\"true\" border=\"false\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div region=\"south\" border=\"false\" class=\"cs-south\">\r\n");
      out.write("        智慧生态种植系统&nbsp;V2.4\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"mm\" class=\"easyui-menu cs-tab-menu\">\r\n");
      out.write("        <div id=\"mm-tabupdate\">\r\n");
      out.write("            刷新</div>\r\n");
      out.write("        <div class=\"menu-sep\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"mm-tabclose\">\r\n");
      out.write("            关闭</div>\r\n");
      out.write("        <div id=\"mm-tabcloseother\">\r\n");
      out.write("            关闭其他</div>\r\n");
      out.write("        <div id=\"mm-tabcloseall\">\r\n");
      out.write("            关闭全部</div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
