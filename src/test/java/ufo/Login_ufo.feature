
@ufo_login
Feature: Title of your feature

  Scenario Outline: Login UFO
    Given Enter Username "<username>" and Password  "<password>"  and select user_type  "<usr_type>" 
    When Go to  sdf Advertisement > Advertisement Ro> IRO
    Then Click on create button
    Then Log out from UFO.

    Examples: 
      | username           | password | usr_type|
      | dusane.infotech    | di@222   |  Sales  |
      
      
      
      
      
 