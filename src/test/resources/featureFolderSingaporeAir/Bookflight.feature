Feature: This feature is for fluight booking functionality

@Bookflight

Scenario: verify user can search the available flights in given dates

Given Launch "<URL>"
When user validate homepage and scrolldown and verify flight booking is displaying without any broken elements
When user click book flights radio button, enter depart city name, click correct pop up airport
And user enter arrival city name and click correct popup airport
 