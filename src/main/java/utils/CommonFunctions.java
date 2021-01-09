package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Properties;

public class CommonFunctions {

    public final static String AppPackage = "io.moneybox"; //assuming the package name
    public final static String AppActivity = ".MainActivity"; //assuming the Activity name
    public final static String DeviceUDID = "";
    public static AndroidDriver driver;

    public void openSession() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.UDID, DeviceUDID);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, AppPackage);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, AppActivity);

        driver = new AndroidDriver(new URL(readPropertyFile("appiumserverurl")), capabilities);
    }

    public void closeSession()
    {
        driver.quit();
    }

    public String readPropertyFile(String key) throws Exception
    {
        FileInputStream inputStream = new FileInputStream(FilePaths.ConfigFilePath);
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties.getProperty(key);
    }

    public static void takeScreenShot(String screenName) throws Exception
    {
        TakesScreenshot screenshot = ((TakesScreenshot)driver);
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(FilePaths.ErrorShotsPath + "/"+screenName+ "_"+ getCurrentTime()+ ".png");
        FileUtils.copyFile(srcFile, destFile);
    }

    public static String getCurrentTime()
    {
        Date date = new Date();
        long time = date.getTime();
        Timestamp ts  = new Timestamp(time);
        return ts.toString();
    }

}
