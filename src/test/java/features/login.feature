

Feature: Test the login functionality
  @Regression @Sanity
  Scenario: To login with valid username and valid password
    Given User opens the website and goes to the login page
    When User fills email as "qacart" and "Test123!" and clicks on login
    Then User should be logged in successfully

    @Regression
    Scenario Outline: Login with invalid credentials
      Given User opens the website and goes to the login page
      When User fills email as "<username>" and "<password>" and clicks on login
      Then Error Message should appear

      Examples:
      |       username      |         password        |
      |       yehia         |           wrong         |
      |       ali           |         Test123!        |
      |       mohamed       |         Test123         |


