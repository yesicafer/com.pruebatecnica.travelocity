package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import questions.FlightDepartingReturningAnswer;
import userinterface.FlighDepartingPage;

public class FlightTripTotal implements Task {

	public static FlightTripTotal toThePage() {
		
		return instrumented(FlightTripTotal.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo();
			
		
	}

}
