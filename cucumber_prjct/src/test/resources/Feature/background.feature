Feature: Login to HRM application
Background:

Given user is on HRMLogin page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
@ValidCredentials
Scenario: Login with valid credentials

When user enters username as "Admin" and password as "admin123"
Then user shouid be able to login successfully and login page open 

@MissingUsername
Scenario: Login with blank username

When user enters username as " " and password as "admin123"
Then user shouid be able to see the message as below required username error message
 



