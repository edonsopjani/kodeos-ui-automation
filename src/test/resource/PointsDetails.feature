Feature: Points Tests
  Check Devices list functions, Check Filters, Check Device Batch Update, Check Point Batch Update, Check Device Details Page.

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in
    And User click twice on Automation Testing building
    Then Check if Automation Testing Dashboard appears


  @SmokeTest @Points
  Scenario: Connect Points from Edit Points page
    And User Click on Devices button
    Then Check if the list of Devices appears
    When User is Searching for BR127
    Then Check if BR127 Device appears on list
    And User click open BR127 Device Page
    And User Click edit Points button
    And User click connect points button
    And User connect point BO1 with DEV277127_systemStatus
    And User click connect points button
    And User connect point BO1 with DEV277127_systemStatus
    Then Check if points are connected

  @SmokeTest @Points
  Scenario: Write Point on Device details
    And User Click on Devices button
    Then Check if the list of Devices appears
    When User is Searching for BR126
    Then Check if BR126 Device appears on list
    And User click open BR126 Device Page
    And User click BO1 point write button
    And User turn on point and click save
    Then Check if write point is saved successfully
    And User turn off point and click save
    Then Check if write point is saved successfully

  @SmokeTest @Points
  Scenario: Edit Point Using Point batch Update
    And User Click on Devices button
    Then Check if the list of Devices appears
    When User click on threedots button
    And Click Point batch update button
    And User is Searching for BO1
    And Click checkbox
    And add Tag Auto and update point
    And User is Searching for BO1
    And Click checkbox
    And remove Tag Auto and update point
    And User is Searching for BO1
    Then Check if Point is updated

  @SmokeTest @Points
  Scenario: Edit Point at Device Details page
    And User Click on Devices button
    Then Check if the list of Devices appears
    When User is Searching for BR127
    Then Check if BR127 Device appears on list
    And User click open BR127 Device Page
    And User Click edit Points button
    And Select Point with name BO1
    And Change point name to BO12
    Then Check if point name is changed to BO12
    And Select Point with name BO12
    And Change point name to BO1
    Then Check if point name is changed to BO1

  @SmokeTest @Points
  Scenario: Open Point detail pop-up
    And User Click on Points button
    Then Check if the list of BO1 appears
    When User is Searching for BO1
    Then Check if BO1 Device appears on list
    And User click open BO1 point pop-up
    Then Check if BO1 popup appears
