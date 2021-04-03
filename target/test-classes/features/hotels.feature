#Author: 23

@Hotel
Feature: Title of your feature
  I want to use this template for my feature file

  @TC1
  Scenario Outline: choose Hotel for adult children
    Given than yesica enter the url travelocity
    When  she choose 
      | goingTo       | checkin         | checkout       | travelersadult         | travelerchildren         |
      | <goingTo>     | <checkin>       | <checkout>     | <travelersadult>       | <travelerchildren>       |
      
    And  she continue with button search 
    Then she observe hotel available
    
    Examples: 
      | goingTo                             | checkin      | checkout     | travelersadult    |travelerchildren      |
      | San Diego (SAN - San Diego Intl.)   | 25 May 2021  | 25 May 2021  | 2                  |2                    |
      
 @TC2
  Scenario Outline: observe message covid when select Hotel for adult children
    Given than yesica enter the url travelocity
    When  she choose 
      | goingTo       | checkin         | checkout       | travelersadult         | travelerchildren         |
      | <goingTo>     | <checkin>       | <checkout>     | <travelersadult>       | <travelerchildren>       |
      
    And  she continue with button search 
    Then she observe important message in the page "COVID-19 alert: Travel requirements are changing rapidly, including need for pre-travel COVID-19 testing and quarantine on arrival."
    
    Examples: 
      | goingTo                             | checkin      | checkout     | travelersadult     | travelerchildren     |
      | San Diego (SAN - San Diego Intl.)   | 25 May 2021  | 25 May 2021  | 2                  | 2                    |
      
      
      
  @TC3
  Scenario Outline: hotel organizes
    Given than yesica enter the url travelocity
    When  she choose 
      | goingTo       | checkin         | checkout       | travelersadult         | travelerchildren         |
      | <goingTo>     | <checkin>       | <checkout>     | <travelersadult>       | <travelerchildren>       |
      
    And  she continue with button search
    And  she organizes for the low price of the hotel 
    Then She validates that the hotel are organized for the low price
    
    Examples: 
      | goingTo                             | checkin      | checkout     | travelersadult     | travelerchildren     |
      | San Diego (SAN - San Diego Intl.)   | 25 May 2021  | 25 May 2021  | 2                  | 2                    |
      
      
  @TC4
  Scenario Outline: hotel filtre River Walk
    Given than yesica enter the url travelocity
    When  she choose 
      | goingTo       | checkin         | checkout       | travelersadult         | travelerchildren         |
      | <goingTo>     | <checkin>       | <checkout>     | <travelersadult>       | <travelerchildren>       |
      
    And  she continue with button search
    And  she selects  River Walk Hoteles
    Then she validates that the filter of River Walk with the Hoteles
    
    Examples: 
      | goingTo                             | checkin      | checkout     | travelersadult     | travelerchildren     |
      | San Diego (SAN - San Diego Intl.)   | 25 May 2021  | 25 May 2021  | 2                  | 2                    |
      
      
  @TC5
  Scenario Outline: filtre star rating 
    Given than yesica enter the url travelocity
    When  she choose 
      | goingTo       | checkin         | checkout       | travelersadult         | travelerchildren         |
      | <goingTo>     | <checkin>       | <checkout>     | <travelersadult>       | <travelerchildren>       |
      
    And  she continue with button search
    And  she selects  star rating Hoteles
    Then she validates that the filter of star rating with the Hoteles
    
    Examples: 
      | goingTo                             | checkin      | checkout     | travelersadult     | travelerchildren     |
      | San Diego (SAN - San Diego Intl.)   | 25 May 2021  | 25 May 2021  | 2                  | 2                    |
      
      
 @TC6
  Scenario Outline: show more hoteles
    Given than yesica enter the url travelocity
    When  she choose 
      | goingTo       | checkin         | checkout       | travelersadult         | travelerchildren         |
      | <goingTo>     | <checkin>       | <checkout>     | <travelersadult>       | <travelerchildren>       |
      
    And  she continue with button search
    And  she selects  star rating Hoteles
    Then she show more hoteles 
    
    Examples: 
      | goingTo                             | checkin      | checkout     | travelersadult     | travelerchildren     |
      | San Diego (SAN - San Diego Intl.)   | 25 May 2021  | 25 May 2021  | 2                  | 2                    |
      
      
  @TC7
  Scenario Outline: reserve hotel 
    Given than yesica enter the url travelocity
    When  she choose 
      | goingTo       | checkin         | checkout       | travelersadult         | travelerchildren         |
      | <goingTo>     | <checkin>       | <checkout>     | <travelersadult>       | <travelerchildren>       |
      
    And  she continue with button search
    And  she selects  star rating Hoteles
    And  she select hotel available
    Then she reserve a room
    
    Examples: 
      | goingTo                             | checkin      | checkout     | travelersadult     | travelerchildren     |
      | San Diego (SAN - San Diego Intl.)   | 25 May 2021  | 25 May 2021  | 2                  | 2                    |
      
 @TC8
  Scenario Outline: reserve low price hotel
    Given than yesica enter the url travelocity
    When  she choose 
      | goingTo       | checkin         | checkout       | travelersadult         | travelerchildren         |
      | <goingTo>     | <checkin>       | <checkout>     | <travelersadult>       | <travelerchildren>       |
      
    And  she continue with button search
    And  she selects  star rating Hoteles
    And  she select hotel available
    Then she reserve a room of low price
    
    Examples: 
      | goingTo                             | checkin      | checkout     | travelersadult     | travelerchildren     |
      | San Diego (SAN - San Diego Intl.)   | 25 May 2021  | 25 May 2021  | 2                  | 2                    | 
      
      
 @TC9
  Scenario Outline: reserve hight price hotel
    Given than yesica enter the url travelocity
    When  she choose 
      | goingTo       | checkin         | checkout       | travelersadult         | travelerchildren         |
      | <goingTo>     | <checkin>       | <checkout>     | <travelersadult>       | <travelerchildren>       |
      
    And  she continue with button search
    And  she selects  star rating Hoteles
    And  she select hotel available
    Then she reserve a room of hight price
    
    Examples: 
      | goingTo                             | checkin      | checkout     | travelersadult     | travelerchildren     |
      | San Diego (SAN - San Diego Intl.)   | 25 May 2021  | 25 May 2021  | 2                  | 2                    |
      
      
 @TC10
  Scenario Outline: validate price in payment
    Given than yesica enter the url travelocity
    When  she choose 
      | goingTo       | checkin         | checkout       | travelersadult         | travelerchildren         |
      | <goingTo>     | <checkin>       | <checkout>     | <travelersadult>       | <travelerchildren>       |
      
    And  she continue with button search
    And  she selects  star rating Hoteles
    And  she select hotel available
    And  she reserve a room of hight price
   Then  she observe price in pay now pay when you stay
    
    Examples: 
      | goingTo                             | checkin      | checkout     | travelersadult     | travelerchildren     |
      | San Diego (SAN - San Diego Intl.)   | 25 May 2021  | 25 May 2021  | 2                  | 2                    |
      
      
      
 @TC11
  Scenario Outline: observe data in room is correct
    Given than yesica enter the url travelocity
    When  she choose 
      | goingTo       | checkin         | checkout       | travelersadult         | travelerchildren         |
      | <goingTo>     | <checkin>       | <checkout>     | <travelersadult>       | <travelerchildren>       |
      
    And  she continue with button search
    And  she selects  star rating Hoteles
    And  she select hotel available
    And  she reserve a room
    And  she choose option buy reserve
    Then she observe data room1 is correctly
    
    Examples: 
      | goingTo                             | checkin      | checkout     | travelersadult     | travelerchildren     |
      | San Diego (SAN - San Diego Intl.)   | 25 May 2021  | 25 May 2021  | 2                  | 2                    |
      
 @TC12
  Scenario Outline: good new a pay is correct
    Given than yesica enter the url travelocity
    When  she choose 
      | goingTo       | checkin         | checkout       | travelersadult         | travelerchildren         |
      | <goingTo>     | <checkin>       | <checkout>     | <travelersadult>       | <travelerchildren>       |
      
    And  she continue with button search
    And  she selects  star rating Hoteles
    And  she select hotel available
    And  she reserve a room
    And  she choose option buy reserve
    Then she observe good new is correct
    
    Examples: 
      | goingTo                             | checkin      | checkout     | travelersadult     | travelerchildren     |
      | San Diego (SAN - San Diego Intl.)   | 25 May 2021  | 25 May 2021  | 2                  | 2                    |
      
      
 @TC13
  Scenario Outline: special request  a pay  
    Given than yesica enter the url travelocity
    When  she choose 
      | goingTo       | checkin         | checkout       | travelersadult         | travelerchildren         |
      | <goingTo>     | <checkin>       | <checkout>     | <travelersadult>       | <travelerchildren>       |
      
    And  she continue with button search
    And  she selects  star rating Hoteles
    And  she select hotel available
    And  she reserve a room
    And  she choose option buy reserve
    And  she observe good new is correct
    Then she fill special request 
    
    Examples: 
      | goingTo                             | checkin      | checkout     | travelersadult     | travelerchildren     |
      | San Diego (SAN - San Diego Intl.)   | 25 May 2021  | 25 May 2021  | 2                  | 2                    |
      
      
      
      
 @TC14
  Scenario Outline: price details in  pay  travelocity
    Given than yesica enter the url travelocity
    When  she choose 
      | goingTo       | checkin         | checkout       | travelersadult         | travelerchildren         |
      | <goingTo>     | <checkin>       | <checkout>     | <travelersadult>       | <travelerchildren>       |
      
    And  she continue with button search
    And  she selects  star rating Hoteles
    And  she select hotel available
    And  she reserve a room
    And  she choose option buy reserve
    And  she observe good new is correct
    Then she observe price details  
    
    Examples: 
      | goingTo                             | checkin      | checkout     | travelersadult     | travelerchildren     |
      | San Diego (SAN - San Diego Intl.)   | 25 May 2021  | 25 May 2021  | 2                  | 2                    |
      
      
      
      
 @TC15
  Scenario Outline: form fill in  pay  travelocity
    Given than yesica enter the url travelocity
    When  she choose 
      | goingTo       | checkin         | checkout       | travelersadult         | travelerchildren         |
      | <goingTo>     | <checkin>       | <checkout>     | <travelersadult>       | <travelerchildren>       |
      
    And  she continue with button search
    And  she selects  star rating Hoteles
    And  she select hotel available
    And  she reserve a room
    And  she choose option buy reserve
    And  she fill only field contact name "<name>"
    Then she sees exception message for mobile phone number field
    
    Examples: 
      | goingTo                             | checkin      | checkout     | travelersadult     | travelerchildren     |
      | San Diego (SAN - San Diego Intl.)   | 25 May 2021  | 25 May 2021  | 2                  | 2                    |