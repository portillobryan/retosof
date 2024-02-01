package com.co.sofka.models;

public class ProductModel {
    private String product;
    private String name;
    private String country;
    private String city;
    private String creditcard;
    private String month;
    private String year;


    public ProductModel(String product, String name, String country, String city, String creditcard, String month, String year) {
        this.product = product;
        this.name = name;
        this.country = country;
        this.city = city;
        this.creditcard = creditcard;
        this.month = month;
        this.year = year;
    }


    public String getProduct() {
        return product;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getCreditcard() {
        return creditcard;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }
}
