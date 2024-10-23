package junit;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Annotations {

    @Test
    void assertTets() {
        Assertions.assertTrue(2 < 3);
    }

    @BeforeEach
    void openPage() {
        Selenide.open("https://page.com");
    }

    @AfterEach
    void closeWindow() {
        WebDriverRunner.closeWindow();
    }
}
