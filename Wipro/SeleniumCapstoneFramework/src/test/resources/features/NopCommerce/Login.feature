Feature: Login functionality

  @ValidLogin
  Scenario: Successful login with valid credentials
    Given User is on the Login page
    When User enters email "123@gmail.com" and password "123456"
    When User clicks on Login button
    Then User should be logged in successfully
    
  @InvalidLogin
  Scenario Outline: Login with invalid credentials
    Given User is on the Login page
    When User enters email "<email>" and password "<password>"
    And User clicks on Login button
    Then User should see login error message "<errorMessage>"

    Examples:
      | email            | password   | errorMessage             |
      | aaaaa@gmail.com	 |123456      |No customer account found |
      | 123@gmail.com    |123		  |Login was unsuccessful    |
      