@Regression
Feature: Validate the Update a Patient functionality in OpenMRS

  @Sanity
  Scenario: Update a patient record for existing patient with valid data
    Given User is on Find Patient Record page of OpenMRS
    When User enters valid existing patient name in search box 
    And User click on the patient name in the table
    And User click on edit link
    And User update the data for patient 
    And User click on confirm button on update page
    Then User will see the data is updated for existing patient

