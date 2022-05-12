@smoke
Feature:Add to Shopping cart
  Scenario: Logged user could add different products to Shopping cart
    Given user login with valid email and password
    When user click on Add to Shopping cart
    Then Add toShopping cart done successfully