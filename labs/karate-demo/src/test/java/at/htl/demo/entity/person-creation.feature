Feature: Person creation endpoint. An user of the endpoint is able to create Persons.

  Background:
    * url baseUrl

  Scenario: Create a Person
    Given path 'hello'
    When method GET
    Then status 200
    And match response == 'Hello 5ahitm'

  Scenario: Create a Person with no name
    Given path 'hello'
    When method GET
    Then status 200
    And match response == 'Hello 5ahitm'



