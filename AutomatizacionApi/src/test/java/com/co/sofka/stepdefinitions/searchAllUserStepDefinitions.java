package com.co.sofka.stepdefinitions;

import com.co.sofka.config.TestConfig;
import com.co.sofka.models.UserModel;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class searchAllUserStepDefinitions extends TestConfig {



    @Given("^I have the (\\d+) for consult$")
    public void IHaveTheForConsult(int id) {
        UserModel.setId(id);
    }

    @When("^I request to search to data the all user$")
    public void IRequestToSearchToDataTheAllUser() {
        response = request.get( "/users");
    }

    @Then("^I validate response (\\d+)$")
    public void IGetStatusCode(int code) {
        Assert.assertEquals(code, response.getStatusCode());
    }

    @And("^I validate if exist the user$")
    public void IValidateIfExistTheUser() {
        String body = response.getBody().toString();
        assertThat(body, containsString(UserModel.getId().toString()));

    }




}
