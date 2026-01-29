Feature: Test login functionality
Scenario Outline: check login is successful

Given browser is open
And user is on login page
When users enters <user-name> and <password>
And user click on login 
Then user is navigated to home page 

Examples:

|user-name|password|
|standard_user|secret_sauce|
