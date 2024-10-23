package demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class FormTests {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void simpleTest() {
        open("/text-box");
        $(".text-center")
                .shouldHave(text("Text Box"));
        $("#userName").setValue("Anatoliy");
        $("#userEmail").setValue("t0l4ik.kas1@gmail.com");
        $("#currentAddress").setValue("Almaty");
        $("#permanentAddress").setValue("saina 10");
        $("#submit").click();

        $("#output").shouldBe(visible);
        $("[id=\"name\"]")
                .shouldHave(text("Anatoliy"));
        $("[id=\"email\"]")
                .shouldHave(text("t0l4ik.kas1@gmail.com"));

        sleep(10000);



    }
}
