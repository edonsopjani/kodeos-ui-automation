Feature: Search Tests
  Check The Search functions

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in

  @SmokeTest @Test @Search
  Scenario: Search has 3 different part
    When User clicks on Search button
    Then Check if by default there appears the list of Building, Floors and Devices

  @SmokeTest @Search
  Scenario: View all for Buildings
    When User clicks on Search button
    And User click on View all button for Buildings
    Then Check if All buildings appears on the list

  @SmokeTest @Search
  Scenario: View all for Floors
    When User clicks on Search button
    And User click on View all button for Floors
    Then Check if All Floors appears on the list

  @SmokeTest @Search
  Scenario: View all for Devices
    When User clicks on Search button
    And User click on View all button for Devices
    Then Check if All Devices appears on the list

  @SmokeTest @Search
  Scenario: User Search with Building name
    When User clicks on Search button
    And search for Automation Testing
    Then Search results shows the Building with Automation search keyword, also shows the Floors and Devices for that Building

  @SmokeTest @Search
  Scenario: User Search with Floor name
    When User clicks on Search button
    And search for Basement
    Then Search results shows all floors with Basement search keyword, and all devices that are assign to that floor

  @SmokeTest @Search
  Scenario: User Search with Devices name
    When User clicks on Search button
    And search for BR126
    Then Search results shows all devices with BR126 search keyword

  @SmokeTest @Search
  Scenario: User Search with Point name
    When User clicks on Search button
    And search for BO1
    Then Search results shows all points with BO1 search keyword