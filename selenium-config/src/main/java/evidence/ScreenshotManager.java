package evidence;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class ScreenshotManager {

    public static void captureScreenshot(WebDriver driver, String testName) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Path destDir = Paths.get("evidences");
            Files.createDirectories(destDir);
            Path destFile = destDir.resolve(testName + "_" + System.currentTimeMillis() + ".png");
            Files.copy(screenshot.toPath(), destFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

