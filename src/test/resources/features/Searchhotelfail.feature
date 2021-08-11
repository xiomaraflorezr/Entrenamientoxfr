#Author: xiomara.f@gmail.com

@CaseFail
Feature: Hotel Rate
  I as a user on the DX Hotels page
  I want to find the cheapest hotels
  To verify the rates charged to customers

Scenario Outline: Verify economic rate and total price to pay
Given the user enters the dx hotels application
When the user selects the options
| location   | checkIn   | checkOut   |
| <location> | <checkIn> | <checkOut> |
And choose the cheapest hotel
Then validate that the total <price> is correct

Examples:
  | location  | checkIn    | checkOut   | price |
  | Las Vegas | 10/21/2021 | 10/25/2021 | 800   |



