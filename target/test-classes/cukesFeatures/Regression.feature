Feature: Regression
Scenario: create prepaid subscriber and gather logs screenshots and DB data
	Given Configurations
	When Create a SIM
	And Create "Prepaid" "Individual" Account
	And Start "BSS" LogCollector for "60" seconds
    And Create "Individual" "Prepaid" Subscriber with PP "100026" and Initial Balance/Credit Limit "$1000.00" 
	And Collect Logs
	And Gather "Transactions" for "Individual" account 
	And Gather "Notes" for "Individual" account 
	And Gather "UsageBalance" for "Individual" account 
	And Gather "MobileNumberTab" for "Individual" subscriber
	And Gather "BillingInfoTab" for "Individual" subscriber
	And Gather "RatingTab" for "Individual" subscriber
	And Gather "Transactions" for "Individual" subscriber
	And Gather "Notes" for "Individual" subscriber
	And Gather "UsageBalance" for "Individual" subscriber
	And Gather "CallDetails" for "Individual" subscriber
	And GatherDBData using query "getTransactions" for "Individual" Account
	Then Verify that "Individual" subscriber is created in "Activated" state

	
Scenario: create Postpaid subscriber and gather logs screenshots and DB data
	Given Configurations
	When Create a SIM
	And Create "Postpaid" "Individual" Account
	And Start "BSS" LogCollector for "60" seconds
    And Create "Individual" "Postpaid" Subscriber with PP "100062" and Initial Balance/Credit Limit "$1000.00" 
	And Collect Logs
	And Gather "Transactions" for "Individual" account 
	And Gather "Notes" for "Individual" account 
	And Gather "UsageBalance" for "Individual" account 
	And Gather "MobileNumberTab" for "Individual" subscriber
	And Gather "BillingInfoTab" for "Individual" subscriber
	And Gather "RatingTab" for "Individual" subscriber
	And Gather "Transactions" for "Individual" subscriber
	And Gather "Notes" for "Individual" subscriber
	And Gather "UsageBalance" for "Individual" subscriber
	And Gather "CallDetails" for "Individual" subscriber
	And GatherDBData using query "getTransactions" for "Individual" Account
	Then Verify that "Individual" subscriber is created in "Activated" state

Scenario: create Group subscriber and gather logs screenshots and DB data
	Given Configurations
	When Create "Hybrid" "Group" Account 
	And Create "first" SIM
	And Create "first" "Postpaid" "NonResponsible" Sub Account
    And Create "first" "Postpaid" Subscriber with PP "100062" and Initial Balance/Credit Limit "$1000.00" 
    And Create "second" SIM
    And Create "second" "Prepaid" "Responsible" Sub Account
    And Create "second" "Prepaid" Subscriber with PP "100026" and Initial Balance/Credit Limit "$1000.00" 
	And Collect Logs
	And Gather "Transactions" for "Group" account 
	And Gather "Notes" for "first" account 
	And Gather "UsageBalance" for "second" account 
	And Gather "MobileNumberTab" for "first" subscriber
	And Gather "BillingInfoTab" for "second" subscriber
	And GatherDBData using query "getTransactions" for "Group" Account
	Then Verify that "first" subscriber is created in "Activated" state
	And Verify that "second" subscriber is created in "Activated" state