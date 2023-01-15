package com.qa.sample;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Searchpage {

    @Given("I am on google")
    public void i_am_on_google() {
        System.out.println("The thread ID for Chrome Test is "+ Thread.currentThread().getId());
        System.out.println("Simple Test");

    }
    @When("I enter the text to search")
    public void i_enter_the_text_to_search() {
        System.out.println("The thread ID for Chrome Test is "+ Thread.currentThread().getId());
        System.out.println("Simple Test");
    }
    @Then("I will be on results page")
    public void i_will_be_on_results_page() {
        System.out.println("The thread ID for Chrome Test is "+ Thread.currentThread().getId());
        System.out.println("Simple Test");
    }
}
