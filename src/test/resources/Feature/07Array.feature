@tag
Feature: Array module

  @tag1
  Scenario: Array module
    Given User is in homepage
    When User clicks the Getting Started button in Array Pane
    Then User be directed to Array Data Structure Page
    When User select Array item from the drop down menu
    Then User be directed to Array Data Structure Pages
    When The user clicks "Arrays in Python" button
    Then The user should be redirected to "Arrays in Python" page
    When The user clicks "Try Here" button in Arrays in Python page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
         

  @tag2
  Scenario Outline: user enter python code "<Input>"
    Given The excel file is located "D:\GirijaRepo\src\test\resources\TestData\Ds-text.xlsx"
    When User enters sheetname as "<sheetname>" and rowNumber <rowNumber>
    And User clicks on run button
    Then output "<output>" is generated

    Examples: 
      | sheetname | rowNumber |
      | text      |         0 |
