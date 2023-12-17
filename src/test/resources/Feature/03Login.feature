Feature: to test logoin functionality


Scenario: Check login is sucessful with using data table
    Given user is on login page

    When user enter below details
      | ninja |  |
    Then user click login button
    And user gets errortext below password test "Please fill out this field."


  Scenario: Check login is sucessful with using data table
    Given user is on login page

    When user enter below details
      | ninja | Ninja1 |
    Then user click login button
    And user gets error message
    
  Scenario Outline: Check login is sucessful with invalid credentials
    Given user is on login page
    When user enter user name as "<username>" and password as "<password>"
    Then user click login button
    And  user gets error message
    
    Examples:
    |username|password| 
    |Ninja|bonds| 
    | john|1234|
  Scenario: Check login is sucessful with valid credentials
    Given user is on login page
    When user enter user name as "Nijabonds" and password as "Ninja@123"
    Then user click login button
    And user is on sigout page
