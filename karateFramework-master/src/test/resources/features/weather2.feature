Feature: Weather API testing

  @t1
  Scenario: Testing valid GET endpoint - Http/GET = 200
    Given url 'http://api.weatherapi.com/v1/forecast.json?key=dbf93f275c9c429ca1300929200205&q=Sydney&days=1'
    When method GET
    Then status 200

  @t2
  Scenario: Testing valid GET endpoint - HTTPS/GET = 200
    Given url 'https://api.weatherapi.com/v1/forecast.json?key=dbf93f275c9c429ca1300929200205&q=Sydney&days=1'
    When method GET
    Then status 200






