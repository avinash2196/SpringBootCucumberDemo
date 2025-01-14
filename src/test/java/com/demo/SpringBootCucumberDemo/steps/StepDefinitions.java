package com.demo.SpringBootCucumberDemo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {

    @Autowired
    private TestRestTemplate restTemplate;

    private String date;
    private String name;
    private Long id;
    private ResponseEntity<String> response;

    @Given("the client sets query parameters date to {string}, name to {string}, and id to {long}")
    public void setQueryParameters(String date, String name, Long id) {
        this.date = date;
        this.name = name;
        this.id = id;
    }

    @When("the client sends a GET request to {string}")
    public void sendGetRequest(String endpoint) {
        String url = String.format("%s?localDate=%s&stringId=%s&itemId=%d", endpoint, date, name, id);
        response = restTemplate.getForEntity(url, String.class);
    }

    @Then("the response status should be {int}")
    public void verifyResponseStatus(int statusCode) {
        assertThat(response.getStatusCodeValue()).isEqualTo(statusCode);
    }

}
