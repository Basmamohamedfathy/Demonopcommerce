@smoke
Feature: select tags
  Scenario:Logged user could select different tags
    Given user log and navigate to home page
    And navigate to All product tags
    When user select any tag like apparel
    Then Products tagged with 'apparel' appears