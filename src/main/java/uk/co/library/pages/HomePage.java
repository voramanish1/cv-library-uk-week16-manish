package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import uk.co.library.utility.Utility;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleField;

    @CacheLookup
    @FindBy(id = "location")
    WebElement locationField;

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;

    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitleField, jobTitle);
        log.info("Enter Job Title " + jobTitleField.toString());

    }

    public void iFrame() {
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptPrivacy);
        log.info("iFrame: " + acceptPrivacy.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement acceptPrivacy;

    public void enterLocation(String location) {
       log.info("Enter Location " + locationField.toString());
        sendTextToElement(locationField, location);
    }

    public void selectDistance(String distance) {
        log.info("Select Distance " + locationField.toString());
        sendTextToElement(distanceDropDown, distance);
    }

    public void clickOnMoreSearchOptionLink() {
        log.info("Enter Location " + moreSearchOptionsLink.toString());
        clickOnElement(moreSearchOptionsLink);

    }

    public void enterMinSalary(String minSalary) {
      log.info("Enter Min Salary " + salaryMin.toString());
        sendTextToElement(salaryMin, minSalary);

    }

    public void enterMaxSalary(String maxSalary) {
       log.info("Enter Maz Salary " + salaryMax.toString());
        sendTextToElement(salaryMax, maxSalary);

    }

    public void selectSalaryType(String sType) {
        log.info("Select Salary Type " + salaryTypeDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);

    }

    public void selectJobType(String jobType) {
        log.info("Select Job Type " + jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);

    }

    public void clickOnFindJobsButton() {
        log.info("Click on Find Jobs Button " + findJobsBtn.toString());
        clickOnElement(findJobsBtn);

    }
}
