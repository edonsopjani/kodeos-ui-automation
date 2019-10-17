Feature: User Roles Tests

  Background: Steps That execute before every scenario
    Given User goes to Login page
    Then Check If user is at Login Page

  @SmokeTest @Roles
  Scenario: Login as Super Admin
    When User Enter user@super.com as username and 123456 as password and click Login
    Then Check if user is logged in
    And Go to User Profile
    Then Check if user role is SuperAdmin
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as System Admin
    When User Enter user@system.com as username and 123456 as password and click Login
    Then Check if user is logged in
    And Go to User Profile
    Then Check if user role is SystemAdmin
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as User Admin
    When User Enter user@admin.com as username and 123456 as password and click Login
    Then Check if user is logged in
    And Go to User Profile
    Then Check if user role is UserAdmin
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as User Admin can't add Units
    When User Enter user@admin.com as username and 123456 as password and click Login
    Then Check if user is logged in
    And User Go To admin panel
    Then Check if user is at Admin panel
    And Click Units tab
    Then Check if user is at Units page
    Then Check if user can't add new Units
    And Go to User Profile
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as System Admin can't add Units
    When User Enter user@system.com as username and 123456 as password and click Login
    Then Check if user is logged in
    And User Go To admin panel
    Then Check if user is at Admin panel
    And Click Units tab
    Then Check if user is at Units page
    Then Check if user can't add new Units
    And Go to User Profile
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as User Admin can't add Tags
    When User Enter user@admin.com as username and 123456 as password and click Login
    Then Check if user is logged in
    And User Go To admin panel
    Then Check if user is at Admin panel
    And Click Tags tab
    Then Check if user is at Tags page
    Then Check if user can't add new Tags
    And Go to User Profile
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as System Admin can't add Tags
    When User Enter user@system.com as username and 123456 as password and click Login
    Then Check if user is logged in
    And User Go To admin panel
    Then Check if user is at Admin panel
    And Click Tags tab
    Then Check if user is at Tags page
    Then Check if user can't add new Tags
    And Go to User Profile
    And User Click logout button
    Then Check if user is logged out


  @SmokeTest @Roles
  Scenario: Login as User Admin can't see unassigned buildings
    When User Enter user@admin.com as username and 123456 as password and click Login
    Then Check if user is logged in
    Then Check if Chrysler House Building do not appear at Buildings list
    And Go to User Profile
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as User Only can't see unassigned buildings
    When User Enter user@only.com as username and 123456 as password and click Login
    Then Check if user is logged in
    Then Check if Chrysler House Building do not appear at Buildings list
    And Go to User Profile
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as ViewOnly User can't see unassigned buildings
    When User Enter user@viewonly.com as username and 123456 as password and click Login
    Then Check if user is logged in
    Then Check if Chrysler House Building do not appear at Buildings list
    And Go to User Profile
    And User Click logout button
    Then Check if user is logged out


  @SmokeTest @Roles
  Scenario: Login as User Admin can't edit building dashboard
    When User Enter user@admin.com as username and 123456 as password and click Login
    Then Check if user is logged in
    And User click twice on Automation Testing building
    Then Check if Automation Testing Dashboard appears
    Then Check if Edit Dashboard button is not visible
    And Go to User Profile
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as User Only can't edit building dashboard
    When User Enter user@only.com as username and 123456 as password and click Login
    Then Check if user is logged in
    And User click twice on Automation Testing building
    Then Check if Automation Testing Dashboard appears
    Then Check if Edit Dashboard button is not visible
    And Go to User Profile
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as ViewOnly User can't edit building dashboard
    When User Enter user@viewonly.com as username and 123456 as password and click Login
    Then Check if user is logged in
    And User click twice on Automation Testing building
    Then Check if Automation Testing Dashboard appears
    Then Check if Edit Dashboard button is not visible
    And Go to User Profile
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as User Admin can't see Templates on Admin Panel
    When User Enter user@admin.com as username and 123456 as password and click Login
    Then Check if user is logged in
    And User Go To admin panel
    Then Check if Template page do not appear
    And Go to User Profile
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as System Admin can't see Templates on Admin Panel
    When User Enter user@system.com as username and 123456 as password and click Login
    Then Check if user is logged in
    And User Go To admin panel
    Then Check if Template page do not appear
    And Go to User Profile
    And User Click logout button
    Then Check if user is logged out


  @SmokeTest @Roles
  Scenario: Login as User
    When User Enter user@only.com as username and 123456 as password and click Login
    Then Check if user is logged in
    And Go to User Profile
    Then Check if user role is User
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as User can't see Admin Panel
    When User Enter user@only.com as username and 123456 as password and click Login
    Then Check if user is logged in
    Then Check if Admin Panel button do not appear
    And Go to User Profile
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as ViewOnly
    When User Enter user@viewonly.com as username and 123456 as password and click Login
    Then Check if user is logged in
    And Go to User Profile
    Then Check if user role is ViewOnly
    And User Click logout button
    Then Check if user is logged out

  @SmokeTest @Roles
  Scenario: Login as ViewOnly can't see Admin Panel
    When User Enter user@viewonly.com as username and 123456 as password and click Login
    Then Check if user is logged in
    Then Check if Admin Panel button do not appear
    And Go to User Profile
    And User Click logout button
    Then Check if user is logged out


