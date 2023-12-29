@tag
Feature: Linkedlist module

  @tag1
  Scenario: Linkedlist module
    Given User is in hompage
    When User clicks the Getting Started button in Linked List Pane
    Then User be directed to Linked List Data Structure Page
    When User select Linked List item from the drop down menu
    Then User be directed to Linked List Data Structure Pages
    When The user clicks "Introduction" buttons
    Then The user should be redirected to "Introduction" pages
    When The user clicks "Try Here" button in Linked List in Python page
    Then The user should be redirected to a page having an tryEditor with a Run button

  @tag2
  Scenario Outline: user enter python code "<Input>"
    Given The excel is located "src/test/resources/TestData/Ds-text.xlsx"
    When User enters sheetname as "<sheetname>" and RowNumber <RowNumber>
    And User clicks on run buttons
    Then output "<output>" generated

    Examples: 
      | sheetname | RowNumber |
      | text      |         0 |
