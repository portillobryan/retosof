package com.co.sofka.task;

import com.co.sofka.drivers.Driver;
import com.co.sofka.interactions.WaitFor;
import com.co.sofka.models.ProductModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.co.sofka.userinterfaces.ProductsUI.*;

public class Add implements Task {

    ProductModel listProductModel;

    public Add(ProductModel listProductModel) {
        this.listProductModel = listProductModel;
    }

    public static Add Product(ProductModel listProductModel){
        return Tasks.instrumented(Add.class, listProductModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        //añade el primer producto
        actor.attemptsTo(Click.on(PRODUCT_SELECT.of(listProductModel.getProduct())));
        actor.attemptsTo(Click.on(BUTTON_ADD_CART));
        new WebDriverWait(Driver.inTheStage(), 60).ignoring(NoAlertPresentException.class)
                .until(ExpectedConditions.alertIsPresent());
        Driver.inTheStage().switchTo().alert().accept();
        actor.attemptsTo(Click.on(OPTION_CART));
    }
}
