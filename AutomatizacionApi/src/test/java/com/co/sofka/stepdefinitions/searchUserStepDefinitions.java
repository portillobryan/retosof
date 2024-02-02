package com.co.sofka.stepdefinitions;

import com.co.sofka.config.TestConfig;
import com.co.sofka.models.UserModel;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;


public class searchUserStepDefinitions extends TestConfig {



    @Given("^I have the (\\d+)$")
    public void IHaveThen(int id) {
        UserModel.setId(id);
    }

    @When("^I request to search to data the user$")
    public void IRequestToSearchToDataTheUser() {
        response = request.get( "/users/" + UserModel.getId().toString());
    }

    @Then("^I get status (\\d+)$")
    public void IGetStatusCode(int code) {
        Assert.assertEquals(code, response.getStatusCode());
    }

    @And("^I schema validate of body$")
    public void ISchemaValidateOfBody() {
        response.then().body(matchesJsonSchema(new File("src/test/resources/schemas/searchuserSchema.json")));

    }




}
