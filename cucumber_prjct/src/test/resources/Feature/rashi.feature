Feature: homepage_search

Scenario: validate google search is working

Given browser is open 
And user enter a text in search box
When user is on google search page
Then user is navigated to search results