package com.neznatnov;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class GitHubEnterpriseTest {

    @Test
    void hoverTest(){
        open("https://github.com/");

        $("header").$(byText("Solutions")).hover();
        $(By.cssSelector("a[href='/enterprise']")).click();
        $("h1").shouldHave(text("Build like the best"));
    }
}