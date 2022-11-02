Feature: User able to Login
  @TC1
  Scenario: Login with valid credentials
    Given User navigates to website
    When User enters valid username
    Then User enters valid password
    Then User select "English (Australian)"
    And User clicks login button
    Then User verifies homes page title as "OpenEMR"

    @Smoke
    Scenario: Login with invalid username
      Given User navigates to website
      When User enters invalid username
      Then User enters valid password
      Then User select "English (Australian)"
      And User clicks login button
      Then User gets error message as "Invalid username or password"

  @Smoke
  Scenario: Login with invalid password
    Given User navigates to website
    When User enters valid username
    Then User enters invalid password
    Then User select "English (Australian)"
    And User clicks login button
    Then User gets error message as "Invalid username or password"

  @Smoke
  Scenario: Login with invalid username and Password
    Given User navigates to website
    When User enters invalid username
    Then User enters invalid password
    Then User select "English (Australian)"
    And User clicks login button
    Then User gets error message as "Invalid username or password"