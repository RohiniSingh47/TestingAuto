Feature: Post feature of facebook
  This will test the post functionality at the user
Background: This is for common steps
  Scenario: post a message on user wall
    Given user should be logged in and should be present at its own wall
    When i type the message as "My Post"in the text box
    And click on post button
    Then the message should get posted

  Scenario: post a video on user wall
    When user supply the youtube link as "https://wwww.google.com" in the text box
    And click on post button
    Then then video should get posted on the user wall
    And the video should have proper thumbnail


