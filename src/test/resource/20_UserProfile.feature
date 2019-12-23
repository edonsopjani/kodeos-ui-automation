Feature: 20 User Profile Tests
  Check The Search functions

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in
    And Go to User Profile
    Then Check If user is at User Profile

  @SmokeTest @UserProfile
  Scenario: Change Password
    When User is at User Profile, click change password
    And User add existing password then user add new password and click save
    Then Check if password is changed successful

  @SmokeTest @UserProfile
  Scenario: Logout
    When User Click logout button
    Then Check if user is logged out

  @SmokeTest @UserProfile
  Scenario: Terminate Session
    When User Click Terminate Session
    Then Check if User session is terminated