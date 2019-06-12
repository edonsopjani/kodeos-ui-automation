Feature: Events on Admin Page Tests

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in


  @Admin @SmokeTest @Events
  Scenario: Add New Event Class
    And User Go To admin panel
    Then Check if user is at Admin panel
    And Click Events tab
    Then Check if user is at Events page
    And User click Add Event
    And User Fill mandatory fields for Event Class
    And User click Save button
    Then Check if Event Class Automation Appears on List

  @Admin @SmokeTest @Events
  Scenario: Edit Event Class
    And User Go To admin panel
    Then Check if user is at Admin panel
    And Click Events tab
    Then Check if user is at Events page
    And User Click edit button
    And User change Event name to Automation2
    Then Check if name is Changed to Automation2

  @Admin @SmokeTest @Events
  Scenario: Delete Event Class
    And User Go To admin panel
    Then Check if user is at Admin panel
    And Click Events tab
    Then Check if user is at Events page
    And User Click delete button
    Then Check if event with name Automation2 is deleted

  @Admin @SmokeTest @Events
  Scenario: Add New Event Type
    And User Go To admin panel
    Then Check if user is at Admin panel
    And Click Events tab
    Then Check if user is at Events page
    And User goto Types tab
    And User click Add Event
    And User Fill mandatory fields for Event Type
    And User click Save button
    Then Check if Event Type Automation Appears on List

  @Admin @SmokeTest @Events
  Scenario: Edit Event Type
    And User Go To admin panel
    Then Check if user is at Admin panel
    And Click Events tab
    Then Check if user is at Events page
    And User goto Types tab
    And User Click edit button
    And User change Event name to Automation2
    Then Check if name is Changed to Automation2

  @Admin @SmokeTest @Events
  Scenario: Delete Event Type
    And User Go To admin panel
    Then Check if user is at Admin panel
    And Click Events tab
    Then Check if user is at Events page
    And User goto Types tab
    And User Click delete button
    Then Check if event with name Automation2 is deleted