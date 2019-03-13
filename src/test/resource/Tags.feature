Feature: Tags Tests

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in
    And User Go To admin panel
    Then Check if user is at Admin panel
    And Click Tags tab
    Then Check if user is at Tags page

  @Admin @SmokeTest @Unit
  Scenario: Add New Tag
    When User Click Add New Tag Button
    And user add AutoTag as Tag Name and click Add
    Then Check if Tag with name AutoTag appears on list

  @Admin @SmokeTest @Unit
  Scenario: Search Tag
    When At Tags page User Search for Tag with name AutoTag
    Then Check if Tag with name AutoTag appears on list

  @Admin @SmokeTest @Unit
  Scenario: Edit Tag
    When At Tags page User Search for Tag with name AutoTag
    Then Check if Tag with name AutoTag appears on list
    And User hover at AutoTag and click Edit Button
    And User Change tag name to AutoTag2
    Then Check if Tag with name AutoTag2 appears on list

  @Admin @SmokeTest @Unit
  Scenario: Delete Tag
    When At Tags page User Search for Tag with name AutoTag2
    Then Check if Tag with name AutoTag2 appears on list
    And User hover at AutoTag2 and click Delete Button
    Then Check if Tag with name AutoTag2 disappears from list


