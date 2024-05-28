Feature: Manage To-Do List

  Scenario: Add a task to the to-do list
    Given I have an empty to-do list
    When I add "Write tests" to the to-do list
    Then the to-do list should contain "Write tests"

  Scenario: Remove a task from the to-do list
    Given I have a to-do list with "Write tests"
    When I remove "Write tests" from the to-do list
    Then the to-do list should not contain "Write tests"