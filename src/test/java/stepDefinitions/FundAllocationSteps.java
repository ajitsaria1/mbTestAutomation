package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AllocationActivity;
import pageObjects.HomeActivity;
import utils.CommonFunctions;

public class FundAllocationSteps extends CommonFunctions {

    AllocationActivity allocationActivity = new AllocationActivity(driver);
    HomeActivity homeActivity = new HomeActivity(driver);

    @When("^I navigate to \"([^\"]*)\" screen$")
    public void navigateToAllocationScreen(String fundAllocation) {
        //Assuming fund allocation screen could be reached from home screen
        homeActivity.chooseFundAllocationScreen(fundAllocation);
    }

    @When("^I choose \"([^\"]*)\" Tab$")
    public void chooseAllocationTab(String allocationTabType) {
        allocationActivity.MoveAndValidateAllocationTab(allocationTabType);
    }

    @Then("^I should see \"([^\"]*)\", \"([^\"]*)\" \"([^\"]*)\" Allocation$")
    public void viewAllocationPercent(String cashFunds, String globalShares, String propertyFunds) {
        allocationActivity.validateFundAllocations(cashFunds, globalShares, propertyFunds);
    }

}
