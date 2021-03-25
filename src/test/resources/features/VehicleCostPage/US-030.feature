@IN-285
Feature:

	Background:
		#@IN-216
		Given the user is on the login page
		When the user enters the driver information
		Then the user should be able to login

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck Driver can see all informations about specific vehicle cost when click on it.
	# 2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	# 3-Truck Driver can refresh the activities by using refresh button
	# 4-Truck Driver can reach the all activities by using Newer and Older buttons
	# 5-Truck driver can change page number for getting following attachment informations
	# 6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	# 7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.
	# 8-Truck driver can refresh the attachments by using Refresh button
	# 9-Truck driver can reset the filtering settings by using Reset button for attachments"
	@IN-275 @IN-284
	Scenario: Truck Driver see informations about specific vehicle cost when click on it US-030 Test
		Given the user click on "Fleet" and click on "Vehicle Costs"
		When the user should navigate to "Vehicle Costs" page
		Then the user click on specific vehicle cost
		And the user should see all informations about that vehicle cost	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck Driver can see all informations about specific vehicle cost when click on it.
	# *2-Truck Driver can filter activities by using either Activity Type button or Date Range button*
	# 3-Truck Driver can refresh the activities by using refresh button
	# 4-Truck Driver can reach the all activities by using Newer and Older buttons
	# 5-Truck driver can change page number for getting following attachment informations
	# 6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	# 7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.
	# 8-Truck driver can refresh the attachments by using Refresh button
	# 9-Truck driver can reset the filtering settings by using Reset button for attachments
	@IN-276 @IN-284
	Scenario: Truck Driver can filter activities by using Activity Type button or Date Range button US-030 Test
		Given the user click on "Fleet" and click on "Vehicle Cost"
		When the user should navigate to "Vehicle Costs" page
		Then the user click on "filter button"
		And the user should see "Manage Filters" button
		When the user click on the "Manage Filters" button
		Then the user should see three options
		When the user select "Type" and "Date" 
		Then the user should see "Type" and "Date" menus next to the "Manage Filters" button	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck Driver can see all informations about specific vehicle cost when click on it.
	# 2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	# *3-Truck Driver can refresh the activities by using refresh button*
	# 4-Truck Driver can reach the all activities by using Newer and Older buttons
	# 5-Truck driver can change page number for getting following attachment informations
	# 6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	# 7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.
	# 8-Truck driver can refresh the attachments by using Refresh button
	# 9-Truck driver can reset the filtering settings by using Reset button for attachments
	@IN-277 @IN-284
	Scenario: Truck Driver can refresh the activities by using refresh button US-030 Test
		Given the user click on "Fleet" and click on "Vehicle Cost"
		When the user should navigate to "Vehicle Costs" page
		And the user should be able to click "Activities Refresh" button
		Then the event should be refreshed	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#"1-Truck Driver can see all informations about specific vehicle cost when click on it.
	# 2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	# 3-Truck Driver can refresh the activities by using refresh button
	# *4-Truck Driver can reach the all activities by using Newer and Older buttons*
	# 5-Truck driver can change page number for getting following attachment informations
	# 6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	# 7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.
	# 8-Truck driver can refresh the attachments by using Refresh button
	# 9-Truck driver can reset the filtering settings by using Reset button for attachments
	@IN-278 @IN-284
	Scenario: Truck Driver can reach the all activities by using Newer and Older buttons US-030 Test
		Given the user click on "Fleet" and click on "Vehicle Cost"
		When the user should navigate to "Vehicle Costs" page
		When the user click on specific vehicle cost
		Then the user should be able to see older activities by clicking the "Older" button
		And the user should be able to see newer all activities by clicking the "Newer" button

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#"1-Truck Driver can see all informations about specific vehicle cost when click on it.
	# 2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	# 3-Truck Driver can refresh the activities by using refresh button
	# 4-Truck Driver can reach the all activities by using Newer and Older buttons
	# *5-Truck driver can change page number for getting following attachment informations*
	# 6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	# 7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.
	# 8-Truck driver can refresh the attachments by using Refresh button
	# 9-Truck driver can reset the filtering settings by using Reset button for attachments
	@IN-279 @IN-284
	Scenario: Truck driver can change page number for getting following attachment informations  US-030 Test
		Given the user click on "Fleet" and click on "Vehicle Cost"
		When the user should navigate to "Vehicle Costs" page
		When the user click on specific vehicle cost
		And the user click on the next button
		Then the user should be able to see the following attachment information	

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck Driver can see all informations about specific vehicle cost when click on it.
	# 2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	# 3-Truck Driver can refresh the activities by using refresh button
	# 4-Truck Driver can reach the all activities by using Newer and Older buttons
	# 5-Truck driver can change page number for getting following attachment informations
	# *6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)*
	# 7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.
	# 8-Truck driver can refresh the attachments by using Refresh button
	# 9-Truck driver can reset the filtering settings by using Reset button for attachments
	@IN-280 @IN-284
	Scenario: US-025 Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
		When the user navigated to  "Fleet" and "Vehicle Cost" sees
		Then the user verify that  "Vehicles Costs" informations  page openned.
		When the user clicks "View per page" on the top right of the page
		Then the user sees View per page options appear "10","25","50","100"
		When the user select 10 forum options
		Then verify row number on the table declared 10
		When the user select 25 forum options
		Then verify row number on the table declared 25
		When the user select 50 forum options
		Then verify row number on the table declared 50
		When the user select 100 forum options
		Then verify row number on the table declared 100

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck Driver can see all informations about specific vehicle cost when click on it.
	# 2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	# 3-Truck Driver can refresh the activities by using refresh button
	# 4-Truck Driver can reach the all activities by using Newer and Older buttons
	# 5-Truck driver can change page number for getting following attachment informations
	# 6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	# *7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.*
	# 8-Truck driver can refresh the attachments by using Refresh button
	# 9-Truck driver can reset the filtering settings by using Reset button for attachments
	@IN-281 @IN-284
	Scenario: Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment US-030 Test
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

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck Driver can see all informations about specific vehicle cost when click on it.
	# 2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	# 3-Truck Driver can refresh the activities by using refresh button
	# 4-Truck Driver can reach the all activities by using Newer and Older buttons
	# 5-Truck driver can change page number for getting following attachment informations
	# 6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	# 7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.
	# *8-Truck driver can refresh the attachments by using Refresh button*
	# 9-Truck driver can reset the filtering settings by using Reset button for attachments
	@IN-282 @IN-284
	Scenario: Truck driver can refresh the attachments by using Refresh button US-030 Test
		Given the user click on "Fleet" and click on "Vehicle Cost"
		When the user should navigate to "Vehicle Costs" page
		And the user should be able to click "Activities Refresh" button
		Then the event should be refreshed

	#{color:#00875a}*User Story :* {color}
	#
	#As a Truck Driver When I click on any vehicle costs in the grid, I should be able to see general informations about selected vehicle cost.
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#1-Truck Driver can see all informations about specific vehicle cost when click on it.
	# 2-Truck Driver can filter activities by using either Activity Type button or Date Range button
	# 3-Truck Driver can refresh the activities by using refresh button
	# 4-Truck Driver can reach the all activities by using Newer and Older buttons
	# 5-Truck driver can change page number for getting following attachment informations
	# 6-Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	# 7-Truck driver can use Grid Settings button for arranging demanded columns for finding demanded attachment.
	# 8-Truck driver can refresh the attachments by using Refresh button
	# *9-Truck driver can reset the filtering settings by using Reset button for attachments*
	@IN-283 @IN-284
	Scenario: Truck driver can reset the filtering settings by using Reset button for attachments US-030 Test
		Given the user click on "Fleet" and click on "Vehicle Cost"
		When the user should navigate to "Vehicle Costs" pageThen the user click on "filter button"
		And the user should see "Manage Filters" button
		When the user click on the "Manage Filters" button
		Then the user should see three options
		And the user select "Type" and "Date"
		When the click "Reset" button
		Then "Type" and "Date" menus should disappear