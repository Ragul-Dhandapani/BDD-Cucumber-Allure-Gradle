package com.cucumber.allure.integration.definitions;


import io.cucumber.java.en.*;
import io.qameta.allure.Severity;

public class StepDefinitions{


    @Given("today is {string}")
    public void today_is(String day) {
        System.out.println("Given Method called");
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        System.out.println("When Method called");
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String answer) {
        System.out.println("Then Method called");
    }

}
