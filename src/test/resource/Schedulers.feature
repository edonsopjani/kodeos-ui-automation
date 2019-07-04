Feature: Schedulers Tests
  Check Schedulers discover, add,edit,delete scheduler, check if it appears on calendar

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in
    And User Click on Schedulers button
    And User select KODE Labs building
    Then Check if Schedulers page appears

  @Schedulers @SmokeTest
  Scenario: Discover Schedulers
    When User click Discovery button
    Then Check if points with schedulers appears on list

  @Schedulers @SmokeTest
  Scenario: Add Time-Period on Scheduler
    When User click exactlogicschedule from the list
    And User click add scheduler button
    And User change date to Saturday
    And Close date dropdown
    And User click add scheduler in list
    And User click save scheduler button
    And User go to calendar
    Then Check if exactlogicschedule Scheduler appears on calendar


  Scenario: Edit Time-Period on Scheduler
    When User click exactlogicschedule from the list
    And User select existing Time-Period
    And User change date to Friday
    And User click save scheduler button
    And User go to calendar
    Then Check if exactlogicschedule Scheduler appears on calendar

  @Schedulers @SmokeTest
  Scenario: Delete Time-Period on Scheduler
    When User click exactlogicschedule from the list
    And User clicks delete scheduler button
    And User click save scheduler button
    And User go to calendar
    Then Check if exactlogicschedule Scheduler disappears on calendar

  @Schedulers
  Scenario: Hide/Show Scheduler Point
    When User click exactlogicschedule three dots menu
    And User click disabled Button
    Then Check if Scheduler point is disabled
    And User click enable Button
    Then Check if Scheduler point is enabled