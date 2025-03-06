@Regression
Feature: Validate the Register a Patient functionality in OpenMRS

  @Sanity
  Scenario: Register a patient with valid data
    Given User is on Register a patient page of OpenMRS
    When User enters valid data in all fields 
    And User click on confirm button
    Then User will see new patient is registerd