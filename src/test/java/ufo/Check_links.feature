
@Check_links
Feature: Check all links
  
Scenario: Check Links on sales login
    Given Login with sales valid credendial
    And Get all links from home page
    Then print all links on console.