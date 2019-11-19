Feature: Audit Tests
  Create Audit page for Specific,Global buildings, create filter base Audit page, edit, delete Audit page and Download CSV file

  Background: Steps That execute before every scenario
    Given User goes to Login page
    Then Check If user is at Login Page
    When User Enter user@super.com as username and KodeL@bs123 as password and click Login
    Then Check if user is logged in
    And User Click on Audit button
    And User select Automation Testing building
    Then Check if Audit page appears

  @Audit @SmokeTest
  Scenario: Create Specific Building Audit Template
    When User click Add Audit template
    And User select VAV type and select Zone Temperature and Zone Temperature Setpoint
    And User click next button
    And User Add VAV Template as Template name
    And User click Save button
    Then Check if VAV Template is created

  @Audit @SmokeTest
  Scenario: Create Global Audit Template
    When User click on threedots button
    And User click Add Template Button
    And User select AHU type and select Chiller Water Temp Entering and Chiller Water Temp Leaving
    And User click next button
    And User Click All Buildings button
    And User Add Global Template as Template name
    And User click Save button
    And User select KODE Labs building
    Then Check if Global Template is created

  @Audit @SmokeTest
  Scenario: Create VAV Template with Alarm Filter
    When User click on VAV Template template
    And User clicks on Filters button
    And User select Alarm filter
    And User click apply button
    And User click Save Filters button
    And User add Alarm Points as filter name
    And User click Save button on filter
    Then Check if Alarm Points is created

  @Audit @SmokeTest
  Scenario: Edit Specific Audit Template
    When User click on VAV Template template
    And User click on threedots button
    And User click Edit Template Button
    And User click Point Selection button
    And User select Filter Status point
    And User click next button
    And User change Template name to Edited Template
    And User click Save button
    Then Check if Edited Template is created

  @Audit @SmokeTest
  Scenario: Delete Specific Audit Template
    When User click on VAV Template template
    And User click on threedots button
    And User click Delete Template Button
    And User click yes button
    Then Check if VAV Template Template is deleted

  @Audit @SmokeTest
  Scenario: Delete Edited Audit Template
    When User click on Edited Template template
    And User click on threedots button
    And User click Delete Template Button
    And User click yes button
    Then Check if Edited Template Template is deleted

  @Audit @SmokeTest
  Scenario: Delete Global Audit Template
    And User click on threedots button
    And User click Delete Template Button
    And User click yes button
    Then Check if Global Template Template is deleted