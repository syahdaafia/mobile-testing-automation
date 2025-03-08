@register
  Feature: register
    Scenario Outline: register user
      Given user is on the registration page
      When user input "<name>", "<weight>", and "<height>"
      And user choose "<gender>"
      And user click next
      Then user get "<status>" to next page

      Examples:
      | name | weight | height | gender | status |
      | syahda | 50   | 160    | female | passed |
      |        | 50   | 160    | female   | invalid input |
      | syahda |      | 160    | female   | invalid input |
      | syahda | 50   |        | female   | invalid input |
      | syahda | 50   | 160    |          | empty gender  |
      | 1      | a    | b      | male     | invalid input |


