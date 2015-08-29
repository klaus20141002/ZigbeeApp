/// <reference path="../../JS/jquery-1.7.2.min.js" />
/// <reference path="../../JS/jquery.easyui.min.js" />
/// <reference path="CommonJs_1.js" />
var mPrjID = 0;  //项目ID
var mEqpID = 0;  //网关ID
$(function () {
    //alert(GetQueryString("test"));
    if (GetQueryString("PrjName") != null || GetQueryString("EqpCode") != null) {
        BindTabs("", GetQueryString("PrjName"), GetQueryString("EqpCode"), "");
    } else {
        BindTabs("", "", "", "");
    }
    //绑定机构名称下拉列表
    BindOrg("SelOrg", GetResutl);
    if (result == 0) {
        //动态绑定项目下拉列表
        $("#SelOrg").change(function () {
            if ($("#SelOrg").val() != "全部") {
                BindPrj("SelPrj", $("#SelOrg").val(), "SeltEqp", GetResutl);
                $("#SeltEqpCode").children().remove();
                $("#SeltPostCode").children().remove();
                $("#SeltEqpCode").append("<option>全部</option>");
                $("#SeltPostCode").append("<option>全部</option>");
            } else {
                $("#SelPrj").children().remove();
                $("#SeltEqpCode").children().remove();
                $("#SeltPostCode").children().remove();
                //添加项目信息
                $("#SelPrj").append("<option>全部</option>");
                $("#SeltEqpCode").append("<option>全部</option>");
                $("#SeltPostCode").append("<option>全部</option>");
            }
            if (resultp == 0) {
                //动态绑定网关地址
                $("#SelPrj").change(function () {
                    if ($("#SelPrj").val() != "全部") {
                        BindEqp("SeltEqpCode", $("#SelOrg").val(), $("#SelPrj").val(), "");
                    } else {
                        $("#SeltEqpCode").children().remove();
                        $("#SeltPostCode").children().remove();
                        //添加项目信息
                        $("#SeltEqpCode").append("<option>全部</option>");
                        $("#SeltPostCode").append("<option>全部</option>");
                    }
                });
            }
            if (resultp == 1) {
                if ($("#SelPrj").val() != "全部") {
                    BindEqp("SeltEqpCode", $("#SelOrg").val(), $("#SelPrj").val(), "");
                } else {
                    $("#SeltEqpCode").children().remove();
                    $("#SeltPostCode").children().remove();
                    //添加项目信息
                    $("#SeltEqpCode").append("<option>全部</option>");
                    $("#SeltPostCode").append("<option>全部</option>");
                }
            }
        });
    }
    if (result == 1) {
        if ($("#SelOrg").val() != "全部") {
            BindPrj("SelPrj", $("#SelOrg").val(), "SeltEqp", GetResutl);
            $("#SeltEqpCode").children().remove();
            $("#SeltPostCode").children().remove();
            $("#SeltEqpCode").append("<option>全部</option>");
            $("#SeltPostCode").append("<option>全部</option>");
        } else {
            $("#SelPrj").children().remove();
            $("#SeltEqpCode").children().remove();
            $("#SeltPostCode").children().remove();
            //添加项目信息
            $("#SelPrj").append("<option>全部</option>");
            $("#SeltEqpCode").append("<option>全部</option>");
            $("#SeltPostCode").append("<option>全部</option>");
        }
    }
    if (resultp == 0) {
        //动态绑定网关地址
        $("#SelPrj").change(function () {
            if ($("#SelPrj").val() != "全部") {
                BindEqp("SeltEqpCode", $("#SelOrg").val(), $("#SelPrj").val(), "");
            } else {
                $("#SeltEqpCode").children().remove();
                $("#SeltPostCode").children().remove();
                //添加项目信息
                $("#SeltEqpCode").append("<option>全部</option>");
                $("#SeltPostCode").append("<option>全部</option>");
            }
        });
    }
    if (resultp == 1) {
        if ($("#SelPrj").val() != "全部") {
            BindEqp("SeltEqpCode", $("#SelOrg").val(), $("#SelPrj").val(), "");
        } else {
            $("#SeltEqpCode").children().remove();
            $("#SeltPostCode").children().remove();
            //添加项目信息
            $("#SeltEqpCode").append("<option>全部</option>");
            $("#SeltPostCode").append("<option>全部</option>");
        }
    }

    //动态绑定灯杆编码
    $("#SeltEqpCode").change(function () {
        if ($("#SeltEqpCode").val() != "全部") {
            BindPostCode("SeltPostCode", $("#SelOrg").val(), $("#SelPrj").val(), $("#SeltEqpCode").val(), "");
        } else {
            $("#SeltPostCode").children().remove();
            //添加项目信息
            $("#SeltPostCode").append("<option>全部</option>");
        }

    });
    //点击查询
    $("#SelRealTimeControlAll").click(function () {
        var OrgName = $("#SelOrg").val();
        var PrjName = $("#SelPrj").val();
        var EqpCode = $("#SeltEqpCode").val();
        var PostCode = $("#SeltPostCode").val();
        if (OrgName == "全部") {
            OrgName = "";
        }
        if (PrjName == "全部") {
            PrjName = "";
        }
        if (EqpCode == "全部") {
            EqpCode = "";
        }
        if (PostCode == "全部") {
            PostCode = "";
        }
        BindTabs(OrgName, PrjName, EqpCode, PostCode);
    });
    //策略执行情况查看
    $("#QueryTime").click(function () {
        BindTime();
        $("#TimeDetail").dialog("open");
        $("#TimeDetail").dialog('setTitle', '策略执行情况');
    });
    //点击取消
    $("#RealTimeControlEsc").click(function () {
        $("#SetRealTimeControl").dialog("close");
    });
    //点击发送
    $("#EditRealTimeControl").click(function () {
        var rows = $('#tbs').datagrid('getSelections');
        var AddType = $("#SelAddType").get(0).selectedIndex + 2;
        if ((rows != "" && AddType == 3) || AddType == 2) {
            RealRefresh(2, GetResult); //更新为0
            var url = "../WebService.asmx/EditGetRealTimeControl";
            var ComType = $("#SelCommType").get(0).selectedIndex + 1;
            var rd1 = document.getElementById("Radio1");
            var rd2 = document.getElementById("Radio2");
            var rd3 = document.getElementById("Radio3");
            var rd4 = document.getElementById("Radio4");
            var LoopCount = null;
            var Checked = null;
            var CheckedRadio = 0;
            var Bright = 0;
            if (rd1.checked) {
                CheckedRadio = 0;
                Bright = 100;
            } else if (rd2.checked) {
                CheckedRadio = 1;
                Bright = 100;
            } else if (rd3.checked) {
                CheckedRadio = 2;
                Bright = 0;
            } else if (rd4.checked) {
                CheckedRadio = 3;
                Bright = $("#SelBright").val();
            }
            var nval = "";
            if (AddType == 3) {  //单灯控制
                for (var i = 0; i < rows.length; i++) {
                    $.ajax({
                        type: "GET",
                        async: false,
                        url: url,
                        data: "UserName=" + getCookie("UserName") + "&Role=" + getCookie("Role") + "&OrgID=" + getCookie("OrgID") + "&PrjID=" + getCookie("PrjID") + "&AddressType=" + AddType + "&AddressNO=" + rows[i].LightID + "&PortType=" + ComType + "&ProtocolType=1&OrderType=" + CheckedRadio + "&Bright=" + Bright + "&Section=" + LoopCount + "&Checked=" + Checked + "&EqpID=0",
                        success: function (msg) {
                            val = $(msg).find("string").text();
                            if (val == nval) {
                                return false;
                            } else if (val == "成功") {
                                nval = val;
                            }
                            else {
                                if (nval != "成功") {
                                    nval = val;
                                }
                            }
                        }
                    });
                }
                if (nval == "成功") {
                    var win = $.messager.progress({
                        title: '温馨提示',
                        msg: '正在发送数据中...'
                    }, setTimeout(function () {
                        $.messager.progress('close');
                        //$.messager.alert("温馨提示", "发送成功!", "info");
                        //setTimeout("GridRead()", 2000);
                        //GetRealRefresh();
                    }, 3400));
                    GetRealRefresh();
                    return false;
                } else {
                    $.messager.alert("温馨提示", nval, "warning");
                    return false;
                }
            }
            else if (AddType == 2) { //群控
                mPrjID = GetQueryString("PrjID");
                mEqpID = GetQueryString("EqpID");
                if ((mPrjID == 0 && mEqpID == 0) || (mPrjID == null && mEqpID == null)) {
                    $.messager.alert("温馨提示", "请选择您需要操作的项目或者网关!", "warning");
                    return;
                }
                if (mEqpID != 0 && mEqpID != null) {  //单个网关群控
                    $.post(url, "UserName=" + getCookie("UserName") + "&Role=" + getCookie("Role") + "&OrgID=" + getCookie("OrgID") + "&PrjID=" + getCookie("PrjID") + "&AddressType=" + AddType + "&AddressNO=0&PortType=" + ComType + "&ProtocolType=1&OrderType=" + CheckedRadio + "&Bright=" + Bright + "&Section=" + LoopCount + "&Checked=" + Checked + "&EqpID=" + mEqpID, function (msg) {
                        val = $(msg).find("string").text();
                        if (val == nval) {
                            return false;
                        } else if (val == "成功") {
                            nval = val;
                            var win = $.messager.progress({
                                title: '温馨提示',
                                msg: '正在发送数据中...'
                            }, setTimeout(function () {
                                $.messager.progress('close');
                                //$.messager.alert("温馨提示", "发送成功!", "info");
                                //setTimeout("GridRead()", 2000);
                                GetRealRefresh();
                            }, 3400));
                            return false;
                        } else {
                            nval = val;
                            $.messager.alert("温馨提示", val, "warning");
                            return false;
                        }
                    });
                }
                else {  //一个项目的所有网关群控
                    $.ajax({
                        type: "GET",
                        async: false,
                        url: "../WebService.asmx/SelEqpID",
                        data: "PrjID=" + mPrjID,
                        success: function (msg) {
                            var valprj = $(msg).find("string").text();
                            var resultprj = eval("(" + valprj + ")");
                            $.each(resultprj, function (index0, value0) {
                                $.ajax({
                                    type: "GET",
                                    async: false,
                                    url: url,
                                    data: "UserName=" + getCookie("UserName") + "&Role=" + getCookie("Role") + "&OrgID=" + getCookie("OrgID") + "&PrjID=" + getCookie("PrjID") + "&AddressType=" + AddType + "&AddressNO=0&PortType=" + ComType + "&ProtocolType=1&OrderType=" + CheckedRadio + "&Bright=" + Bright + "&Section=" + LoopCount + "&Checked=" + Checked + "&EqpID=" + value0.EqpID,
                                    success: function (msg) {
                                        val = $(msg).find("string").text();
                                        if (val == nval) {
                                            return false;
                                        } else if (val == "成功") {
                                            nval = val;
                                        }
                                        else {
                                            if (nval != "成功") {
                                                nval = val;
                                            }
                                        }
                                    }
                                });
                            });
                            if (nval == "成功") {
                                var win = $.messager.progress({
                                    title: '温馨提示',
                                    msg: '正在发送数据中...'
                                }, setTimeout(function () {
                                    $.messager.progress('close');
                                    //$.messager.alert("温馨提示", "发送成功!", "info");
                                    //setTimeout("GridRead()", 2000);
                                    //GetRealRefresh();
                                }, 3400));
                                GetRealRefresh();
                                return false;
                            } else {
                                $.messager.alert("温馨提示", nval, "warning");
                                return false;
                            }
                        }
                    });
                }
            }
        } else {
            $.messager.alert("温馨提示", "请选择您需要操作的项!", "warning");
        }

    });
    $.extend($.fn.datagrid.methods, {
        addToolbarItem: function (jq, items) {
            return jq.each(function () {
                var toolbar = $(this).parent().prev("div.datagrid-toolbar");
                for (var i = 0; i < items.length; i++) {
                    var item = items[i];
                    if (item === "-") {
                        toolbar.append('<div class="datagrid-btn-separator"></div>');
                    } else {
                        var btn = $("<a href=\"javascript:void(0)\"></a>");
                        btn[0].onclick = eval(item.handler || function () { });
                        btn.css("float", "left").appendTo(toolbar).linkbutton($.extend({}, item, { plain: true }));
                    }
                }
                toolbar = null;
            });
        }, removeToolbarItem: function (jq, param) {
            return jq.each(function () {
                var btns = $(this).parent().prev("div.datagrid-toolbar").children("a");
                var cbtn = null;
                if (typeof param == "number") {
                    cbtn = btns.eq(param);
                } else if (typeof param == "string") {
                    var text = null;
                    btns.each(function () {
                        text = $(this).data().linkbutton.options.text;
                        if (text == param) {
                            cbtn = $(this);
                            text = null;
                            return;
                        }
                    });
                }
                if (cbtn) {
                    var prev = cbtn.prev()[0];
                    var next = cbtn.next()[0];
                    if (prev && next && prev.nodeName == "DIV" && prev.nodeName == next.nodeName) {
                        $(prev).remove();
                    } else if (next && next.nodeName == "DIV") {
                        $(next).remove();
                    } else if (prev && prev.nodeName == "DIV") {
                        $(prev).remove();
                    }
                    cbtn.remove();
                    cbtn = null;
                }
            });
        }
    });
    $('#tbs').datagrid({ singleSelect: 0 });
    if (getCookie("UserName") == "xinneng") {
        $('#tbs').datagrid('hideColumn', 'LightCode');
    }
    if (getCookie("OrgID") == "87") {
        $('#tbs').datagrid('hideColumn', 'Bright');
    }
    setCookie('Reload', setInterval('GridRead()', 5000));

    //Tabs切换
    $("#li_real").click(function () {
        TabsSwitch(1);
    });
    $("#li_action").click(function () {
        TabsSwitch(2);
    });
});
//绑定账户信息
function BindTabs(OrgName, PrjName, EqpCode, PostCode) {
    //添加机构信息
    $("#tbs").datagrid({
        url: "Handler/RealTimeControlHandler.ashx",
        idField: "LightID",
        striped: true,
        collapsible: true,
        sortName: 'PostCode',
        sortOrder: 'desc',
        remoteSort: false,
        //fit: true,  //表头不动，出现滚动条
        pageSize: getCookie("PSize"),
        pageList: [15, 30, 40, 50],
        onRowContextMenu: onRowContextMenu, //右键。[表头(tab)右键onHeaderContextMenu,树形(tree)右键onContextMenu]
        columns: [[
                    { field: "ck", checkbox: true },
                    { field: "EqpHD", title: "集中管理器" },
                    { field: "GPRSlive", title: "联网状态", width: 70,
                        formatter: function (val, rec) {
                            var del;
                            if (val == "断线") {
                                del = '<img  src=' + "images/red.gif" + '  style=' + '"width:14px; height:14px; " title=' + "断线" + '  />';
                            } else {
                                del = '<img  src=' + "images/green.gif" + '  style=' + '"width:14px; height:14px; " title=' + "在线" + '  />';
                            }
                            return del;
                        }
                    },
                    { field: "PostCode", title: "灯杆", sortable: true },
                    { field: "CtlerCode", title: "控制器地址", width: 100, sortable: true },
                    { field: "LightCode", title: "端口", width: 70 },
                    { field: "OpenClose", title: "路灯状态", width: 60, sortable: true,
                        formatter: function (val, rec) {
                            var del;
                            if (val == "待读") {
                                del = '<img  src=' + "images/light_1.gif" + '  style=' + '"width:12px; height:16px;" title=' + "待读" + '  />';
                            } else if (val == "亮") {
                                del = '<img  src=' + "images/light_2.gif" + '  style=' + '"width:12px; height:16px;" title=' + "亮" + '  />';
                            } else if (val == "关") {
                                del = '<img  src=' + "images/light_3.gif" + '  style=' + '"width:12px; height:16px;" title=' + "关" + '  />';
                            } else if (val == "故障") {
                                del = '<img  src=' + "images/light_4.gif" + '  style=' + '"width:12px; height:16px;" title=' + "故障" + '  />';
                            }
                            return del;
                        }
                    },
                    { field: "Bright", title: "亮度", width: 60 },
                    { field: "Voltage", title: "电压(V)", width: 100 },
                    { field: "ECurrent", title: "电流(A)", width: 100 },
                    { field: "Power", title: "负载功率(W)", width: 80 },
        //                    { field: "NoPower", title: "无功功率(W)", width: 110 },
                    {field: "Frequency", title: "频率(Hz)", width: 80 },
                    { field: "Temperature", title: "温度(℃)", width: 80 },
                    { field: "RefreshTime", title: "更新时间", width: 150, sortable: true }
                ]],
        pagination: true,
        pageNumber: 1,
        queryParams: {
            "UserName": getCookie("UserName"),
            "Role": getCookie("Role"),
            "OrgID": getCookie("OrgID"),
            "PrjID": getCookie("PrjID"),
            "OrgName": OrgName,
            "PrjName": PrjName,
            "EqpCode": EqpCode,
            "PostCode": PostCode
        }, onLoadSuccess: function () {

        }, loadFilter: function (data) {
            var _num = data.rows.length;
            if (_num == 15 || _num == 30 || _num == 40 || _num == 50) {
                setCookie("PSize", _num);
            }
            if (typeof data.length == "number" && typeof data.splice == "function") {
                return { total: data.length, rows: data };
            } else {
                return data;
            }
        }

    });
}

