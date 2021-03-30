#Author: your.email@your.domain.com
@Maxtime
Feature: maxtime
  I want to use this template for my feature file

  @reporte @Maxtime
  Scenario Outline: Reporte Maxtime
    Given Brandon Ingresa a la url Maxtime
    And el realiza el loguin con el usuario "<User>" y la contraseña "<password>"
    When Crea un nuevo reporte del dia
    And Diligencia el dealle del reporte de dia
      | proyecto   | tipoHora   | servicio   | actividad     | causaaOcioso     | HorasEjecutadas     | HorasaPagar     | HorasAdicionales     | Comentario     |
      | <proyecto> | <tipoHora> | <servicio> | <"actividad"> | <"causaaOcioso"> | <"HorasEjecutadas"> | <"HorasaPagar"> | <"HorasAdicionales"> | <"Comentario"> |
    Then el guardar y cierra al dia del reporte
    And valida la creacion

    Examples: 
      | User     | password      | proyecto | tipoHora    | servicio | actividad                     | causaaOcioso | HorasEjecutadas | HorasaPagar | HorasAdicionales | Comentario    |
      | lvaldezg | Choucair2020* | Ecomerce | H. Proyecto | ca       | AUT AUTOMATIZACION FACTURABLE | No           |               9 |           0 |                0 | Prueba Automa |

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
