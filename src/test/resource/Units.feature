Feature: Units Tests

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in
    And User Go To admin panel
    Then Check if user is at Admin panel
    And Click Units tab
    Then Check if user is at Units page

  @Admin @SmokeTest @Unit
  Scenario: Add New Unit Category
    When User Click Add Category Button
    And user add AAuto Test as Category Name and click Add
    Then Check if category with name AAuto Test appears on list

  @Admin @SmokeTest @Unit
  Scenario: Add new Unit
    When User Click Add Category Button
    And user add AAuto Test as Category Name and click Add
    Then Check if category with name AAuto Test appears on list
    And Click category options button
    And Click Add new Unit
    And User fill mandatory fields and click add
    Then Check if unit with AutoUnit name appears on list

  @Admin @SmokeTest @Unit
  Scenario: Edit Unit
    When User click unit with name AutoUnit
    And Change symbol to ~!~
    Then Check if Unit symbol is changed to ~!~

  @Admin @SmokeTest @Unit
  Scenario: Delete Unit
    When User click unit with name AutoUnit
    And user Click delete Unit button
    And User click Yes button to delete Unit
    Then Check if Unit with name AutoUnit disappears from list
