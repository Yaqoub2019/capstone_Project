Feature: Sign In Feature 

@login
Scenario: Verify user can sign in into Retail Application 

Given User is on retail website 
When User click on Sign in option 
And User enter email 'ghafor@gmail.com' and password 'Ghafor@123' 
And User click on login button 
Then User should be logged in into Account 


@createAccoun
Scenario: Verify user can create an account into Retail Website 
Given User is on retail website 
When User click on Sign in option 
And User click on Create New Account button 
And User fill the signUp information with below data 
| name     | email                   | password  | confirmPassword | 
| panthers | afghan1202545@tekschool.us | Tek@123454 | Tek@123454     | 
And User click on SignUp button 
Then User should be logged into account page 