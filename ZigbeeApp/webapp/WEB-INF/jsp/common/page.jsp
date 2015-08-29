<%
com.zigbee.framework.common.util.Pager _pager2 = (com.zigbee.framework.common.util.Pager)request.getAttribute(com.zigbee.framework.common.constant.CommonConstants.REQUEST_ATTRIBUTE_PAGER);
if(null == _pager2){
    _pager2 = new com.zigbee.framework.common.util.Pager();
}
%>
<script LANGUAGE="JavaScript">
var _pageSize2 = <%=_pager2.getPageSize()%>;
var _currentPage2 = <%=_pager2.getCurrentPage()%>;
var _totalPage2 = <%=_pager2.getTotalPages()%>;
var _totalSize2 = <%=_pager2.getTotalSize()%>;

function toPage(pageNo){
	document.getElementById("currentPage").value=pageNo;		
	search();
}
function goToPage2(){
	var page=document.getElementById("pageNumber2").value;
	var re = /^[1-9][0-9]*$/;
	if(!re.test(page))
		jAlert('<spring:message code="common.key.10"/>','<spring:message code="common.key.18"/>');
	else if(_currentPage2==page)
		jAlert('<spring:message code="common.key.11"/>','<spring:message code="common.key.18"/>');
	else if(page>_totalPage2)
		jAlert('<spring:message code="common.key.12"/>','<spring:message code="common.key.18"/>');
	else
		toPage(page);
}
function gotoFirst(){
	if(_currentPage2 == 1)
		jAlert('<spring:message code="common.key.13"/>','<spring:message code="common.key.18"/>');
	else
		toPage(1);
}
function gotoLast(){
	if(_currentPage2 >= _totalPage2)
		jAlert('<spring:message code="common.key.14"/>','<spring:message code="common.key.18"/>');
	else
		toPage(_totalPage2);
}
function gotoPre(){
	if(_currentPage2>1)
		toPage(_currentPage2-1);
	else
		jAlert('<spring:message code="common.key.15"/>','<spring:message code="common.key.18"/>');
}
function gotoNext(){
	if(_currentPage2<_totalPage2)
		toPage(_currentPage2-0+1);
	else
		jAlert('<spring:message code="common.key.16"/>','<spring:message code="common.key.18"/>');

}
</script>
<!-- page_div -->
<div class="page_div"><input
	name="<%=com.zigbee.framework.common.constant.CommonConstants.REQUEST_ATTRIBUTE_PAGER %>.currentPage"
	id="currentPage" value="<%=_pager2.getCurrentPage()%>" type="hidden">
	<div class="page_info">
			<span><spring:message code="common.key.0"/><%=_pager2.getCurrentPage()%><spring:message code="common.key.1"/></span>
			<span><spring:message code="common.key.2"/><%=_pager2.getTotalPages()%><spring:message code="common.key.1"/>
			,<%=_pager2.getTotalSize()%><spring:message code="common.key.3"/></span>
	</div>
	<div class="page_opts">
		<ul>
	<li><img src="${webcontext}/images/page_first.jpg"
		alt='<spring:message code="common.key.4"/>' onclick="javascript:gotoFirst();" /></li>
	<li><img src="${webcontext}/images/page_prev.jpg"
		alt="<spring:message code="common.key.5"/>" onclick="javascript:gotoPre();" /></li>
	<li class="next"><img
		src="${webcontext}/images/page_next.jpg" alt='<spring:message code="common.key.6"/>'
		onclick="javascript:gotoNext();" /></li>
	<li class="last"><img
		src="${webcontext}/images/page_last.jpg" alt='<spring:message code="common.key.7"/>'
		onclick="javascript:gotoLast();" /></li>
	<li><spring:message code="common.key.9"/><spring:message code="common.key.8"/><input type="text" name="pageNumber2" id="pageNumber2" /></li>
	<li><img src="${webcontext}/images/page_goto.jpg"
		alt='<spring:message code="common.key.9"/>' onclick="javascript:goToPage2();" /></li>
</ul>
</div>
</div>
<!-- /page_div -->