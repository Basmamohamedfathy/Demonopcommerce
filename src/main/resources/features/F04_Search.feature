@smoke
Feature: search
  Scenario:Logged User could search for any product
     Given user login successfully
     And user enter any product name in search field
     When user click search button
     Then search done successfully