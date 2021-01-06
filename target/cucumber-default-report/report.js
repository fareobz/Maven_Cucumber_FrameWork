$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/amazonFunc.feature");
formatter.feature({
  "name": "Checking amazon search functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to see books available in different stores",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to amazon.com",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cucumber_maven.steps.AmazonFuncSteps.user_is_navigated_to_amazon_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"Books\" from the searchFropDownBox",
  "keyword": "And "
});
formatter.match({
  "location": "com.cucumber_maven.steps.AmazonFuncSteps.user_selects_from_the_searchFropDownBox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user inputs \"Harry Potter\" in the search box",
  "keyword": "When "
});
formatter.match({
  "location": "com.cucumber_maven.steps.AmazonFuncSteps.user_inputs_in_the_search_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees \"Harry Pooter\" book available in different stores",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cucumber_maven.steps.AmazonFuncSteps.the_user_sees_book_available_in_different_stores(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "User should be able to see books available in different stores");
formatter.after({
  "status": "passed"
});
});