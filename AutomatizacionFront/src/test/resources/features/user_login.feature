Feature: User Login


  @Test
  Scenario Outline: User Login
    Given the user enter main page
    When the user fills the fields to login with success
    |username | password|
    |<username>| <password>|
    Then the user successfully login

    Examples:
    |username | password|
        ##@externaldata@./src/test/resources/datadriven/test.xlsx@escenario2@
   |andrestes4   |123456|
   |andrestes26   |123456|
