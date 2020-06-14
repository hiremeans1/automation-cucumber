@US2123
Feature: Energy Resources for State and Local Governments test

#  @US123S1-A
#  Scenario: EPA dashboard test
#    Given I am on EPA site as user
#    Then "Energy Resources for State and Local Governments" is displayed
#    And I click on a "The goals of the State Inventory Tool"
#    Then "Provide pre-loaded default data but allow for state customization" is displayed
#    And I click on a "How does the State Inventory Tool work?"
#    Then "Specific instructions for estimating emissions vary by emissions source and SIT module; however the following basic steps apply for each module" is displayed
#    And I click on a "Samples of Analyses and Reports"
#    Then "State CO2 Emissions from Fossil Fuel Combustion" is displayed

  @US123S1-B
  Scenario: EPA dashboard test
    Given I am on EPA site as user
    Then "Energy Resources for State and Local Governments" is displayed
    And I click on a "State Topics"
    Then "State Energy and Environment Program" is displayed
    And I shall see text with "improving air quality"
    And I shall see text with "lowering energy costs"
    And I shall see text with "supporting local economic development"
    And I shall see text with "improving public health, and"
    And I shall see text with "increasing energy system reliability"
#
#  @US123S2
#  Scenario: EPA local topics test
#    Given I am on EPA site as user
#    Then "Energy Resources for State and Local Governments" is displayed
#    And I click on a "Local Topics"
#    Then "Local Energy and Environment Program" is displayed
#    And I shall see text with "improving air quality"
#    And I shall see text with "lowering energy costs"
#
#  @US123S3
#  Scenario: EPA local topics test
#    Given I am on EPA site as user
#    Then "Energy Resources for State and Local Governments" is entered in search bar
#    And I click on search button
#    Then "Requirements for state programs, links to state regulations and a table identifying which states have federal and state universal wastes." is displayed
#    And I shall see text with "Protect Children, Protect Our Future (2010)"
#    And I shall see text with "Estimates of Methane Emissions by Sector in the United States"
