package com.contactapp.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.contactapp.constant.AppConstant;
import com.contactapp.model.UserInfo;
import com.contactapp.properties.AppProperties;
import com.contactapp.services.ServiceI;

@Controller
public class UserController {
	@Autowired
	private ServiceI serviceI;

	@Autowired
	private AppProperties appProperties;

	@GetMapping("/user")
	public String userForm(Model model) {
		UserInfo userInfo = new UserInfo();
		model.addAttribute("userInfo", userInfo);
		return AppConstant.USERINFO;
	}

	@PostMapping("userLogin")
	public String userLogin(UserInfo userInfo, Model model) {
		boolean saveUser = serviceI.saveUser(userInfo);
		Map<String, String> messages = appProperties.getMessages();

		if (saveUser) {
			model.addAttribute(AppConstant.SUCCESS, messages.get(AppConstant.SAVE_SUCCESS));
		} else {
			model.addAttribute(AppConstant.FAIL, messages.get(AppConstant.SAVE_FAIL));
		}
		return AppConstant.USERINFO;

	}

}
