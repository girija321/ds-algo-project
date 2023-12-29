Feature: data Structure

Scenario: data structure get started
     Given The user is in home page after log in
     When  the user click get started button
     When  The user is in the Data structures-Introduction page
 Scenario: Time complexity
     Given The user is in the Data structures-Introduction page    
     When  The user clicks Time Complexity button
     Then  the user is in Time comlexity page of Data structure-introduction
 Scenario: Practise Qusetion
     Given the user is in Time comlexity page of Data structure-introduction
     When  The user click in the Practise question button
     When  The user should be redirected to Practice Questions of Data structures-Introduction
     When  the user is in Time comlexity page of Data structure-introduction
     And   The user clicks on Try  button
     Then  The user should be on assesment page
     And   the user enter "print Hi"
     Then  the user click on run button