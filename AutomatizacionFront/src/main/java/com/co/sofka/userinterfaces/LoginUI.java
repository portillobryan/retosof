package com.co.sofka.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

    public static final Target OPTION_LOGIN = Target.the("Option Login").located(By.id("login2"));
    public static final Target FIELD_USERNAME = Target.the("Field Username").located(By.id("loginusername"));
    public static final Target FIEL_PASSWORD = Target.the("Field password").located(By.id("loginpassword"));
    public static final Target BUTTON_LOGIN = Target.the("Button Login").locatedBy("//div[@id='logInModal']//button[@onclick='logIn()']");
    public static final Target MESSAGE_SUCCESS_LOGIN = Target.the("Message Products Success").located(By.id("nameofuser"));

}