function GridRead() {
    //alert("我刷我刷，刷刷刷……");
    $("#tbs").datagrid({ loadMsg: '' });
    $('#tbs').datagrid("reload");
}
function KGridRead(txt) {
    $(txt).html("关闭实时更新");
    setCookie('Reload', setInterval('GridRead()', 5000));
    $(txt).attr("onclick", "GGridRead(this);");
}
function GGridRead(txt) {
    $(txt).html("开启实时更新");
    clearInterval(getCookie('Reload'));
    $(txt).attr("onclick", "KGridRead(this);");
}


var ResultRealJson;
var RealRefresh = function (parameter, GetResult) {
    //alert("参数"+parameter);
    var url = "../WebService.asmx/RealRefresh";
    $.ajax({
        type: "GET",
        async: false,
        url: url,
        data: "mState=" + parameter,
        success: function (msg) {
            var val = $(msg).find("string").text();
            //var result = eval("(" + val + ")");
            GetResult(val);//result[0].States
        }
    });
}
var GetResult = function (result) {
    ResultRealJson = result;
}
var mThread = null;
function GetRealRefresh() {
    //if (mThread != null) {
    //    alert(mThread);
    //    mThread.kill();
    //}
    mThread = Concurrent.Thread.create(function () {
        var para = 1;
        var i = 0;
        while (i < 5000) {
            //alert("参数" + para);
            RealRefresh(para, GetResult);
            //alert("状态" + ResultRealJson);
            $("#test").val(ResultRealJson + "  " + para + "  " + i);
            if (ResultRealJson == 1) {
                GridRead();
                para = 2;
                //alert(123);
                RealRefresh(para, GetResult);
                //setTimeout("GridRead()", 3000);
                //return;
                mThread.kill();
            }
            i++;
        }
    });
}

