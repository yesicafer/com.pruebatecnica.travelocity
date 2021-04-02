package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.FlighDepartingPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.FlighDepartingPage.lblFirstOption;
import static userinterface.FlighFilterPage.Filter1Stop;
import static userinterface.FlighFilterPage.filterAlaskaAirlenes;


public class FlighFilter implements Task {

    public static FlighFilter selectFilter(){
        return instrumented(FlighFilter.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Filter1Stop),
                Scroll.to(filterAlaskaAirlenes),
                Click.on(filterAlaskaAirlenes)

        );

        actor.attemptsTo(

                WaitUntil.the(lblFirstOption, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Scroll.to(lblFirstOption)
        );
    }
}
