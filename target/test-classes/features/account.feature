Feature: accountfeature

Scenario:
Given user launches shopwitheg site.
When user clicks login button
And user clicks on create account button

When user enters firstname with less than 2charactes
Then validate the error message