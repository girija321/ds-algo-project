  
 Feature: graph
Scenario: graph getstarted  
Given  The user is in the Home page after logged in
When   The user clicks the Getting Started button in Graph Pane or select Graph item from the drop down menu
Then   The user is in the Graph page after logged in
Scenario Outline: graph and tryhere 
Given  The user is in the Graph page after logged in
When   The user clicks Graph button
Then   The user should be directed to Graph introdution Page
And    The user clicks Try Here button
When   user is on asesment page
When   user Enters "<sheetName>" and RowNumber <rowNumber>
Then   user Runbutton
And    User can see output 

    Examples: 
      | sheetName       | rowNumber |
      | datatablesheet  |         0 |

Scenario Outline: graph representation and tryhere 
Given  The user should be directed to Graph introdution Page
When   The user clicks Graph Representations button
Then   The user should be directed to Graph Representations Page
And    The user clicks Try Here button
When   user is on asesment page
When   user Enters "<sheetName>" and RowNumber <rowNumber>
Then   user Runbutton
And    User can see output 

    Examples: 
      | sheetName       | rowNumber |
      | datatablesheet  |         1 |
     
  Scenario: practise Question
  Given The user is in the Graph page after logged in
  When   The user clicks Graph button
  When   The user should be directed to Graph introdution Page
  When  user click in the practise question button 
  Then  user is on practise questions page
     
 