$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Regression.feature");
formatter.feature({
  "id": "regression",
  "description": "",
  "name": "Regression",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 10240623751,
  "status": "passed"
});
formatter.scenario({
  "id": "regression;create-prepaid-subscriber-and-gather-logs-screenshots-and-db-data",
  "description": "",
  "name": "create prepaid subscriber and gather logs screenshots and DB data",
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
  "name": "Create a SIM",
  "keyword": "When ",
  "line": 4
});
formatter.step({
  "name": "Create \"Prepaid\" \"Individual\" Account",
  "keyword": "And ",
  "line": 5
});
formatter.step({
  "name": "Start \"BSS\" LogCollector for \"60\" seconds",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "Create \"Individual\" \"Prepaid\" Subscriber with PP \"100026\" and Initial Balance/Credit Limit \"$1000.00\"",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "Collect Logs",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "Gather \"Transactions\" for \"Individual\" account",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "Gather \"Notes\" for \"Individual\" account",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "Gather \"UsageBalance\" for \"Individual\" account",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "Gather \"MobileNumberTab\" for \"Individual\" subscriber",
  "keyword": "And ",
  "line": 12
});
formatter.step({
  "name": "Gather \"BillingInfoTab\" for \"Individual\" subscriber",
  "keyword": "And ",
  "line": 13
});
formatter.step({
  "name": "Gather \"RatingTab\" for \"Individual\" subscriber",
  "keyword": "And ",
  "line": 14
});
formatter.step({
  "name": "Gather \"Transactions\" for \"Individual\" subscriber",
  "keyword": "And ",
  "line": 15
});
formatter.step({
  "name": "Gather \"Notes\" for \"Individual\" subscriber",
  "keyword": "And ",
  "line": 16
});
formatter.step({
  "name": "Gather \"UsageBalance\" for \"Individual\" subscriber",
  "keyword": "And ",
  "line": 17
});
formatter.step({
  "name": "Gather \"CallDetails\" for \"Individual\" subscriber",
  "keyword": "And ",
  "line": 18
});
formatter.step({
  "name": "GatherDBData using query \"getTransactions\" for \"Individual\" Account",
  "keyword": "And ",
  "line": 19
});
formatter.step({
  "name": "Verify that \"Individual\" subscriber is created in \"Activated\" state",
  "keyword": "Then ",
  "line": 20
});
formatter.match({
  "location": "RegressionSteps.Configurations()"
});
formatter.result({
  "duration": 372269389,
  "status": "passed"
});
formatter.match({
  "location": "RegressionSteps.createIndividualSIM()"
});
formatter.result({
  "duration": 25684333103,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prepaid",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 18
    }
  ],
  "location": "RegressionSteps.createGroupAccount(String,String)"
});
formatter.result({
  "duration": 24399014572,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BSS",
      "offset": 7
    },
    {
      "val": "60",
      "offset": 30
    }
  ],
  "location": "RegressionSteps.StartLogCollector(String,int)"
});
formatter.result({
  "duration": 2889639903,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Individual",
      "offset": 8
    },
    {
      "val": "Prepaid",
      "offset": 21
    },
    {
      "val": "100026",
      "offset": 50
    },
    {
      "val": "$1000.00",
      "offset": 92
    }
  ],
  "location": "RegressionSteps.createSubscriber(String,String,String,String)"
});
formatter.result({
  "duration": 55471412172,
  "status": "passed"
});
formatter.match({
  "location": "RegressionSteps.CollectLogs()"
});
formatter.result({
  "duration": 15892372685,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Transactions",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.GatherAccountData(String,String)"
});
formatter.result({
  "duration": 11777137554,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Notes",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 20
    }
  ],
  "location": "RegressionSteps.GatherAccountData(String,String)"
});
formatter.result({
  "duration": 10835478874,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UsageBalance",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.GatherAccountData(String,String)"
});
formatter.result({
  "duration": 10381385899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MobileNumberTab",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 30
    }
  ],
  "location": "RegressionSteps.GatherSubscriberData(String,String)"
});
formatter.result({
  "duration": 12778407826,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BillingInfoTab",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 29
    }
  ],
  "location": "RegressionSteps.GatherSubscriberData(String,String)"
});
formatter.result({
  "duration": 12843409192,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RatingTab",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 24
    }
  ],
  "location": "RegressionSteps.GatherSubscriberData(String,String)"
});
formatter.result({
  "duration": 13019800136,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Transactions",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.GatherSubscriberData(String,String)"
});
formatter.result({
  "duration": 14846733688,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Notes",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 20
    }
  ],
  "location": "RegressionSteps.GatherSubscriberData(String,String)"
});
formatter.result({
  "duration": 14946811215,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UsageBalance",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.GatherSubscriberData(String,String)"
});
formatter.result({
  "duration": 13464736338,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CallDetails",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 26
    }
  ],
  "location": "RegressionSteps.GatherSubscriberData(String,String)"
});
formatter.result({
  "duration": 13618759365,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "getTransactions",
      "offset": 26
    },
    {
      "val": "Individual",
      "offset": 48
    }
  ],
  "location": "RegressionSteps.GatherDBData(String,String)"
});
formatter.result({
  "duration": 869769109,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Individual",
      "offset": 13
    },
    {
      "val": "Activated",
      "offset": 51
    }
  ],
  "location": "RegressionSteps.verifySubscriberState(String,String)"
});
formatter.result({
  "duration": 180413339,
  "status": "passed"
});
formatter.after({
  "duration": 61975,
  "status": "passed"
});
formatter.before({
  "duration": 301976,
  "status": "passed"
});
formatter.scenario({
  "id": "regression;create-postpaid-subscriber-and-gather-logs-screenshots-and-db-data",
  "description": "",
  "name": "create Postpaid subscriber and gather logs screenshots and DB data",
  "keyword": "Scenario",
  "line": 23,
  "type": "scenario"
});
formatter.step({
  "name": "Configurations",
  "keyword": "Given ",
  "line": 24
});
formatter.step({
  "name": "Create a SIM",
  "keyword": "When ",
  "line": 25
});
formatter.step({
  "name": "Create \"Postpaid\" \"Individual\" Account",
  "keyword": "And ",
  "line": 26
});
formatter.step({
  "name": "Start \"BSS\" LogCollector for \"60\" seconds",
  "keyword": "And ",
  "line": 27
});
formatter.step({
  "name": "Create \"Individual\" \"Postpaid\" Subscriber with PP \"100062\" and Initial Balance/Credit Limit \"$1000.00\"",
  "keyword": "And ",
  "line": 28
});
formatter.step({
  "name": "Collect Logs",
  "keyword": "And ",
  "line": 29
});
formatter.step({
  "name": "Gather \"Transactions\" for \"Individual\" account",
  "keyword": "And ",
  "line": 30
});
formatter.step({
  "name": "Gather \"Notes\" for \"Individual\" account",
  "keyword": "And ",
  "line": 31
});
formatter.step({
  "name": "Gather \"UsageBalance\" for \"Individual\" account",
  "keyword": "And ",
  "line": 32
});
formatter.step({
  "name": "Gather \"MobileNumberTab\" for \"Individual\" subscriber",
  "keyword": "And ",
  "line": 33
});
formatter.step({
  "name": "Gather \"BillingInfoTab\" for \"Individual\" subscriber",
  "keyword": "And ",
  "line": 34
});
formatter.step({
  "name": "Gather \"RatingTab\" for \"Individual\" subscriber",
  "keyword": "And ",
  "line": 35
});
formatter.step({
  "name": "Gather \"Transactions\" for \"Individual\" subscriber",
  "keyword": "And ",
  "line": 36
});
formatter.step({
  "name": "Gather \"Notes\" for \"Individual\" subscriber",
  "keyword": "And ",
  "line": 37
});
formatter.step({
  "name": "Gather \"UsageBalance\" for \"Individual\" subscriber",
  "keyword": "And ",
  "line": 38
});
formatter.step({
  "name": "Gather \"CallDetails\" for \"Individual\" subscriber",
  "keyword": "And ",
  "line": 39
});
formatter.step({
  "name": "GatherDBData using query \"getTransactions\" for \"Individual\" Account",
  "keyword": "And ",
  "line": 40
});
formatter.step({
  "name": "Verify that \"Individual\" subscriber is created in \"Activated\" state",
  "keyword": "Then ",
  "line": 41
});
formatter.match({
  "location": "RegressionSteps.Configurations()"
});
formatter.result({
  "duration": 57632,
  "status": "passed"
});
formatter.match({
  "location": "RegressionSteps.createIndividualSIM()"
});
formatter.result({
  "duration": 9273532398,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Postpaid",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 19
    }
  ],
  "location": "RegressionSteps.createGroupAccount(String,String)"
});
formatter.result({
  "duration": 23322306416,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BSS",
      "offset": 7
    },
    {
      "val": "60",
      "offset": 30
    }
  ],
  "location": "RegressionSteps.StartLogCollector(String,int)"
});
formatter.result({
  "duration": 2266950511,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Individual",
      "offset": 8
    },
    {
      "val": "Postpaid",
      "offset": 21
    },
    {
      "val": "100062",
      "offset": 51
    },
    {
      "val": "$1000.00",
      "offset": 93
    }
  ],
  "location": "RegressionSteps.createSubscriber(String,String,String,String)"
});
formatter.result({
  "duration": 53004849375,
  "status": "passed"
});
formatter.match({
  "location": "RegressionSteps.CollectLogs()"
});
formatter.result({
  "duration": 14981362767,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Transactions",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.GatherAccountData(String,String)"
});
formatter.result({
  "duration": 11871063854,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Notes",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 20
    }
  ],
  "location": "RegressionSteps.GatherAccountData(String,String)"
});
formatter.result({
  "duration": 9334506236,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UsageBalance",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.GatherAccountData(String,String)"
});
formatter.result({
  "duration": 10420143796,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MobileNumberTab",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 30
    }
  ],
  "location": "RegressionSteps.GatherSubscriberData(String,String)"
});
formatter.result({
  "duration": 10954641663,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BillingInfoTab",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 29
    }
  ],
  "location": "RegressionSteps.GatherSubscriberData(String,String)"
});
formatter.result({
  "duration": 12531883902,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RatingTab",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 24
    }
  ],
  "location": "RegressionSteps.GatherSubscriberData(String,String)"
});
formatter.result({
  "duration": 12470314402,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Transactions",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.GatherSubscriberData(String,String)"
});
formatter.result({
  "duration": 17962903167,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Notes",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 20
    }
  ],
  "location": "RegressionSteps.GatherSubscriberData(String,String)"
});
formatter.result({
  "duration": 6633522624,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UsageBalance",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.GatherSubscriberData(String,String)"
});
formatter.result({
  "duration": 9261437578,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CallDetails",
      "offset": 8
    },
    {
      "val": "Individual",
      "offset": 26
    }
  ],
  "location": "RegressionSteps.GatherSubscriberData(String,String)"
});
formatter.result({
  "duration": 5816574008,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "getTransactions",
      "offset": 26
    },
    {
      "val": "Individual",
      "offset": 48
    }
  ],
  "location": "RegressionSteps.GatherDBData(String,String)"
});
formatter.result({
  "duration": 868976867,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Individual",
      "offset": 13
    },
    {
      "val": "Activated",
      "offset": 51
    }
  ],
  "location": "RegressionSteps.verifySubscriberState(String,String)"
});
formatter.result({
  "duration": 176139100,
  "status": "passed"
});
formatter.after({
  "duration": 21316,
  "status": "passed"
});
formatter.before({
  "duration": 66711,
  "status": "passed"
});
formatter.scenario({
  "id": "regression;create-group-subscriber-and-gather-logs-screenshots-and-db-data",
  "description": "",
  "name": "create Group subscriber and gather logs screenshots and DB data",
  "keyword": "Scenario",
  "line": 43,
  "type": "scenario"
});
formatter.step({
  "name": "Configurations",
  "keyword": "Given ",
  "line": 44
});
formatter.step({
  "name": "Create \"Hybrid\" \"Group\" Account",
  "keyword": "When ",
  "line": 45
});
formatter.step({
  "name": "Create \"first\" SIM",
  "keyword": "And ",
  "line": 46
});
formatter.step({
  "name": "Create \"first\" \"Postpaid\" \"NonResponsible\" Sub Account",
  "keyword": "And ",
  "line": 47
});
formatter.step({
  "name": "Create \"first\" \"Postpaid\" Subscriber with PP \"100062\" and Initial Balance/Credit Limit \"$1000.00\"",
  "keyword": "And ",
  "line": 48
});
formatter.step({
  "name": "Create \"second\" SIM",
  "keyword": "And ",
  "line": 49
});
formatter.step({
  "name": "Create \"second\" \"Prepaid\" \"Responsible\" Sub Account",
  "keyword": "And ",
  "line": 50
});
formatter.step({
  "name": "Create \"second\" \"Prepaid\" Subscriber with PP \"100026\" and Initial Balance/Credit Limit \"$1000.00\"",
  "keyword": "And ",
  "line": 51
});
formatter.step({
  "name": "Collect Logs",
  "keyword": "And ",
  "line": 52
});
formatter.step({
  "name": "Gather \"Transactions\" for \"Group\" account",
  "keyword": "And ",
  "line": 53
});
formatter.step({
  "name": "Gather \"Notes\" for \"first\" account",
  "keyword": "And ",
  "line": 54
});
formatter.step({
  "name": "Gather \"UsageBalance\" for \"second\" account",
  "keyword": "And ",
  "line": 55
});
formatter.step({
  "name": "Gather \"MobileNumberTab\" for \"first\" subscriber",
  "keyword": "And ",
  "line": 56
});
formatter.step({
  "name": "Gather \"BillingInfoTab\" for \"second\" subscriber",
  "keyword": "And ",
  "line": 57
});
formatter.step({
  "name": "GatherDBData using query \"getTransactions\" for \"Group\" Account",
  "keyword": "And ",
  "line": 58
});
formatter.step({
  "name": "Verify that \"first\" subscriber is created in \"Activated\" state",
  "keyword": "Then ",
  "line": 59
});
formatter.step({
  "name": "Verify that \"second\" subscriber is created in \"Activated\" state",
  "keyword": "And ",
  "line": 60
});
formatter.match({
  "location": "RegressionSteps.Configurations()"
});
formatter.result({
  "duration": 23684,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hybrid",
      "offset": 8
    },
    {
      "val": "Group",
      "offset": 17
    }
  ],
  "location": "RegressionSteps.createGroupAccount(String,String)"
});
formatter.result({
  "duration": 11714806602,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "first",
      "offset": 8
    }
  ],
  "location": "RegressionSteps.createSIM(String)"
});
formatter.result({
  "duration": 6589059162,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "first",
      "offset": 8
    },
    {
      "val": "Postpaid",
      "offset": 16
    },
    {
      "val": "NonResponsible",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.createSubAccount(String,String,String)"
});
formatter.result({
  "duration": 9636563303,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "first",
      "offset": 8
    },
    {
      "val": "Postpaid",
      "offset": 16
    },
    {
      "val": "100062",
      "offset": 46
    },
    {
      "val": "$1000.00",
      "offset": 88
    }
  ],
  "location": "RegressionSteps.createSubscriber(String,String,String,String)"
});
formatter.result({
  "duration": 27638962924,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "second",
      "offset": 8
    }
  ],
  "location": "RegressionSteps.createSIM(String)"
});
formatter.result({
  "duration": 5134911713,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "second",
      "offset": 8
    },
    {
      "val": "Prepaid",
      "offset": 17
    },
    {
      "val": "Responsible",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.createSubAccount(String,String,String)"
});
formatter.result({
  "duration": 12517334987,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "second",
      "offset": 8
    },
    {
      "val": "Prepaid",
      "offset": 17
    },
    {
      "val": "100026",
      "offset": 46
    },
    {
      "val": "$1000.00",
      "offset": 88
    }
  ],
  "location": "RegressionSteps.createSubscriber(String,String,String,String)"
});
formatter.result({
  "duration": 33137943707,
  "status": "passed"
});
formatter.match({
  "location": "RegressionSteps.CollectLogs()"
});
formatter.result({
  "duration": 47368,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Transactions",
      "offset": 8
    },
    {
      "val": "Group",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.GatherAccountData(String,String)"
});
formatter.result({
  "duration": 1694606989,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Notes",
      "offset": 8
    },
    {
      "val": "first",
      "offset": 20
    }
  ],
  "location": "RegressionSteps.GatherAccountData(String,String)"
});
formatter.result({
  "duration": 4757213076,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UsageBalance",
      "offset": 8
    },
    {
      "val": "second",
      "offset": 27
    }
  ],
  "location": "RegressionSteps.GatherAccountData(String,String)"
});
formatter.result({
  "duration": 4076614209,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MobileNumberTab",
      "offset": 8
    },
    {
      "val": "first",
      "offset": 30
    }
  ],
  "location": "RegressionSteps.GatherSubscriberData(String,String)"
});
formatter.result({
  "duration": 7607153627,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BillingInfoTab",
      "offset": 8
    },
    {
      "val": "second",
      "offset": 29
    }
  ],
  "location": "RegressionSteps.GatherSubscriberData(String,String)"
});
formatter.result({
  "duration": 6145007571,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "getTransactions",
      "offset": 26
    },
    {
      "val": "Group",
      "offset": 48
    }
  ],
  "location": "RegressionSteps.GatherDBData(String,String)"
});
formatter.result({
  "duration": 807223813,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "first",
      "offset": 13
    },
    {
      "val": "Activated",
      "offset": 46
    }
  ],
  "location": "RegressionSteps.verifySubscriberState(String,String)"
});
formatter.result({
  "duration": 181358741,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "second",
      "offset": 13
    },
    {
      "val": "Activated",
      "offset": 47
    }
  ],
  "location": "RegressionSteps.verifySubscriberState(String,String)"
});
formatter.result({
  "duration": 172632628,
  "status": "passed"
});
formatter.after({
  "duration": 56842,
  "status": "passed"
});
});