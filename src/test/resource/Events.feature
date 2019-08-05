Feature: Events
Create Event Config, Create Event, Acknowledge Events etc.

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

  @SmokeTest @EventsDashboard
  Scenario: Create Event and check if it appears on Event Dashboard
    And User click twice on KODE Labs building
    Then Check if KODE Labs Dashboard appears
    And User click BO1 point write button
#    And User add automation as reason
    And User make point value false and click save
    Then Check if write point is saved successfully
#    And User wait until event is created
#    And User goes to Event Dashboard
    Then Check if Light is OFF event appears on list
#    And User click twice on KODE Labs building
#    Then Check if KODE Labs Dashboard appears
    And User click BO1 point write button
#    And User add automation as reason
    And User turn on point and click save
    Then Check if write point is saved successfully
#    And User wait until event is finished
#    And User goes to Event Dashboard
    Then Check if Light is OFF event disappears on list

  @SmokeTest @EventsDashboard
  Scenario: Acknowledge Event
    And User goes to Event Dashboard
    And Change Filters to Events that are Unacknowledged
    And Click Ack button and then Click Acknowledge
    Then Check if Event is Acknowledged

  @SmokeTest @EventsDetails
  Scenario: Go To Event Details
    And User goes to Event Dashboard
    And Change Filters to Events that are Unacknowledged
    And Click High/Low Temp Event
    Then Check if High/Low Temp Event details page appear

  @SmokeTest @EventsConfig
  Scenario: Disable/Enable event configuration
    And User goes to Event Dashboard
    And User click twice on Automation Testing building
    And Click create event configuration button
    And Click enable config button
    Then Check if config is enabled
    And Click disable config button
    Then Check if config is disabled

  @SmokeTest @EventsConfig
  Scenario: Create/Delete Event Configuration
    And User goes to Event Dashboard
    And User click twice on Automation Testing building
    And Click create event configuration button
    And Click Light is OFF Routine
    And Click next button
    And Add device to list and drag point to config
    And Click next button
    And Setup event class and click save button
    Then Check if config is added
    And Click Light is OFF Routine
    And Click next button
    And Remove device from list
    And Click next button
    And User click Save button
    Then Check if config is removed