Feature: accountfeature

Scenario:
Given user launches shopwitheg site.
When user clicks login button
And user clicks on create account button

When user enters firstname with less than 2charactes
Then validate the error message
When user enters firstname with greater than 30charactes
Then validate the error message
When user enters firstname  specialcharacters and symbols and numericvalues
Then validate error message
And it allows only letters