package com.co.sofka.stepdefinitions;

import com.co.sofka.models.UserLoginModel;
import com.co.sofka.models.UserRegisterModel;
import com.co.sofka.task.Register;
import com.co.sofka.task.VerifyAlert;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;


public class UserRegisterStepDefinitions {
    @When("^the user fills the fields to register with success$")
    public void theUserFillsTheFieldsToRegisterWithSuccess(List<UserRegisterModel> ListUserRegisterModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.user(ListUserRegisterModel.get(0)));

    }
    @Then("^the user successfully register$")
    public void theUserSuccessfullyRegister(List<UserRegisterModel> ListUserRegisterModel) {

        OnStage.theActorInTheSpotlight().attemptsTo(VerifyAlert.text(ListUserRegisterModel.get(0)));
    }
}
