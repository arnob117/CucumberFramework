@OtherLoginFeature @Regression
Feature: Techfios login functionality validation

Background:
	Given User is on techfios login page

@OtherScenario1
Scenario Outline:1 User should not be able to login with invalid credential
	When User enters username as "<username>"
	When User enters password as "<password>"
	When User clicks on the signin button
	Then User should land on Dashboard page

Examples: 
|username|password|
|demo@techfios.com|abc124|
|demo2@techfios.com|abc123|
|demo3@techfios.com|abc124|

