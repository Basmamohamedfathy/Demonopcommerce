@smoke
Feature:Create Order
  Scenario:Create successful Order
    Given user log in with valid email
    And user click on Add items to Shopping cart
    And navigate to shopping cart
    And agree with the terms of service
    When user click checkout  button
    And user enter valid data to Billing address section
    And user enter valid data to Shipping method section
    And user enter valid data to Payment method section
    And Payment information section
    Then user Confirm order
    And the order done successfully
