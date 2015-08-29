<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <%@include file="include/include.jsp"%>
	<link rel="stylesheet" type="text/css" href="${csspath}/firstpage.css"/>
	<script src="${jspath}/jquery/jquery-1.4.4.js" type="text/javascript"></script>
	<script type="text/javascript" src="${jspath}/load_layer.js"></script>
	<script type="text/javascript">
	   //document.domain="shanghaigm.com";
		function showDetail(url){
			loadLayer(this,url,680,180);
			return false;
		}
    
		$(function() {
			//设置信息展示表格奇数行的背景色
			$(".tab tr:odd").not($(".th")).addClass("tr_odd");
			/*$(".th").css("height","26");*/
			//设置鼠标滑过时数据展示表格行背景色的变化
			$(".tab tr").mouseover(function() {
				$(this).addClass("tr_over");
			}).mouseout(function() {
				$(this).removeClass("tr_over");
			});
		});
		function resetReminderIframeHeight(height){
			$("#reminder_target").attr("height",height);
		}
		
	</script>
	
<title>Doss 首页</title>
</head>
<body style="background-color:#EAEAEA;">
<!-- container -->
	<div id="container">

		<!-- content -->
		<div id="content">
			<!-- tags -->
			<div class="tags">
				<div class="tag tag_left">
					<div class="title">
							<div class="title_l">
								<span>公告</span>
							</div>
							<div class="title_r"></div>
					</div>
					<div class="middle">
						
						<iframe name="bulletin_target" src="${gdmsurl}/bulletin/dealer/displayBulletinInMainPageForDealer" width="100%" height="100%" frameborder="0" marginwidth="0" marginheight="0"  allowtransparency="true"></iframe>
					</div>
				</div>
				<div class="tag tag_right">
					<div class="title">
						<div class="title_l">
									<span>KPI和常用报表</span>
						</div>
						<div class="title_r">
						</div>
					</div>	
					<div class="middle">
						
						<iframe name="report_target" src="${webcontext}/kpi/display" width="100%" height="100%" frameborder="0" marginwidth="0" marginheight="0"  allowtransparency="true"></iframe>
					</div>
				</div>
			</div>
			<div class="clear"></div>
			<div class="empty"></div>
			<div class="tags">
				<div class="tag tag_left">
					<div class="title">
							<div class="title_l">
								<span>今日提醒</span>
							</div>
							<div class="title_r">
							</div>
					</div>
					<div class="middle">
						<iframe id="reminder_target" name="reminder_target" src="${webcontext}/reminder/getDisplayReminder" width="100%" height="100%" frameborder="0" marginwidth="0" marginheight="0" allowtransparency="true"></iframe>
					</div>
				</div>
				<div class="tag tag_right">
						<div class="title">
							<div class="title_l">
								<span>交互平台</span>
							</div>
							<div class="title_r">
							</div>
						</div>
						<div class="middle">
							<iframe name="note_target" src="${gdmsurl}/ge/dealer/displayNotesMainpageForDealer" width="100%" height="100%" frameborder="0" marginwidth="0" marginheight="0" allowtransparency="true"></iframe>
						</div>
			</div>
			<div class="clear"></div>
		</div>
	  </div>
   </div>
</body>
</html>