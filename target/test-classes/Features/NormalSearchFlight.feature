Feature: Search a flight

  @test2luis
  Scenario: Search Product Rog Flow
    Given I go to Amazon web page
    And I search for a product
    And I click in search button
    Then I click in first item
    Then I Close Browser

