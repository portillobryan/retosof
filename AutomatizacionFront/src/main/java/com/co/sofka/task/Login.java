package com.co.sofka.task;

import com.co.sofka.interactions.WaitFor;
import com.co.sofka.models.UserLoginModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.sofka.userinterfaces.LoginUI.*;


public class Login implements Task {

    UserLoginModel listUserLoginModel;

    public Login(UserLoginModel listUserLoginModel) {
        this.listUserLoginModel = listUserLoginModel;
    }

    public static Login user(UserLoginModel listUserLoginModel){
        return Tasks.instrumented(Login.class, listUserLoginModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(OPTION_LOGIN));
        actor.attemptsTo(Enter.theValue(listUserLoginModel.getUsername()).into(FIELD_USERNAME));
        actor.attemptsTo(Enter.theValue(listUserLoginModel.getPassword()).into(FIEL_PASSWORD));
        actor.attemptsTo(Click.on(BUTTON_LOGIN));

        actor.attemptsTo(WaitFor.seconds(1));
    }
}
