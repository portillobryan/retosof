package com.co.sofka.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUI {

    public static final Target OPTION_REGISTERE = Target.the("Option Register").located(By.id("signin2"));
    public static final Target FIELD_USERNAME = Target.the("Field Username").located(By.id("sign-username"));
    public static final Target FIEL_PASSWORD = Target.the("Field password").located(By.id("sign-password"));
    public static final Target BUTTON_REGISTER = Target.the("Button Register").locatedBy("//div[@id='signInModal']//button[@onclick='register()']");


}
