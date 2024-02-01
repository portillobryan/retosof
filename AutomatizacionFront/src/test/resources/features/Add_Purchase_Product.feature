Feature: Add two products and completes the purchase


  Background:
    Given the user enter main page
    When the user fills the fields to login with success
      |username | password|
        ##@externaldata@./src/test/resources/datadriven/test.xlsx@escenario2@
   |andrestes4   |123456|
   |andrestes26   |123456|


  @Test
  Scenario Outline: Add and purchase Product
    When the user add with success the product
     |product|
     |<product>|
    When the user completes the purchase
      |name| country| city | creditcard|month| year|
      |<name>|<country>|<city>|<creditcard>|<month>|<year>|
    Then the user confirms the purchase

    Examples:
      |product |  name| country |city | creditcard|month| year|
        ##@externaldata@./src/test/resources/datadriven/test.xlsx@escenario3@
   |Samsung galaxy s6   |Andres   |Colombia   |cali   |123234433   |12   |2024|