//添加右击菜单内容
function onRowContextMenu(e, rowIndex, rowData) {
    e.preventDefault();
    var selected = $("#tbs").datagrid('getRows'); //获取所有行集合对象
    selected[rowIndex].LightID; //index为当前右键行的索引，指向当前行对象
    $('#mm').menu('show', {
        left: e.pageX,
        top: e.pageY
    });
}
var m_LightID = 0;
//查看详细
function view() {
    //就是这里获取单行数据方法????  treeGrid上倒是很好实现:   
    //var node = $('#tbs').treegrid('getSelections');
    var rows = $('#tbs').datagrid('getSelections');
    if (rows != "") {
        if (rows.length == 1) {
            $("#LigthHistory").dialog("open");
            $("#LigthHistory").panel("move", { top: $(document).scrollTop() + ($(window).height() - 394) * 0.5 });
            //设置标题为添加
            $("#LigthHistory").dialog('setTitle', '灯具记录');
            m_LightID = rows[0].LightID;
            LightReal(m_LightID);
            LightAction(m_LightID);
        }
        else {
            $.messager.alert("温馨提示", "此操作只能选择一行!", "warning");
        }
    }
    else {
        $.messager.alert("温馨提示", "请选择您需要操作的项!", "warning");
    }
}

//Tabs切换
function TabsSwitch(m_type) {
    if (m_type == 1) { //历史记录
        $("#div_real").show("slow");
        $("#div_action").hide("slow");
        $("#li_real").attr("class", "tabs-selected1");
        $("#li_action").attr("class", "");
        LightReal(m_LightID);
    }
    if (m_type == 2) { //操作记录
        $("#div_action").show();
        $("#div_real").hide("slow");
        $("#li_action").attr("class", "tabs-selected1");
        $("#li_real").attr("class", "");
        LightAction(m_LightID);
    }
}
//历史记录
function LightReal(mLightID) {
    $("#tbs_real").datagrid({
        url: "Handler/LightRecordHandler.ashx",
        idField: "LightID",
        striped: true,
        collapsible: true,
        sortName: 'AddDate',
        sortOrder: 'desc',
        remoteSort: false,
        singleSelect: true,
        //fit: true,  //表头不动，出现滚动条
        pageList: [10, 20, 40, 50],
        onRowContextMenu: onRowContextMenu, //右键。[表头(tab)右键onHeaderContextMenu,树形(tree)右键onContextMenu]
        columns: [[
                    { field: "LightID", title: "编号", width: 30 },
                    { field: "OpenClose", title: "路灯状态", width: 60,
                        formatter: function (val, rec) {
                            var del;
                            if (val == 2) {
                                del = '<img  src=' + "images/light_1.gif" + '  style=' + '"width:12px; height:16px;" title=' + "待读" + '  />';
                            } else if (val == 0) {
                                del = '<img  src=' + "images/light_2.gif" + '  style=' + '"width:12px; height:16px;" title=' + "亮" + '  />';
                            } else if (val == 1) {
                                del = '<img  src=' + "images/light_3.gif" + '  style=' + '"width:12px; height:16px;" title=' + "关" + '  />';
                            } else if (val == 3) {
                                del = '<img  src=' + "images/light_4.gif" + '  style=' + '"width:12px; height:16px;" title=' + "故障" + '  />';
                            }
                            return del;
                        }
                    },
                    { field: "Bright", title: "亮度", width: 50 },
                    { field: "Voltage", title: "电压(V)", width: 60 },
                    { field: "ECurrent", title: "电流(A)", width: 60 },
                    { field: "Power", title: "负载功率(W)", width: 60 },
                    { field: "Frequency", title: "频率(Hz)", width: 60 },
                    { field: "Temperature", title: "温度(℃)", width: 60 },
                    { field: "RefreshTime", title: "更新时间", width: 140 }
                ]],
        pagination: true,
        pageNumber: 1,
        queryParams: {
            "SelType": 1,
            "LightID": mLightID
        }, onLoadSuccess: function () {

        }, loadFilter: function (data) {
            if (typeof data.length == "number" && typeof data.splice == "function") {
                return { total: data.length, rows: data };
            } else {
                return data;
            }
        }

    });
}
//操作记录
function LightAction(mLightID){
    $("#tbs_action").datagrid({ //操作记录
        url: "Handler/LightRecordHandler.ashx",
        idField: "LightID",
        striped: true,
        collapsible: true,
        sortName: 'ActionTime',
        sortOrder: 'desc',
        remoteSort: false,
        singleSelect: true,
        //fit: true,  //表头不动，出现滚动条
        pageList: [10, 20, 40, 50],
        onRowContextMenu: onRowContextMenu, //右键。[表头(tab)右键onHeaderContextMenu,树形(tree)右键onContextMenu]
        columns: [[
                    { field: "Kid", title: "编号", width: 30 },
                    { field: "DeviceId", title: "灯具编号", width: 70 },
                    { field: "Action", title: "操作", width: 80,
                        formatter: function (val, rec) {
                            var del;
                            if (val == 0) {
                                del = '读数据';
                            } else if (val == 1) {
                                del = '开灯';
                            } else if (val == 2) {
                                del = '关灯';
                            }else if (val == 3) {
                                del = '调光';
                            }
                            return del;
                        }
                    },
                    { field: "ActionResult", title: "结果", width: 80,
                        formatter: function (val, rec) {
                            var del;
                            if (val == 0) {
                                del = '发送';
                            } else if (val == 1) {
                                del = '接收';
                            } 
                            return del;
                        }
                    },
                    { field: "ActionTime", title: "操作时间", width: 140 },
                    { field: "Actor", title: "操作人", width: 80 }
                ]],
        pagination: true,
        pageNumber: 1,
        queryParams: {
            "SelType": 2,
            "LightID": mLightID
        }, onLoadSuccess: function () {

        }, loadFilter: function (data) {
            if (typeof data.length == "number" && typeof data.splice == "function") {
                return { total: data.length, rows: data };
            } else {
                return data;
            }
        }

    });
}
//右击操作
function SendData(type_send) {
    var rows = $('#tbs').datagrid('getSelections');
    if (rows != "") {
        if (rows.length == 1) {
            m_LightID = rows[0].LightID;
            var AddType = $("#SelAddType").get(0).selectedIndex + 2;
            RealRefresh(2, GetResult); //更新为0
            var url = "../WebService.asmx/EditGetRealTimeControl";
            var ComType = $("#SelCommType").get(0).selectedIndex + 1;
            var LoopCount = null;
            var Checked = null;
            var Bright = 0;
            if (type_send == 0) {
                Bright = 100;
            } else if (type_send == 1) {
                Bright = 100;
            } else if (type_send == 2) {
                Bright = 0;
            } else if (type_send == 3) {
                Bright = $("#SelBright").val();
            }
            var nval = "";
            $.post(url, "UserName=" + getCookie("UserName") + "&Role=" + getCookie("Role") + "&OrgID=" + getCookie("OrgID") + "&PrjID=" + getCookie("PrjID") + "&AddressType=" + AddType + "&AddressNO=" + m_LightID + "&PortType=" + ComType + "&ProtocolType=1&OrderType=" + type_send + "&Bright=" + Bright + "&Section=" + LoopCount + "&Checked=" + Checked + "&EqpID=0", function (msg) {
                val = $(msg).find("string").text();
                if (val == nval) {
                    return false;
                } else if (val == "成功") {
                    nval = val;
                    var win = $.messager.progress({
                        title: '温馨提示',
                        msg: '正在发送数据中...'
                    }, setTimeout(function () {
                        $.messager.progress('close');
                        GetRealRefresh();
                    }, 3400));
                    return false;
                } else {
                    nval = val;
                    $.messager.alert("温馨提示", val, "warning");
                    return false;
                }
            });
        }
        else {
            $.messager.alert("温馨提示", "此操作只能选择一行!", "warning");
        }
    }
    else {
        $.messager.alert("温馨提示", "请选择您需要操作的项!", "warning");
    }

}

