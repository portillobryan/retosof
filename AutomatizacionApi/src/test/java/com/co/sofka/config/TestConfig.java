package com.co.sofka.config;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TestConfig {

    public static RequestSpecification request = RestAssured.given();
    public static Response response;
    public static final String URL = "https://reqres.in/api";

    public static String body(String firstname, String lastname){
        return "{" +
                "   \"data\": {\n" +
                "        \"first_name\": \""+ firstname+"\",\n" +
                "        \"last_name\": \""+lastname+"\"\n" +
                "    }}";
    }

}
