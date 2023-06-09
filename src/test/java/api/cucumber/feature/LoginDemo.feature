Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user is navigated to the home page

    Examples:
      | username | password |
      | Kundan   | 12345    |
      | Varsha   |12345     |