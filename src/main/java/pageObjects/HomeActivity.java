package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeActivity {

    public AndroidDriver driver;

    public HomeActivity(AndroidDriver driver)
    {
        this.driver  = driver;
    }

    public void chooseFundAllocationScreen(String screenName)
    {
        driver.findElement(By.id(""+screenName+"")).click();
    }
}
