/// <reference path="../../JS/jquery-1.7.2.min.js" />
/// <reference path="../../JS/jquery.easyui.min.js" />
function setCookie(name, value) {//两个参数，一个是cookie的名子，一个是值
    document.cookie = name + "=" + escape(value) + ";path=/";
}
//取cookies函数    
function getCookie(name) {
    var arr = document.cookie.match(new RegExp("(^| )" + name + "=([^;]*)(;|$)"));
    if (arr != null) return unescape(arr[2]); return null;
}
var result = 0;
var resultp = 0;
//绑定机构下拉列表
var BindOrg = function (id, GetResutl) {
    var sel;
    var url = "../WebService.asmx/SelOrgAll";
    $("#" + id + "").children().remove();
    $.ajax({
        type: "GET",
        async: false,
        url: url,
        data: "UserName=" + getCookie("UserName") + "&Role=" + getCookie("Role") + "&OrgID=" + getCookie("OrgID") + "&PrjID=" + getCookie("PrjID"),
        success: function (result) {
            var json = $(result).find("string").text();
            var val = eval("(" + json + ")");
            if (val.length != 1) {
                if (id == "SelOrg") {
                    sel = sel + "<option>全部</option>";
                } else {
                    sel = sel + "<option>--请选择--</option>";
                }
                result = 0;
            }
            else {
                result = 1;
            }
            $.each(val, function (index, item) {
                $("#" + id + "").children().remove();
                sel = sel + "<option>" + item.OrgName + "</option>";
            });
            $("#" + id + "").append(sel);
            GetResutl(result);
        }
    });
}
var GetResutl = function (res) {
    result = res;
}
var GetResutlP = function (res) {
    resultp = res;
}
function BindOrgName(id, value) {
    var sel;
    var url = "../WebService.asmx/SelOrgAll";
    $("#" + id + "").children().remove();
    $.post(url, "UserName=" + getCookie("UserName") + "&Role=" + getCookie("Role") + "&OrgID=" + getCookie("OrgID") + "&PrjID=" + getCookie("PrjID"), function (msg) {
        var json = $(msg).find("string").text();
        var val = eval("(" + json + ")");
        if (id == "SelOrg") {
            sel = sel + "<option>全部</option>";
        } else {
            sel = sel + "<option>--请选择--</option>";
        }
        $.each(val, function (index, item) {
            if (value != "" && item.OrgName == value) {
                sel = sel + "<option selected='true' >" + item.OrgName + "</option>";
            } else {
                $("#" + id + "").children().remove();
                sel = sel + "<option>" + item.OrgName + "</option>";
            }
        });
        $("#" + id + "").append(sel);
    });

}
//绑定项目下拉列表
var BindPrj = function (id, Org, value, GetResutl) {
    var sel;
    var url = "../WebService.asmx/SelItemsAll";
    $("#" + id + "").children().remove();
    $.ajax({
        type: "GET",
        async: false,
        url: url,
        data: "UserName=" + getCookie("UserName") + "&Role=" + getCookie("Role") + "&OrgID=" + getCookie("OrgID") + "&PrjID=" + getCookie("PrjID") + "&OrgName=" + Org,
        success: function (msg) {
            var json = $(msg).find("string").text();
            var val = eval("(" + json + ")");
            if (val.length != 1) {
                if (id == "SelPrj") {
                    sel = sel + "<option>全部</option>";
                } else {
                    sel = sel + "<option>--请选择--</option>";
                }
                resultp = 0;
            }
            else {
                resultp = 1;
            }
            $.each(val, function (index, item) {
                if (value != "" && item.PrjName == value) {
                    sel = sel + "<option selected='true' >" + item.PrjName + "</option>";
                } else {
                    $("#" + id + "").children().remove();
                    sel = sel + "<option>" + item.PrjName + "</option>";
                }
            });
            $("#" + id + "").append(sel);
            GetResutlP(resultp);
        }
    });

}
//绑定网关地址——>改为了网关名称
function BindEqp(id, Org, Prj, value) {
    var url = "../WebService.asmx/SelEqpCodeAll";
    var sl;
    $("#" + id).children().remove();
    $.post(url, "UserName=" + getCookie("UserName") + "&Role=" + getCookie("Role") + "&OrgID=" + getCookie("OrgID") + "&PrjID=" + getCookie("PrjID") + "&OrgName=" + Org + "&PrjName=" + Prj, function (msg) {
        var json = $(msg).find("string").text();
        var val = eval("(" + json + ")");
        if (id == "SeltEqpCode") {
            sl = sl + "<option>全部</option>";
        } else {
            sl = sl + "<option>--请选择--</option>";
        }
        $.each(val, function (index, item) {
            if (value != "" && item.EqpCode == value) {
                sl = sl + "<option selected='true' value='" + item.EqpCode + "'>" + item.EqpHD + "</option>";
            } else if (Org != "" && Prj != "") {
                $("#" + id + "").children().remove();
                sl = sl + "<option value='" + item.EqpCode + "'>" + item.EqpHD + "</option>";
            }
        });
        $("#" + id).append(sl);
    });

}
//绑定网关类型
function EqpTypeName(id, Org, Prj, value) {
    var url = "../WebService.asmx/SelEqpTypeNameAll";
    var sl;
    $("#" + id).children().remove();
    $.post(url, "UserName=" + getCookie("UserName") + "&Role=" + getCookie("Role") + "&OrgID=" + getCookie("OrgID") + "&PrjID=" + getCookie("PrjID") + "&OrgName=" + Org + "&PrjName=" + Prj, function (msg) {
        var json = $(msg).find("string").text();
        var val = eval("(" + json + ")");
        if (id == "SeltEqpTypeName") {
            sl = sl + "<option>全部</option>";
        } else {
            sl = sl + "<option>--请选择--</option>";
        }
        $.each(val, function (index, item) {
            if (value != "" && item.EqpTypeName == value) {
                sl = sl + "<option selected='true' >" + item.EqpTypeName + "</option>";
            } else if (Org != "") {
                $("#" + id + "").children().remove();
                sl = sl + "<option>" + item.EqpTypeName + "</option>";
            }
        });
        $("#" + id).append(sl);
    });

}
//绑定灯杆编码
function BindPostCode(id, Org, Prj, Eqp, value) {
    var url = "../WebService.asmx/SelPostCodeItemsAll";
    var sl;
    $("#" + id).children().remove();
    $.post(url, "UserName=" + getCookie("UserName") + "&Role=" + getCookie("Role") + "&OrgID=" + getCookie("OrgID") + "&PrjID=" + getCookie("PrjID") + "&OrgName=" + Org + "&PrjName=" + Prj + "&EqpCode=" + Eqp, function (msg) {
        var json = $(msg).find("string").text();
        var val = eval("(" + json + ")");
        if (id == "SeltPostCode") {
            sl = sl + "<option>全部</option>";
        } else {
            sl = sl + "<option>--请选择--</option>";
        }
        $.each(val, function (index, item) {
            if (value != "" && item.PostCode == value) {
                sl = sl + "<option selected='true' >" + item.PostCode + "</option>";
            } else if (Org != "" && Prj != "" && Eqp != "") {
                $("#" + id + "").children().remove();
                sl = sl + "<option>" + item.PostCode + "</option>";
            }
        });
        $("#" + id).append(sl);
    });

}
//绑定控制器地址
function BindCtlerCode(id, Org, Prj, Eqp, Post, value) {
    var url = "../WebService.asmx/SelCtlerCodeItemsAll";
    var sl;
    $("#" + id).children().remove();
    $.post(url, "UserName=" + getCookie("UserName") + "&Role=" + getCookie("Role") + "&OrgID=" + getCookie("OrgID") + "&PrjID=" + getCookie("PrjID") + "&OrgName=" + Org + "&PrjName=" + Prj + "&EqpCode=" + Eqp + "&PostCode=" + Post, function (msg) {
        var json = $(msg).find("string").text();
        var val = eval("(" + json + ")");
        if (id == "SeltCtlerCode") {
            sl = sl + "<option>全部</option>";
        } else {
            sl = sl + "<option>--请选择--</option>";
        }
        $.each(val, function (index, item) {
            if (value != "" && item.CtlerCode == value) {
                sl = sl + "<option selected='true' >" + item.CtlerCode + "</option>";
            } else if (Org != "" && Prj != "" && Eqp != "") {
                $("#" + id + "").children().remove();
                sl = sl + "<option>" + item.CtlerCode + "</option>";
            }
        });
        $("#" + id).append(sl);
    });

}
//绑定传感器类型
function BindSensorType(id, Org, Prj, value) {
    var url = "../WebService.asmx/SelSensorTypeItemsAll";
    var sl;
    $("#" + id).children().remove();
    $.post(url, "UserName=" + getCookie("UserName") + "&Role=" + getCookie("Role") + "&OrgID=" + getCookie("OrgID") + "&PrjID=" + getCookie("PrjID") + "&OrgName=" + Org + "&PrjName=" + Prj, function (msg) {
        var json = $(msg).find("string").text();
        var val = eval("(" + json + ")");
        if (id == "SelSensorTypeName") {
            sl = sl + "<option>--请选择--</option>";
        } else {
            sl = sl + "<option>全部</option>";
        }
        $.each(val, function (index, item) {
            if (value != "" && item.SensorTypeName == value) {
                sl = sl + "<option selected='true' >" + item.SensorTypeName + "</option>";
            } else if (Org != "" && Prj != "") {
                $("#" + id + "").children().remove();
                sl = sl + "<option>" + item.SensorTypeName + "</option>";
            }
        });
        $("#" + id).append(sl);
    });

}
//绑定灯杆类型
function BindPostType(id, Org, Prj, value) {
    var url = "../WebService.asmx/SelPostTypeItemsAll";
    var sl;
    $("#" + id).children().remove();
    $.post(url, "UserName=" + getCookie("UserName") + "&Role=" + getCookie("Role") + "&OrgID=" + getCookie("OrgID") + "&PrjID=" + getCookie("PrjID") + "&OrgName=" + Org + "&PrjName=" + Prj, function (msg) {
        var json = $(msg).find("string").text();
        var val = eval("(" + json + ")");
        if (id == "SelTime") {
            sl = sl + "<option>全部</option>";
        } else {
            sl = sl + "<option>--请选择--</option>";
        }
        $.each(val, function (index, item) {
            if (value != "" && item.PostTypeName == value) {
                sl = sl + "<option selected='true' >" + item.PostTypeName + "</option>";
            } else if (Org != "" && Prj != "") {
                $("#" + id + "").children().remove();
                sl = sl + "<option>" + item.PostTypeName + "</option>";
            }
        });
        $("#" + id).append(sl);
    });

}
//绑定控制器类型
function BindCtlerType(id, Org, Prj, value) {
    var url = "../WebService.asmx/SelCtlerTypeItemsAll";
    var sl;
    $("#" + id).children().remove();
    $.post(url, "UserName=" + getCookie("UserName") + "&Role=" + getCookie("Role") + "&OrgID=" + getCookie("OrgID") + "&PrjID=" + getCookie("PrjID") + "&OrgName=" + Org + "&PrjName=" + Prj, function (msg) {
        var json = $(msg).find("string").text();
        var val = eval("(" + json + ")");
        if (id = "SelCtlerTypeName") {
            sl = sl + "<option>--请选择--</option>";
        } else {
            sl = sl + "<option>全部</option>";
        }
        $.each(val, function (index, item) {
            if (value != "" && item.CtlerTypeName == value) {
                sl = sl + "<option selected='true' >" + item.CtlerTypeName + "</option>";
            } else if (Org != "" && Prj != "") {
                $("#" + id + "").children().remove();
                sl = sl + "<option>" + item.CtlerTypeName + "</option>";
            }
        });
        $("#" + id).append(sl);
    });

}
//绑定路灯类型
function BindLightType(id, Org, Prj, value) {
    var url = "../WebService.asmx/SelLightTypeItemsAll";
    var sl;
    $("#" + id).children().remove();
    $.post(url, "UserName=" + getCookie("UserName") + "&Role=" + getCookie("Role") + "&OrgID=" + getCookie("OrgID") + "&PrjID=" + getCookie("PrjID") + "&OrgName=" + Org + "&PrjName=" + Prj, function (msg) {
        var json = $(msg).find("string").text();
        var val = eval("(" + json + ")");
        if (id == "SelLightTypeName") {
            sl = sl + "<option>--请选择--</option>";
        } else {
            sl = sl + "<option>全部</option>";
        }
        $.each(val, function (index, item) {
            if (value != "" && item.LightTypeName == value) {
                sl = sl + "<option selected='true' >" + item.LightTypeName + "</option>";
            } else if (Org != "" && Prj != "") {
                $("#" + id + "").children().remove();
                sl = sl + "<option>" + item.LightTypeName + "</option>";
            }
        });
        $("#" + id).append(sl);
    });

}
//绑定策略名称
function BindTime(id, Org, Prj, value) {
    var url = "../WebService.asmx/SelTimeItemsAll";
    var sl;
    $("#" + id).children().remove();
    $.post(url, "UserName=" + getCookie("UserName") + "&Role=" + getCookie("Role") + "&OrgID=" + getCookie("OrgID") + "&PrjID=" + getCookie("PrjID") + "&OrgName=" + Org + "&PrjName=" + Prj, function (msg) {
        var json = $(msg).find("string").text();
        var val = eval("(" + json + ")");
        if (id == "SelTime") {
            sl = sl + "<option>全部</option>";
        } else {
            sl = sl + "<option>--请选择--</option>";
        }
        $.each(val, function (index, item) {
            if (value != "" && item.TimeName == value) {
                sl = sl + "<option selected='true' >" + item.TimeName + "</option>";
            } else if (Org != "" && Prj != "") {
                $("#" + id + "").children().remove();
                sl = sl + "<option>" + item.TimeName + "</option>";
            }
        });
        $("#" + id).append(sl);
    });

}
$("#tbs").datagrid({ rowStyler: function (index, row) {

    return 'background-image: url("../Images/webshu.net.jpg");background-repeat: no-repeat;';
}
});

