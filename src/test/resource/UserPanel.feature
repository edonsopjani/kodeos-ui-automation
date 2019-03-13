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
