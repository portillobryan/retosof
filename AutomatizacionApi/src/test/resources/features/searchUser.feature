Feature: query a user by id


  @Test
  Scenario Outline: query a user by id
    Given I have the <Id>
    When I request to search to data the user
    Then I get status <code>
    And I schema validate of body
    Examples:
    |Id | code|
        ##@externaldata@./src/test/resources/datadriven/test.xlsx@escenario1@
   |1   |200|
   |2   |200|



