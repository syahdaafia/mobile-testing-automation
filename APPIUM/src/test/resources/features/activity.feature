@activity
  Feature: choose activity
    Background:
      Given user is on the registration page
      When user input "syahda", "50", and "160"
      And user choose "female"
      And user click next
      Then user get "passed" to next page

    Scenario Outline: check various activity
      When user choose one "<activity>"
      Then user click selesai
      Then user get "<status>" registers

      Examples:
      | activity | status |
      | 1 | passed        |
      | 2 | passed        |
      | 3 | passed        |
      | 4 | passed        |
      | 5 | passed        |
      | 6 | passed        |
      | 7 | passed        |
      |  | failed        |