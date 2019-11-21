Feature: 10 Sites Page Tests
  Check The Search functions

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in

  @SmokeTest @Sites
  Scenario: Search for Building
    When User At Home page search for KODE Labs
    Then Check if KODE Labs appears on Search list

  @SmokeTest @Sites
  Scenario: Go To Building Dashboard
    When User At Home page search for KODE Labs
    And User click twice on KODE Labs building
    Then Check if KODE Labs Dashboard appears


  @SmokeTest @Sites
  Scenario: Sort by Down Device
    When User click sort by down devices
    Then Check if list of buildings is sorted by down devices

  @SmokeTest @Sites
  Scenario: Sort by Active Events
    When User click sort by active events
    Then Check if list of buildings is sorted by active events


