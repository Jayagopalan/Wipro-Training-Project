Feature: Wishlist Functionality

  Scenario: Add Ray-Ban Aviator Sunglasses to wishlist
  	Given User is on the Home page
  	When User searches for "Ray Ban Aviator Sunglasses"
    When the user adds Ray Ban Aviator Sunglasses to the wishlist
    Then Ray Ban Aviator Sunglasses should appear in the wishlist


