<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../include/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="Shortcut Icon" href="Imagers/ligth-on.ico" />
    <link rel="Bookmark" href="Imagers/ligth-on.ico" />
    <title>智慧生态种植系统</title>
    <link href="${csspath}/easyui.css" rel="stylesheet" type="text/css" id="swicth-style" />
    <link href="${csspath}/icon.css" rel="stylesheet" type="text/css" />
    <script src="${jspath}/jquery-1.7.2.min.js" type="text/javascript"></script>
    <script src="${jspath}/jquery.easyui.min.js" type="text/javascript"></script>
    <script src="${jspath}/IndexJs.js" type="text/javascript"></script>
    <link href="${csspath}/IndexCss.css" rel="stylesheet" type="text/css" />
    <link href="${csspath}/default.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" language="JavaScript">
 	// Start indexjs.js move to here
 	var mBind1 = 0, mBind2 = 0, mBind3 = 0, mBind4 = 0, mBind5 = 0, mBind6 = 0, mBind7 = 0;
$(document).ready(function () {
	//added by zizou 
	//for test 
	setCookie("AdminName", "adminName");
    setCookie("AdminPass", "adminPass");
    setCookie("UserName", "王志泽");
    setCookie("Role", 0);
    setCookie("OrgID", null);
    setCookie("PrjID", null);
    setCookie("remember", "是");
    setCookie("Ckautomatic", "是");
	
	
    var userRoleID = getCookie("Role");
    var userRole = "";
    if (userRoleID == 0) {
        userRole = "高级管理员";
    }
    else if (userRoleID == 1) {
        userRole = "管理员";
    }
    else if (userRoleID == 2) {
        userRole = "机构管理员";
    }
    else if (userRoleID == 3) {
        userRole = "项目管理员";
    }
    else if (userRoleID == 4) {
        userRole = "普通操作员";
    }
    $("#lbl_Name").html("欢迎您！" + getCookie("UserName"));
    tabCloseEven();
    if (getCookie("OrgID") == "7") //徐州节能改造
    {
        //$("#about").attr("href","javascript:;");
        $("#logo_img").attr("src", "Imagers/gglogo_index.png");
    }
    if (getCookie("OrgID") == "12") //江苏芯光能源管理有限公司
    {
        //$("#tit").attr("href", "javascript:;");
        $("#logo_img").hide();
        $("#tit").html("扬州瘦西湖风景区管理处");
    }

    /*切换主题开始*/
    var themes = {
        'gray': 'css/themes/gray/easyui.css',
        'pepper-grinder': 'css/themes/pepper-grinder/easyui.css',
        'blue': 'css/themes/default/easyui.css',
        'cupertino': 'css/themes/cupertino/easyui.css',
        'dark-hive': 'css/themes/dark-hive/easyui.css',
        'sunny': 'css/themes/sunny/easyui.css'
    };
    var skins = $('.li-skinitem span').click(function () {
        var $this = $(this);
        if ($this.hasClass('cs-skin-on')) return;
        skins.removeClass('cs-skin-on');
        $this.addClass('cs-skin-on');
        var skin = $this.attr('rel');
        $('#swicth-style').attr('href', themes[skin]);
        setCookie('cs-skin', skin);
        skin == 'dark-hive' ? $('.cs-north-logo').css('color', '#FFFFFF') : $('.cs-north-logo').css('color', '#000000');
    });
    if (getCookie('cs-skin')) {
        var skin = getCookie('cs-skin');
        $('#swicth-style').attr('href', themes[skin]);
        $this = $('.li-skinitem span[rel=' + skin + ']');
        $this.addClass('cs-skin-on');
        skin == 'dark-hive' ? $('.cs-north-logo').css('color', '#FFFFFF') : $('.cs-north-logo').css('color', '#000000');
    }
    /*切换主题结束*/

    window.onbeforeunload = function () //author: meizz     
    {
        var n = window.event.screenX - window.screenLeft;
        var b = n > document.documentElement.scrollWidth - 20;
        if (b && window.event.clientY < 0 || window.event.altKey) {
            window.event.returnValue = "确定要退出-智慧生态种植系统？";
        }
    }
    if (window.screen) {              //判断浏览器是否支持window.screen判断浏览器是否支持screen
        var myw = screen.availWidth;   //定义一个myw，接受到当前全屏的宽
        var myh = screen.availHeight;  //定义一个myw，接受到当前全屏的高
        window.moveTo(0, 0);           //把window放在左上脚
        window.resizeTo(myw, myh);     //把当前窗体的长宽跳转为myw和myh
    }
    //退出
    $("#esc").click(function () {
        $.messager.confirm("温馨提示", "确定要退出智慧生态种植系统?", function (r) {
            if (r) {
                //if ($("#Ckzd").attr("checked") || $("#Ckjz").attr("checked")) {
                if (getCookie("remember") == "是" || getCookie("Ckautomatic") == "是") {
                    setCookie("OrgID", null);
                    setCookie("PrjID", null);
                } else {
                    setCookie("AdminName", null);
                    setCookie("AdminPass", null);
                    setCookie("UserName", null);
                    setCookie("Role", null);
                    setCookie("OrgID", null);
                    setCookie("PrjID", null);
                }
                window.open('', '_self', '');
                window.close();
            }
        });
    });
    //注销
    $("#logout").click(function () {
        $.messager.confirm("温馨提示", "确定要注销智慧生态种植系统，重新登录吗？", function (r) {
            if (r) {
                setCookie("AdminName", null);
                setCookie("AdminPass", null);
                setCookie("UserName", null);
                setCookie("Role", null);
                setCookie("PrjID", null);
                if (getCookie("OrgID") == "12") //江苏芯光能源管理有限公司
                {
                    setCookie("OrgID", null);
                    window.location.href = "xglogin.htm";
                }
                else {
                    setCookie("OrgID", null);
                    window.location.href = "Login.aspx";
                }
            }
        });
    });
    //判断是否登录
    if (getCookie("UserName") != null && getCookie("Role") != null) {
        //BindEqpList("treeDiv1", "大棚实时监控", "${webcontext}/greenhouse/monitor");
        BindEqpList("treeDiv1", "大棚监控", "${webcontext}/greenhouse/toMonitorDetailPage");
        
        if (getCookie("OrgID") == "12") //江苏芯光能源管理有限公司
        {
            $("#tabs_1").hide();
            changemenu(3, "时间设置");
        }
    }
    else {
        $.messager.alert("温馨提示", "登录已经过期，请重新登录！", "info");
        window.location.href = "Login.aspx";
    }
    //    if (getCookie("OrgID") == "95") {
    //        $("#tit").html("远程视频监控智能管理系统");
    //        document.title = "远程视频监控智能管理系统";
    //    } else {
    //        $("#tit").html("智慧生态种植系统");
    //        document.title = "智慧生态种植系统";
    //    }
    if (getCookie("OrgID") != "12") //江苏芯光能源管理有限公司
    {
        //setTimeout("AddTab('大棚实时监控', '${webcontext}/greenhouse/monitor');", 10);
        setTimeout("AddTab('大棚监控', '${webcontext}/greenhouse/toMonitorDetailPage');", 10);
    }

    $("#menudv").mouseover(function () {
        $("#menudv").attr("src", "Imagers/globe grey.ico");

    }).mouseout(function () {
        $("#menudv").attr("src", "Imagers/globe.ico");
    }).click(function (e) {
        e.preventDefault();
        $('#mmd').menu('show', {
            left: e.pageX,
            top: e.pageY
        });

    });
});
 	
