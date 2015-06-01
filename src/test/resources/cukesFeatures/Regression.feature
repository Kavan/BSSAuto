Feature: Regression
Scenario: create SIM, create Prepaid and Postpaid subscriber and gather logs, screenshots and DB data
	Given Configurations
	When Create SIM
	And Create Account
	And Start LogCollector
    And Create "Prepaid" Subscriber with PP "100026" and initial Balance "$1000.00" 
	And Collect Logs
	And Gather "Account" level "Transactions"
	And Gather "Account" level "Notes"
	And Gather "Account" level "UsageBalance"
	And Gather "Subscriber" level "MobileNumberTab"
	And Gather "Subscriber" level "BillingInfoTab"
	And Gather "Subscriber" level "RatingTab"
	And Gather "Subscriber" level "Transactions"
	And Gather "Subscriber" level "Notes"
	And Gather "Subscriber" level "UsageBalance"
	And Gather "Subscriber" level "CallDetails"
	And GatherDBData using query "getTransactions" 	
	Then Verify that subscriber created in "Activated" state
