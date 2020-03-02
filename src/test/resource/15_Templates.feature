Feature: 15 Templates Tests

  Background: Steps That execute before every scenario
    Given Open KodeLabs Page
    Then Check if user is logged in
    And User Go To admin panel
    Then Check if user is at Admin panel
    And Click Templates tab
    Then Check if user is at Templates page

  @Admin @SmokeTest @Template
  Scenario: Add New Section and Add new Point
    When User go to Chiller template
    And Click add new section button
    And enter Auto for this section name
    Then Check if template with Auto name appears on list
    And Click add new point button
    And Fill point mandatory fields with name NewPoint
    Then Check if Point with name NewPoint is added on Section with name Auto

  @Admin @SmokeTest @Template
  Scenario: Edit Section Name
    When User go to Chiller template
    And Click add new section button
    And enter Auto2 for this section name
    Then Check if template with Auto2 name appears on list
    And Click add new point button
    And Fill point mandatory fields with name NewPoint2
    Then Check if Point with name NewPoint2 is added on Section with name Auto2
    And Click on Edit Button, then change section name to AutoSection2
    Then Check if template with AutoSection2 name appears on list

  @Admin @SmokeTest @Template
  Scenario: Edit Point
    When User go to Chiller template
    And Click on Edit Button, then change point name to EditedPoint
    Then Check if Point name is changed from NewPoint to EditedPoint

  @Admin @SmokeTest @Template
  Scenario: Link Points
    When User go to Chiller template
    And user select Connect Points
    And user select point with name EditedPoint
    And it links it with point with name NewPoint2
    And Click Connect Button
    Then Check if points EditedPoint and NewPoint2 are linked

  @Admin @SmokeTest @Template
  Scenario: Delete Point
    When User go to Chiller template
    And Click add new point button
    And Fill point mandatory fields with name Newone
    And Open Point with name Newone and click Delete
    Then Check if point with name Newone is deleted from list

  @Admin @SmokeTest @Template
  Scenario: Delete Section
    When User go to Chiller template
    And Click on Delete Button, then click delete Section
    Then Check if template with AutoSection name Disappears from list
