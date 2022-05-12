@smoke
Feature:Wishlist
  Scenario: Logged user could add different products to Wishlist
    Given user login with valid data
    When user click on Add to Wishlist
    Then success message is appeared
    And Add done successfully