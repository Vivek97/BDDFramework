$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Main.feature");
formatter.feature({
  "line": 1,
  "name": "Login to aplication",
  "description": "",
  "id": "login-to-aplication",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "xyz",
  "description": "",
  "id": "login-to-aplication;xyz",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Login as user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "sdf",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "sdf1",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "sdf2",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.login_as_user()"
});
formatter.result({
  "duration": 5912003806,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.sdf()"
});
formatter.result({
  "duration": 11176707393,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.sdf1()"
});
formatter.result({
  "duration": 35766,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.sdf2()"
});
formatter.result({
  "duration": 1419430203,
  "status": "passed"
});
});