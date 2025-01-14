Feature: Addition

  Scenario: Retrieve complex message with valid parameters
    Given the client sets query parameters date to "2025-01-13", name to "JohnDoe", and id to 12345
    When the client sends a GET request to "/test"
    Then the response status should be 200
