
Feature: Etsy verify Title Verification
  User story:As a user I am on the etsy page
  I should be able to verify if the title is as expected

  Background:
    Given User is on etsy search page

  Scenario:Search Etsy Title Verification
   //  Given user is on etsy search page
    Then  user sees title is as expected

    Scenario:Etsy Search Functionality Title Verification (without parameterization)
    //  Given user is on etsy search page
      When user types Wooden Spoon in the search box
      And User clicks search button
      Then User sees Wooden Spoon is in the title

      Scenario:Etsy Search Functionality Title Verification (with parameterization)
      //  Given user is on etsy search page
        When User types "Wooden Spoon" in the search box
        And User clicks search button
        Then User sees "Wooden spoon" is in the title



