Feature: Cart functionality
	
 @Add
  Scenario: Add product to cart
    Given User is on the Home page for Cart
    When User searches for product "Oversized Women T-Shirt"
    And User selects product options if available
    And User clicks on Add to Cart
    Then Product should be added to cart successfully