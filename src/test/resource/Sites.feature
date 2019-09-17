Feature: Sites Page Tests
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



