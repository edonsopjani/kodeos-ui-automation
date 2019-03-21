Feature: User Panel Tests

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in
    And User Go To admin panel
    Then Check if user is at Admin panel
    And Click User Panel tab
    Then Check if user is at User panel

  @Admin @SmokeTest @UserPanel
  Scenario: Add New User
    When User clicks on Add new User
    And User Fill Edonis as First Name
    And User Fill Sopi as Last Name
    And User Fill edon@kodelabs.co as Email
    And User Fill 123-456-7889 as Phone number
    And User Fill User as Role
    And User click Save changes
    Then Check if User with name Edonis appear on the list

  @Admin @SmokeTest @UserPanel
  Scenario: Add New User Account
    When User clicks on Add new User
    And User Fill Michael as First Name
    And User Fill Sopi as Last Name
    And User Fill don@kodelabs.co as Email
    And User Fill 123-456-7889 as Phone number
    And User Fill User as Role
    And User Fill 123456 as Password
    And User click Save changes
    Then Check if User with name Michael appear on the list

  @Admin @SmokeTest @UserPanel
  Scenario: Update User Account Role
    When User click Michael User
    And Click on Edit Role Button, change role and click save
    Then Check if Role is updated

  @Admin @SmokeTest @UserPanel
  Scenario: Update User Account Email
    When User click Michael User
    And Click on Edit email Button, change email and click save
    Then Check if email is updated

  @Admin @SmokeTest @UserPanel
  Scenario: Update User Account Password
    When User click Michael User
    And Click on Edit password Button, change password and click save
    Then Check if password is updated

  @Admin @SmokeTest @UserPanel
  Scenario: Deactivate User Account
    When User click Michael User
    And Click on deactivate Button and click save
    Then Check if user account is deactivated

  @Admin @SmokeTest @UserPanel
  Scenario: Update User to User Account
    When User click Edonis User
    And Click on Create account Button, enter password and click save
    Then Check if User account is updated

  @Admin @SmokeTest @UserPanel
  Scenario: Edit User
    When User click Edonis User
    And Click on Edit Button, then change some values for user and click save
    Then Check if All Changed fields for Edonis are saved successful

  @Admin @SmokeTest @UserPanel
  Scenario: Assign Buildings to User
    When User click Edonis User
    And User go to buildings tab
    And User click assign buildings
    And User assign Chrysler House Building
    Then Check if Chrysler House is assigned to that user

  @Admin @SmokeTest @UserPanel
  Scenario: Remove Building from User
    When User click Edonis User
    And User go to buildings tab
    And User clicks delete assigned buildings
    And User remove Chrysler House Building
    Then Check if Chrysler House is removed from user

  @Admin @SmokeTest @UserPanel
  Scenario: Delete Users
    When User click Edonis User
    And User click on Delete user button
    Then Check if User Edonis dissapears from the list

  @Admin @SmokeTest @UserPanel
  Scenario: Delete Users Account
    When User click Michael User
    And User click on Delete user button
    Then Check if User Michael dissapears from the list
