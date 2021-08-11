#Author: xiomara.f@gmail.com

@tag
Feature: I as a user on the DX Hotels page
  I want to find the cheapest hotels
  To verify the rates charged to customers

  Scenario: Verify the lowest price by destination
    Given the user enters the dx hotels application
    And that the user select the destination Paris in date range between 9/21/2021 and 9/28/2021
    And select rooms 2 for people 3 and children 2
    When to select the most economical hotel
    Then verify that the total price 880 is correct

