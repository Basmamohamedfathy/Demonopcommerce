@smoke
Feature: Reset Pasword
  Scenario:User could reset his/her password successfully
    Given navigates to home and click log in Tab
    And user click Forgot password Tab
    When user fills Your email address field
    And user click Recover button
    Then success message is displayed
