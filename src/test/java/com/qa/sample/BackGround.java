package com.qa.sample;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;

@Test
public class BackGround {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Simple Test");

    }
    @When("user username and password")
    public void user_username_and_password() {

    }
    @When("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("Simple Test");
    }
    @Then("user is navigated to the homepage")
    public void user_is_navigated_to_the_homepage() {
        System.out.println("Simple Test");
    }
    @When("user clicks on welcome link")
    public void user_clicks_on_welcome_link() {
        System.out.println("Simple Test");
    }
    @Then("logout link is displayed")
    public void logout_link_is_displayed() {
        System.out.println("Simple Test");
    }
    @When("user clicks on dashboard link")
    public void user_clicks_on_dashboard_link() {
        System.out.println("Simple Test");
    }
    @Then("quick launch toolbar is displayed")
    public void quick_launch_toolbar_is_displayed() {
        System.out.println("Simple Test");
    }


}
