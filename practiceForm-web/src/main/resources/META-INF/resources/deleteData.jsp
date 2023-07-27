<%@ include file="/init.jsp" %>

<portlet:actionURL name="deleteMethod" var="deleteFormActionURL" />

<aui:form action="${deleteFormActionURL}">
<aui:input label="Enter Data Which You Want to Delete : " name="empId" type="long"    />
<aui:button name="deleteData" type="submit" value="Delete Data"  />
</aui:form>

