package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import userinterface.FlighDepartingPage;
import userinterface.FlightDestinationPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FlightOrganize implements Task {

    public static FlightOrganize organizeHighest() {
        return instrumented(FlightOrganize.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byIndex(1).from(FlighDepartingPage.dropdown)

        );
        actor.attemptsTo(
                WaitUntil.the(FlighDepartingPage.lblFirstOption, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds()
                );

    }
}
