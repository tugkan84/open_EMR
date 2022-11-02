Feature: User able to Log out

  Background: Login with valid credentials
    Given User navigates to website
    When User enters valid username
    Then User enters valid password
    Then User select "English (Australian)"
    And User clicks login button
    Then User verifies homes page title as "OpenEMR"

  @TC2
  Scenario: Log out from the website successfully
    Given User navigates to website
    When User clicks to log out button
    And User navigates to login page with title "OpenHMR"
