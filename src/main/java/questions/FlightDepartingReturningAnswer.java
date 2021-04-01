package questions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import tasks.FlightDeparting;
import userinterface.FlighDepartingPage;

public class FlightDepartingReturningAnswer implements Task {
	
	public static FlightDepartingReturningAnswer theGetText() {
		 
		return instrumented(FlightDepartingReturningAnswer.class);
	}

	

	


	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("PRUEBA YESICA "+BrowseTheWeb.as(actor).find(FlighDepartingPage.lblFirstOption1).getText());
		BrowseTheWeb.as(actor).find(FlighDepartingPage.lblFirstOption1).getText();
		
	}

	
}
