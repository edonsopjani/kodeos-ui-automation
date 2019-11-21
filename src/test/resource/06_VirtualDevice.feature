Feature: 06 Virtual Devices Tests
  Create Virtual Device, add points to virtual device, remove points from Virtual device

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in
    And User click twice on Automation Testing building
    Then Check if Automation Testing Dashboard appears
    And User Click on Devices button
    Then Check if the list of Devices appears
    When User click on threedots button
    And User goes to Virtual Device Page
    Then Check if user is at Virtual Device page

  @VirtualDevice @SmokeTest
  Scenario: Create Virtual Device
    When User Click Add Virtual Device and add VirtualDevice as name
    Then Check if Virtual Device with name VirtualDevice appears on list

  @VirtualDevice @SmokeTest
  Scenario: Add Points to Virtual Device
    When User select ExactLogic Device
    And  User also select VirtualDevice Device
    And User check all points and move to Virtual device
    And User select Flex Device
    And User check all points and move to Virtual device
    Then Check if points are moved to Virtual Device

  @VirtualDevice @SmokeTest
  Scenario: Remove Points to Virtual Device
    When  User also select VirtualDevice Device
    And User check all points and move to real device
    Then Check if points are moved to Virtual Device

