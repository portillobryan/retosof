package com.co.sofka.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsUI {
    public static final Target PRODUCT_SELECT = Target.the("Name Product select").locatedBy("//a[text()='{0}']");

    public static final Target BUTTON_ADD_CART = Target.the("Button Add Cart").locatedBy("//a[contains(text(),'Add to cart')]");

    public static final Target OPTION_CART = Target.the("Option Cart check").located(By.id("cartur"));
    public static final Target BUTTON_PLACE_ORDER = Target.the("Button Place Order").locatedBy("//button[text()='Place Order']");


    public static final Target INPUT_NAME = Target.the("Input Name").located(By.id("name"));
    public static final Target INPUT_COUNTRY = Target.the("Input Country").located(By.id("country"));
    public static final Target INPUT_CITY = Target.the("Input city").located(By.id("city"));
    public static final Target INPUT_CARD = Target.the("Input Card").located(By.id("card"));
    public static final Target INPUT_MONTH = Target.the("Input Month").located(By.id("month"));
    public static final Target INPUT_YEAR = Target.the("Input Year").located(By.id("year"));

    public static final Target BUTTON_PURCHASE = Target.the("BUTTON_FINISH").locatedBy("//button[text()='Purchase']");
    public static final Target TEXT_PURCHASE_SUCCESS = Target.the("TEXT_VALIDATION").locatedBy("//h2[text()='Thank you for your purchase!']");

}
