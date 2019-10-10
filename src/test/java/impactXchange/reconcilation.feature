
Feature: Recocilation process
   @testing_add_movie @Reconcile @Indivdual_reconcile
   Scenario: To test movie individual reconcile for specific exhibitor.
   Given  A login with valid username and password.
   Then  Click on Movie>Manage Movie and add new movie.
   Then  Add all details about movie and click on save.
   |Mad Max: Fury Road 7| Thursday, October 03, 2019| U | Animation |English|3D|Aamir Khan Productions Pvt. Ltd.|150|George Miller|Junkie XL|Tom Hardy|Charlize Theron,Nicholas Hoult,Hugh Keays-Byrne,Rosie Huntington-Whiteley,Riley Keough,Zoë Kravitz,Abbey Lee,Courtney Eaton   |                              
   Then  Click on that movie and set status to Active and approve that movie.
   Then  Add movie from MMS application.
   |Mad Max: Fury Road 7| Thursday, October 03, 2019| U | Animation |English|3D|Aamir Khan Productions Pvt. Ltd.|150|George Miller|Junkie XL|Tom Hardy|Charlize Theron,Nicholas Hoult,Hugh Keays-Byrne,Rosie Huntington-Whiteley,Riley Keough,Zoë Kravitz,Abbey Lee,Courtney Eaton   |  
   Then  Go to Contracts>Reconcile Local Contracts>Individual Reconcile.
   Then  Select movie that movie which is not reconcile and Click on Edit icon button.
   And   Select Movie and Distributer to reconcile.
   |854|032100510039|
   Then  Check in Manage Contracts and Click on Upcoming Pacts.
   Then  Check and Validate  that movie is Re-concile.
   
   