package com.co.sofka.stepdefinitions;

import com.co.sofka.config.TestConfig;
import com.co.sofka.models.UserModel;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.hamcrest.Matchers.isEmptyString;


public class deleteUserStepDefinitions extends TestConfig {

    @When("^I request to delete to data the user$")
    public void IRequestToDeleteToDataTheUser() {
        response = request.delete( "/users/" + UserModel.getId().toString());
    }

    @When("^I validate status (\\d+)$")
    public void IValidateStatus(int code) {
        Assert.assertEquals(code, response.getStatusCode());
    }


    @And("^I validate of response body$")
    public void IValidateOfResponseBody() {
        response.then().body(isEmptyString());
    }




}
