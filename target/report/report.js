$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Regression.feature");
formatter.feature({
  "id": "regression",
  "description": "",
  "name": "Regression",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 7919382865,
  "status": "passed"
});
formatter.scenario({
  "id": "regression;create-sim,-create-prepaid-and-postpaid-subscriber-and-gather-logs,-screenshots-and-db-data",
  "description": "",
  "name": "create SIM, create Prepaid and Postpaid subscriber and gather logs, screenshots and DB data",
  "keyword": "Scenario",
  "line": 2,
  "type": "scenario"
});
formatter.step({
  "name": "Configurations",
  "keyword": "Given ",
  "line": 3
});
formatter.step({
  "name": "Create SIM",
  "keyword": "When ",
  "line": 4
});
formatter.step({
  "name": "Create Account",
  "keyword": "And ",
  "line": 5
});
formatter.step({
  "name": "Start LogCollector",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "Create \"Prepaid\" Subscriber with PP \"100026\" and initial Balance \"$1000.00\"",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "Collect Logs",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "Gather \"Account\" level \"Transactions\"",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "Gather \"Account\" level \"Notes\"",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "Gather \"Account\" level \"UsageBalance\"",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "Gather \"Subscriber\" level \"MobileNumberTab\"",
  "keyword": "And ",
  "line": 12
});
formatter.step({
  "name": "Gather \"Subscriber\" level \"BillingInfoTab\"",
  "keyword": "And ",
  "line": 13
});
formatter.step({
  "name": "Gather \"Subscriber\" level \"RatingTab\"",
  "keyword": "And ",
  "line": 14
});
formatter.step({
  "name": "Gather \"Subscriber\" level \"Transactions\"",
  "keyword": "And ",
  "line": 15
});
formatter.step({
  "name": "Gather \"Subscriber\" level \"Notes\"",
  "keyword": "And ",
  "line": 16
});
formatter.step({
  "name": "Gather \"Subscriber\" level \"UsageBalance\"",
  "keyword": "And ",
  "line": 17
});
formatter.step({
  "name": "Gather \"Subscriber\" level \"CallDetails\"",
  "keyword": "And ",
  "line": 18
});
formatter.step({
  "name": "GatherDBData using query \"getTransactions\"",
  "keyword": "And ",
  "line": 19
});
formatter.step({
  "name": "Verify that subscriber created in \"Activated\" state",
  "keyword": "Then ",
  "line": 20
});
formatter.match({
  "location": "RegressionSteps.Configurations()"
});
formatter.result({
  "duration": 74836184,
  "status": "passed"
});
formatter.match({
  "location": "RegressionSteps.createSIM()"
});
formatter.result({
  "duration": 29326160138,
  "status": "passed"
});
formatter.match({
  "location": "RegressionSteps.createAccount()"
});
formatter.result({
  "duration": 23636677167,
  "status": "passed"
});
formatter.match({
  "location": "RegressionSteps.StartLogCollector()"
});
formatter.result({
  "duration": 3064241391,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prepaid",
      "offset": 8
    },
    {
      "val": "100026",
      "offset": 37
    },
    {
      "val": "$1000.00",
      "offset": 66
    }
  ],
  "location": "RegressionSteps.createSubscriber(String,String,String)"
});
formatter.result({
  "duration": 110897306696,
  "status": "passed"
});
formatter.match({
  "location": "RegressionSteps.CollectLogs()"
});
formatter.result({
  "duration": 5487525461,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account",
      "offset": 8
    },
    {
      "val": "Transactions",
      "offset": 24
    }
  ],
  "location": "RegressionSteps.GatherData(String,String)"
});
formatter.result({
  "duration": 14241457455,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account",
      "offset": 8
    },
    {
      "val": "Notes",
      "offset": 24
    }
  ],
  "location": "RegressionSteps.GatherData(String,String)"
});
formatter.result({
  "duration": 14372524987,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account",
      "offset": 8
    },
    {
      "val": "UsageBalance",
      "offset": 24
    }
  ],
  "location": "RegressionSteps.GatherData(String,String)"
});
formatter.result({
  "duration": 9365934031,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Subscriber",
      "offset": 8
    },
    {
      "val": "MobileNumberTab",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.GatherData(String,String)"
});
formatter.result({
  "duration": 14601211849,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Subscriber",
      "offset": 8
    },
    {
      "val": "BillingInfoTab",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.GatherData(String,String)"
});
formatter.result({
  "duration": 10617619566,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Subscriber",
      "offset": 8
    },
    {
      "val": "RatingTab",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.GatherData(String,String)"
});
formatter.result({
  "duration": 10700052105,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Subscriber",
      "offset": 8
    },
    {
      "val": "Transactions",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.GatherData(String,String)"
});
formatter.result({
  "duration": 15119604314,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Subscriber",
      "offset": 8
    },
    {
      "val": "Notes",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.GatherData(String,String)"
});
formatter.result({
  "duration": 13908412282,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Subscriber",
      "offset": 8
    },
    {
      "val": "UsageBalance",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.GatherData(String,String)"
});
formatter.result({
  "duration": 11490444160,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Subscriber",
      "offset": 8
    },
    {
      "val": "CallDetails",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.GatherData(String,String)"
});
formatter.result({
  "duration": 16504345286,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "getTransactions",
      "offset": 26
    }
  ],
  "location": "RegressionSteps.GatherDBData(String)"
});
formatter.result({
  "duration": 1425903163,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Activated",
      "offset": 35
    }
  ],
  "location": "RegressionSteps.verifySubscriberState(String)"
});
formatter.result({
  "duration": 341989168,
  "status": "passed"
});
formatter.after({
  "duration": 1277966068,
  "status": "passed"
});
});