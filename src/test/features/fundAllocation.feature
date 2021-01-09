Feature: Fund Allocation
  As a user
  I should be viewing portfolio for Cautions, Balanced and Adventurous investments

  Background:
    Given I launch MoneyBox APP

  @allocation
  Scenario Outline: User validates Fund Allocations on Cautious Investments

    When  I navigate to "Fund Allocation" screen
    And I choose "<Allocation Tab>" Tab
    Then I should see "<Cash Fund>", "<Global Shares Fund>" "<Property Fund>" Allocation

    Examples:
      | Allocation Tab | Cash Fund | Global Shares Fund | Property Fund |
      | Cautious       | 85%       | 10%                | 5%            |
      | Balanced       | 30%       | 25%                | 45%           |
      | Adventurous    | 5%        | 60%                | 35%           |

