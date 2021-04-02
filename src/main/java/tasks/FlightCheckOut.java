package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.FlighCheckOutPage;


public class FlightCheckOut  implements Task{

	public static FlightCheckOut theCheckOut() {
		 
		return instrumented(FlightCheckOut.class);
	}
	
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(		    
				Click.on(FlighCheckOutPage.btnCheckOut),
				WaitUntil.the(FlighCheckOutPage.lblWhoTraveling,WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds()
				);
		
		
		
	}
}


	
