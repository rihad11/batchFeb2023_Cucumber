Feature: login feature

  Background:
    Given user in login page


  Scenario: test login 1

    When user enters uname and pass
    And user click submit
    Then user successfully login

  Scenario: test login 2

    When user enters "raki.hasan" and "Abc!234"
    And user click submit
    Then user successfully login



