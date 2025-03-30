package home;

import core.BaseTest;
import org.junit.jupiter.api.Test;

public class HomeTest extends BaseTest {

    @Test
    public void shouldAccessHomePage() {
        driver.get("https://www.automationexercise.com/");
    }
}