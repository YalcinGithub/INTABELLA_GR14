@IN-326
Feature:

		#@IN-287
		Background:
		    Given the user is on the login page
		    When the user enters the driver information
		    Then the user should be able to login
		    And the user navigates to "Fleet" , "Vehicle Costs"
		    Then the user should be able to see the page "Vehicle Costs"
		

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to view any vehicle costs in the grid.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck Driver can view any vehicle costs in the grid by using eye sign inside … sign.
	#2-Truck Driver can not delete vehicle costs in the grid by using recycle bin inside … sign.
	#3-Truck Driver can not edit vehicle costs in the grid by using edit inside ... sign.
	@IN-314 @IN-317
	Scenario: US-028 Driver can view any vehicle costs in the grid by using eye sign inside … sign. TEST
		When move your mouse on the three dot on the top of the  vehicle cost line's right sign
		And click  view button by using eye sign inside … sign.
		Then verify view general information page	

	#*User Story :* 
	#
	#As a Truck Driver I should be able to view any vehicle costs in the grid.
	#
	# 
	#
	#*_Acceptance Criterias:_*
	#
	#"1-Truck Driver can view any vehicle costs in the grid by using eye sign inside … sign.
	# 2-Truck Driver can not delete vehicle costs in the grid by using recycle bin inside … sign.
	# 3-Truck Driver can not edit vehicle costs in the grid by using edit inside ... sign."
	@IN-315 @IN-317
	Scenario: US-028 Driver can not delete vehicle costs in the grid by using recycle bin inside … sign TEST
		When move your mouse on the three dot on the top of the  vehicle cost line's right sign
		And click  edit  button by using edit inside … sign.
		Then verify seen "You do not have permission to perform this action." message top of and middle of the page
			

	#*User Story :* 
	#
	#As a Truck Driver I should be able to view any vehicle costs in the grid.
	#
	# 
	#
	#*_Acceptance Criterias:_*
	#
	#"1-Truck Driver can view any vehicle costs in the grid by using eye sign inside … sign.
	# 2-Truck Driver can not delete vehicle costs in the grid by using recycle bin inside … sign.
	# 3-Truck Driver can not edit vehicle costs in the grid by using edit inside ... sign."
	@IN-316 @IN-317
	Scenario: US-028 Driver can not edit vehicle costs in the grid by using edit inside ... sign TEST
		When move your mouse …sign on the top of the  vehicle cost line's right sign
		And click  delete  button by using recycle bin inside … sign.
		When click yes,delete button.
		Then verify seen "You do not have permission to perform this action." message top of and middle of the page
		