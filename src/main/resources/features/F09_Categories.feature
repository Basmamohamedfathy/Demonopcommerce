@smoke
Feature:different Categories
  Scenario:Logged user could select different Categories
    Given user login with valid email
    When select Category
    Then open sub-Category
    And open page done successfully