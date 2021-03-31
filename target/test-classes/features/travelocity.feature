#Author: Yesica Guayabo

@funcionales
Feature: Travelocity
  Como usuario quiero viajar de los angeles a otro pais



  @viaje1
  Scenario Outline: Viaje ida y vuelta
    Given como cliente ingreso a la url de travelocity
    When cliente selecciona 
      | yendosePara     | irA      | partiendo       | regresando      |
      | <yendosePara> | <irA>  |  <partiendo>  | <regresando>  |
    Then cliente selecciona el vuelo de menos costo

  
    Examples: 
      | yendosePara                         | irA          | partiendo    | regresando    |
      | San Diego (SAN - San Diego Intl.)   | San Antonio (SAT - San Antonio Intl.)  | 25 May 2021  | 28 May 2021  |