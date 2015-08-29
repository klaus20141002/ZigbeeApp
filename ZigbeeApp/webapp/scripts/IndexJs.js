/// <reference path="jquery-1.7.2.min.js" />
/// <reference path="jquery.easyui.min.js" />

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