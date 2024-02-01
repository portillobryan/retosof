package com.co.sofka.task;

import com.co.sofka.interactions.WaitFor;
import com.co.sofka.models.ProductModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.sofka.userinterfaces.ProductsUI.*;

public class complete implements Task {
    ProductModel listProductModel;

    public complete(ProductModel listProductModel) {
        this.listProductModel = listProductModel;
    }

    public static complete purchase(ProductModel listProductModel){
        return Tasks.instrumented(complete.class, listProductModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Click.on(BUTTON_PLACE_ORDER));

        actor.attemptsTo(Enter.theValue(listProductModel.getName()).into(INPUT_NAME));
        actor.attemptsTo(Enter.theValue(listProductModel.getCountry()).into(INPUT_COUNTRY));
        actor.attemptsTo(Enter.theValue(listProductModel.getCity()).into(INPUT_CITY));
        actor.attemptsTo(Enter.theValue(listProductModel.getCreditcard()).into(INPUT_CARD));
        actor.attemptsTo(Enter.theValue(listProductModel.getMonth()).into(INPUT_MONTH));
        actor.attemptsTo(Enter.theValue(listProductModel.getYear()).into(INPUT_YEAR));
        actor.attemptsTo(Click.on(BUTTON_PURCHASE));
        actor.attemptsTo(WaitFor.seconds(1));
    }
}
