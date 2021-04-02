package questions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import tasks.FlightDeparting;
import userinterface.FlighDepartingPage;

public class FlightDepartingReturningQuestion implements Task {
	
	public static String saveData;
	public static String substr;

	
	
	public static FlightDepartingReturningQuestion theGetText() {
		 
		return instrumented(FlightDepartingReturningQuestion.class);
	}

	public static String getSaveData() {
		String substr = saveData.substring(0,7);
		return substr;
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		this.saveData = BrowseTheWeb.as(actor).find(FlighDepartingPage.lblRoundtripTraveler).getText();
		
	}

	
}
