package com.taehun.controller.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tests")
public class GetModelTestPageController {

	@GetMapping("/usingmodelAttributeonmethodparameter")
	public String getTestUsingModelAttributeOnMethodParameter() {
		System.out.println("getTestUsingModelAttributeOnMethodParameter");
		return "model/accountForm";
	}
	
	@GetMapping("/addreturnvalueasmodelproperty")
	public String getTestAddReturnValueAsModel() {
		System.out.println("getTestAddReturnValueAsModel");
		return "model/accountFormOnlyName";
		
	}
	
	
}
