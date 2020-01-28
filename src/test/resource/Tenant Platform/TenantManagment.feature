Feature: Tenant APP Test Cases
 Create Tenant, Assign Buildings, Create Tenant admin/user, Create After Hours HVAC and Work Orders etc.

  Background: Steps That execute before every scenario
    Given Open Tenant Page
    Then Check if user is at Tenant login page

#    TODO:
# @Tenant
#  Scenario: Create New Tenant
#    When User Enter user@super.com as username and KodeL@bs123 as password and click tenant Login
#    Then Check if user is logged in on Tenant app
#    And User goes to Tenant Management page
#    And User click add button on tenant page
#    And User fill mandatory fields for tenant input page
#    Then Check if Tenant is created successfully

#    TODO:
#  @Tenant
#  Scenario: Configure Tenant
#    When User Enter user@super.com as username and KodeL@bs123 as password and click tenant Login
#    Then Check if user is logged in on Tenant app
#    And User goes to Tenant Management page
#    And User open tenantName tenant page
#    And User click Configure button
#    And User add 20 as Hourly Rate
#    And User select tenant floors
#    And User select tenant devices
#    And User select working hours
#    And User save changes on tenant page
#    Then Check if tenant is updated successfully

#   @Tenant
  Scenario: Property Manager Add Tenant admin/user
    When User Enter es30323@ubt-uni.net as username and KodeL@bs123 as password and click tenant Login
    Then Check if user is logged in on Tenant app
    And User goes to Tenant Management page
    And User open Burger King tenant page
    And User click add new tenant user
    And User fill mandatory fields for tenant user input
    Then Check if Automation Tenant appears for that Tenant
    And User logs out from propertyManager role on tenant side
    Then Check if user is at Tenant login page

#  @Tenant
  Scenario: Tenant Admin create request for AfterHours HVAC
    When User Enter edonicardi@gmail.com as username and KodeL@bs123 as password and click tenant Login
    Then Check if tenant is logged in
    And User goes to After Hours HVAC page
    And User click add button on tenant page
    And User select floor
    And User select start date
    And User select start time
    And User select end time
    And User select end date
    And User click submit request button
    Then Check if After Hours HVAC request is created successfully
    And User logs out from tenant role on tenant side
    Then Check if user is at Tenant login page

#  @Tenant
  Scenario: Property Manager reject Tenant request for HVAC
    When User Enter es30323@ubt-uni.net as username and KodeL@bs123 as password and click tenant Login
    Then Check if user is logged in on Tenant app
    And User open request for After Hours request
    And User click reject button
    And User open request for After Hours request
    Then Check if request status is changed to rejected
    And User logs out from propertyManager role on tenant side
    Then Check if user is at Tenant login page

#  @Tenant
  Scenario: Tenant Admin create request for AfterHours HVAC with weekly repeat
    When User Enter edonicardi@gmail.com as username and KodeL@bs123 as password and click tenant Login
    Then Check if tenant is logged in
    And User goes to After Hours HVAC page
    And User click add button on tenant page
    And User select floor
    And User select start date
    And User select start time
    And User select end time
    And User select end date
    And User select weekly repeat
    And User select every Tuesday
    And User click submit request button
    Then Check if After Hours HVAC request is created successfully
    And User logs out from tenant role on tenant side
    Then Check if user is at Tenant login page

#   @Tenant
  Scenario: Property Manager accept Tenant request for HVAC
    When User Enter es30323@ubt-uni.net as username and KodeL@bs123 as password and click tenant Login
    Then Check if user is logged in on Tenant app
    And User open request for After Hours request
    And User click approve button
    And User open request for After Hours request
    Then Check if request status is changed to approved
    And User logs out from propertyManager role on tenant side
    Then Check if user is at Tenant login page

#  @Tenant
  Scenario: Engineer complete Tenant request for HVAC
    When User Enter sopjaniedon@outlook.com as username and KodeL@bs123 as password and click tenant Login
    Then Check if user is logged in on Tenant app
    And User goes to approved tab
    And User open request for After Hours request
    And User click complete button
    And User open request for After Hours request
    Then Check if request status is changed to completed
    And User logs out from engineer role on tenant side
    Then Check if user is at Tenant login page

##  @Tenant
#  Scenario: Tenant Admin create Work Order request
#    When User Enter edonicardi@gmail.com as username and KodeL@bs123 as password and click tenant Login
#    Then Check if tenant is logged in
#    And User goes to Work Orders page
#    And User click add button on tenant page
#    And User select floor
#    And User select request category
#    And User add issue description
#    And User add issue images
#    And User click submit request button
#    Then Check if Work Order request is created successfully
#    And User logs out from tenant role on tenant side
#    Then Check if user is at Tenant login page
#
##  @Tenant
#  Scenario: Engineer assign itself Work Order request and Marks as done
#    When User Enter sopjaniedon@outlook.com as username and KodeL@bs123 as password and click tenant Login
#    Then Check if user is logged in on Tenant app
#    And User goes to Work Orders page
#    And User open request for Work Order request
#    And User click assign me button
#    Then Check if request status is changed to In Progress
#    And User click Mark as Done button
#    Then Check if request status is changed to Completed
#    And User logs out from engineer role on tenant side
#    Then Check if user is at Tenant login page
#
##   @Tenant
#  Scenario: Tenant Admin Evaluate Work Order request
#    When User Enter edonicardi@gmail.com as username and KodeL@bs123 as password and click tenant Login
#    Then Check if tenant is logged in
#    And User goes to Work Orders page
#    And User open request for Work Order request
#    And User click Evaluate button
#    Then Check if request status is changed to Closed
#    And User logs out from tenant role on tenant side
#    Then Check if user is at Tenant login page
#
##  @Tenant
#  Scenario: Tenant user create Work Order request
#    When User Enter edonicardi@gmail.com as username and KodeL@bs123 as password and click tenant Login
#    Then Check if tenant is logged in
#    And User goes to Work Orders page
#    And User click add button on tenant page
#    And User select floor
#    And User select request category
#    And User add issue description
#    And User add issue images
#    And User click submit request button
#    Then Check if Work Order request is created successfully
#    And User logs out from tenant role on tenant side
#    Then Check if user is at Tenant login page
#
##  @Tenant
#  Scenario: Engineer assign itself Work Order request and Marks as done
#    When User Enter sopjaniedon@outlook.com as username and KodeL@bs123 as password and click tenant Login
#    Then Check if user is logged in on Tenant app
#    And User goes to Work Orders page
#    And User open request for Work Order request
#    And User click assign me button
#    Then Check if request status is changed to In Progress
#    And User click Mark as Done button
#    Then Check if request status is changed to Completed
#    And User logs out from engineer role on tenant side
#    Then Check if user is at Tenant login page
#
##  @Tenant
#  Scenario: Tenant Admin Reject Work Order request
#    When User Enter edonicardi@gmail.com as username and KodeL@bs123 as password and click tenant Login
#    Then Check if tenant is logged in
#    And User goes to Work Orders page
#    And User open request for Work Order request
#    And User click Evaluate button and reject work order
#    Then Check if request status is changed to Rejected
#    And User logs out from tenant role on tenant side
#    Then Check if user is at Tenant login page