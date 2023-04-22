Feature: passwordfeature

Scenario:
Given user launches shipWithEg site
When user clicks on login
And user enters password with valid input
Then user clicks on signin
When user not enter specialcharacters,numericvalues,lowercase and uppercaseletters
And user click on signin
Then validate error message