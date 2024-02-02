Feature: query a user by id


  @Test
  Scenario Outline: query a user by id
    Given I have the <Id> for consult
    When I request to search to data the all user
    Then I validate response <code>
    And I validate if exist the user

    Examples:
    |Id | code|
        ##@externaldata@./src/test/resources/datadriven/test.xlsx@escenario4@
   |1   |200|
   |500   |200|



