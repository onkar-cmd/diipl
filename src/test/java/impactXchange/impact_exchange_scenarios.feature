Feature: Add Edit account
  
    @test_checking_special_characters @smoke_testing @Imapct_website
    Scenario: To test company ,screen and class name with special characters
    Given Go to Impact Exchange website and login with valid username and password
    When  Go to Add edit accoount page and click on add new button 
    Then  On Create company page insert invalid special characters. 
    Then  Check for edit company page insert invalid special characters.
    Then  On Create class insert invalid special characters.
    Then  Check for edit class insert invalid special characters.
    Then  On Create screen insert invalid special characters.
    Then  Check for edit screen insert invalid special characters.
    
   @testing_add_new_company @regression_testing @exhibitor
   Scenario: To test add exhibitor and validating if add and approves properly.
   Given A login with valid username and password.
   Then  Create new exhibitor and add certain details and click on next,with below available data
   |JK company|JK support|onkarb@diipl.com|456312|lane1 road|Thane|Ernakulam| Kerala| 022-544554545| JK threater|10000|20000|30000|
   Then Create class for new exhibitor and click on next button.
   |Sofa|Balcony|
   Then Create Screen for new exhibitor with ac,ufo and webcode and click on next button .
   |Screen1|1234|
   And  According to the screen_name and class_name  assign ticket_rate and seats and click on web-booking allowed checkbox and then click on add button.
   |100|50|
   Then  Click on that exhibitor and validate if it is active.
   Then  Click on approve button.