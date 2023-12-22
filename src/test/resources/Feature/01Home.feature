
Feature: feature to test home page
   @smoke
  Scenario: The user opens DS Algo portal link 1
    Given user opens portal link
    When user clicks getStarted button
    Then user should go to home page
  @smoke
  Scenario: The user click dropdown page 2
    Given user should go to home page
    When user click data structure dropdown
    Then user select graph
    Then user gets error message for graph "You are not logged in"
   @smoke 
  Scenario: The user clicking array 3
    Given user should go to home page
    When user can see different modules
    Then user click array getStarted button
    Then user gets error message for graph "You are not logged in"
   @smoke
  Scenario: The user click sigin page 4
    Given user should go to home page
    When user clicks signin button
    Then user should go to sigin page "log in" 
   @smoke
  Scenario: The user register 5
    Given user should go to home page
    When user clicks register button
    Then user should go to register page "Registration"
