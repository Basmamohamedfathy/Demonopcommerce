@smoke
Feature: Registartion
  Scenario:guest user could register with valid data successfully
    Given user navigate to home page and click register Tab
    When user enter valid data to Your Personal Details section
    And user enter valid data to Company Details section
    And user enter valid data to Your Password section
    And user click register button
    Then Registartion done successfully
