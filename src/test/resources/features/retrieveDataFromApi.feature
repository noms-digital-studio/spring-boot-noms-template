Feature: Retrieve data

  Acceptance Criteria:
  Data can be retrieved from a test REST endpoint

  Scenario: Retrieving Data from a REST endpoint
    When I call the Rest Service
    Then I receive an OK status
    And some data is returned in JSON format


