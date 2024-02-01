package com.co.sofka.task;

import com.co.sofka.models.UserLoginModel;
import com.co.sofka.models.UserRegisterModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.sofka.userinterfaces.RegisterUI.*;


public class Register implements Task {

    UserRegisterModel listUserRegisterModel;

    public Register(UserRegisterModel listUserRegisterModel) {
        this.listUserRegisterModel = listUserRegisterModel;
    }

    public static Register user(UserRegisterModel listUserRegisterModel){
        return Tasks.instrumented(Register.class, listUserRegisterModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(OPTION_REGISTERE));
        actor.attemptsTo(Enter.theValue(listUserRegisterModel.getUsername()).into(FIELD_USERNAME));
        actor.attemptsTo(Enter.theValue(listUserRegisterModel.getPassword()).into(FIEL_PASSWORD));
        actor.attemptsTo(Click.on(BUTTON_REGISTER));
    }
}
