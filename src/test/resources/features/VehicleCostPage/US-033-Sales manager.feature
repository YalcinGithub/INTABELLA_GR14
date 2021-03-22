Feature: Sales Manager I should be able to get Vehicle Costs


		#@IN-287
  Background:
    Given the user is on the login page
    When the user enters the sales manager information
    Then the user should be able to login
    And the user navigates to "Fleet" , "Vehicle Costs"
    Then the user should be able to see the page "Vehicle Costs"


	#User Story :
	#As a Store Manager/Sales Manager I should be able to get Vehicle Costs
	#informations
	#
	#Acceptance Criterias:
	#{color:#DE350B}1-Store manager/Sales Manager can see vehicle costs informations once navigate to vehicle page{color}
	#2-Store manager/Sales Manager can change page number for getting following vehicle costs informations
	#3-Store manager/Sales Manager can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#4-Store manager/Sales Manager can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
  @IN-299 @IN-304
  Scenario: US-33 Sales manager can see vehicle costs informations once navigate to vehicle page Test
    And the user navigates to "Fleet" , "Vehicle Costs"
    Then the user should be able to see the page "Vehicle Costs"

	#User Story :
	#As a Store Manager/Sales Manager I should be able to get Vehicle Costs
	#informations
	#
	#Acceptance Criterias:
	#1-Store manager/Sales Manager can see vehicle costs informations once navigate to vehicle page
	#{color:#DE350B}2-Store manager/Sales Manager can change page number for getting following vehicle costs informations{color}
	#3-Store manager/Sales Manager can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#4-Store manager/Sales Manager can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
  @IN-301 @IN-304
  Scenario: US-33 Sales manager can change page number for getting following vehicle costs informations Test
    When the user clicks the right arrow
    Then the user verify sees the page number changed to two
    When the user clicks the right arrow
    Then the user verify sees the page number changed to three

	#User Story :
	#As a Store Manager/Sales Manager I should be able to get Vehicle Costs
	#informations
	#
	#Acceptance Criterias:
	#1-Store manager/Sales Manager can see vehicle costs informations once navigate to vehicle page
	#2-Store manager/Sales Manager can change page number for getting following vehicle costs informations
	#{color:#DE350B}3-Store manager/Sales Manager can change the entity number by clicking the View Per Page dropdown(10,25,50,100){color}
	#4-Store manager/Sales Manager can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats
  @IN-302 @IN-304
  Scenario: US-33 Sales manager can change the entity number by clicking the View Per Page dropdown(10,25,50,100) Test
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

	#User Story :
	#As a Store Manager/Sales Manager I should be able to get Vehicle Costs
	#informations
	#
	#Acceptance Criterias:
	#1-Store manager/Sales Manager can see vehicle costs informations once navigate to vehicle page
	#2-Store manager/Sales Manager can change page number for getting following vehicle costs informations
	#3-Store manager/Sales Manager can change the entity number by clicking the View Per Page dropdown(10,25,50,100)
	#{color:#DE350B}4-Store manager/Sales Manager can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats{color}
  @IN-303 @IN-304
  Scenario: US-33 Sales manager can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats Test
    When the user clicks "Export Grid" button in the upper left corner of the page
    Then the user sees options appear csv and xlsx formats
    When the user click "csv" view forum options
    Then the user verify export started successfully
    When the user click "xlsx formats" view forum options
    Then the user verify export started successfully
