import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.CommonFunctions;

public class Hooks {

    CommonFunctions commonFunctions = new CommonFunctions();

    @Before
    public void beforeTest() throws Exception {
        commonFunctions.openSession();
    }

    @After
    public void afterTest() {
        commonFunctions.closeSession();
    }
}
