
Feature: Checking amazon search functionality

@smoke
  Scenario: User should be able to see books available in different stores
	Given user is navigated to amazon.com
	And user selects "Books" from the searchFropDownBox
	When user inputs "Harry Potter" in the search box
	Then the user sees "Harry Pooter" book available in different stores
	
#zenplanner

	