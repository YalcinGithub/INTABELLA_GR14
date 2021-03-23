@US24
Feature:

	#{color:#00875a}*User Story :* {color}
	#
	#As a Store manager/Sales Manager I should not be able to access Vehicle odometer page
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Only truck driver can access to vehicle odometer page
	#2-Sales manager or store manager can not access vehicle odometer page
	@IN-228 @IN-233
	Scenario: US-024 Only truck driver can access to Vehicle Odometer Page Test

		Given the user is on the login page
		When the user enters the driver information
		Then the user should be able to login
		When the user navigate to Fleet module and click on the Vehicle Odometer
		Then the user should navigate to Vehicles Odometers page


#		Then Entity saved should appear at the top of the page


#{color:#00875a}*User Story :* {color}
	#
	#As a Store manager/Sales Manager I should not be able to access Vehicle odometer page
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Only truck driver can access to vehicle odometer page
	#2-Sales manager or store manager can not access vehicle odometer page
	@IN-229 @IN-233
	Scenario: US-024 Sales manager can not access vehicle odometer page Test
		Given the user is on the login page
		When the user enters the sales manager information
		Then the user should be able to login
		When the sales manager navigate to Fleet module and click on the Vehicle Odometer
		Then "You do not have permission to perform this action." notification should be seen

#{color:#00875a}*User Story :* {color}
	#
	#As a Store manager/Sales Manager I should not be able to access Vehicle odometer page
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Only truck driver can access to vehicle odometer page
	#2-Sales manager or store manager can not access vehicle odometer page
	@IN-231 @IN-233
	Scenario: US-024 Store manager can not access vehicle odometer page Test
		Given the user is on the login page
		When the user enters the store manager information
		Then the user should be able to login
		When the store manager navigate to Fleet module and click on the Vehicle Odometer
		Then "You do not have permission to perform this action." notification should be seen