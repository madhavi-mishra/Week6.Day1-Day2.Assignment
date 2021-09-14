Feature: Login function
#Background: 
#Given Open the chrome browser
#And Load the application url 'http://leaftaps.com/opentaps/control/main'

Scenario Outline: TC001_Positive data
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed

Examples: 
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

Scenario: TC001_Negative data
Given Enter the username as 'Demo123'
And Enter the password as 'crmsfa'
When Click on Login button
But Error message should be displayed