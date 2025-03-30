package core;

import driver.DriverFactory;
import evidence.ScreenshotManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void setUp(TestInfo testInfo) {
        System.out.println("🔍 Iniciando teste: " + testInfo.getDisplayName());
        driver = DriverFactory.getDriver();
    }

    @AfterEach
    public void tearDown(TestInfo testInfo) {
        System.out.println("📸 Finalizando teste: " + testInfo.getDisplayName());

        if (driver != null) {
            try {
                if (((RemoteWebDriver) driver).getSessionId() != null) {
                    ScreenshotManager.captureScreenshot(driver, testInfo.getDisplayName());
                }
            } catch (Exception e) {
                System.err.println("Erro ao capturar screenshot: " + e.getMessage());
            } finally {
                DriverFactory.quitDriver();
            }
        }
    }
}
