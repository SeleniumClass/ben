Feature: login function validation


Description: user able to login in to application with valid user// where we write requiremnet



Scenario: Successsful Login with Valid Credentials//common steps written in backgroup

Given User able to open Disney world browser//Given pre action setup browsse url
And Put URL and got to SignIn page
When User able to click SignIn Button//When  action (testing )
And User able to take screen shot of SignIn page//And and or multiple times
And User able to use Valid <email_id>
|email_id|
|sarowerny@gmail.com|
And User able to put valid<password>
|password|
|student|

And User able to clik submit button
Then User able to Validate SignIn status//then validation
And User able to take screen Shot of home page
And Close the browser
