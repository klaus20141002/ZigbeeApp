<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var CONTEXT_PATH = "<%=request.getContextPath() %>";
</script>
<script type="text/javascript" src="<%=request.getContextPath() %>/scripts/jquery1.4.2.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/scripts/tree/lib/jquery.cookie.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/scripts/tree/lib/jquery.hotkeys.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/scripts/tree/jquery.jstree.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/scripts/tree/dossTree.js"></script>
<style type="text/css">
html,body {
	margin: 0;
	padding: 0;
}

body,td,th,pre,code,select,option,input,textarea {
	font-family: verdana, arial, sans-serif;
	font-size: 10px;
}

.demo,.demo input,.jstree-dnd-helper,#vakata-contextmenu {
	font-size: 16px;
	font-family: verdana;
}

#container {
	width: 780px;
	margin: 10px auto;
	overflow: hidden;
	position: relative;
}

#demo {
	width: auto;
	height: 400px;
	overflow: auto;
	border: 1px solid gray;
}

#text {
	margin-top: 1px;
}

#alog {
	font-size: 9px !important;
	margin: 5px;
	border: 1px solid silver;
}
</style>
</head>
<body>
<input type="button" onclick="submit();" value="submit"/>
<input type="button" onclick="createRootNode();" value="创建根节点"/>
<div id="orgTree" class="demo">
</div>
<script type="text/javascript">

	function submit(){
		var queryStr = check();
		if(queryStr != undefined && queryStr != ""){
			location.href = "<%=request.getContextPath() %>/org/test?" + queryStr;
			//alert("submit = " + queryStr);
		}
	}

	function check(node,idList){
		var childrenSize;
		if(idList == undefined){
			var idList = "";
		}
		var checkedNode = $("#orgTree").jstree("get_checked",node);
		if(node != undefined){
			childrenSize = $("#orgTree").jstree("get_children")._get_children(node).length;
		}
		if(checkedNode.length != 0 && childrenSize != checkedNode.length){	// checked
			for(var i = 0; i < checkedNode.length; i++){
				idList +=  check(checkedNode[i], "idList=" + checkedNode[i].id + "&");
			}
		}
		return idList;
	}
	
	function createRootNode(){
		$("#orgTree").jstree("create", -1, "last", {
			"data" :  	"输入节点名"
		}); 
	}
	var dossTreeInitConfig = new DossTreeInitConfig();
	dossTreeInitConfig.renderId = "orgTree";
//	dossTreeInitConfig.theme = "apple";
	dossTreeInitConfig.isCheckbox = true;
	dossTreeInitConfig.contextPath = "<%=request.getContextPath() %>";
	dossTreeInitConfig.queryChildNodeUrl  = "<%=request.getContextPath() %>/org/queryChildNode";
	dossTreeInitConfig.createChildNodeUrl = "<%=request.getContextPath() %>/org/createChildNode";
	dossTreeInitConfig.renameChildNodeUrl = "<%=request.getContextPath() %>/org/renameChildNode";
	dossTreeInitConfig.removeChildNodeUrl = "<%=request.getContextPath() %>/org/removeChildNode";
	new DossTree(dossTreeInitConfig);
</script>
</body>
</html>