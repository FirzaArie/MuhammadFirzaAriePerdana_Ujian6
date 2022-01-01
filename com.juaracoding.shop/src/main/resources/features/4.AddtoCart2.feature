Feature: Wordpress Shop Again
	Scenario: AddToCart Shoes
		Given User go to search shoes
		When User type shoes and submit 
		And User Open product shoes click Color and size
		Then User click compare and add to cart