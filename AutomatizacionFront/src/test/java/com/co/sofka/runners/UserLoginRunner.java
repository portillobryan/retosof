package com.co.sofka.runners;

import com.co.sofka.utils.excel.BeforeSuite;
import com.co.sofka.utils.excel.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(CustomRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/user_login.feature",
        glue = {"com.co.sofka.stepdefinitions", "com.co.sofka.hooks"},
        snippets = SnippetType.CAMELCASE,
        tags = "@Test"

)

public class UserLoginRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/user_login.feature");
    }
}
