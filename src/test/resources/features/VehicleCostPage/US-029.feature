Feature: Deneme

  Background:
		#@LoginStepDefs
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login

  @IN-298
  Scenario: Truck Driver Create Vehicle Costs (IN-30)

    Given the user is on the "Dashboard" page
    When the user navigates to "Fleet" "Vehicle Costs"
    And the user clicks Create Vehicle Costs button
    Then the user should be able to click "Save And Close" button
    And User verifies that Entity Saved message can be seen on page

  @IN-300
  Scenario: Truck Driver can add chassi number and licence plate (IN-30)

    Given the user is on the "Dashboard" page
    When the user navigates to "Fleet" "Vehicle Costs"
    And the user clicks Create Vehicle Costs button
    And the user clicks first plus button
    Then "Select Carreservation" window should pop up
    When the user clicks first chassis number and then clicks select
    Then Chassis Number should be shown on the "CreateVehicleCosts" page