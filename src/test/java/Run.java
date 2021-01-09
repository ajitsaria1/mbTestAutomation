import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import utils.FilePaths;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",
        tags = {"@allocation"},
        dryRun = false,
        plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/report/tsr.html")
public class Run {

    @AfterClass
    public static void generateReport() {
        Reporter.loadXMLConfig(FilePaths.XmlFilePath);
    }
}
