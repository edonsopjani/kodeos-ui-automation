Feature: 00 Login Tests

  Background: Steps That execute before every scenario
    Given User goes to Login page
    Then Check If user is at Login Page

  @SmokeTest @Roles
  Scenario: Try to login with wrong username(not a valid email)
    When User Enter WrongUsername as username and Password as password
    Then Error message should be Enter a valid email

  @SmokeTest @Roles
  Scenario: Try to login with wrong username(not a exist user)
    When User Enter NotAUser as username and Password as password and click Login
    Then Error message should be Invalid credentials

  @SmokeTest @Roles
  Scenario: Try to login with wrong password(password is short)
    When User Enter SystemAdmin as username and ShortPassword as password
    Then Error message should be Password must have at least 6 characters

  @SmokeTest @Roles
  Scenario: Try to login with wrong password(password is incorrect)
    When User Enter SystemAdmin as username and WrongPassword as password and click Login
    Then Error message should be Invalid credentials

  @SmokeTest @Roles
  Scenario: Reset password using Forgot Password
    When User click Forgot password button in login page
    And User Enter UserAdmin as username
    Then Error message should be Check your email, we have sent you a link to reset your password.