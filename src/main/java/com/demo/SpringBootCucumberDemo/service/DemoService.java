package com.demo.SpringBootCucumberDemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Slf4j
public class DemoService {
    public void printInputs(LocalDate localDate, long itemId, String stringId) {
        log.info("LocalDate : {}", localDate);
        log.info("itemId: {}", itemId);
        log.info("stringId: {}", stringId);
    }
}
