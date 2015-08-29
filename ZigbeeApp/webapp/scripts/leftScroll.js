// JavaScript Document
	$(function(){  
	$("#scroll").toggle(function(){						
		$("#scroll").removeClass("scroll_bg1").addClass("scroll_bg2");
		$(".left").hide();
		$(".main").css("width","100%");
		var mf=$(window.frames["mainFrame"].document);
		var bf=window.frames["mainFrame"].frames["bottomFrame"];
		if(mf!=null&&bf!=null){
			var wd=$(mf).find("#wd").width();
			var swd=bf.document.getElementById("swd");
			if(swd!=null){
				swd.style.width=wd+"px";
			}
		}
     //   document.getElementById("center").className="mainhide";
	},function(){
		$("#scroll").removeClass("scroll_bg2").addClass("scroll_bg1");
		$(".left").show();
		$(".main").css("width","100%");
		//document.getElementById("center").className="main";
		var mf=$(window.frames["mainFrame"].document);
		var bf=window.frames["mainFrame"].frames["bottomFrame"];
		if(mf!=null&&bf!=null){
			var wd=$(mf).find("#wd").width();
			var swd=bf.document.getElementById("swd");
			if(swd!=null){
				swd.style.width=wd+"px";
			}
		}
	});
});