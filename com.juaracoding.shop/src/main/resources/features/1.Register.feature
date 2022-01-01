Feature: Shop Demo QA Register

	Scenario: Testing the authentication
		Given User go to the Website
		When User click MyAccount page button
		And User input username password email
	 Then User can click Register
