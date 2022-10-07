Feature: Search

  Scenario: As a user I can search an article using Search Bar
    Given The website "https://en.wikipedia.org" is opened using Chrome
    When The word "automation testing" is searched in Search Bar
    Then The article page should have title "Test automation - Wikipedia"