# BSSAuto
A Page Object Model Based Selenium Framework (Pages are from a Web Based BSS Application )

Following Features Supported:

1. CustomizedHTMLLayout for log4j2 to capture screenshots at various stages, include logs files as link, capture ResultSet from Database to preserve DB state.

   Main purpose to add these feature was to used framework not just for regression testing but also for day to day activity and just analyze results from preserved data. and also results can be archived for later analysis.

2. Cucumber-JVM to make testcases more readable and better maintanability

   Sample Feature File:
   
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

3. Mavenized

   Using Maven made dependency management really invisible (though had to struggle a lot initially)
   
4. CustomPageFactory(based on TAF Framework by Varun Menon), which allows locator to be stored in separate  property file, and also let you have benefit of PageFactory.
   
4. Run a shell command on Unix/Linux Machine using telnet or SSH

5. Run Sql query to SQL Server and Oracle for a single value or a Resultset

6. Send SOAP Request using Axis2

7. Collect log from Unix Envionments based on predefined time given

8. File Transfer using SFTP 

Rather than being a ready to run framework, BSSAuto is a collection of functions and shares my approach to achieve different objectives like 
maintaining context for data share, effective use of page object model and page factory for high maintability, interacting with DB and Unix systems to fullfill backend tasks. 
It might be basic, but I hope it will be useful. 

