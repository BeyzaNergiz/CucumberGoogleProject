
@amazon
Feature: Amazon Optimize Product Testing

  Scenario Outline: User finds the best product in the search results

    * User goes to "amazonUrl"
    * User selects "<category>" as the category
    * User types "<product>" in the search box
    * User performs calculations to find the best product
    * The user writes the best product to the console
    * Close the browser

    Examples:
      |category  |product              |
      |Automotive |car phone holder    |
      |Baby       |baby shampoo dalin  |
