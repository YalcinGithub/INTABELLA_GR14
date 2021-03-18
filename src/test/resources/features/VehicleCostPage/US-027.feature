@IN-292
Feature:Truck Driver using sidebar widgets, pins and favorite buttons in Vehicle Costs Page (IN-28)

  Background:
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login
    And the user navigates to "Fleet" , "Vehicle Costs"
    Then the user should be able to see the page "Vehicle Costs"


#  Acceptance Criteria:
#  1-Truck driver can add Recent Email, Sticky Note, Task List Widgets by using  plus sign
  @IN-288 @IN-286
  Scenario Outline:Truck driver can add Recent Email, Sticky Note, Task List Widgets by using (+) plus sign
    When the user clicks "Add Widget" button
    Then the user clicks "<Widgets>" button
    Then the user clicks "Close the Sidebar Widgets Pop-up" button
    Then the user should be able to see the "<Widgets>" widget

    Examples:
      | Widgets       |
      | Recent emails |
      | Sticky Note   |
      | Task list     |


#  Acceptance Criteria:
#  2-Truck driver can pin the page by using pin sign
    @IN-289 @IN-286
    Scenario: Truck driver can pin the page by using pin sign
    When the user clicks "Pin Button" button
    Then the user should be able to see the Pin Menu Shortcut


#  Acceptance Criteria:
#  3-Truck driver can make the page favorite by using favorite sign
    @IN-290 @IN-286
    Scenario: Truck driver can make the page favorite by using favorite sign
    When the user clicks "Favorite Button" button
    Then the user should be able to see that Page is added to the Favorites