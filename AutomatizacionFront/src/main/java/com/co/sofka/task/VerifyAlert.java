package com.co.sofka.task;

import com.co.sofka.drivers.Driver;
import com.co.sofka.models.UserRegisterModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class VerifyAlert implements Task {


    UserRegisterModel listUserRegisterModel;

    public VerifyAlert(UserRegisterModel listUserRegisterModel) {
        this.listUserRegisterModel = listUserRegisterModel;
    }
    public static VerifyAlert text(UserRegisterModel listUserRegisterModel){
        return Tasks.instrumented(VerifyAlert.class,listUserRegisterModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        new WebDriverWait(Driver.inTheStage(), 60).ignoring(NoAlertPresentException.class)
                .until(ExpectedConditions.alertIsPresent());
        Alert alert = Driver.inTheStage().switchTo().alert();
        actor.attemptsTo(
                Ensure.that(alert.getText()).contains(listUserRegisterModel.getMessage())
        );
    }
}
