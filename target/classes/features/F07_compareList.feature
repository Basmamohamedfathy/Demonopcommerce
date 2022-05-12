@smoke
Feature:compare list
  Scenario: Logged user could add different products to compare list
    Given user log in with valid data
    When user click on Add to compare list
    Then Add to compare list done successfully