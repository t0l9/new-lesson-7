package demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FormTestsAuto {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void hardTest() {
        open("/automation-practice-form");

        $(".text-center")
                .shouldHave(text("Practice Form"));
        $("#firstName").setValue("Anatoliy");
        $("#lastName").setValue("Kolyshkin");
        $("#userEmail").setValue("t0l4ik.kas1@gmail.com");

        $("#genterWrapper").$(byText("Male")).click();

        $("#userNumber").setValue("4545444444");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("February");
        $(".react-datepicker__year-select").selectOption("1996");
        $(".react-datepicker__day.react-datepicker__day--014").click();

        $("#hobbiesWrapper").$(byText("Sports")).click();

        $("#uploadPicture").uploadFromClasspath("img/1.png");

        $("#currentAddress").setValue("Almaty");

        $("#state").click();
        $("#stateCity-wrapper")
                .$(byText("NCR")).click();

        $("#city").click();
        $("#stateCity-wrapper")
                .$(byText("Delhi")).click();
        $("#submit").click();

        $(".modal-content").should(appear);
        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Anatoliy"));

        System.out.println("Secseesful test");

    }
}
