Feature: feature to test registry functionality
Background: 
   
   Given user is on registry page
    
 
 Scenario Outline: Check registry is sucessful with in-valid credentials
   When user enter username "<username>" and password "<password>" and confirm password "<confirmPassword>" 
   And  click on Register submit button
   Then user gets errortext message "<messageValidate>"
 
 Examples:
|username|password|confirmPassword|messageValidate|
|        |        |               |Please fill out this field.|
|NinjaBonds | |              |Please fill out this field.|
|NinjaBonds| ninja|          |Please fill out this field.|
  

 Scenario Outline: Check registry is sucessful with in-valid credentials
     When user enter username "<username>" and password "<password>" and confirm password "<confirmPassword>"
     And  click on Register submit button
    Then user gets error message "<errormessage>" 
  Examples:
|username|password|confirmPassword|errormessage| 
|NinjaBonds|Ninja@123|Ninja|password_mismatch the two password fields didn’t match.|
|@$&       |1234|1234|password_mismatch:The two password fields didn’t match.|
 
 Scenario Outline: Check registry is sucessful with valid credentials
    When user enter username "<username>" and password "<password>" and confirm password "<confirmPassword>" 
    And  click on Register submit button
    Then user is on signin page gets alert "<alert>"
 Examples:
 |username|password|confirmPassword|alert| 
 |Ninjabo|Ninja@123|Ninja@123| New Account Created. You are logged in as Ninjabond|
   