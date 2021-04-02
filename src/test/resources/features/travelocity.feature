#Author: Yesica Guayabo

@generalSomokeTest
Feature: Travelocity
 How a user, I want interact with the flight module



  @viaje1
  Scenario Outline: travel roundtrip
    Given than yesica enter the url travelocity
    When  she choose 
      | leavingFrom       | goingTo       | departing         | returning       |
      | <leavingFrom>     | <goingTo>     |  <departing>      | <returning>     |
    Then she observe important message in the page "COVID-19 alert: Travel requirements are changing rapidly, including need for pre-travel COVID-19 testing and quarantine on arrival."
    
    Examples: 
      | leavingFrom                         | goingTo                                | departing    | returning    |
      | San Diego (SAN - San Diego Intl.)   | San Antonio (SAT - San Antonio Intl.)  | 25 May 2021  | 28 May 2021  |
      
      
      @viaje2
  Scenario Outline: login travelocity
    Given than yesica enter the url travelocity
    When  she want login with user "<user>" pass "<pass>" 
    Then she observe your name in the page "<name>"
    
    Examples: 
      | user                                | pass        | name   |	
      | yesicafernandaguayabo@hotmail.com   | Yesica123+  |yesica  |
      
      
       @viaje3
  Scenario Outline: travel roundtrip
    Given than yesica enter the url travelocity
    When  she choose 
      | leavingFrom       | goingTo       | departing         | returning       |
      | <leavingFrom>     | <goingTo>     |  <departing>      | <returning>     |
    And   she choose departing flight firts option    
    And   she obsereve price    
    And   she choose returning flight    
    Then  she observe trip total
    
    Examples: 
      | leavingFrom                         | goingTo                                | departing    | returning    |
      | San Diego (SAN - San Diego Intl.)   | San Antonio (SAT - San Antonio Intl.)  | 25 May 2021  | 28 May 2021  |