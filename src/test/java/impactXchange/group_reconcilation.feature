
Feature: Group Reconcilation
  @testing_add_movie @Reconcile @Group_reconcile
    Scenario: To test movie individual reconcile for specific exhibitor.
    Given  Click on Movie>Manage Movie and add two new movie.
    Then  Add all details about movies and click on save.
    |Mad Max: Fury Road 12| Saturday, October 05, 2019| U | Animation |English|3D|Aamir Khan Productions Pvt. Ltd.|150|George Miller|Junkie XL|Tom Hardy|Charlize Theron,Nicholas Hoult,Hugh Keays-Byrne,Rosie Huntington-Whiteley,Riley Keough,Zoë Kravitz,Abbey Lee,Courtney Eaton|                              
    |Mad Max: Fury Road 13| Saturday, October 05, 2019| U | Animation |English|3D|Aamir Khan Productions Pvt. Ltd.|150|George Miller|Junkie XL|Tom Hardy|Charlize Theron,Nicholas Hoult,Hugh Keays-Byrne,Rosie Huntington-Whiteley,Riley Keough,Zoë Kravitz,Abbey Lee,Courtney Eaton|                              
    Then  Click on that two movies and set status to Active and approve that movie.
    Then  Add two movies from MMS application.
    |Mad Max: Fury Road 12| Saturday, October 05, 2019| U | Animation |English|3D|Aamir Khan Productions Pvt. Ltd.|150|George Miller|Junkie XL|Tom Hardy|Charlize Theron,Nicholas Hoult,Hugh Keays-Byrne,Rosie Huntington-Whiteley,Riley Keough,Zoë Kravitz,Abbey Lee,Courtney Eaton|                              
    |Mad Max: Fury Road 13| Saturday, October 05, 2019| U | Animation |English|3D|Aamir Khan Productions Pvt. Ltd.|150|George Miller|Junkie XL|Tom Hardy|Charlize Theron,Nicholas Hoult,Hugh Keays-Byrne,Rosie Huntington-Whiteley,Riley Keough,Zoë Kravitz,Abbey Lee,Courtney Eaton|                 
    Then   Contracts>Reconcile Local Contracts>Group Reconcile.
    Then  Go Upcoming Contracts> Select that movie which is to be reconcile.
    Then  Click on two Checkbox's for specific movies which is created by exhibitor.
    |826|Warner Bros. Pictures|
    |826|Warner Bros. Pictures|
    Then  Click on Reconcile button.
    Then  Check in Manage Contracts and Click on Upcoming Pacts.
    Then  Check and Validate that two movies is Re-concile.