function BindGroup(id, Org, Prj, value) {
    var url = "../WebService.asmx/SelGroupItemsAll";
    var sl;
    $("#" + id).children().remove();
    $.post(url, "UserName=" + getCookie("UserName") + "&Role=" + getCookie("Role") + "&OrgID=" + getCookie("OrgID") + "&PrjID=" + getCookie("PrjID") + "&OrgName=" + Org + "&PrjName=" + Prj, function (msg) {
        var json = $(msg).find("string").text();
        var val = eval("(" + json + ")");
        if (id == "SelGrp") {
            sl = sl + "<option>全部</option>";
        } else {
            sl = sl + "<option>--请选择--</option>";
        }
        $.each(val, function (index, item) {
            if (value != "" && item.GrpName == value) {
                sl = sl + "<option selected='true' >" + item.GrpName + "</option>";
            } else if (Org != "" && Prj != "") {
                $("#" + id + "").children().remove();
                sl = sl + "<option>" + item.GrpName + "</option>";
            }
        });
        $("#" + id).append(sl);
    });

}

function cookie(name) {

    var cookieArray = document.cookie.split("; "); //得到分割的cookie名值对      
    var cookie = new Object();
    for (var i = 0; i < cookieArray.length; i++) {

        var arr = cookieArray[i].split("=");       //将名和值分开      

        if (arr[0] == name) return unescape(arr[1]); //如果是指定的cookie，则返回它的值      

    }

    return "";

}

