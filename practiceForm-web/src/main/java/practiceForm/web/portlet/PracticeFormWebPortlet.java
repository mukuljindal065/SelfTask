package practiceForm.web.portlet;

import com.liferay.headless.form.dto.v1_0.Form;
import com.liferay.parcticeform.service.formLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import practiceForm.web.constants.PracticeFormWebPortletKeys;

/**
 * @author me
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=PracticeFormWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PracticeFormWebPortletKeys.PRACTICEFORMWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PracticeFormWebPortlet extends MVCPortlet {
	 public void actionMethod(ActionRequest actionRequest , ActionResponse actionResponse) {
		 
		 //To get data in the terminal 
		 System.out.println("Inside the Function.......");
		 String name = ParamUtil.getString(actionRequest,"userName");
		 System.out.println(name);
//		 Long id = ParamUtil.getLong(actionRequest,"empId");
//		 System.out.println(id);
		 Long mobileno = ParamUtil.getLong(actionRequest,"mobileNo");
		 System.out.println(mobileno);
		 String emailId = ParamUtil.getString(actionRequest,"emailId");
		 System.out.println(emailId);
//		 formLocalServiceUtil.saveFormData(name, id, emailId, mobileno);
		 formLocalServiceUtil.fillFormData(name , emailId , mobileno);
		 formLocalServiceUtil.sendEmail(emailId);
	 }
	 
	 public void deleteMethod(ActionRequest actionRequest , ActionResponse actionResponse) throws PortalException {
		 System.out.println("Inside the Delete Function.......");
		 Long deleteId = ParamUtil.getLong(actionRequest,"empId");
		 System.out.println(deleteId);
		
		 formLocalServiceUtil.deleteform(deleteId);
	}
	
}