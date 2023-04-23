Feature: passwordfeature
Scenario:
Given user launches shipWithEg site
When user clicks on login
And user enters password with valid input
Then user clicks on signin
When user not enter specialcharacters
And user click on signin
Then validate error message
When user not enter numericvalues

Then validate error message2  
When user not enter lowercase

Then validate error message3
When user not enter uppercaseletters

Then validate error message4
