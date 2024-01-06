@testAll
Feature: Casos reto técnico

  Background: Carga de variables
    Given url ambiente.url
    * def utils_class = Java.type('demoblaze.utils.util')
    * def util = new utils_class()

  @test01
  Scenario: Crear nuevo usuario
    * def req_create_user = read('../request/create_user.json')
    Given path ambiente.paths.signup
    And header Content-Type = 'application/json'
    * set req_create_user.username = util.random_username()
    * set req_create_user.password = util.random_password_base64()
    And request req_create_user
    When method post
    Then status 200
    And print response

  @test02
  Scenario: Crear usuario ya existente
    * def req_create_user = read('../request/create_user.json')
    * def res_create_user_already_exist = read('../response/create_user_already_exist.json')
    * def username = util.random_username()
    * def password = util.random_password_base64()
    Given path ambiente.paths.signup
    And header Content-Type = 'application/json'
    * set req_create_user.username = username
    * set req_create_user.password = password
    And request req_create_user
    When method post
    Then status 200
    And print response
    Given path ambiente.paths.signup
    And header Content-Type = 'application/json'
    * set req_create_user.username = username
    * set req_create_user.password = password
    And request req_create_user
    When method post
    Then status 200
    And print response
    And match response == res_create_user_already_exist


  @test03
  Scenario: Realizar login con credenciales correctas
    * def req_login_user = read('../request/login_user.json')
    * def res_login_user = read('../response/login_user.json')
    Given path ambiente.paths.login
    And header Content-Type = 'application/json'
    * set req_login_user.username = 'adminjq1234'
    * set req_login_user.password = 'YWRtaW5qcTEyMzQ='
    And request req_login_user
    When method post
    Then status 200
    And print response
    And response.contains('Auth_token:')



  @test04
  Scenario Outline: Realizar login con credenciales incorrectas
    * def req_login_user = read('../request/login_user.json')
    * def res_login_wrong = read('../response/login_wrong.json')
    Given path ambiente.paths.login
    And header Content-Type = 'application/json'
    * set req_login_user.username = '<username>'
    * set req_login_user.password = '<password>'
    And request req_login_user
    When method post
    Then status 200
    * set res_login_wrong.errorMessage = '<error_message>'
    And print response
    And match response == res_login_wrong
    Examples:
      | username    | password         | error_message        |
      | adminjq1234 | aaaaaaa          | Wrong password.      |
      | aaaaaaa1112 | YWRtaW5qcTEyMzQ= | User does not exist. |

