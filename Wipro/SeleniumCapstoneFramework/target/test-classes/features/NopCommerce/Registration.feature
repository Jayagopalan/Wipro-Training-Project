Feature: User Registration
  

  @Register
  Scenario Outline: Successful Registration
    Given User is on the Registration page
    When User enters registration details "<gender>", "<firstName>", "<lastName>", "<email>", "<company>", "<password>"
    And User clicks Register button
    Then User should be registered successfully

    Examples:
      | gender | firstName | lastName | email               | company  | password   |
      | Male   | John      | Doe      | john123@gmail.com   | TestComp | Test@12345 |
      | Female | Jane      | Smith    | jane456@gmail.com   | MyCompany| Pass@12345 |
      
    
  @RegisterNegative
  Scenario: Registration with already registered email
    Given User is on the Registration page
    When User enters registration details "Male", "John", "Doe", "john123@gmail.com", "TestComp", "Test@12345"
    And User clicks Register button
    Then User should see error message "The specified email already exists"
    
  @PasswordMismatch
  Scenario: Registration with mismatched Password and Confirm Password
    Given User is on the Registration page
    When User enters registration details "Female", "Alice", "Brown", "alice123@gmail.com", "MyCompany", "Test@12345"
    And User enters confirm password "Mismatch123"
    And User clicks Register button
    Then User should see error message "The password and confirmation password do not match."