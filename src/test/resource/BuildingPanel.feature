Feature: Building Panel Tests

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in
    And User Go To admin panel
    Then Check if user is at Admin panel

  @Admin @SmokeTest @BuildingPanel
  Scenario: Add New Building
    When User clicks on Add new button
    And User add Auto Test Building as Name
    And User add 277 Gratiot Ave as Address 1
    And User add Ste 100 as Address 2
    And User add 48127 as ZIP code
    And User add Detroit as City
    And User add Alabama as State
    And User add USA as Country
    And User add 42.3314 as Latitude
    And User add -83.0458 as Longitude
    And User add 2009 as Year build
    And User add 208 as Area
    And User add test1.jpg as Image
    And User click Save changes
    Then Check if Auto Test Building appear on list

  @Admin @SmokeTest @BuildingPanel
  Scenario: Edit Building
    When User Open Auto Test Building
    And Click on Edit Button, then change some values and click save
    Then Check if All Changed fields are saved successful for Auto Test Building

  @Admin @SmokeTest @BuildingPanel
  Scenario: Add New Floor
    When User Open Auto Test Building
    And User click on Areas Tab
    And User opens menu popup
    And User click Add Single floor button
    And User Enter autoArea in name field
    And User click Save changes
    And User opens menu popup
    Then Check if floor autoArea appears on list

  @Admin @SmokeTest @BuildingPanel
  Scenario: Add Multiple Floors
    When User Open Auto Test Building
    And User click on Areas Tab
    And User opens menu popup
    And User click Add Multiple Floors button
    And User Enter TEST in name field and Range from 1 to 3
    And User click Save changes
    And User opens menu popup
    Then Check if floors with name TEST 1 until TEST 3 appears on list

  @Admin @SmokeTest @BuildingPanel
  Scenario: Edit Floors
    When User Open Auto Test Building
    And User click on Areas Tab
    And User Search for autoArea
    And User click on three dots button
    And Enter new name autoArea2
    And User click Save changes
    And User opens menu popup
    Then Check if floors has the new name autoArea2

  @Admin @SmokeTest @BuildingPanel
  Scenario: Delete Floors
    When User Open Auto Test Building
    And User click on Areas Tab
    And User opens menu popup
    And User click Delete button
    And User Select all floors with name autoArea2
    And User click delete
    And User opens menu popup
    Then Check if floor with name autoArea2 is deleted

  @Admin @SmokeTest @BuildingPanel
  Scenario: Assign Users
    When User Open Auto Test Building
    And User goto on Users Tab
    And User opens menu popup
    And click the Assign Users button
    And User select user Edon
    And User click Save changes
    Then Check if user Edon appears on list

  @Admin @SmokeTest @BuildingPanel
  Scenario: Delete Assign Users
    When User Open Auto Test Building
    And User goto on Users Tab
    And User Search for ttestt
    And User opens menu popup
    And click Remove Users button
    And User select user Edon
    And User click delete
    Then Check if user Edon disappears from list

  @Admin @SmokeTest @BuildingPanel
  Scenario: Add Connector
    When User Open Auto Test Building
    And User goto on Connectors Tab
    And User click create new connector
    And User fill mandatory fields for connector and click add
    Then Check if connector with name jace appears on list

  @Admin @SmokeTest @BuildingPanel
  Scenario: Test Connector
    When User Open Auto Test Building
    And User goto on Connectors Tab
    And User click test connector
    Then Check if connector connection is good

  @Admin @SmokeTest @BuildingPanel
  Scenario: Edit Connector
    When User Open Auto Test Building
    And User goto on Connectors Tab
    And User click edit connector
    And User change connector name to AutoJace
    Then Check if connector with name AutoJace appears on list

  @Admin @SmokeTest @BuildingPanel
  Scenario: Delete Connector
    When User Open Auto Test Building
    And User goto on Connectors Tab
    And User delete connector from building
    Then Check if connector with name AutoJace disappears from list

  @Admin @SmokeTest @BuildingPanel
  Scenario: Delete Building
    When User Open Auto Test Building
    And Click on Delete Button, then click Delete again
    Then Check if Auto Test Building is removed from list