//绑定账户信息
function BindTime() {
    //添加机构信息
    $("#tbs_time").datagrid({
	height: 282,
        fitColumns: true,
        striped: true, //True 就把行条纹化。（即奇偶行使用不同背景色）
        url: "Handler/ImplementationPlanHandler.ashx",
        columns: [[
                    { field: "TimeDetailID", title: "编号", width: 30 },
                    { field: "TimeName", title: "策略名称", width: 110 },
                    { field: "DetailMark", title: "计划名称", width: 110 },
                    //{ field: "PlanType", title: "计划周期", width: 60 },
                    { field: "StartDate", title: "计划生效", width: 120 },
                    { field: "EndDate", title: "计划失效", width: 120 },
                    { field: "DealTime", title: "上次执行时间", width: 170, formatter: function (value, row, index) {
                        return value + "已执行";
                    } 
                    }
                    //{ field: "SunType", title: "执行时间", width: 80 },
                    //{ field: "PlusType", title: "修正", width: 50 },
                    //{ field: "PlusValues", title: "修正值", width: 50 },
                    //{ field: "AddressType", title: "协议类型", width: 90 },
                    //{ field: "OrderType", title: "控制命令", width: 80 },
                    //{ field: "Bright", title: "亮度", width: 40 },
                    //{ field: "LoopCode", title: "集中器回路", width: 110 },
                    //{ field: "PrjName", title: "项目名称", width: 120 },
                    //{ field: "OrgName", title: "机构名称", width: 170 },
                    //{ field: "ModifyUser", title: "操作员", width: 70 }
                ]],
        pagination: true,
        pageNumber: 1,
        singleSelect: true,
        queryParams: {
            "UserName": getCookie("UserName"),
            "Role": getCookie("Role"),
            "OrgID": getCookie("OrgID"),
            "PrjID": getCookie("PrjID"),
            "OrgName": "",
            "PrjName": "",
            "TimeName": ""
        }
    });
}