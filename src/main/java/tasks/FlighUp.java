package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.selectReprotNewPage.lblDatereport;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.FlightDestinationPage;

public class FlighUp implements Task {
	
	private FlightDestinationPage flightDestinationPage;

	

	public static FlighUp theFligh() {
		 
		return Tasks.instrumented(FlighUp.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(FlightDestinationPage.btnFligh));

	}

}

