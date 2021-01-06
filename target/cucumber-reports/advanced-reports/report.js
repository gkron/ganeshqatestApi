$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/functionalTests/petstore.feature");
formatter.feature({
  "name": "Verify Pet store API functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify user should be able to get,add,update and delete pet",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am able to get pet by id",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.i_am_able_to_get_pet_by_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add a new pet",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.i_add_a_new_pet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see new pet added in list",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.i_should_see_new_pet_added_in_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I update a status of existing pet",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.i_update_a_status_of_existing_pet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see status updated",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.i_should_see_status_updated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I remove a pet FROM LIST",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.i_remove_a_pet_FROM_LIST()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see pet removed from list",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.i_should_see_pet_removed_from_list()"
});
formatter.result({
  "status": "passed"
});
});