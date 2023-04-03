
Feature: Contact page feature
  @Regression @Sanity
  Scenario: Make sure that the email text field is visible
    Given User opens the website and goes to the login page
    When User fills email as "qacart" and "Test123!" and clicks on login
    And Clicks on contacts button
    Then Email Text field should be visible

    @Regression
  Scenario: Add new Contact
    Given User opens the website and goes to the login page
    When User fills email as "qacart" and "Test123!" and clicks on login
    And Clicks on contacts button
    And Clicks on add new contact button
    And Fill the first name and password
    Then A new Contact should be added