Feature: 07 Systems Tests
  Check Devices list functions, Check Filters, Check Device Batch Update, Check Point Batch Update, Check Device Details Page.

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in
    And User click twice on Automation Testing building
    Then Check if Automation Testing Dashboard appears
    And User Click on Systems button
    Then Check if Systems page appears

  @SmokeTest @System
  Scenario: Create System
    When User click Add new System button
    And User fill mandatory fields for System and click add
    Then Check if Automation System is created

#  @SmokeTest @System
#  Scenario: Add content to System
#    When User clicks Automation System from the list and go to Details page
#    And User Click Edit Content button
#    And User add Device with Linked points
#    And User Drag Device to the list
#    And User Drag point to device
#    And User Save changes for System
#    Then Check if Changes Appears on System
#
#  @SmokeTest @System
#  Scenario: Edit System
#    When User clicks Automation System from the list and go to Details page
#    And User Click Edit System button
#    And User add Automation as Tag
#    Then Check if Changes Appears on System

  @SmokeTest @System
  Scenario: Delete Systems
    When User clicks Automation System from the list and go to Details page
    And user click delete System Button
    Then Check if Systems page appears
