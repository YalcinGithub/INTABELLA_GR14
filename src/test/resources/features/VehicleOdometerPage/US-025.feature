
Feature:

  Background:

    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login

  @IN-235 @IN-239
  Scenario: US-025 Truck driver can see vehicle costs informations once navigate to vehicle page
    When the user navigated to  "Fleet" and "Vehicle Costs" sees
    Then the user verify that  "Vehicle Costs" informations  page openned.


  @IN-236 @IN-239
  Scenario: US-025 Truck driver can change page number for getting following vehicle costs informations
    When the user navigated to  "Fleet" and "Vehicle Cost" sees
    Then the user verify that  "Vehicles Costs" informations  page openned.
    When the user clicks the right arrow
    Then the user verify sees the page number changed to two
    When the user clicks the right arrow
    Then the user verify sees the page number changed to three


  @IN-237 @IN-239
  Scenario: US-025 Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
    When the user navigated to  "Fleet" and "Vehicle Cost" sees
    Then the user verify that  "Vehicles Costs" informations  page openned.
    When the user clicks "View per page" on the top right of the page
    Then the user sees View per page options appear "10","25","50","100"
    When the user select 10 forum options
    Then verify row number on the table declared 10
    When the user select 25 forum options
    Then verify row number on the table declared 25
    When the user select 50 forum options
    Then verify row number on the table declared 50
    When the user select 100 forum options
    Then verify row number on the table declared 100


  @IN-238 @IN-239
  Scenario: US-025 Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
    When the user navigated to  "Fleet" and "Vehicle Cost" sees
    Then the user verify that  "Vehicles Costs" informations  page openned.
    When the user clicks "Export Grid" button in the upper left corner of the page
    Then the user sees options appear csv and xlsx formats
    When the user click "csv" view forum options
    Then the user verify export started successfully
    When the user click "xlsx formats" view forum options
    Then the user verify export started successfully