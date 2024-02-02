package com.co.sofka.stepdefinitions;

import com.co.sofka.config.TestConfig;
import com.co.sofka.models.UserModel;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.equalTo;


public class updateUserStepDefinitions extends TestConfig {



    @Given("^I have the data$")
    public void IHaveThenData(List<String> datas) {
        UserModel.setId(Integer.valueOf(datas.get(0)));
        UserModel.setFirst_name(datas.get(1));
        UserModel.setLast_name(datas.get(2));
    }

    @When("^I request to update to data the user$")
    public void IRequestToUpdateToDataTheUser() {
        String body = TestConfig.body(UserModel.getFirst_name(), UserModel.getLast_name());
        request.contentType("application/json")
                .body(body);
        response = request.put( "/users/" + UserModel.getId().toString());
    }

    @Then("^I validate status (\\d+) of the response$")
    public void IValidateStatusOfTheResponse(int code) {
        Assert.assertEquals(code, response.getStatusCode());
    }

    @And("^I schema validate of the response$")
    public void ISchemaValidateOfTheResponse() {
        response.then().body(matchesJsonSchema(new File("src/test/resources/schemas/updateuserSchema.json")));

    }

    @And("^I data validate of body$")
    public void IDataValidateOfBody() {
        response.then().body("data.first_name", equalTo(UserModel.getFirst_name()));
        response.then().body("data.last_name", equalTo(UserModel.getLast_name()));

    }
}
