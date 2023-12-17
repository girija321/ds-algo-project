@module
Feature: testing Stack

  Scenario: checking stack operational functionality
    Given user is on Stack page after logged in
    When user clicks Operations in Stack button
    Then user should be directed to Operations in Stack Page
    When user clicks on try hrer button
    Then user should be directed to Assesment page
    When user enters "Print hi"
    And user enters run button

  Scenario: checking stack implementation functionality
    Given user is on implementation page
    When user clicks Implementation button
    When user should be directed to Implementation Page
    When user clicks on try hrer button
    Then user should be directed to Assesment page
    When user enters "hi"
    And user enters run button

  Scenario: checking stack Applications functionality
    Given user is on Application page
    When user clicks Applications button
    Then user should be directed to Applications Page
    When user clicks on try hrer button
    Then user should be directed to Assesment page
    When user enters "hi"
    And user enters run button
