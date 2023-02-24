package com.contactapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.contactapp.model.ContactInfo;
import com.contactapp.services.ServiceI;

@Controller
public class ViewController {

	@Autowired
	private ServiceI serviceI;

	@GetMapping("/edit")
	public String getContacts(@RequestParam("contactId") Integer cid, Model model) {
//		String string=null;
//		System.out.println(string.length());
		ContactInfo contactByid = serviceI.getContactByid(cid);
		model.addAttribute("contactinfo", contactByid);
		return "contactInfo";
	}

	@GetMapping("/delete")
	public String deleteContact(@RequestParam("contactId") Integer id, Model model) {
		serviceI.deleteByidcontact(id);
		return "redirect:viewContact";
	}

}
