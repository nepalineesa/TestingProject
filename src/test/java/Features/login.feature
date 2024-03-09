Feature: Login

  Scenario: Login with valid credentials
    Given User launch the chrome browser
    When User enter the url "https://www.facebook.com/"
    Then User enter email as "nisha123@hotmail.com" and password as "nisha123"
    Then User click on the login button
    Then User can navigate to login page