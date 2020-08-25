Feature: 03 Dashboard Tests
  Check Dashboard functions, Check Widgets, Navigate through buildings, floors and devices

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in
    And User click twice on Automation Testing building
    Then Check if Automation Testing Dashboard appears

  @SmokeTest @Dashboard
  Scenario: Go to one Floor from the list
    When Clicks Basement from the list
    Then Check if Basement page is opened

  @SmokeTest @Dashboard
  Scenario: Go to one Floor from the Floors button
    When User Click on floors button
    Then Check if list of floors appears
    And Clicks Basement from the list
    Then Check if Basement page is opened

  @SmokeTest @Dashboard
  Scenario: Go to one Device from the Devices button
    When User Click on Devices button
    Then Check if the list of Devices appears
    And Click at BR126 Device
    Then Check if BR126 Device pop-up appears

  @SmokeTest @Dashboard
  Scenario: Add Widget on Dashboard
    When User Click on Edit Dashboard
    Then Check if the Edit Dashboard page appears
    And Click add for Navigation Widget
    And Click add for Summary Widget
    And Click Save Dashboard
    Then Check if Navigation Widget appears on Dashboard
    Then Check if Summary Widget appears on Dashboard

  @SmokeTest @Dashboard
  Scenario: Edit Navigation Widget on Dashboard
    When User Click on Edit Dashboard
    And Click edit for Navigation Widget
    And Add BR126 Device at Widget
    Then Check if BR126 device appears on Navigation Widget

  @SmokeTest @Dashboard
  Scenario: Edit Summary Widget on Dashboard
    When User Click on Edit Dashboard
    And Click edit for Summary Widget
    And Add systemStatus and Zone Temperature points for BR126 Device at Summary Widget
    Then Check if systemStatus and BO1 points appears on Summary Widget

  @SmokeTest @Dashboard
  Scenario: Go to one Device from Summary Widget
    When User Click BR126 from Summary Widget
    Then Check if BR126 Device pop-up appears

  @SmokeTest @Dashboard
  Scenario: Go to one Device from Navigation Widget
    When User Click BR126 from Navigation Widget
    Then Check if BR126 Device pop-up appears

  @SmokeTest @Dashboard
  Scenario: Remove Widget from Dashboard
    When User Click on Edit Dashboard
    And Click remove for Navigation Widget
    And Click remove for Summary Widget
    And Click Save Dashboard
    Then Check if Navigation Widget disappears from Dashboard
    Then Check if Summary Widget disappears from Dashboard
