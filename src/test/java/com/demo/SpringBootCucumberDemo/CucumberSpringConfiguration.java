package com.demo.SpringBootCucumberDemo;

import com.demo.SpringBootCucumberDemo.service.DemoService;
import io.cucumber.spring.CucumberContextConfiguration;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDate;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CucumberSpringConfiguration {
    @MockBean
    private DemoService demoService;

    @org.junit.Before
    public void setUp() {
        // Stub the void method to do nothing
        Mockito.doNothing().when(demoService).printInputs(
                Mockito.any(LocalDate.class), Mockito.anyLong(),
                Mockito.anyString()
        );
    }
}
