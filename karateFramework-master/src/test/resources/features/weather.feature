cssFeature: Weather API testing

#
#  Scenario: Testing valid GET endpoint - HTTPS/GET = 200
#    * def location = 'Sydney'
#    * def days = 1
#    Then print location
#    * assert days == 1
#    * def myJson = { foo: 'bar', baz: [1, 2, 3] }
#    * print 'the value of myJson is:\n ' + karate.pretty(myJson)

  @test
  Scenario: Testing valid GET endpoint - HTTPS/GET = 200
    * def jsonUrl = 'https://api.weatherapi.com/v1/forecast.json?key=dbf93f275c9c429ca1300929200205&q=Sydney&days=2'
    * def xmlUrl = 'http://api.weatherapi.com/v1/forecast.xml?key=dbf93f275c9c429ca1300929200205&q=Sydney&days=2'

    Given url jsonUrl
    When method GET
    Then status 200
    And match responseType == 'json'
    * def jsonResponse = response
    * print '====JSON response====' + karate.pretty(jsonResponse.location)

    Given url xmlUrl
    When method GET
    Then status 200
    And match responseType == 'xml'
    * def xmlResponse = response
#    * print '====Xml response====' + karate.pretty(xmlResponse.location)
    * print '====Xml response====' + response
#    And match $ contains {"name":"Sydney"}Sydney









#  Scenario: Testing the exact response of a GET endpoint
#
#    Given url 'https://api.weatherapi.com/v1/forecast.json?key=dbf93f275c9c429ca1300929200205&q=Sydney&days=1'
#    When method GET
#    Then status 200

#    * def authId = response.authId
#
#    * def payload1 =
#    """
#    {"authId":"${authId}","callbacks":[{"type":"NameCallback","output":[{"name":"prompt","value":"Email Address"}],"input":[{"name":"IDToken0","value":"${user}@putsbox.com"}]}]}
#    """
#




#  Scenario: Testing the exact response of a GET endpoint
#
#    Given url 'https://api.weatherapi.com/v1/forecast.json?key=dbf93f275c9c429ca1300929200205&q=Sydney&days=1'
#    When method GET
#    Then status 200
#    And match $ == {id:"user1", name:"Anna"}





#Feature: Demo
#
#  Scenario: Testing valid GET endpoint
#
#    Given url 'http://localhost:8088/user/get'
#    When method GET
#    Then status 200
#
#  Scenario: Testing the exact response of a GET endpoint
#
#    Given url 'http://localhost:8088/user/get'
#    When method GET
#    Then status 200
#    And match $ == {id:"user1", name:"Anna"}
#
#  Scenario: Testing that GET response contains specific field
#
#    Given url 'http://localhost:8088/user/get'
#    When method GET
#    Then status 200
#    And match $ contains {id:"user1"}




