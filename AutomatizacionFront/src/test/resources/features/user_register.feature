Feature: User Register


  @Test
  Scenario Outline: User Register
    Given the user enter main page
    When the user fills the fields to register with success
    |username | password|
    |<username>| <password>|
    Then the user successfully register
      | message |
      | <message> |

    Examples:
    |username | password| message |
        ##@externaldata@./src/test/resources/datadriven/test.xlsx@escenario1@
   |andrestes4   |123456   |This user already exist.|
   |andrestes26   |123456   |Sign up successful.|

