Feature: Add Facility feature

  Background: Login with valid credentials
    Given User navigates to website
    When User enters valid username
    Then User enters valid password
    Then User select "English (Australian)"
    And User clicks login button
    Then User verifies homes page title as "OpenEMR"

  Scenario Outline: Users add to facilities
    Given User navigates to facilities
    And User validates that user can see text as "Facilities"
    Then User clicks Add facilities button
    And User add required facilities "<Name>","<Tax Id>","<POS code>","<Billing Address>","<Phone>","<Color>"
    Then User clicks the save button
    Examples:
      | Name  | Tax Id | POS code | Billing Address | Phone    | Color   |
      | Seray | 12304H | 12: Home | 123 State st    | 12345678 | #FFFF00 |
