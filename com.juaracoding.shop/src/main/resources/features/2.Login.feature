#Feature: Shop Demo QA Register

#	Scenario: Testing the authentication
#		Given User go to the Website
#		When User click MyAccount page button
#		And User input username password email
#		Then User can click Register


Feature: Wordpress Login

	Scenario: Login
		Given User go to the Website
		When User click MyAccount page button
		And User Add new email and password
		Then User can press login 