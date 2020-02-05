Feature: 13 Access Tests
  Request Access to building, approve, reject and delete request

  Background: Steps That execute before every scenario
    Given User goes to Login page
    Then Check If user is at Login Page

  @Access @SmokeTest
  Scenario: User request access to building
    When User Enter AccessUser as username and Password as password and click Login
    Then Check if user is logged in
    And User Click on Access button
    Then Check if Access page appears
    When User click create new request button
    And User select Access User and select Automation Testing building for access
    And User select request from today until tomorrow
    And User select shift and Just for Testing as reason and click save
    Then Check if request appears on list with status pending

  @Access @SmokeTest
  Scenario: Admin approve request from user to specific building
    When User Enter SuperAdmin as username and Password as password and click Login
    Then Check if user is logged in
    And User Click on Access button
    Then Check if Access page appears
    And User Click request from Access User and approves it
    Then Check if request status changes to active

  @Access @SmokeTest
  Scenario: User log in to see if building appears on Sites page
    When User Enter AccessUser as username and Password as password and click Login
    Then Check if user is logged in
    Then Check if Automation Testing building appears on list

  @Access @SmokeTest
  Scenario: Admin reject request from user to specific building
    When User Enter SuperAdmin as username and Password as password and click Login
    Then Check if user is logged in
    And User Click on Access button
    Then Check if Access page appears
    And User Click request from Access User and reject it with reason You are not allowed to view this building
    Then Check if request status changes to rejected

  @Access @SmokeTest
  Scenario: User delete the request from access page
    When User Enter AccessUser as username and Password as password and click Login
    Then Check if user is logged in
    And User Click on Access button
    Then Check if Access page appears
    And User Click request from Access User and click delete
    Then Check if request disappears from list
