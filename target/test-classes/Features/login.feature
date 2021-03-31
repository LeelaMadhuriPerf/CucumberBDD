  
  @SmokeFeature
   Feature: Feature to test login funcitonality
   
   @smoketest
   Scenario: Check login is successful with valid credentials
      
   Given user is on login page
   When user enters username and password
   And Clicks on login button
   Then user is navigated to homepage
      
