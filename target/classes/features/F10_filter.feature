@smoke
Feature:filter
  Scenario:Logged user could filter with color
    Given user log in with valid email and password
    When select specific category like Apparel > Shoes
    Then select color
    And select color done successfully