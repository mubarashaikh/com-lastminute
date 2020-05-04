Feature: Search feautre
  as a customer
  i want the ability to search fora flight
  so that i can rewview the select deals

  Scenario Outline: customer can search a flight deats
    Given   i navigate to lastmint homepage
    When i select return type as "<returnType>"
    And  i enter from location as "<flyingFrom>"
    And i enter destination as "<destination>"
    And i select the leave on date as "<leaveOnDate>"
    And i select the returning on as "<returnDate>"
    And i click  on findbutton
    Then the results base on above are displayed
    Examples:
      | returnType | flyingFrom        | destination   | leaveOnDate | returnDate |
      |    oneway  |  Biringham airport|london heathro |02/05/2020   |03/05/2020  |



