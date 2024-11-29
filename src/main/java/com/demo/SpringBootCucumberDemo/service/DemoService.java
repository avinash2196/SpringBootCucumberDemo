package com.demo.SpringBootCucumberDemo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

        public int add(int a, int b) {
            return a + b;
        }
}
