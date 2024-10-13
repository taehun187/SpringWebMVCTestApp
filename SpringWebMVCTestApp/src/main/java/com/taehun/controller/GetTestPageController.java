package com.taehun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tests")
public class GetTestPageController {
	
	@GetMapping("/requestparam")
	public String getTestRequestParam() {
		System.out.println("getTestRequestParam");
		return "methodarguments/requestparamTest";
	}
	
	@GetMapping("/requestheader")
    public String getTestRequestHeader() {
        System.out.println("getTestRequestHeader");
        return "methodarguments/requestheaderTest";
    }
	
	@GetMapping("/sessionattributes")
	public String getTestSessionAttributes() {
		System.out.println("getTestModelAttribute");
		return "methodarguments/newPetForm";
	}
	
	@GetMapping("/requestattribute")
	public String getTestRequestAttributes() {
		System.out.println("getTestModelAttribute");
		return "methodarguments/newPetForm";
	}
	
	@GetMapping("/requestbody")
    public String getTestRequestBody() {
        System.out.println("getTestRequestBody");
        return "methodarguments/requestbodyTest";
    }
    
    @GetMapping("/responsebody")
    public String getTestResponseBody() {
        System.out.println("getTestResponseBody");
        return "methodarguments/responsebodyTest";
    }
    
    @GetMapping("/redirectattributes")
	public String getredirectattributes() {
		System.out.println("getredirectattributes");
		return "methodarguments/redirectattributesTest";
	}
	
}
