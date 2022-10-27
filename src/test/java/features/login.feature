Feature: Register user
  Scenario: Successfully register user
    Given Website is opened
    When User clicks on register button
    And User fills up the form
    And User clicks submit button
    Then Success register notification shown