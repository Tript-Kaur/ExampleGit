Feature: Post feature of facebook
  This will test the functionality at the user wall

  Background:
    Given User should be logged in and should be present at its own wall

  Scenario:Post a message on user wall
    When I type the message in the text box
    And Click on Post button
    Then the message should be get posted

  Scenario:Post a video on user wall
    When user supply the youtube link in the text box
    And Click on Post button
    Then the video should have proper thumbnail
