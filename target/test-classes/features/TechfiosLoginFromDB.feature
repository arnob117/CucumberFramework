@DbLoginFeature
Feature: Techfios login functionality validation

Background: 
	Given User is on techfios login page

@DbScenario1 @Smoke
Scenario:1 User should be able to login with valid credential
	When User enters username from database
	When User enters password from database
	When User clicks on the signin button
	Then User should land on Dashboard page
	