function delCookie(name)//删除cookie  
{

    document.cookie = name + "=;expires=" + (new Date(0)).toGMTString();
}


function addCookie(objName, objValue, objHours) {      //添加cookie  
    var str = objName + "=" + escape(objValue);
    if (objHours > 0) {                               //为时不设定过期时间，浏览器关闭时cookie自动消失  
        var date = new Date();
        var ms = objHours * 3600 * 1000;
        date.setTime(date.getTime() + ms);

        str += "; expires=" + date.toGMTString();
    }
    document.cookie = str;
}
var is2 = /^-?[0-9]+\.?[0-9]*$/;
var is3 = /^[0-9]*[1-9][0-9]*$/;
$.extend($.fn.validatebox.defaults.rules, {
    minLength: {
        validator: function (value, param) {
            return value.length >= param[0];
        },
        message: '至少输入 {0} 个字符.'
    }, IsSelValue: {
        validator: function (value, param) {
            return value != '--请选择--';
        },
        message: '请选择该项的值.'
    }, IsInt: {
        validator: function (value, param) {
            return is2.test(value);
        }, message: '请输入整数.'
    }, IsNumber: {
        validator: function (value, param) {
            return value >= 0 && value <= 100;
        }, message: '请输入0-100的整数.'
    }
});

//判断是否为空
function IsNull(val) {
    var valnode = val.split(',');
    var kong = /^\s*(\S+)\s*$/;
    for (var i = 0; i < valnode.length; i++) {
        if (!kong.test($("#" + valnode[i]).val())) {
        }
    }
}

//获取url参数值
function GetQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]); return null;
}