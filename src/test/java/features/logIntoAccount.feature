Feature: Log into account
  Scenario: Logging into account scenario
    Given Website is opened
    When User clicks on login button
    And User fills up login form "babalen" and "qwerty"
    Then Logged as shown