package uk.co.library.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.Result;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class HomePageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I accept privacy$")
    public void iAcceptPrivacy() {
        new HomePage().iFrame();
    }

    @And("^I enter JobTitle in the jobTitle Field \"([^\"]*)\"$")
    public void iEnterJobTitleInTheJobTitleField(String jobTitle) {
       new HomePage().enterJobTitle(jobTitle);
    }

    @And("^I enter Location in the Location Field \"([^\"]*)\"$")
    public void iEnterLocationInTheLocationField(String location){
        new HomePage().enterLocation(location);
    }

    @And("^I select distance from DropDown List \"([^\"]*)\"$")
    public void iSelectDistanceFromDropDownList(String distance){
        new HomePage().selectDistance(distance);
    }

    @And("^I click on more search option$")
    public void iClickOnMoreSearchOption() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I enter MinSalary \"([^\"]*)\"$")
    public void iEnterMinSalary(String salaryMin) {
       new HomePage().enterMinSalary(salaryMin);
    }

    @And("^I enter MaxSalary \"([^\"]*)\"$")
    public void iEnterMaxSalary(String salaryMax){
        new HomePage().enterMaxSalary(salaryMax);
    }

    @And("^I select Salary Type \"([^\"]*)\"$")
    public void iSelectSalaryType(String salaryType){
        new HomePage().selectSalaryType(salaryType);
    }

    @And("^I select Job Type \"([^\"]*)\"$")
    public void iSelectJobType(String jobType){
       new HomePage().selectJobType(jobType);
    }

    @Then("^I click On Find Job Button$")
    public void iClickOnFindJobButton() {
        new HomePage().clickOnFindJobsButton();
    }


    @Then("^I verify the Result \"([^\"]*)\"$")
    public void iVerifyTheResult(String result){
       new ResultPage().verifyTheResults(result);
    }
}

