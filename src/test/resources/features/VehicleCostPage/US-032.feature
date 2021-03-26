@wip
Feature:
	Background:
		#@LoginStepDefs
		Given the user is on the login page
		When the user enters the driver information
		Then the user should be able to login

	@IN-306
	Scenario: Truck Driver Vehicle Costs Add Attachment function (IN-34)
		Given the user is on the "Dashboard" page
		When the user navigates to "Fleet" "Vehicle Costs"
		And the user clicks first column of Type row
		Then the user should be able to see General Information of chosen type
		When the user clicks Add Attachment button
		Then Add Attachment Window should popup
		When the user clicks Choose File button
		And the user chooses file from his PC
		And the user clicks Save button
		Then the user should be able to see "Attachment created successfully" message

	@IN-307
	Scenario: Truck Driver should see the update (IN-34)
		Given the user is on the "Dashboard" page
		When the user navigates to "Fleet" "Vehicle Costs"
		And the user clicks first column of Type row
		Then the user should be able to see General Information of chosen type
		And the user should be able to see the update in vehicle cost general information page