#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

      
Feature: Validation of Facebook login page and Adactin Order ID

	Scenario Outline: Validation of facebook login page with invalid username and invalid password
		Given User launches facebook web application
		When User enters valid "<username>" and valid "<password>"
		And User clicks Login Button
		Then Error message should be displayed
		
	Examples:
		|username|password|
		|UserName|PasSw0r@d|
	
	
