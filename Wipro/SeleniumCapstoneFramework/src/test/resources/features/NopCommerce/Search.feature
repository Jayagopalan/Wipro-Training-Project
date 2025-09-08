Feature: Product Search
  
  @ValidSearch
  Scenario: Search with a valid product name
    Given User is on the Home page
    When User searches for "Laptop"
    Then Product results should be displayed
    
  @InvalidSearch
  Scenario: Search with an invalid product name
    Given User is on the Home page
    When User searches for "abcde"
    Then User should see message "No products were found that matched your criteria."
    
 