package com.co.sofka.runners;

import com.co.sofka.config.TestConfig;
import com.co.sofka.utils.excel.BeforeSuite;
import com.co.sofka.utils.excel.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import io.restassured.RestAssured;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(CustomRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/searchAllUser.feature",
        glue = {"com.co.sofka.stepdefinitions"},
        snippets = SnippetType.CAMELCASE,
        tags = "@Test"

)

public class UserAllSearchRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/searchAllUser.feature");
    }
    @BeforeClass
    public static void rest(){
        RestAssured.baseURI = TestConfig.URL;
    }
}
