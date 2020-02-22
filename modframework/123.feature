#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login OrangeHrm
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given open HRM Webpage
    Then User verified Hpmepage
     And verify UserName
     And verify Password
    When I enter my UserName as <UserName>  
     When I enter my Password as <Password> 
    And click on Login
    Then check orangeHRM page
    And click on logout

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      |UserName | Password | 
      | qaplanet1 |    lab1 | 
      | qaplanet2 |     lab2| 
