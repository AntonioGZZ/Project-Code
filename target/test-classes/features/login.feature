Feature: The login Page
	As a returning customer
	I want to login to the application
	So that I can view my account balance
	
Background: 
	Given the user is on the login page
	
@ignore
Scenario: the user should be able to login with valid credentials
	When the user enters valid credentials
	Then the user should be able to view account balance

@ignore
Scenario: the user should be able to login with valid credentials
	When the user enters invalid credentials
	Then the user should be able to view account balance
	
@ignore	
Scenario: the user should be able to log in
	When the user enters username as "ipgb2207@gmail.com" 
	And the user enters password as "PASSWORD"
	And user clicks login
	Then the user should be able to view account balance
	
Scenario Outline: user should log in
	When the user enters "<username>" and "<password>"
	Then the user should be able to view account balance
	
Examples:
	|username|password|
	|ipgb2207@gmail.com|PASSWORD|
	|tim@testemail.com|trpass|
