@LoginFeature
Feature: Techfios login functionality validation

Background: 
	Given User is on techfios login page

@Scenario1 @Smoke
Scenario:1 User should be able to login with valid credential
	When User enters username as "demo@techfios.com"
	When User enters password as "abc123"
	When User clicks on the signin button
	Then User should land on Dashboard page
	
@Scenario2
Scenario:2 User should be able to login with valid credential
	When User enters username as "demo2@techfios.com"
	When User enters password as "abc123"
	When User clicks on the signin button
	Then User should land on Dashboard page
	