Feature: Update user data


  @Test
  Scenario Outline: Update user data
    Given I have the <Id>
    When I request to delete to data the user
    Then I validate status <code>
    And I validate of response body

    Examples:
    |Id | code|
        ##@externaldata@./src/test/resources/datadriven/test.xlsx@escenario3@
   |1   |204|
   |2   |204|



