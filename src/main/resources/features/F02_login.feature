@smoke
Feature: Login
  Scenario:User could log in with valid email and password
    Given navigate to home page and click login Tab
    When user enter valid data to Returning Customer section
    And user click log in  button
    Then going to home page done successfully