//根据节点排序号获取节点地址
function SelNode(ul) {
    if (ul == 22) {
        return 'Admin/Headoffice.aspx';
    } else if (ul == 20) {
        return 'Admin/OrganiZation.aspx';
    } else if (ul == 21) {
        return 'Admin/ProjectManager.aspx';
    } else if (ul == 34) {
        return 'Admin/UserSystemAssign.aspx';
    } else if (ul == 5) {
        return 'Admin/Privileges.aspx';
    } else if (ul == 24) {
        return 'Admin/ControlBoxType.aspx';
    } else if (ul == 52) {
        return 'Admin/SensorTypeSettings.aspx';
    } else if (ul == 25) {
        return 'Admin/LampPostType.aspx';
    } else if (ul == 26) {
        return 'Admin/ControllerTypeSettings.aspx';
    } else if (ul == 27) {
        return 'Admin/StreetlamptypeSettings.aspx';
    } else if (ul == 15) {
        return 'Admin/ControlBoxSet.aspx';
    } else if (ul == 47) {
        return 'Admin/InstrumentSettings.aspx';
    } else if (ul == 50) {
        return 'Admin/SensorSetup.aspx';
    } else if (ul == 16) {
        return 'Admin/LampPost.aspx';
    } else if (ul == 17) {
        return 'Admin/ControlsSetup.aspx';
    } else if (ul == 18) {
        return 'Admin/StreetLampSet.aspx';
    } else if (ul == 28) {
        return 'Admin/GroupCustom.aspx';
    } else if (ul == 29) {
        return 'Admin/GroupSubsidiary.aspx';
    } else if (ul == 30) {
        return 'Admin/StrategyCustom.aspx';
    } else if (ul == 53) {
        return 'Admin/SensorGroup.aspx';
    } else if (ul == 31) {
        return 'Admin/ImplementationPlan.aspx';
    } else if (ul == 32) {
        return 'Admin/ACLAssociation.aspx';
    } else if (ul == 12) {
        return 'Admin/RealTimeAlerts.aspx';
    } else if (ul == 42) {
        return 'Admin/AlertProcessing.aspx';
    } else if (ul == 33) {
        return '${webcontext}/greenhouse/monitor';
    } else if (ul == 56) {
        return 'Admin/BaiDuiMap.aspx';
    } else if (ul == 58) {
        return "Admin/LoopControl.aspx";
    } else if (ul == 48) {
        return "Admin/RealTimeMeterReading.aspx";
    } else if (ul == 49) { //抄表数据统计
        return "Admin/MeterStatistics.aspx";
    } else {
        return 'Admin/NullPage.htm';
    }
}
//查询菜单
var ResultNodeJson;
var SelectNode = function (GetResult) {
    var UserName = getCookie("UserName");
    var Role = getCookie("Role");
    var url = "WebService.asmx/SelNodes";
    //获取登录之后返回的JSON权限数据
    $.ajax({
        type: "GET",
        async: false,
        url: url,
        data: "&UserName=" + UserName + "&Role=" + Role,
        success: function (msg) {
            var json = $(msg).find("string").text();
            var result = eval("(" + json + ")");
            GetResult(result);
        }
    });
}
var GetResult = function (result) {
    ResultNodeJson = result;
}
SelectNode(GetResult);
//菜单切换
function changemenu(checkid, mCheckName) {
    $("#tabs_container > div").attr("class", "");
    $("#tabs_" + checkid).attr("class", "selected");
    $("#first_title").empty().append(mCheckName);
    $("#MenuID > div").hide();
    switch (checkid) {
        case 1:
            $("#treeDiv1").show();
            BindEqpList("treeDiv1", "大棚监控", "${webcontext}/greenhouse/toMonitorDetailPage");
            AddTab('大棚监控', '${webcontext}/greenhouse/toMonitorDetailPage');
            break;
        case 2:
            $("#treeDiv2").show();
            BindEqpList("treeDiv2", "大棚监控列表", "${webcontext}/greenhouse/getMonitorList");
            AddTab('大棚监控列表', '${webcontext}/greenhouse/getMonitorList');
            break;
        case 3:
            $("#treeDiv3").show();
            BindEqpList("treeDiv3", "时间设置", "${webcontext}/greenhouse/toThresholdConfig?cfgType=3");
            AddTab('时间设置', '${webcontext}/greenhouse//toThresholdConfig?cfgType=3');
            break;
        case 4:
            /* $("#treeDiv4").show();
            if (mBind4 == 0) {
                mBind4 = 1;
                DataBindNode("treeDiv4", 229, 249);
            } */
            $("#treeDiv4").show();
            BindEqpList("treeDiv4", "数据曲线", "${webcontext}/greenhouse/toChart");
            AddTab('数据曲线', '${webcontext}/greenhouse/toChart');
            break;
            break;
        case 5:
            $("#treeDiv5").show();
            if (mBind5 == 0) {
                mBind5 = 1;
                DataBindNode("treeDiv5", 259, 263);
            }
            break;
        case 6:
            $("#treeDiv6").show();
            BindEqpList("treeDiv6", "光照度设置", "${webcontext}/greenhouse/toLightTriggerConfig");
            AddTab('光照度设置', '${webcontext}/greenhouse/toLightTriggerConfig');
            break;
        case 7:
            $("#treeDiv7").show();
            BindEqpList("treeDiv7", "运行模式设置", "${webcontext}/greenhouse/toeditschedule");
            AddTab('运行模式设置', '${webcontext}/greenhouse/toeditschedule');
            break;
        default:
            break;
    }
}



    // END indexjs.js move to here
        self.moveTo(0,0);
        self.resizeTo(screen.availWidth, screen.availHeight);
    </script>
