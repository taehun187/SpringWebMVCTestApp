package com.taehun.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/myhello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";  // hello.jsp 파일을 렌더링
    }
    
    @GetMapping("/login")
    public String login() {
        return "login";  // login.jsp 파일을 반환
    }
    
}
