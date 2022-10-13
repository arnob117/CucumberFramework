$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechfiosLoginFromDB.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios login functionality validation",
  "description": "",
  "id": "techfios-login-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DbLoginFeature"
    }
  ]
});
formatter.before({
  "duration": 2810204600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 1330047701,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "1 User should be able to login with valid credential",
  "description": "",
  "id": "techfios-login-functionality-validation;1-user-should-be-able-to-login-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@DbScenario1"
    },
    {
      "line": 7,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters username from database",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters password from database",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on the signin button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_from_database()"
});
formatter.result({
  "duration": 1606245100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_password_from_database()"
});
formatter.result({
  "duration": 1168671999,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_the_signin_button()"
});
formatter.result({
  "duration": 2133205401,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 390111399,
  "status": "passed"
});
formatter.after({
  "duration": 815729999,
  "status": "passed"
});
});