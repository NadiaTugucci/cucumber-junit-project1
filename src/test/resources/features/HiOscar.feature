@task
Feature:   hioscar.com care options web app testing
Background:  Open Chrome browser

  Scenario: hioscar.com care options web app testing
Given User is on the homepage of HiOscar

When Click Search network
And From Coverage year dropdown Select "2023" option
And From Coverage access dropdown Select Employer-provided option
And  From Network partner dropdown Select Oscar option
And From Coverage area dropdown Select New Jersey
And Click Continue button
Then Verify title contains Oscar