package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SimlTest {
    @Test
    void selenideSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("selenide.org"));
    }

    @Test
    void assertTrueTest() {
        assertTrue(3 > 2);
    }

    @Test
    @DisplayName("AssertFalse")
    void assertFalseTest() {
        assertFalse(3 < 2);
    }

}
