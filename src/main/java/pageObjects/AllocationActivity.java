package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.CommonFunctions;

public class AllocationActivity {


    public AndroidDriver driver;

    public AllocationActivity(AndroidDriver driver)
    {
        this.driver =  driver;
        PageFactory.initElements(driver, this);
    }

    @AndroidFindBy(id="")
    public AndroidElement cashFundAllocation;

    @AndroidFindBy(id="")
    public AndroidElement globalSharesFundAllocation;

    @AndroidFindBy(id="")
    public AndroidElement propertyFundsAllocation;


    public void MoveAndValidateAllocationTab(String tabName) throws Exception
    {
        WebElement tab = driver.findElement(By.id("loatorValue"+tabName+"")); //assuming tab name forms part of locator
        tab.click();
        try {
            Assert.assertEquals(tab.getText(), tabName);
        }catch(Exception e )
        {
            CommonFunctions.takeScreenShot(tabName);
        }
    }

    public void validateFundAllocations(String cashFunds, String globalShares,String propertyFunds )
    {
            Assert.assertEquals(cashFundAllocation.getText(), cashFunds);
            Assert.assertEquals(globalSharesFundAllocation.getText(), globalShares);
            Assert.assertEquals(propertyFundsAllocation.getText(), propertyFunds);

    }


}
