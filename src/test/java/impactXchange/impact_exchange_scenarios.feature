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
   Scenario Outline: To test add exhibitor and validating if add and approves properly.
   Given A login with valid username and password.
   Then  Create new exhibitor and add certain details and click on next,with below available data
   Then Create class for new exhibitor and click on next button.
   Then Create Screen for new exhibitor with ac,ufo and webcode and click on next button .
   And  According to the screen_name and class_name  assign ticket_rate and seats and click on web-booking allowed checkbox and then click on add button.
   Then  Click on that exhibitor and validate if it is active.
   Then  Click on approve button.
  Examples:
  |Moviename|
  |Jumbo|
   
   
   @testing_link_movie @cineworld @Add_link
   Scenario Outline: To test Add movie to Link UFO movie
   Given Login .
   Then Click on new movie .
   Then click on icon link Ufo movie "<Movie_name>".
   Then Add all details about movie. 
   Date: "Saturday, October 05, 2019" , 
   Rating: "U" , 
   generic: "Animation" , 
   language: "English" , 
   type: "3D" ,
   production: "Aamir Khan Productions Pvt. Ltd." , 
   Movie-length: "150" , 
   director: "George Miller" ,
   music-director: "Junkie XL ,Tom Hardy" , 
   movie-stars: "Charlize Theron,Nicholas Hoult,Hugh Keays-Byrne,Rosie Huntington-Whiteley,Riley Keough,Zo� Kravitz,Abbey Lee,Courtney Eaton" .
   Then close browser.
   Examples:
   |Movie_name|
   |War|
   
   
   @Edit_link
   Scenario: To test edit movie to link UFO movie
   Given Login.
   Then Click on movie .
   Then Click on icon link ufo movie.
   
    