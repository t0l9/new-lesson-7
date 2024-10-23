package locators;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {
    //<input type="email" class="inputtext login_form_input_box"
    // name="email" id = "email" data-testid="email"


    @Test
    void example() {
        $("[data-testid=email]");
        $(by("data-testid", "email"));

        $("[id=email]").setValue("1");
        $("input#email").setValue("1");
        $x("//*[id='email']").setValue("1");


        $("[name=email]").setValue("2");
        $(byName("email")).setValue("1");

        $(".login_form_input_box").setValue("3");
        $("[class=login_form_input_box]").setValue("3");
        $("//input[@class='login_form_input_box']").setValue("3");


        $(byText("Hello mothetFuskers"));
        $(withText("llo motherfuskers"));
    }
}
