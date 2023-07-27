<%@ include file="/init.jsp" %>



<p>
	<b><liferay-ui:message key="practiceformweb.caption"/></b>
</p>

<portlet:actionURL name="actionMethod" var="formActionURL" />

<portlet:renderURL var="deleteDataURL">
    <portlet:param name="mvcPath" value="/deleteData.jsp"></portlet:param>
</portlet:renderURL>



<aui:form  action="${formActionURL}">
	<aui:input label="Employee Name : " name="userName" type="text" >
	 <aui:validator name="required" />
	</aui:input>
	<aui:input label="Mobile Number : " name="mobileNo" type="number" required="true">
	 		  <aui:validator name="digits"></aui:validator>
              <aui:validator name="maxLength">10</aui:validator>
	</aui:input>
	<aui:input label="Email Id : " name="emailId" type="email" required="true" >
	 <aui:validator name="email" />

        <aui:validator errorMessage="Only emails from @liferay.com are allowed." 
        name="custom">
                function(val, fieldNode, ruleValue) {
                        var regex = new RegExp(/@liferay\.com$/i);

                        return regex.test(val);
                }
        </aui:validator>
	</aui:input>
	
	<aui:button name="submitButton" type="submit" value="Submit" />
	
</aui:form>
<aui:button name="deleteButton" onClick="<%= deleteDataURL.toString() %>"  value="delete data from db"/>