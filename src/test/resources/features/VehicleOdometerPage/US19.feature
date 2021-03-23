@US19
Feature:

	Background:
		#@IN-216
		Given the user is on the login page
		When the user enters the driver information
		Then the user should be able to login
		

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver I should be able to create vehicle odometer
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#*1-Truck driver can create vehicle odometer by using Create Vehicle Odometer button*
	# 2-Truck driver can also add Licence plate information by using +Add button when creating vehicle odometer
	@IN-223 @IN-225
	Scenario: US-19 Driver can create vehicle odometer Test
		When the user navigate to Fleet module and click on the Vehicle Odometer
		Then the user should navigate to Vehicles Odometers page
		When the user click on the Create Vehicle Odometer
		Then the user should navigate to Create Vehicle Odometer page
		When the user click on the Save and Close
		Then "Entity saved" message should appear at the top of the page

	#*User Story :* 
	#
	#As a Truck Driver I should be able to create vehicle odometer
	#
	# 
	#
	#*_Acceptance Criterias:_*
	#
	#1-Truck driver can create vehicle odometer by using Create Vehicle Odometer button
	# 2-Truck driver can also add Licence plate information by using +Add button when creating vehicle odometer
	@IN-224 @IN-225
	Scenario: US-19 Driver can add License plate information Test
		When the user navigate to Fleet module and click on the Vehicle Odometer
		Then the user should navigate to Vehicles Odometers page
		When the user click on the Create Vehicle Odometer
		Then the user should navigate to Create Vehicle Odometer page
		When the user click on the Add button
		Then the user should navigate to Select Carreservation page
		When the user checked the checkbox of the related license plate and click on the Select button
		Then the selected license plate should appear on the screen
		When the user click on the Save and Close
		Then "Entity saved" message should appear at the top of the page