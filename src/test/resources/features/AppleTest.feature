  @wip
  Feature: Searching for headers on Apple home page

    Scenario Outline: Headers display test on Apple home page

      * User goes to "googleUrl"
      * Searches "<searchWord>" on Google
      * Click on Apple
      * It is tested that the titles of the Apple homepage are displayed
      * Close the browser

      Examples:
        |searchWord     |
        |Apple          |

    Scenario Outline: Verify that Macbook Air buy and display test on Apple page

      * User goes to "googleUrl"
      * Searches "<searchWord>" on Google
      * Click on Apple
      * Macbook Air buy and verify that Macbook Air buy
      * Close the browser

      Examples:
        |searchWord     |
        |Apple          |
