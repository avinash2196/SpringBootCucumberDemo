package com.demo.SpringBootCucumberDemo.controller;

import com.demo.SpringBootCucumberDemo.models.DemoRequest;
import com.demo.SpringBootCucumberDemo.models.DemoResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
public class DemoController {

    @PostMapping("/test")
    public DemoResponse post(DemoRequest request){
        DemoResponse response=new DemoResponse();
        Set<String> responseSet =new HashSet<>();
        responseSet.add("test");
        responseSet.add("test2");
        response.setData(responseSet);
        response.setSample("sample");
        return response;

    }
}
