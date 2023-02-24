package com.contactapp.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.contactapp.constant.AppConstant;
import com.contactapp.model.ContactInfo;
import com.contactapp.properties.AppProperties;
import com.contactapp.services.ServiceI;

@Controller
public class ContactController {

	@Autowired
	private ServiceI serviceI;

	@Autowired
	private AppProperties appProperties;

	@GetMapping("/index")
	public String Index(Model model) {
		return AppConstant.INDEX;
	}

	@GetMapping("/ContactPage")
	public String ContactPage(Model model) {
//		String string=null;
//		System.out.println(string.length());

//		int a=10;
//		int b=0;
//		int c=a/0;
		ContactInfo contactinfo = new ContactInfo();
		model.addAttribute("contactinfo", contactinfo);

		return AppConstant.CONTACTINFO;

	}

	@PostMapping("/SaveContact")
	public String SaveData(ContactInfo contactinfo, Model model) {

		boolean saveData = serviceI.SaveData(contactinfo);
		Map<String, String> messages = appProperties.getMessages();
		if (saveData) {
			model.addAttribute(AppConstant.SUCCESS, messages.get(AppConstant.SAVE_SUCCESS));
		} else {
			model.addAttribute(AppConstant.FAIL, messages.get(AppConstant.SAVE_FAIL));
		}
		return AppConstant.CONTACTINFO;

	}

	@GetMapping("/viewContact")
	public String viewContacts(Model model) {
		List<ContactInfo> viewContacts = serviceI.viewContacts();
		model.addAttribute(AppConstant.CONTACT, viewContacts);
		return AppConstant.CONTACT;
	}

}
