package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import session.Session;

public class BaseDemoQA {

    @BeforeEach
    public void openBrowser() {
        Session.getInstance().getBrowser().get("https://demoqa.com/");
    }

    @AfterEach
    public void closeBrowser() {
        Session.getInstance().closeSession();
    }
}
