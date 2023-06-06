Feature: Post feature of facebook
  This will test the post functionality at the user
@SmokeTest
  Scenario: post a message on user wall
    Given user should be logged in and should be present at its own wall
    When i type the message in the box
    And click on post button
    Then the message should get posted

  Scenario: post a video on user wall
    Given user should be logged in and should be present at its own wall
    When user supply the youtube link in the text box
    And click on post button
    Then then video should get posted on the user wall
    And the video should have proper thumbnail


