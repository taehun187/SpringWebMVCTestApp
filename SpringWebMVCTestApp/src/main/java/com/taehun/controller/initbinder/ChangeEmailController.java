package com.taehun.controller.initbinder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/initbinder")
public class ChangeEmailController {
	
	private static final Logger log = LoggerFactory.getLogger(ChangeEmailController.class);
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setAllowedFields("oldEmailAddress", "newEmailAddress");
    }

	// @InitBinder 에서 특정 필드를 허용하는 것은 
	
	@PostMapping("/changeEmail")
	public String changeEmail(@RequestParam("oldEmailAddress") String oldEmail,
							  @RequestParam("newEmailAddress") String newEmail, 
							  Model model) {
		// 이메일 변경로직
		if (oldEmail.equalsIgnoreCase(newEmail)) {
			model.addAttribute("message", 
					"The new email address must be different from the old one.");
		} else {
			model.addAttribute("message", 
					"Email successfully changed from " + oldEmail + "to" + newEmail);
		}
		return "initbinder/changeEmailSuccess"; // 결과 페이지로 이동
	}
	
	

}



