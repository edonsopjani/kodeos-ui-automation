Feature: Fire Dashboard Tests
  List of Fire Events, Check New Fire Event appears, create,edit and delete notes, check sites page

  Background: Steps That execute before every scenario
    Given User goes to Login page
    Then Check If user is at Login Page

  @SmokeTest @FireDashboard
  Scenario: User Login as Fire User
    When User Enter fire@user.com as username and 123456 as password and click Login
    Then Check if user is at Fire Dashboard

  @SmokeTest @FireDashboard
  Scenario: User Login as Admin user and then go to Fire Dashboard
    When User Enter user@super.com as username and 123456 as password and click Login
    Then Check if user is logged in
    And User switch to Fire Dashboard view
    Then Check if user is at Fire Dashboard

  @SmokeTest @FireDashboard
  Scenario: User view sites page at Fire Dashboard
    When User Enter fire@user.com as username and 123456 as password and click Login
    Then Check if user is at Fire Dashboard
    And Click Sites button
    Then Check if Automation Testing building appears on list

  @SmokeTest @FireDashboard
  Scenario: View Fire Event details page
    When User Enter fire@user.com as username and 123456 as password and click Login
    Then Check if user is at Fire Dashboard
    And Click Fire - Alarm Event
    Then Check if Fire - Alarm Event details page appear

  @SmokeTest @FireDashboard
  Scenario: Create Global Note
    When User Enter fire@user.com as username and 123456 as password and click Login
    Then Check if user is at Fire Dashboard
    And User Click add new note
    And User fill note message as automationNote and click add
    Then Check if automationNote note appears on list

  @SmokeTest @FireDashboard
  Scenario: Create specific Note
    When User Enter fire@user.com as username and 123456 as password and click Login
    Then Check if user is at Fire Dashboard
    And User Click add new specific note
    And User fill note message as automationSpecificNote and click add
    Then Check if automationSpecificNote note appears on list

  @SmokeTest @FireDashboard
  Scenario: Edit Note
    When User Enter fire@user.com as username and 123456 as password and click Login
    Then Check if user is at Fire Dashboard
    And User Click edit note button
    And User change note message to editedNote and click add
    Then Check if editedNote note appears on list

  @SmokeTest @FireDashboard
  Scenario: Delete Specific Note
    When User Enter fire@user.com as username and 123456 as password and click Login
    Then Check if user is at Fire Dashboard
    And User Click delete note button
    Then Check if note message editedNote is deleted

  @SmokeTest @FireDashboard
  Scenario: Delete Global Note
    When User Enter user@super.com as username and 123456 as password and click Login
    Then Check if user is logged in
    And User switch to Fire Dashboard view
    Then Check if user is at Fire Dashboard
    And User Click delete note button
    Then Check if note message automationNote is deleted

