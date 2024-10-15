package com.taehun.controller.valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taehun.model.AccountForm;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/valid")
public class AccountController {
	
	@PostMapping("/accounts")
	public String handleAccount(@Valid @ModelAttribute AccountForm form, Errors errors, Model model) {
		if (errors.hasErrors()) {
			return "valid/accountForm"; // 유효성 검사 실패시 다시 돌아감
		}
		model.addAttribute("message", "Account created successfully!");
		return "valid/success"; // 성공 시 성공 페이지로 이동
	}
	
	@PostMapping("/users")
	public ResponseEntity<String> createUser(@Valid @RequestBody User user) {
		// 유효성 검사를 통과한 로직
		return ResponseEntity.ok("User created successfully!");
	}

}
