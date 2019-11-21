Feature: 04 Devices Tests
  Check Devices list functions, Check Filters, Check Device Batch Update, Check Point Batch Update, Check Device Details Page.

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in
    And User click twice on Automation Testing building
    Then Check if Automation Testing Dashboard appears
    And User Click on Devices button
    Then Check if the list of Devices appears

  @SmokeTest @Device
  Scenario: Search For Device
    When User is Searching for Flex
    Then Check if Flex Device appears on list

  @SmokeTest @Device
  Scenario: Filter By Type
    When User clicks on Filters button
    And Click Filter by FCU type
    Then Check if all Devices with FCU type appears

  @SmokeTest @Device
  Scenario: Filter by Area
    When User clicks on Filters button
    And Click Filter by Basement area
    Then Check if all Devices with Basement area appears

  @SmokeTest @Device
  Scenario: Go to Device Details Page
    When User Click on Flex Device
    And Click at Device details button
    Then Check if Flex Device details page appears

  @SmokeTest @Device @Attachments
  Scenario: Add Image to Device Attachments
    When User Click on Flex Device
    And Click at Device details button
    Then Check if Flex Device details page appears
    And User click Attachment button
    And User open Photos dialog
    And User upload image
    Then Check if image is uploaded successfully

  @SmokeTest @Device @Attachments
  Scenario: Edit Image name at Device Attachments
    When User Click on Flex Device
    And Click at Device details button
    Then Check if Flex Device details page appears
    And User click Attachment button
    And User open Photos dialog
    And User click edit image button
    And User change name to editedName
    Then Check if image name is updated successfully

  @SmokeTest @Device @Attachments
  Scenario: Delete Image name at Device Attachments
    When User Click on Flex Device
    And Click at Device details button
    Then Check if Flex Device details page appears
    And User click Attachment button
    And User open Photos dialog
    And User click edit image button
    And User click delete image button
    Then Check if image is deleted successfully

  @SmokeTest @Device @Attachments
  Scenario: Add Document to Device Attachments
    When User Click on Flex Device
    And Click at Device details button
    Then Check if Flex Device details page appears
    And User click Attachment button
    And User open Documents dialog
    And User upload document
    Then Check if document is uploaded successfully

  @SmokeTest @Device @Attachments
  Scenario: Edit Document name at Device Attachments
    When User Click on Flex Device
    And Click at Device details button
    Then Check if Flex Device details page appears
    And User click Attachment button
    And User open Documents dialog
    And User click edit document button
    And User change name to editedName
    Then Check if document name is updated successfully

  @SmokeTest @Device @Attachments
  Scenario: Delete Document name at Device Attachments
    When User Click on Flex Device
    And Click at Device details button
    Then Check if Flex Device details page appears
    And User click Attachment button
    And User open Documents dialog
    And User click edit document button
    And User click delete document button
    Then Check if document is deleted successfully

  @SmokeTest @Device @Attachments
  Scenario: Add Note to Device Attachments
    When User Click on Flex Device
    And Click at Device details button
    Then Check if Flex Device details page appears
    And User click Attachment button
    And User open Notes dialog
    And User create note
    Then Check if note is uploaded successfully

  @SmokeTest @Device @Attachments
  Scenario: Edit Note name at Device Attachments
    When User Click on Flex Device
    And Click at Device details button
    Then Check if Flex Device details page appears
    And User click Attachment button
    And User open Notes dialog
    And User click edit note button
    And User change note name to editedName
    Then Check if note name is updated successfully

  @SmokeTest @Device @Attachments
  Scenario: Delete Note name at Device Attachments
    When User Click on Flex Device
    And Click at Device details button
    Then Check if Flex Device details page appears
    And User click Attachment button
    And User open Notes dialog
    And User click edit note button
    And User click delete note button
    Then Check if note is deleted successfully

  @SmokeTest @Device
  Scenario: Update Device using Batch Update
    When User click on threedots button
    And Click Device batch update button
    And User is Searching for ExactLogic
    And Click checkbox
    And Select AutomatedTag as Tag
    And User click Save button
    And User click Confirm button
    Then Check if Device has tag AutomationTag

  @SmokeTest @Device
  Scenario: Add point to Template from Point Batch Update
    When User click on threedots button
    And Click Device batch update button
    And User is Searching for BR127
    And Click checkbox
    And Click Apply Point template button
    And Drag Point to Template
    And User click Update Points button
    And User is Searching for BR127
    And Click checkbox
    And Click Apply Point template button
    Then Check if Point appears on Template

  @SmokeTest @Device
  Scenario: Remove point from Template at Point Batch Update
    When User click on threedots button
    And Click Device batch update button
    And User is Searching for BR127
    And Click checkbox
    And Click Apply Point template button
    And Remove Point from Template
    And User click Update Points button
    And User is Searching for BR127
    And Click checkbox
    And Click Apply Point template button
    Then Check if Point disappears from Template

  @SmokeTest @Device
  Scenario: Update Device from device page
    When User click on three dots button
    And User click edit button
    And Select AutomationTag as Tags
    And User click Save button
    And User click open ExactLogic Device Page
    And Open Device Details Pop-up
    Then Check if Device has tag AutomationTag

  @SmokeTest @Device
  Scenario: Update Device from Details page
    When User Search for Flex
    And User click open Flex Device Page
    And User Click edit Device button
    And Select AutomationTag as Tags
    And User close autofill popup
    And User click Save button
    Then Check if Device has tag AutomationTag

  @SmokeTest @Device
  Scenario: Show Device References on Details page
    When User Search for BR126
    And User click open BR126 Device Page
    And User click references button
    Then Check if Device references appears on list

  @SmokeTest @Device
  Scenario: Change Default view to Dashboard view
    When User Search for Flex
    And User click open Flex Device Page
    And User click change details view to dashboard view
    Then Check if device details view is changed to dashboard view
