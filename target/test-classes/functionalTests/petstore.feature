Feature: Verify Pet store API functionality

Scenario:Verify user should be able to get,add,update and delete pet
Given I am able to get pet by id
When I add a new pet
Then I should see new pet added in list
When I update a status of existing pet
Then I should see status updated
When I remove a pet FROM LIST
Then I should see pet removed from list



