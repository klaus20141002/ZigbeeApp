<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/tld/doss.tld" prefix="doss" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<%=request.getContextPath() %>/scripts/jquery_1.3.2.min.js"></script>
	
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
.sel{width:80px}
</style>
</head>
<body>
<h1>主数据父子级联动选择Tag使用样例</h1>
自动创建select<br/>
<doss:ls selectNames="name1,name2,name3" selectIds="id1,id2,id3" level="3" parentCode="-1" selectLables="AA&nbsp;,&nbsp;BB&nbsp;,&nbsp;CC&nbsp;" cssClass="sel" headerValues="-1,-1,-1" headerTexts="请选择,请选择,请选择" />
<br/>
<br/>手动创建select<br/>
AA&nbsp;<select id='mid1' name='mname1' class='sel' ></select>&nbsp;BB&nbsp;<select id='mid2' name='mname2' class='sel' ></select><br/>&nbsp;CC&nbsp;<select id='mid3' name='mname3' class='sel' ></select>
<doss:ls selectIds="mid1,mid2,mid3" level="3" parentCode="-1" headerValues="-1,-1,-1" headerTexts="请选择,请选择,请选择" create="false"/>

</body>
</html>