</head>
<body class="easyui-layout">
    <div region="north" border="true" class="cs-north" style="overflow: hidden;">
        <div style="float: left; width: 800px;">
            <div style="float: left; margin: 20px 0 0 50px; width: 600px; height: 58px;">
                <span style="float: left;">
                    <!-- <img id="logo_img" src="Imagers/logo_index.png" alt="" /> --></span> <span id="tit" style="float: left; padding: 10px; font-family: 幼圆; font-size: 38px; color: White;">智慧生态种植系统</span></div>
            <div style="float: left; width: 800px; height: 30px; margin-left: 50px;">
                <div id="tabs_container" style="width: 800px;">
                	<div id='tabs_1' onclick='changemenu(1,"大棚监控");'>
                        <a href='javascript:;' id='tabs_link_1' class='tab' hidefocus='hidefocus'>大棚监控</a></div>
                    <div id='tabs_2' onclick='changemenu(2,"大棚监控列表");'>
                        <a href='javascript:;' id='tabs_link_2' class='tab' hidefocus='hidefocus'>大棚监控列表</a></div>
                    <div id='tabs_3' onclick='changemenu(3,"时间设置");'>
                        <a href='javascript:;' id='tabs_link_3' class='tab' hidefocus='hidefocus'>时间设置</a></div>
                    <div id='tabs_5' onclick='changemenu(4,"数据曲线");'>
                        <a href='javascript:;' id='tabs_link_4' class='tab' hidefocus='hidefocus'>数据曲线</a></div>
                    <div id='tabs_6' onclick='changemenu(6,"光照度设置");'>
                        <a href='javascript:;' id='tabs_link_6' class='tab' hidefocus='hidefocus'>光照度设置</a></div>
                    <div id='tabs_7' onclick='changemenu(7,"运行模式设置");'>
                        <a href='javascript:;' id='tabs_link_7' class='tab' hidefocus='hidefocus'>运行模式设置</a></div>
                        
                    <!-- 
                    <div id='tabs_1' class='selected' onclick='changemenu(1,"运行监控");'>
                        <a href='javascript:;' id='tabs_link_1' class='tab' hidefocus='hidefocus'>运行监控</a></div>
                    <div id='tabs_4' onclick='changemenu(4,"策略控制");'>
                        <a href='javascript:;' id='tabs_link_4' class='tab' hidefocus='hidefocus'>策略控制</a></div>
                    <div id='tabs_6' onclick='changemenu(6,"故障告警");'>
                        <a href='javascript:;' id='tabs_link_6' class='tab' hidefocus='hidefocus'>故障告警</a></div>
                     -->
                </div>
            </div>
        </div>
        <div style="float: right; width: 260px;">
            <div style="float: right; width: 255px; height: 85px; margin-top: -23px; overflow: hidden;">
                <iframe src="http://www.thinkpage.cn/weather/weather.aspx?uid=&cid=101010100&l=zh-CHS&p=CMA&a=1&u=C&s=31&m=1&x=1&d=0&fc=FFFFFF&bgc=&bc=&ti=1&in=1&li=2&ct=iframe"
                    frameborder="0" scrolling="no" width="300" height="90" allowtransparency="true">
                </iframe>
            </div>
            <div style="float: right; height: 20px; margin-right: 40px; padding-top: 15px; display:none;">
                <ul class="ui-skin-nav">
                    <li class="li-skinitem" title="blue"><span class="blue" rel="blue"></span></li>
                    <li class="li-skinitem" title="gray"><span class="gray" rel="gray"></span></li>
                    <li class="li-skinitem" title="pepper-grinder"><span class="pepper-grinder" rel="pepper-grinder">
                    </span></li>
                    <li class="li-skinitem" title="cupertino"><span class="cupertino" rel="cupertino"></span>
                    </li>
                    <li class="li-skinitem" title="sunny"><span class="sunny" rel="sunny"></span></li>
                </ul>
            </div>
            <div style="float: right; height: 30px;text-align:center; margin-top: 10px; color: White; margin-right: 43px;width:200px;">
                <label id="lbl_Name"></label> &nbsp;&nbsp;
                <a id="esc" href="javascript:void(0);" style="color: #E6F0FF;">退出</a> | <a id="logout"
                    href="javascript:void(0);" style="color: #E6F0FF;">注销</a> 
            </div>
        </div>
    </div>
    <div id="MenuID" region="west" border="true" split="true" style="overflow-y:auto;" iconcls="icon-sys" title="<b style='font-size:14px;' id='first_title'>运行监控</b>"
        class="cs-west">
        <div id="treeDiv1" style="display: block;margin-top:10px;float:left;">
        <span style='float:left;width:100%;margin-left:10px;cursor:hand;'>全部</span>
        </div>
        <div id="treeDiv2" style="display: none;margin-top:10px;float:left;">
        </div>
        <div id="treeDiv3" style="display: none;margin-top:10px;float:left;">
        </div>
        <div class="easyui-accordion" fit="true" border="false" id="treeDiv4" style="display: none;">
        </div>
        <div class="easyui-accordion" fit="true" border="false" id="treeDiv5" style="display: none;">
        </div>
        <div class="easyui-accordion" fit="true" border="false" id="treeDiv6" style="display: none;">
        </div>
        <div class="easyui-accordion" fit="true" border="false" id="treeDiv7" style="display: none;">
        </div>
    </div>
    <div id="mainPanle" region="center" border="true" border="false">
        <div id="tabs" class="easyui-tabs" fit="true" border="false">
        </div>
    </div>
    <div region="south" border="false" class="cs-south">
        智慧生态种植系统&nbsp;V2.4
    </div>
    <div id="mm" class="easyui-menu cs-tab-menu">
        <div id="mm-tabupdate">
            刷新</div>
        <div class="menu-sep">
        </div>
        <div id="mm-tabclose">
            关闭</div>
        <div id="mm-tabcloseother">
            关闭其他</div>
        <div id="mm-tabcloseall">
            关闭全部</div>
    </div>
</body>
</html>
