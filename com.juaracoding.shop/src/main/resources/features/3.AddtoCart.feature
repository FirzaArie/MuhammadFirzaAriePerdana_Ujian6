Feature: Wordpress Shop

	Scenario: AddToCart Glass
		Given User go to search
		When User type glass and submit
		And User Open product Page click Color and size 
		Then User click add to cart