Feature: Recocilation process
   @testing_add_movie @Reconcile @Indivdual_reconcile
   Scenario: To test movie individual reconcile for specific exhibitor.
   Given  A login with valid username and password.
   Then  Click on Movie>Manage Movie and add new movie from excel sheet.
   Then  Add all details about movie and click on save.       
   Then  Click on that movie and set status to Active and approve that movie.
   Then  Add movie from MMS application.
   Then  Go to Contracts>Reconcile Local Contracts>Individual Reconcile.
   Then  Select movie that movie which is not reconcile and Click on Edit icon button.
   And   Select Movie and Distributer to reconcile.
   Then  Check in Manage Contracts and Click on Upcoming Pacts and Validate  that movie is Re-concile.
   
   @testing_add_movie @Reconcile @Group_reconcile
    Scenario: To test movie individual reconcile for specific exhibitor.
    Given  Click on Movie>Manage Movie and add two new movie.
    Then  Add all details about movies and click on save.      
    Then  Click on that two movies and set status to Active and approve that movie.
    Then  Assign Territory Allocation.
    Then  Add two movies from MMS application.
    Then  Contracts>Reconcile Local Contracts>Group Reconcile.
    Then  Go Upcoming Contracts> Enter movie in exhibitor filter textbox > click on select all checkbox.
    Then  Click on Reconcile button (reconcile two movies).
    Then  Check in Manage Contracts and Click on Upcoming Pacts then Validate that two movies is Re-concile.