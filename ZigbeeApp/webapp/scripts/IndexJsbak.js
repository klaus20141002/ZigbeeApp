/// <reference path="jquery-1.7.2.min.js" />
/// <reference path="jquery.easyui.min.js" />
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
            window.event.returnValue = "确定要退出-果蔬地生产滴灌监控系统？";
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
        $.messager.confirm("温馨提示", "确定要退出无线智能照明监控系统?", function (r) {
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
        $.messager.confirm("温馨提示", "确定要注销无线智能照明监控系统，重新登录吗？", function (r) {
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
        //BindEqpList("treeDiv1", "大棚实时监控", "http://localhost:8010/ZigbeeApp/greenhouse/monitor");
        BindEqpList("treeDiv1", "大棚监控", "http://localhost:8010/ZigbeeApp/greenhouse/getList");
        
        if (getCookie("OrgID") == "12") //江苏芯光能源管理有限公司
        {
            $("#tabs_1").hide();
            changemenu(3, "联动设置");
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
    //        $("#tit").html("果蔬地生产滴灌监控系统");
    //        document.title = "果蔬地生产滴灌监控系统";
    //    }
    if (getCookie("OrgID") != "12") //江苏芯光能源管理有限公司
    {
        //setTimeout("AddTab('大棚实时监控', 'http://localhost:8010/ZigbeeApp/greenhouse/monitor');", 10);
        setTimeout("AddTab('大棚监控', 'http://localhost:8010/ZigbeeApp/greenhouse/getList');", 10);
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
function AddCss(id) {
    if (id == 3) {          //系统项目管理
        return 'icon-prj';
    } else if (id == 4) {   //系统权限管理
        return 'icon-key';
    } else if (id == 23) {  //设备类型管理
        return 'icon-iptype';
    } else if (id == 8) {   //设备参数管理
        return 'icon-ipset';
    } else if (id == 9) {   //设备分组管理
        return 'icon-grp';
    } else if (id == 10) {  //策略关联控制
        return 'icon-cngl';
    } else if (id == 44) {  //故障报警管理
        return 'icon-delip';
    } else if (id == 57) {  //远程抄表控制
        return 'icon-lbok';
    } else if (id == 11) {  //远程实时监控
        return 'icon-light';
    } else if (id == 22) {  //总部信息设置
        return 'Imagers/chart_bar_edit.png';
    } else if (id == 20) {  //机构信息设置
        return 'Imagers/chart_curve_edit.png';
    } else if (id == 21) {  //项目信息设置
        return 'Imagers/folder_edit.png';
    } else if (id == 34) {  //系统账户分配
        return 'Imagers/group_edit.png';
    } else if (id == 5) {   //系统权限设置
        return 'Imagers/group_gear.png';
    } else if (id == 24) {  //控制箱类型设置
        return 'Imagers/drive_edit.png';
    } else if (id == 51) {  //电能表类型设置
        return 'Imagers/page_white_lightning.png';
    } else if (id == 52) {  //传感器类型设置
        return 'Imagers/phone_sound.png';
    } else if (id == 25) {  //灯杆类型设置
        return 'Imagers/wand.png';
    } else if (id == 26) {  //灯控器类型设置
        return 'Imagers/transmit_blue.png';
    } else if (id == 27) {  //灯具类型设置
        return 'Imagers/joystick.png';
    } else if (id == 15) {  //控制箱设置
        return 'Imagers/drive_rename.png';
    } else if (id == 47) {  //电能表设置
        return 'Imagers/server_lightning.png';
    } else if (id == 50) {  //传感器设置
        return 'Imagers/ipod_cast.png';
    } else if (id == 16) {  //灯杆设置
        return 'Imagers/vector.png';
    } else if (id == 17) {  //灯控器设置
        return 'Imagers/transmit_edit.png';
    } else if (id == 18) {  //灯具设置
        return 'Imagers/joystick_add.png';
    } else if (id == 28) {  //分组自定义
        return 'Imagers/chart_organisation.png';
    } else if (id == 29) {  //分组成员明细
        return 'Imagers/chart_pie.png';
    } else if (id == 30) {  //策略自定义
        return 'Imagers/shape_group.png';
    } else if (id == 31) {  //预定计划设置
        return 'Imagers/script_edit.png';
    } else if (id == 55) {  //电能表分组关联
        return 'Imagers/table_lightning.png';
    } else if (id == 53) {  //传感器分组关联
        return 'Imagers/feed_disk.png';
    } else if (id == 32) {  //策略分组关联
        return 'Imagers/bricks.png';
    } else if (id == 12) {  //警情实时通报
        return 'Imagers/clock_red.png';
    } else if (id == 42) {  //警情实时处理
        return 'Imagers/clock.png';
    } else if (id == 48) {  //远程实时抄表
        return 'Imagers/computer_edit.png';
    } else if (id == 49) {  //抄表数据统计
        return 'Imagers/chart_pie_edit.png';
    } else if (id == 33) {  //大棚实时监控
        return 'Imagers/folder_lightbulb.png';
    } else if (id == 56) {  //GIS地图监控
        return 'Imagers/picture_edit.png';
    } else if (id == 46) {  //校园能耗监管
        return 'Imagers/tag_blue_edit.png';
    } else if (id == 58) {  //联动设置
        return 'Imagers/compress.png';
    } else {
        return 'Imagers/directory.png';
    }

}
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
        return 'http://localhost:8010/ZigbeeApp/greenhouse/monitor';
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
//添加选项卡
function AddTab(title, url) {
    if ($('#tabs').tabs('exists', title)) {
        $('#tabs').tabs('select', title); //选中并刷新
        var currTab = $('#tabs').tabs('getSelected');
        var url1 = $(currTab.panel('options').content).attr('src');
        if (url1 != undefined && currTab.panel('options').title != '') {
            $('#tabs').tabs('update', {
                tab: currTab,
                options: {
                    content: createFrame(url)
                }
            })
        }
    } else {
        var content = createFrame(url);
        $('#tabs').tabs('add', {
            title: title,
            content: content,
            closable: true,
            selected: true
        });
    }
    tabClose();
}
//嵌入选项卡
function createFrame(url) {
    var s = '<iframe width="100%" height="100%" frameborder="0" scrolling="auto"   src="' + url + '"></iframe>';
    return s;
}
//绑定及关闭选项卡
function tabClose() {
    /*双击关闭TAB选项卡*/
    $(".tabs-inner").dblclick(function () {
        var subtitle = $(this).children(".tabs-closable").text();
        $('#tabs').tabs('close', subtitle);
    })
    /*为选项卡绑定右键*/
    $(".tabs-inner").bind('contextmenu', function (e) {
        $('#mm').menu('show', {
            left: e.pageX,
            top: e.pageY
        });

        var subtitle = $(this).children(".tabs-closable").text();

        $('#mm').data("currtab", subtitle);
        $('#tabs').tabs('select', subtitle);
        return false;
    });
}
//绑定右键菜单事件
function tabCloseEven() {
    //刷新
    $('#mm-tabupdate').click(function () {
        var currTab = $('#tabs').tabs('getSelected');
        var url = $(currTab.panel('options').content).attr('src');
        if (url != undefined && currTab.panel('options').title != '大棚实时监控') {
            $('#tabs').tabs('update', {
                tab: currTab,
                options: {
                    content: createFrame(url)
                }
            })
        }
    })
    //关闭当前
    $('#mm-tabclose').click(function () {
        var currtab_title = $('#mm').data("currtab");
        $('#tabs').tabs('close', currtab_title);
    })
    //全部关闭
    $('#mm-tabcloseall').click(function () {
        $('.tabs-inner span').each(function (i, n) {
            var t = $(n).text();
            if (t != 'Home') {
                $('#tabs').tabs('close', t);
            }
        });
    });
    //关闭除当前之外的TAB
    $('#mm-tabcloseother').click(function () {
        var prevall = $('.tabs-selected').prevAll();
        var nextall = $('.tabs-selected').nextAll();
        if (prevall.length > 0) {
            prevall.each(function (i, n) {
                var t = $('a:eq(0) span', $(n)).text();
                if (t != 'Home') {
                    $('#tabs').tabs('close', t);
                }
            });
        }
        if (nextall.length > 0) {
            nextall.each(function (i, n) {
                var t = $('a:eq(0) span', $(n)).text();
                if (t != 'Home') {
                    $('#tabs').tabs('close', t);
                }
            });
        }
        return false;
    });
    //关闭当前右侧的TAB
    $('#mm-tabcloseright').click(function () {
        var nextall = $('.tabs-selected').nextAll();
        if (nextall.length == 0) {
            //msgShow('系统提示','后边没有啦~~','error');
            $.messager.alert("温馨提示", "后边没有啦~~", "info");
            //alert('后边没有啦~~');
            return false;
        }
        nextall.each(function (i, n) {
            var t = $('a:eq(0) span', $(n)).text();
            $('#tabs').tabs('close', t);
        });
        return false;
    });
    //关闭当前左侧的TAB
    $('#mm-tabcloseleft').click(function () {
        var prevall = $('.tabs-selected').prevAll();
        if (prevall.length == 0) {
            $.messager.alert("温馨提示", "到头了，前边没有啦~~!", "info");
            //alert('到头了，前边没有啦~~');
            return false;
        }
        prevall.each(function (i, n) {
            var t = $('a:eq(0) span', $(n)).text();
            $('#tabs').tabs('close', t);
        });
        return false;
    });

    //退出
    $("#mm-exit").click(function () {
        $('#mm').menu('hide');
    })
}
function setCookie(name, value) {//两个参数，一个是cookie的名子，一个是值
    document.cookie = name + "=" + escape(value) + ";path=/";
}
//取cookies函数   
function getCookie(name) {
    var arr = document.cookie.match(new RegExp("(^| )" + name + "=([^;]*)(;|$)"));
    if (arr != null) return unescape(arr[2]); return null;
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
            BindEqpList("treeDiv1", "大棚实时监控", "http://localhost:8010/ZigbeeApp/greenhouse/monitor");
            AddTab('大棚实时监控', 'http://localhost:8010/ZigbeeApp/greenhouse/monitor');
            break;
        case 2:
            $("#treeDiv2").show();
            BindEqpList("treeDiv2", "大棚监控", "http://localhost:8010/ZigbeeApp/greenhouse/getList");
            AddTab('大棚监控', 'http://localhost:8010/ZigbeeApp/greenhouse/getList');
            break;
        case 3:
            $("#treeDiv3").show();
            BindEqpList("treeDiv3", "联动设置", "http://localhost:8010/ZigbeeApp/greenhouse/toCascadeConfig");
            AddTab('联动设置', 'http://localhost:8010/ZigbeeApp/greenhouse/toCascadeConfig');
            break;
        case 4:
            $("#treeDiv4").show();
            if (mBind4 == 0) {
                mBind4 = 1;
                DataBindNode("treeDiv4", 229, 249);
            }
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
            if (mBind6 == 0) {
                mBind6 = 1;
                DataBindNode("treeDiv6", 249, 253);
            }
            break;
        case 7:
            $("#treeDiv7").show();
            if (mBind7 == 0) {
                mBind7 = 1;
                DataBindNode("treeDiv7", 0, 230);
            }
            break;
        default:
            break;
    }
}

//绑定左边树数据
function DataBindNode(mTreeDivID,val1,val2) {
    var toptitle = "";
    var nodename = "";
    var nodeid = "";
    //加载树选项卡
    $.each(ResultNodeJson, function (index1, item) {
        if (item.NodeSort.substring(1, 3) != 0) {
            if (item.NodeSort.substring(2, 3) == 0 && item.NodeSort > val1 && item.NodeSort < val2) {
                //获取第二数为0并且数小于300的大选项卡
                toptitle = item.CNName;
                nodeid = item.NodeID;
                $.each(ResultNodeJson, function (index2, value) {
                    //获取1,2相同并且最后一位数不等于0并且数小于300的小选项卡
                    if (value.NodeSort.substring(0, 2) == item.NodeSort.substring(0, 2) && value.NodeSort.substring(2, 3) != 0 && value.NodeSort < val2) {
                        nodename = nodename + "<p><a href='javascript:void(0);' onclick=AddTab('" + value.CNName + "','" + SelNode(value.NodeID) + "')   class='cs-navi-tab'><img src='" + AddCss(value.NodeID) + "'  style='border:0px;margin-bottom:-2px;' />&nbsp;" + value.CNName + "</a></p>";
                    }
                });
                //添加选项数据
                $("#"+mTreeDivID).accordion('add', {
                    //selected: false,
                    title: "<span style='font-weight:bolder;'>" + toptitle + "</span>",
                    content: nodename,
                    iconCls: AddCss(nodeid)
                });
                //小选项清空操作
                nodename = "";
            }
        }
    });
}

//绑定左边网关列表
function BindEqpList(treeDivID,pageName,pageUrl) {
    var htmlcontent = "<span style='float:left;width:100%;margin-left:10px;'><a href='javascript:void();' onclick=\"AddTab('" + pageName + "', '" + pageUrl + "')\">全部</a></span>";
    var eqp_url = "WebService.asmx/SelectEqp";
    var prj_url = "WebService.asmx/SelectPrj";
    $.ajax({
        type: "GET",
        async: false,
        url: prj_url,
        data: "OrgID=" + getCookie("OrgID"),
        success: function (msg) {
            var valprj = $(msg).find("string").text();
            var resultprj = eval("(" + valprj + ")");
            $.each(resultprj, function (index0, value0) {
                htmlcontent += "<ul class='eqp_ulfirst'><li><span class='prjli' id='span_" + index0 + "' onclick=\"showhideeqp(" + index0 + ");\"></span><span><a href='javascript:void();' onclick=\"AddTab('" + pageName + "', '" + pageUrl + "?PrjName=" + escape(value0.PrjName) + "&EqpCode=&PrjID=" + value0.PrjID + "')\">" + value0.PrjName + "</a></span><ul class='eqp_ul' id='eqp_li_" + index0 + "'>";
                $.ajax({
                    type: "GET",
                    async: false,
                    url: eqp_url,
                    data: "PrjID=" + value0.PrjID,
                    success: function (msg) {
                        var val = $(msg).find("string").text();
                        var result = eval("(" + val + ")");
                        $.each(result, function (index, value) {
                            if (value.GPRSlive == 0) {
                                htmlcontent += "<li><img src='Admin/images/red.gif' style='width:14px; height:14px;margin-top:3px;' title='断线' /><a href='javascript:void();' onclick=\"AddTab('" + pageName + "', '" + pageUrl + "?PrjName=" + escape(value0.PrjName) + "&EqpCode=" + escape(value.EqpCode) + "&EqpID=" + value.EqpID + "')\">" + value.EqpHD + "</a></li>";
                            }
                            else if (value.GPRSlive == 1) {
                                htmlcontent += "<li><img src='Admin/images/green.gif' style='width:14px; height:14px;margin-top:3px;' title='在线' /><a href='javascript:void();' onclick=\"AddTab('" + pageName + "', '" + pageUrl + "?PrjName=" + escape(value0.PrjName) + "&EqpCode=" + escape(value.EqpCode) + "&EqpID=" + value.EqpID + "')\">" + value.EqpHD + "</a></li>";
                            }
                        });
                    }
                });
                htmlcontent += "</ul></li></ul>";
            });
        }
    });
    $("#" + treeDivID).empty().append(htmlcontent);
}
//显示隐藏网关
function showhideeqp(index_li) {
    $("#span_"+index_li).toggleClass("prjliover");
    $("#eqp_li_" + index_li).toggle();
}