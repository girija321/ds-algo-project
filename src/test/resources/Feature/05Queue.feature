Feature: Queue Function checking 

  Scenario Outline: queue function checking with excel data
    Given user is on home page after logged in
    When user clicks queue button
    Then user is on queue page
    When user clicks implemetation of queue in python
    And user clicks TryHere
    When user enters "<sheetName>" and rowNumber <rowNumber>
    Then user runbutton
    And user can see output 

    Examples: 
      | sheetName       | rowNumber |
      | testDataTextBox |         0 |
      |testDataTextBox  |       1   | 
      
   Scenario Outline: Implementation using collection
   Given user is on queue page
   When user clicks implementation using collection  
   Then user clicks TryHere
   When user enters "<sheetName>" and rowNumber <rowNumber>
   Then user runbutton 
   And  user can see output
   
   Examples: 
      | sheetName       | rowNumber |
      | testDataTextBox |         0 |
      |testDataTextBox  |       1   | 
   
   
    Scenario Outline: Implementation using array
   Given user is on queue page
   When user clicks implementation using array  
   Then user clicks TryHere
   When user enters "<sheetName>" and rowNumber <rowNumber>
   Then user runbutton 
   And  user can see output
   
 Examples: 
      | sheetName       | rowNumber |
      | testDataTextBox |         0 |
      |testDataTextBox  |       1   |  
   
    Scenario Outline: queue operations
   Given user is on queue page
   When user clicks queue operations  
   Then user clicks TryHere
   When user enters "<sheetName>" and rowNumber <rowNumber>
   Then user runbutton 
   And  user can see output
   
  Examples: 
      | sheetName       | rowNumber |
      | testDataTextBox |         0 |
      |testDataTextBox  |       1   | 
      
      Scenario: practice question
     Given user is on queue operation page
     When  user clicks practic quection
     Then user is on practic question page 
   