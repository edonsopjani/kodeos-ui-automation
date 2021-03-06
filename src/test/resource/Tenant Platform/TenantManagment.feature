Feature: Tenant APP
  Create Tenant, Assign Buildings, Create Tenant admin/user, Create After Hours HVAC and Work Orders etc.

  Background: Steps That execute before every scenario
    Given Open Tenant Page

#    TODO:
# @Tenant
#  Scenario: Create New Tenant
#    When User Enter SuperAdmin as username and Password as password and click tenant Login
#    Then Check if user is logged in on Tenant app
#    And User goes to Tenant Management page
#    And User click add button on tenant page
#    And User fill mandatory fields for tenant input page
#    Then Check if Tenant is created successfully

#    TODO:
#  @Tenant
#  Scenario: Configure Tenant
#    When User Enter SuperAdmin as username and Password as password and click tenant Login
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

#  @Tenant @SmokeTest
  Scenario: Property Manager Add Tenant admin/user
    When User Enter PropertyManager as username and Password as password and click tenant Login
    Then Check if user is logged in on Tenant app
    And User goes to Tenant Management page
    And User open BelAmi tenant page
    And User click add new tenant user
    And User fill mandatory fields for tenant user input
    Then Check if Automation Tenant appears for that Tenant
    And User logs out from propertyManager role on tenant side
    Then Check if user is at Tenant login page

#  @Tenant @SmokeTest
  Scenario: Property Manager Delete Tenant admin/user
    When User Enter PropertyManager as username and Password as password and click tenant Login
    Then Check if user is logged in on Tenant app
    And User goes to Tenant Management page
    And User open BelAmi tenant page
    And User delete Automation Tenant tenant user
    Then Check if Automation Tenant disappears for that Tenant
    And User logs out from propertyManager role on tenant side
    Then Check if user is at Tenant login page

#  @Tenant @SmokeTest
  Scenario: Tenant Admin create request for AfterHours HVAC
    When User Enter TenantAdmin as username and Password as password and click tenant Login
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

#  @Tenant @SmokeTest
  Scenario: Property Manager reject Tenant request for HVAC
    When User Enter PropertyManager as username and Password as password and click tenant Login
    Then Check if user is logged in on Tenant app
    And User open request for After Hours request
    And User click reject button
    And User open request for After Hours request
    Then Check if request status is changed to rejected
    And User logs out from propertyManager role on tenant side
    Then Check if user is at Tenant login page

#  @Tenant @SmokeTest
  Scenario: Tenant Admin create request for AfterHours HVAC with weekly repeat
    When User Enter TenantAdmin as username and Password as password and click tenant Login
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

#  @Tenant @SmokeTest
  Scenario: Property Manager accept Tenant request for HVAC
    When User Enter PropertyManager as username and Password as password and click tenant Login
    Then Check if user is logged in on Tenant app
    And User open request for After Hours request
    And User click approve button
    And User open request for After Hours request
    Then Check if request status is changed to approved
    And User logs out from propertyManager role on tenant side
    Then Check if user is at Tenant login page

#  @Tenant @SmokeTest
  Scenario: Engineer complete Tenant request for HVAC
    When User Enter PropertyManager as username and Password as password and click tenant Login
    Then Check if user is logged in on Tenant app
    And User goes to approved tab
    And User open request for After Hours request
    And User click complete button
    And User open request for After Hours request
    Then Check if request status is changed to completed
    And User logs out from engineer role on tenant side
    Then Check if user is at Tenant login page

#  @Tenant @SmokeTest
  Scenario: Tenant Admin create Work Order request
    When User Enter TenantAdmin as username and Password as password and click tenant Login
    Then Check if tenant is logged in
    And User goes to Work Orders page
    And User click add button on tenant page
    And User add issue images
    And User select floor
    And User select request category
    And User add issue description
    And User click submit request button
    Then Check if Work Order request is created successfully
    And User logs out from tenant role on tenant side
    Then Check if user is at Tenant login page

#  @Tenant @SmokeTest
  Scenario: Engineer assign itself Work Order request and Marks as done
    When User Enter PropertyManager as username and Password as password and click tenant Login
    Then Check if user is logged in on Tenant app
    And User goes to Work Orders page
    And User open request for Work Order request
    And User click assign me button
    Then Check if request status is changed to In Progress
    And User click Mark as Done button
    Then Check if request status is changed to Completed
    And User logs out from engineer role on tenant side
    Then Check if user is at Tenant login page

#  @Tenant @SmokeTest
  Scenario: Tenant Admin Evaluate Work Order request
    When User Enter TenantAdmin as username and Password as password and click tenant Login
    Then Check if tenant is logged in
    And User goes to Work Orders page
    And User open request for Work Order request
    And User click Evaluate button
    Then Check if request status is changed to Closed
    And User logs out from tenant role on tenant side
    Then Check if user is at Tenant login page

#  @Tenant @SmokeTest
  Scenario: Property manager create Work Order request
    When User Enter PropertyManager as username and Password as password and click tenant Login
    Then Check if user is logged in on Tenant app
    And User goes to Work Orders page
    And User click add button on tenant page
    And User select tenant
    And User select floor
    And User select request category
    And User add issue description
    And User add issue images
    And User click submit request button
    Then Check if Work Order request is created successfully
    And User logs out from propertyManager role on tenant side
    Then Check if user is at Tenant login page

#  @Tenant @SmokeTest
  Scenario: Engineer assign itself Work Order request and Marks as done again
    When User Enter PropertyManager as username and Password as password and click tenant Login
    Then Check if user is logged in on Tenant app
    And User goes to Work Orders page
    And User open request for Work Order
    And User click assign me button
    Then Check if request status is changed to In Progress
    And User click Mark as Done button
    Then Check if request status is changed to Completed
    And User logs out from engineer role on tenant side
    Then Check if user is at Tenant login page

#  @Tenant @SmokeTest
  Scenario: Property manager Reject Work Order request
    When User Enter PropertyManager as username and Password as password and click tenant Login
    Then Check if user is logged in on Tenant app
    And User goes to Work Orders page
    And User open request for Work Order
    And User click Evaluate button and reject work order
    Then Check if request status is changed to Rejected
    And User logs out from propertyManager role on tenant side
    Then Check if user is at Tenant login page

#  @Tenant @SmokeTest @TenantControl
  Scenario: Tenant Admin change device location name
    When User Enter TenantAdmin as username and Password as password and click tenant Login
    Then Check if tenant is logged in
    And User goes to Tenant Control page
    Then Check if User is at card view
    And Tenant click edit device button
    And Tenant change name to Automation
    And User save the changes on tenant control
    Then Check if device name is changed to Automation
    And Tenant click edit device button
    And Tenant change name to Goat Room
    And User save the changes on tenant control
    Then Check if device name is changed to Goat Room

#  @Tenant @SmokeTest @TenantControl
  Scenario: Tenant Admin write on Point from List view
    And User goes to Tenant Control page
    Then Check if User is at card view
    And Tenant goes to Light tab
    And Tenant click Meeting Room device from Card view
    And Tenant writes point with value Inactive
    Then User save the changes on tenant control
    And Tenant writes point with value Active
    Then User save the changes on tenant control

#  @Tenant @SmokeTest @TenantControl
  Scenario: Tenant Admin write on Point from Map view
    And User goes to Tenant Control page
    Then Check if User is at card view
    And Tenant goes to Light tab
    And User switch to Map view
    Then Check if User is at map view
    And Tenant click Meeting Room device from Map view
    And Tenant writes point with value Inactive
    Then User save the changes on tenant control
    And Tenant writes point with value Active
    Then User save the changes on tenant control