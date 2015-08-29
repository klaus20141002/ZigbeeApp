<link rel="stylesheet" type="text/css" href="${webcontext}/css/jquery.alerts.css" />
<script type="text/javascript" src="${jspath}/jquery/jquery.alerts.js"></script>
<%
com.zigbee.framework.common.util.Pager _pager1 = (com.zigbee.framework.common.util.Pager)request.getAttribute(com.zigbee.framework.common.constant.CommonConstants.REQUEST_ATTRIBUTE_PAGER);
if(null == _pager1){
    _pager1 = new com.zigbee.framework.common.util.Pager();
}
%>
<script type="text/javascript">
function goToPage1(){
	var currentPage = <%=_pager1.getCurrentPage()%>;
	var totalPage = <%=_pager1.getTotalPages()%>;
	var page=document.getElementById("pageNumber1").value;
	var re = /^[1-9][0-9]*$/;
	if(!re.test(page))
		jAlert('<spring:message code="common.key.10"/>','<spring:message code="common.key.18"/>');
	else if(currentPage==page)
		jAlert('<spring:message code="common.key.11"/>','<spring:message code="common.key.18"/>');
	else if(page>totalPage)
		jAlert('<spring:message code="common.key.12"/>','<spring:message code="common.key.18"/>');
	else
		toPage(page);
}
</script>
<div class="page_opts">
<input
	name="<%=com.zigbee.framework.common.constant.CommonConstants.REQUEST_ATTRIBUTE_PAGER %>.currentPage"
	id="currentPage" value="<%=_pager1.getCurrentPage()%>" type="hidden">
<ul>
	<li><img
		src="${webcontext}/images/page_first.jpg" alt='<spring:message code="common.key.4"/>'
		onclick="javascript:gotoFirst();" /></li>
	<li><img
		src="${webcontext}/images/page_prev.jpg" alt='<spring:message code="common.key.5"/>'
		onclick="javascript:gotoPre();" /></li>
	<li class="next"><img
		src="${webcontext}/images/page_next.jpg" alt='<spring:message code="common.key.6"/>'
		onclick="javascript:gotoNext();" /></li>
	<li class="last"><img
		src="${webcontext}/images/page_last.jpg" alt='<spring:message code="common.key.7"/>'
		onclick="javascript:gotoLast();" /></li>
	<li><spring:message code="common.key.9"/><spring:message code="common.key.8"/><input type="text" name="pageNumber1" id="pageNumber1" /></li>
	<li><img
		src="${webcontext}/images/page_goto.jpg" alt='<spring:message code="common.key.9"/>' onclick="javascript:goToPage1();"/></li>
</ul>
</div>