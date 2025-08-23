Feature: Login page automation of sample App

Scenario Outline: Check login is successful with using different valid credentials
Given User is on login page
When User enters valid "<username>" and "<password>"
And User clicks login button
Then User is navigate to the home page
And Close the browser

Examples:
|	username	|	password	|
|	standard_user	|	secret_sauce	|