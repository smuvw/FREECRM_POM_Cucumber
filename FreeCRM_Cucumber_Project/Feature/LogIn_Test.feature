Feature: Login Action


#Scenario: Successful Login with Valid Credentials
	#Given User is on Home Page
	#When User enters "smuvva" and "Selenium"
	#Then Message displayed Login Successfully
	

#Scenario Outline: Successful Login with Valid Credentials
#	Given User is on Home Page
#	When User enters "<username>" and "<password>"
#	Then Message displayed Login Successfully
	
#	Examples:
 #         | username  | password  |
  #        | smuvva | Selenium |
   #       | smuvva | Selenium |
          
          
 Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User enters Credentials to LogIn
    | smuvva | Selenium |
	Then Message displayed Login Successfully
          
          