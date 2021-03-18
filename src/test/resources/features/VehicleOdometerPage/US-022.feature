@wip
Feature:

  @IN-227
  Scenario: Testcase (IN-22) - Driver Can Edit Selected Vehicle Odometer

    Given the user is logged in as "driver"
    When the driver navigates to "Fleet", "Vehicle Odometer"
    Then "Vehicle Odometer - Entities - System - Car - Entities - System" page should be displayed
    When the user clicks first odometer information on the table
    Then information Edit page should be opened
    When the user clicks the Edit button
    And the driver clears the Odometer Value inbox and enters a new value "3445"
    And the driver clicks the "Save and Close" button on the right
    Then "Entity Saved" message should be displayed

  @IN-264
  Scenario: Testcase (US-22) - Odometer value negative test
    Given the user is logged in as "driver"
    When the driver navigates to "Fleet", "Vehicle Odometer"
    Then "Vehicle Odometer - Entities - System - Car - Entities - System" page should be displayed
    When the user clicks first odometer information on the table
    Then information Edit page should be opened
    When the user clicks the Edit button
    And the driver clears the Odometer Value inbox and enters a new value "testName"
    And the driver clicks the "Save and Close" button on the right
    Then "This value is not valid." validation message should be displayed