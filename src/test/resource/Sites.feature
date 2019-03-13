Feature: Sites Page Tests
  Check The Search functions

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in

  @SmokeTest @Sites
  Scenario: Search for Building
    When User At Home page search for Chrysler House
    Then Check if Chrysler House appears on Search list

  @SmokeTest @Sites
  Scenario: Go To Building Dashboard
    When User At Home page search for Chrysler House
    And User click twice on Chrysler House building
    Then Check if Chrysler House Dashboard appears

  @SmokeTest @Sites
  Scenario: Select Building from Map
    When User At Home page search for Chrysler House
    And Select Chrysler House from Map
    Then Check if Chrysler House Dashboard appears


