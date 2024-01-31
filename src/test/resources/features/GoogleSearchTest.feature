
@pages
Feature: Searching for products on Google

  Scenario Outline: Google search test of the given products in the list

    * User goes to "googleUrl"
    * Searches "<searchWord>" on Google
    * Google tests whether search results contain "<searchWord>"
    * Close the browser

    Examples:
      |searchWord |
      |Samsung    |
      |Apple      |
      |Amazon     |
