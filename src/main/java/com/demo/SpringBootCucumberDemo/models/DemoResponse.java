package com.demo.SpringBootCucumberDemo.models;

import lombok.Data;

import java.util.Set;

@Data
public class DemoResponse {
    public Set<String> data;
    public String sample;
}
