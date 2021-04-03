#Author: Yesica Guayabo

@generalSomokeTest
Feature: Travelocity
 How a user, I want interact with the flight module



  @viaje
  Scenario Outline: travel roundtrip message covid
    Given than yesica enter the url travelocity
    When  she choose 
      | leavingFrom       | goingTo       | departing         | returning       |
      | <leavingFrom>     | <goingTo>     |  <departing>      | <returning>     |
    Then she observe important message in the page "COVID-19 alert: Travel requirements are changing rapidly, including need for pre-travel COVID-19 testing and quarantine on arrival."
    
    Examples: 
      | leavingFrom                         | goingTo                                | departing    | returning    |
      | San Diego (SAN - San Diego Intl.)   | San Antonio (SAT - San Antonio Intl.)  | 25 May 2021  | 28 May 2021  |
      
      
    
      
      
  @viaje
  Scenario Outline: travel roundtrip observe trip total flight
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


  @viaje
  Scenario Outline: travel roundtrip organizes
    Given than yesica enter the url travelocity
    When  she choose
      | leavingFrom       | goingTo       | departing         | returning       |
      | <leavingFrom>     | <goingTo>     |  <departing>      | <returning>     |
    And she organizes for the highest price of the flight
    Then She validates that the flights are organized for the highest price

    Examples:
      | leavingFrom                         | goingTo                                | departing    | returning    |
      | San Diego (SAN - San Diego Intl.)   | San Antonio (SAT - San Antonio Intl.)  | 25 May 2021  | 28 May 2021  |

  @viaje
  Scenario Outline: travel roundtrip filtre one stop
    Given than yesica enter the url travelocity
    When  she choose
      | leavingFrom       | goingTo       | departing         | returning       |
      | <leavingFrom>     | <goingTo>     |  <departing>      | <returning>     |
    And she selects  1 stop with Alaska Airlines
    Then she validates that the filter of a stop with the airline Alaska Airlenes

    Examples:
      | leavingFrom                         | goingTo                                | departing    | returning    |
      | San Diego (SAN - San Diego Intl.)   | San Antonio (SAT - San Antonio Intl.)  | 25 May 2021  | 28 May 2021  |
      
   @viaje
  Scenario Outline: travel roundtrip fill information check out
    Given than yesica enter the url travelocity
    When  she choose 
      | leavingFrom       | goingTo       | departing         | returning       |
      | <leavingFrom>     | <goingTo>     |  <departing>      | <returning>     |
    And   she choose departing flight firts option    
    And   she obsereve price    
    And   she choose returning flight
    And   she continue with check out    
    And   she register your personal information 
    | firstname       | lastname       | phonenumber          | date       | month       	|year         |
    | <firstname>     | <lastname>     |  <phonenumber>       |  <date>    | <month>      | <year>      |
    Then  she observe the message of exeption because is under age 
   
    
    Examples: 
      | leavingFrom                         | goingTo                                | departing    | returning    | firstname       | lastname        | phonenumber         | date       | month      	| year      |
      | San Diego (SAN - San Diego Intl.)   | San Antonio (SAT - San Antonio Intl.)  | 25 May 2021  | 28 May 2021  | Yesica          | Guayabo         | 3445521102          | 08         | 03 - Mar  	| 2008      |
      
      
      
   @viaje6
  Scenario Outline: login travelocity
    Given than yesica enter the url travelocity
    When  she want login with user "<user>" pass null "<pass>" 
    Then she observe message of exception  "<msn>"
    
    Examples: 
      | user                                | pass   | msn                         |	
      | yesicafernandaguayabo@hotmail.com   |        | Please enter your password. |
      