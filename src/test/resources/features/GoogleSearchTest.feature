
@books
Feature: Searching for products on Google

  Scenario Outline: Google search test of the given products in the list

    Given User goes to "googleUrl"
    Then Searches "<searchWord>" on Google
    And Google tests whether search results contain "<searchWord>"
    And Close the browser

    Examples:
      |searchWord |
      |Trendyol   |
      |Hepsiburada|
      |Samsung    |
      |Apple      |
      |Amazon     |
