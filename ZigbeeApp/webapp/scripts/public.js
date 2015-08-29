//将数据改为发布状态
$(function() {
			$(".release").click(function() {
				window.confirm("\Do you want to release?");
				$("input:checked").parent().siblings().children("label").text("Release");
				$("input:checked").parent().siblings().children("img").remove();
				$("input:checked").parent().siblings().children("a").attr("href","UC-SEM-SP2-initialInventory_Release.html");
				$("input:checked").attr("disabled","disabled").removeAttr("checked");
			});
});
//$(function() {
		//	$("#btn_release").click(function() {
			//	window.confirm("\Do you want to release?");
				//$(".label_status").text("Release");	
				
			//});
//});
$(function() {
	//设置输入框获取/失去焦点时的背景色变化
	$(".text,textarea").focus(function() {
		$(this).addClass("oninput");
	}).blur(function() {
		$(this).removeClass("oninput");
	});
	//设置只读输入框/文本域的背景色
	$(".text[readonly]").addClass("readonly");
	$("textarea[readonly]").addClass("readonly");
});

$(function() {
	//输入日期
	$("input.date").datepicker({
		dateFormat: "yy-mm-dd" //日期格式
		//showButtonPanel: true, //显示【Today】和【Done】按钮
		//changeMonth: true, changeYear: true, //选择年月
		//minDate: -7, maxDate: "+1m +1d", //限定可选的日期范围
	});
});

$(function() {
	//设置鼠标悬停/移开时按钮的变化
	$(".btn").mouseover(function() {
		$(this).addClass("btn_over");	
	}).mouseout(function() {
		$(this).removeClass("btn_over");
	});
});

$(function() {
	//设置数据展示表格奇、偶行的背景色
	$(".data_tab tr:odd").addClass("odd");
	$(".data_tab tr:even").addClass("even");
	//设置鼠标滑过时数据展示表格行背景色的变化
	$(".data_tab tr").mouseover(function() {
		$(this).addClass("over");
	}).mouseout(function() {
		$(this).removeClass("over");
	});
});

$(function() {
	//设置数据展示表格奇、偶行的背景色
	$(".data1_tab tr:odd").addClass("odd");
	$(".data1_tab tr:even").addClass("even");
	//设置鼠标滑过时数据展示表格行背景色的变化
	$(".data1_tab tr").mouseover(function() {
		$(this).addClass("over");
	}).mouseout(function() {
		$(this).removeClass("over");
	});
});


$(function() {
	//点击标题，切换其下的内容
	$(function() {
		$("p.min").toggle(function() {
			$(this).addClass("max").parent().next("div").slideUp("slow");
		},function() {
			$(this).removeClass("max").parent().next("div").slideDown("slow");
		});
	});
});
/*
the down is the part of select all
*/

$(document).ready(function() { 
						   $("#check_all").attr("checked",false);
   //定义全选框的名称为$chkall 
   var $chkall = $('#check_all');
   var $chkarry = $('input[type="checkbox"]').not ($('#check_all')).not($('input[type="checkbox"]:disabled'));//取到除全选框的其它复选框 
   //全选框的实现函数 
   $chkall.click(function(){
    var b = $(this).attr('checked');//取到全选框的值
    $chkarry.each(function(){ $(this).attr('checked', b); });//设置其它复选框值与全选框同步 ，实现全选，取消全选功能 
   });
   //除了全选的其它复选框 
   $chkarry.each(function(){
    $(this).click(function(){
     //先把每个其它复选框的值赋给全选框
     $chkall.attr('checked', $(this).attr('checked'));
     //再循环所有其它的复选框是否已经全部选择，实现全选与其它复选框出现全选情况下同步。 
    //即如果其它复选都已经选择，则全选也选择。 
     $chkarry.each(function(index){ $chkall.attr('checked', ($chkall.attr('checked') && $chkarry.eq(index).attr('checked'))? true:false); });
    });
   });  
});


//居中弹出窗口页面
function openWindow(iUrl,iName,iWidth,iHeight) {
	var url = ''; 
	var name = ''; 
	var w = 914; 
	var h = 520;
	if(iUrl) {url=iUrl}
	if(iName) {name=iName}
	if(iWidth) {w=iWidth}
	if(iHeight) {h=iHeight}
	var l = (window.screen.availWidth-10-w)/2;
	var t = (window.screen.availHeight-30-h)/2;
	window.open(url,name,'height='+h+',innerHeight='+h+',width='+w+',innerWidth='+w+',top='+t+',left='+l+',toolbar=no,menubar=no,scrollbars=yes,resizeable=no,location=no,status=no');
}

//无确认关闭窗口
function closeWindow() {
	window.opener=null;
	window.open("","_self");
	window.close();
}

$(function() {
	//点击提示输入框，出现提示信息
	$(".help").attr("title","点击查看提示");
	//打开不同类型的提示窗口
	$(".help_client").click(function() {
		openWindow("../WIN/WIN-CLIENT.html","client");
	});
	$(".help_consultant").click(function() {
		openWindow("../WIN/WIN-CONSULTANT.html","consultant");
	});
	$(".help_dealer").click(function() {
		openWindow("../WIN/WIN-DEALER.html","dealer");
	});
	$(".help_intent").click(function() {
		openWindow("../WIN/WIN-INTENT.html","intent");
	});
	$(".help_intent2").click(function() {
		openWindow("../WIN/WIN-INTENT_2.html","intent2");
	});
	$(".help_msrp").click(function() {
		openWindow("../WIN/WIN-MSRP.html","msrp");
	});
	$(".help_mac").click(function() {
		openWindow("../WIN/WIN-MAC.html","mac");
	});
	$(".help_marketing").dblclick(function() {
		openWindow("../WIN/WIN-MARKETING.html","marketing");
	});
	$(".help_order").click(function() {
		openWindow("../WIN/WIN-ORDER.html","order");
	});
	$(".help_people").click(function() {
		openWindow("../WIN/WIN-PEOPLE.html","people");
	});
	$(".help_people2").click(function() {
		openWindow("../WIN/WIN-PEOPLE_2.html","people2");
	});
	$(".help_repair").click(function() {
		openWindow("../WIN/WIN-REPAIR.html","repair");
	});
	$(".help_role").click(function() {
		openWindow("../WIN/WIN-ROLE.html","role");
	});
	$(".help_station").click(function() {
		openWindow("../WIN/WIN-STATION.html","station");
	});
	$(".help_value").click(function() {
		openWindow("../WIN/WIN-VALUE.html","value");
	});
	$(".help_vin").click(function() {
		openWindow("../WIN/WIN-VIN.html","vin");
	});
});

$(function() {
	//取消遮罩 - 测试使用
	$("#save,#cancel,#cancel_f,#save_s,#cancel_s,#saveDraft,#saveRelease,#cancel_add,#saveDraft_add,#saveRelease_add").click(function() {
		$.unblockUI();
	});
	
});	