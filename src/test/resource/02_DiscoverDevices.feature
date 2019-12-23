Feature: 02 Discover Devices Tests
  Discover Devices, add remove delete devices and points

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in
    When User At Home page search for Auto Test Building
    Then Check if Auto Test Building appears on Search list
    And User click twice on Auto Test Building building
    Then Check if Auto Test Building Dashboard appears
    And User Click on Devices button
    Then Check if the list of Devices appears

  @SmokeTest @Device @Discover
  Scenario: User make new discover devices from all Edge Devices
    When User click on threedots button
    And User click Device Discovery button
    And User select all Edge Devices
    And User Click New Discover button
    Then Check if devices are discovered successfully
    And User click save changes after discover
    Then Check if Devices appears on the list

  @SmokeTest @Discover
  Scenario: User make update discover devices from all Edge Devices
    When User delete BR129 device from list
    And User click on threedots button
    And User click Device Discovery button
    And User select all Edge Devices
    And User Click Update Discover button
    Then Check if devices are discovered successfully
    And User click add BR129 device from discover results
    And User remove points from device and let only one
    And User click save changes and click finish
    Then Check if BR129 device appears on the list
    And User Click on BR129 Device
    Then Check if Cooling_Demand point appears on device details

  @Admin @SmokeTest @BuildingPanel @Discover
  Scenario: Delete Connector
    And User Go To admin panel
    Then Check if user is at Admin panel
    When User Open Auto Test Building
    And User goto on Connectors Tab
    And User delete connector from building
    Then Check if connector with name AutoJace disappears from list

  @Admin @SmokeTest @BuildingPanel @Discover
  Scenario: Delete Building
    And User Go To admin panel
    Then Check if user is at Admin panel
    When User Open Auto Test Building
    And Click on Delete Button, then click Delete again
    Then Check if Auto Test Building is removed from list