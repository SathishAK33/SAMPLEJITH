
Feature:test the HCL  application
Scenario:test the login with valid users
Given Open chrome browser and url of the appliction
When Enter username and password and click on login button
Then Click approve button and Successfully login to the account


Scenario: test the iTime in my hcl
Given Open chrome and url of myhcl
When Enter username1 and password1 and click on login button
Then Click approve button1 and login Successfully
And Enter itime in text search box
And Enter time in timesheet
And Save the time 