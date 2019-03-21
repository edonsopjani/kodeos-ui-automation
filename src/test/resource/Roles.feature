Feature: User Roles Tests

  Background: Steps That execute before every scenario
    Given User goes to Login page
    Then Check If user is at Login Page

  @SmokeTest @Roles
  Scenario: Login as Super Admin
    When User Enter user@super.com as username and 123456 as password and click Login
    And Go to User Profile
    Then Check if user role is SuperAdmin
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as System Admin
    When User Enter user@system.com as username and 123456 as password and click Login
    And Go to User Profile
    Then Check if user role is SystemAdmin
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as User Admin
    When User Enter user@admin.com as username and 123456 as password and click Login
    And Go to User Profile
    Then Check if user role is UserAdmin
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as User
    When User Enter user@only.com as username and 123456 as password and click Login
    And Go to User Profile
    Then Check if user role is User
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as ViewOnly
    When User Enter user@viewonly.com as username and 123456 as password and click Login
    And Go to User Profile
    Then Check if user role is ViewOnly
    And User Click logout button
    Then Check if user is logged out


