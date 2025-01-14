package com.demo.SpringBootCucumberDemo.controller;

import com.demo.SpringBootCucumberDemo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoService demoService;

    @GetMapping("/test")
    public String GetMethod(@RequestParam LocalDate localDate, @RequestParam long itemId, @RequestParam String stringId) {
        demoService.printInputs(localDate, itemId, stringId);
        return "OK";

    }
}
