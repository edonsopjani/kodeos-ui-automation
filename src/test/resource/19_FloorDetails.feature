Feature: 19 Floor Tests
  Go To Floor, add plan, add zones, add devices at different tabs, check Hide Zones and Names etc.

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in
    And User click twice on Automation Testing building
    Then Check if Automation Testing Dashboard appears
    When Clicks Basement from the list
    Then Check if Basement page is opened

  @SmokeTest @FloorPlan
  Scenario: Add Floor plan
    When User go to edit page
    And User upload floor plan
    And User save the changes at Floor
    Then Check if floor plan appears

#  @SmokeTest @FloorPlan
#  Scenario: Add Devices at Floor
#    When User go to edit page
#    And user go to list view
#    And user drag and drop the device to floor
#    And user drag and drop point to device
#    And User save the changes at Floor
#    Then Check if device appears at floor plan

#  @SmokeTest @FloorPlan
#  Scenario: Hide Zones and Names at Floor
#    When User click hide Names
#    Then Check if Names are hided from Floor
#
#  @SmokeTest @FloorPlan
#  Scenario: Check Event List on Floor Plan
#    When User switch to Event Tab in floor details
#    And User click show past events
#    Then Check if Event Light is OFF appears on the list

  @SmokeTest @FloorPlan
  Scenario: Reset Floor to Default
    When User go to edit page
    And user Click reset floor to default
    And User save the changes at Floor
    Then Check if Floor is reseted to default