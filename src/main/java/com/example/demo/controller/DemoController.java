package com.example.demo.controller;

import org.springframework.core.SpringVersion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo/getMessage")
    public ResponseEntity<String> getMessage() {
        System.out.println("version: " + SpringVersion.getVersion());
        return new ResponseEntity<String> ("Show me the money", HttpStatus.OK);
    }
}