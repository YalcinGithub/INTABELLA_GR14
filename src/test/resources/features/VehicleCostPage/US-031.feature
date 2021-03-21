@IN-311
Feature: Truck Driver Add Event function-US031
#  User Story :
#  Truck Driver should be able to add event

  Background:
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login
    And the user navigates to "Fleet" , "Vehicle Costs"
    Then the user should be able to see the page "Vehicle Costs"

#  Acceptance Criteria:
#  Truck Driver can add event by using Add Event button
  @IN-309 @IN-308
  Scenario: Truck Driver can add event by using Add Event button
    When the user creates Vehicle Costs
    Then the user clicks "Add Event" button
    Then the user enters Event info
    Then the user should be able too see the Calendar Event added


#  Acceptance Criteria:
#  Truck Driver should see the update in both General Information and Activity tab
  @IN-310 @IN-308
  Scenario: Truck Driver should see the update in both General Information and Activity tab
    When the user creates Vehicle Costs
    And the user clicks "Add Event" button
    And the user enters Event info
    Then the user should be able too see the Calendar Event added
    When the user clicks "Activity Tab" button
    Then the user should be able too see the Calendar Event added
