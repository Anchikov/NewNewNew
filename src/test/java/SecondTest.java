import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import static com.codeborne.selenide.Selenide.*;

public class SecondTest {
    String beggeek = "https://biggeek.ru/";

    @Before
    public void setUp() {
        // Настройки
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }

    @Test
    public void seachIphoneOnProductBasket() {
        open(beggeek);
        $("[aria-label='Поле для поиска']").setValue("айфон 14").pressEnter();
        sleep(5000);
    }
}

