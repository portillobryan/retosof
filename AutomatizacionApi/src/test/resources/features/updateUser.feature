Feature: Update user data


  @Test
  Scenario Outline: Update user data
    Given I have the data
      |<Id> |<first_name> | <last_name>|
    When I request to update to data the user
    Then I validate status <code> of the response
    And I schema validate of the response
    And I data validate of body

    Examples:
      |Id |first_name | last_name|  code|
        ##@externaldata@./src/test/resources/datadriven/test.xlsx@escenario2@
   |1   |Andres   |Test   |200|
   |2   |Carlos   |Test   |200|




