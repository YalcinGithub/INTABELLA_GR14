Feature:
  Background:
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login

  @IN-241 @IN-242
  Scenario: US-020 Truck Driver can see all informations about specific vehicle odometer.
    When the user navigated to "Fleet" and "Vehicle Odometers"sees
    Then the user verify sees all informations about specific "Vehicles Odometers" page.