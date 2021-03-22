@IN-297
Feature: Truck Driver filtering functions in Vehicle costs module


		#@IN-287
		Background:
		    Given the user is on the login page
		    When the user enters the driver information
		    Then the user should be able to login
		    And the user navigates to "Fleet" , "Vehicle Costs"
		    Then the user should be able to see the page "Vehicle Costs"
		

	#User Story : 
	#As a Truck Driver I should be able to use all filtering functions
	#
	#Acceptance Criterias:
	#{color:#DE350B}"1-Truck driver can use Grid Settings button for arranging demanded columns.{color}
	#2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations
	#3-Truck driver can refresh the page by using Refresh button
	#4-Truck driver can reset the filtering settings by using Reset button"
	@IN-291 @IN-296
	Scenario: US-026 Truck driver can use Grid Settings button for arranging demanded columns.
		When the user clicks on the "Grid Settings" on the right.
		Then the user verify that  "Grid Settings" informations page openned.
		When the user "Select All" is clicked.
		Then the user verify sees "Id" properties appear on the vehicle cost page page.
		When the user "Type" is clicked.
		Then the user verify sees "Type" properties don't appear on the vehicle cost page page.
		When the user "Total Price" is clicked.
		Then the user verify sees "Total Price" properties don't appear on the vehicle cost page page.
		When the user "Date" is clicked.
		Then the user verify sees "Date" properties appear don't on the vehicle cost page.

	#User Story :
	#As a Truck Driver I should be able to use all filtering functions
	#
	#Acceptance Criterias:
	#"1-Truck driver can use Grid Settings button for arranging demanded columns.
	#{color:#DE350B}2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations{color}
	#3-Truck driver can refresh the page by using Refresh button
	#4-Truck driver can reset the filtering settings by using Reset button"
	@IN-293 @IN-296
	Scenario: US-026 Truck driver can use Filters sign with opening Manage Filters button for filtering informations Test
		When the user clicks on the Filters on the right.
		Then the user verify that "Manage filters" openned on the left side.
		When the user Manage filters is clicked.
		Then the user verify "Type" "Total Price" "Date" search appears.
		When the user Type is clicked.
		Then the user verify sees "Type:All" all option appears at the top.
		When the user Type:All is clicked.
		And  the user click on choose values and click the first one.
		When the user Update is clicked.
		Then the user verify that the result appears on the page.
			

	#User Story :
	#As a Truck Driver I should be able to use all filtering functions
	#
	#Acceptance Criterias:
	#"1-Truck driver can use Grid Settings button for arranging demanded columns.
	#2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations
	#{color:#DE350B}3-Truck driver can refresh the page by using Refresh button{color}
	#4-Truck driver can reset the filtering settings by using Reset button"
	@IN-294 @IN-296
	Scenario: US-026 Truck driver can refresh the page by using Refresh button Test
		When the user clicks "Refresh" button
		Then the user should be able to see the Loader Mask and it disappears again
			

	#User Story :
	#As a Truck Driver I should be able to use all filtering functions
	#
	#Acceptance Criterias:
	#"1-Truck driver can use Grid Settings button for arranging demanded columns.
	#2-Truck driver can use Filters sign with opening Manage Filters button for filtering informations
	#3-Truck driver can refresh the page by using Refresh button
	#{color:#DE350B}4-Truck driver can reset the filtering settings by using Reset button"{color}
	@IN-295 @IN-296
	Scenario: US-026 Truck driver can reset the filtering settings by using Reset button Test
		When the user clicks on the Filters on the right.
		Then the user verify that "Manage filters" openned on the left side.
		When the user Manage filters is clicked.
		Then the user verify "Type" "Total Price" "Date" search appears.
		When the user Type is clicked.
		Then the user verify sees "Type:All" all option appears at the top.
		When the user clicks "Reset" button
		Then the user verify see that Type:All are not visible
		