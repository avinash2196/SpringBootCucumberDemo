/*
package com.demo.SpringBootCucumberDemo.steps;

import com.demo.SpringBootCucumberDemo.service.DemoService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StepDefinitions {

    @Autowired
    private DemoService demoService;
    private int a, b, result;

    @Given("I have two numbers {int} and {int}")
    public void i_have_two_numbers_and(int num1, int num2) {
        a = num1;
        b = num2;
    }

    @When("I add them")
    public void i_add_them() {
        result = demoService.add(a , b);
    }

    @Then("I should get {int}")
    public void i_should_get(int expected) {
        assertEquals(expected, result);
    }
}
*/
