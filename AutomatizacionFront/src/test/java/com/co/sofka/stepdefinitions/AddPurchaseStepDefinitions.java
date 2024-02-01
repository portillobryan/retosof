package com.co.sofka.stepdefinitions;

import com.co.sofka.models.ProductModel;
import com.co.sofka.questions.TheElement;
import com.co.sofka.task.Add;
import com.co.sofka.task.complete;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static com.co.sofka.userinterfaces.ProductsUI.TEXT_PURCHASE_SUCCESS;

public class AddPurchaseStepDefinitions {
    @When("^the user add with success the product$")
    public void theUserAddWithSuccessTheProduct(List<ProductModel> ListProductModel){
        OnStage.theActorInTheSpotlight().attemptsTo(Add.Product(ListProductModel.get(0)));
    }

    @When("^the user completes the purchase$")
    public void theUserCompletesThePurchase(List<ProductModel> ListProductModel){
        OnStage.theActorInTheSpotlight().attemptsTo(complete.purchase(ListProductModel.get(0)));
    }

    @Then("^the user confirms the purchase$")
    public void theUserConfirmsThePurchase() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheElement.exists(TEXT_PURCHASE_SUCCESS)));
    }
}
