package com.fordnext.resource_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {

    @GetMapping("/getMessages")
    public String getMessagesOnRequest(){
        return "hello world";
    }

}