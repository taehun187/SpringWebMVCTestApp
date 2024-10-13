package com.taehun.controller;

import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taehun.model.Account;

@Controller 
@RequestMapping("/accounts")
public class ResponseBodyController {
    
    @GetMapping("/{id}")
    @ResponseBody  // 데이터를 JSON으로 반환
    public Account handle() {
        return new Account("John Doe", "lth1518@gmail.com");
    }
    
    @GetMapping("/download")
    public ResponseEntity<Resource> downloadFile() throws IOException {
        ClassPathResource resource = new ClassPathResource("files/example.txt");
        
        if (!resource.exists()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"example.txt\"");
        
        return ResponseEntity.ok()
                .headers(headers)
                .contentLength(resource.contentLength())
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(new InputStreamResource(resource.getInputStream()));
    }
}
