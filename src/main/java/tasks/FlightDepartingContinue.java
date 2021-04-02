package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.FlighDepartingPage;
public class FlightDepartingContinue implements Task {

	public static FlightDepartingContinue theContinue() {
		return instrumented(FlightDepartingContinue.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
		Click.on(FlighDepartingPage.btnContinue));
		
	}

}
