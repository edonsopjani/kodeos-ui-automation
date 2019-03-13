Feature: Schedulers Tests
  Check Schedulers discover, add,edit,delete scheduler, check if it appears on calendar

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in
    And User click twice on Automation Testing building
    Then Check if Automation Testing Dashboard appears
    And User Click on Schedulers button
    Then Check if Schedulers page appears

  @Schedulers
  Scenario: Discover Schedulers
    When User click Discovery button
    Then Check if points with schedulers appears on list

  @Schedulers
  Scenario: Add Scheduler
    When User click BR126_str from the list
    And User click add scheduler button
    And User click save scheduler button
    And User go to calendar
    Then Check if Scheduler appears on calendar

 @Schedulers
  Scenario: Edit Scheduler
    When User click BR126_str from the list
    And User clicks delete scheduler button
    And User click add scheduler button
    And User change date to Saturday
    And User click save scheduler button
    And User go to calendar
    Then Check if Scheduler appears on calendar

  @Schedulers
  Scenario: Delete Scheduler
    When User click BR126_str from the list
    And User clicks delete scheduler button
    And User click save scheduler button
    And User go to calendar
    Then Check if Scheduler disappears on calendar
