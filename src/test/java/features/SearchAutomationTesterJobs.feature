Feature: Search for Automation Tester Jobs on LexisNexis

  As a potential job applicant
  I want to search for "automation tester" positions on the LexisNexis careers page
  So that I can find and apply for relevant job opportunities

  Scenario: Successful search for automation tester positions
    Given I am on the LexisNexis homepage
    When I navigate to the Careers page through the "About Us" dropdown
    And I proceed to the new tab opened by the Careers page link
    And I click on "Search all jobs"
    And I enter "automation tester" into the search box and submit the search
    Then I should see at least one result in the search results
