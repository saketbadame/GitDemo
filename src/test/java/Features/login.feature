Feature:  Application Login

Scenario: Home Page default login
Given Initiate the browser with chrome
And Navigate to "QAClickAcademy" Site
And Click on login link 
When  User enters "username" and "password" and logs in 
Then  Verify that user is successfully logged in

