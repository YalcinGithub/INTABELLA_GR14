@IN-271
Feature: Truck_Driver_filtering_functions_in_Vehicle_Odometer

  Background:
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login
    And the user navigates to "Fleet" , "Vehicle Odometer"
    Then the user should be able to see the page "Vehicle Odometer"

  @IN-252 @IN-270
  Scenario: Test of IN-18 Truck Driver arranging Columns by using Grid Settings button in Vehicle Odometer module US-017

    When the user clicks "Reset" button
    When the user clicks "Grid Settings" button
    And the user selects all columns
    Then the user should see the columns in correct number and order

  @IN-267 @IN-270
  Scenario: Test of IN-18 Truck driver using Filters sign and Manage Filters button for filtering information

    When the user clicks "Filters" button
    And the user clicks "Manage filters" button
    Then the user should be able to see the "Multiselect" menu
    When the user selects "Driver" option
    Then the user clicks "Filter criteria" button
    Then the user should be able to see the "Filter criteria dropdown" menu
    Then the user selects "Is Equal To" option from the dropdown option menu
    And the user enters "jon" keyword in to the  input box
    And the user clicks "Update" button
    Then the user should be able to see the results for filter type "Driver", condition "Is Equal To", and input "jon"

  @IN-268 @IN-270
  Scenario: Test of IN-18 Truck driver can refresh the page by using Refresh button
    When the user clicks "Refresh" button
    Then the user should be able to see the Loader Mask and it disappears again

  @IN-269 @IN-270
  Scenario: Test of IN-18 Truck driver can reset the filtering settings by using Reset button
    Given the user uses filtering options in Vehicle Odometer Page
    When the user clicks "Reset" button
    Then the user should be able to see that Filter Buttons are not visible