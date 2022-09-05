@ui @US_001_TC_002
Feature: Users will be able to view a list of popular movies.

  Scenario: US_001_TC_002_Manual_UI:Checks Movie List can be sorted by Title
    Given User lauches the movie app
    Then  Verify that movie list screen is visible
    When Click Sort Button which is on the right top corner
    Then Verify that Sort By screen is visible
    And Verify that Title Button is on the Sort By Screen
    When Click Title Button on Sort By Screen
    Then Verify that movie list is sorted by title