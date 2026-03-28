import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FirstTest {

    @Test
    public void googleSearchTest() {
        // Настройки
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;

        // Открываем Google
        open("https://www.google.com");

        // Проверяем заголовок
        String title = title();
        System.out.println("Page title: " + title);

        // Ищем текст на странице
        $("body").shouldHave(text("Google"));

        // Закрываем браузер
        closeWebDriver();
    }
}
