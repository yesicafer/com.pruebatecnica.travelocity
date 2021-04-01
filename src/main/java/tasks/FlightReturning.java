package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.FlighDepartingPage;

public class FlightReturning implements Task {

	public static FlightReturning theFirstElement() {
		return instrumented(FlightReturning.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
	//	String res=(FlighDepartingPage.lblFirstOption1.getName());
	//	System.out.println("erer"+res);
			
		        actor.attemptsTo(
		    
				Click.on(FlighDepartingPage.lblFirstOption),
				WaitUntil.the(FlighDepartingPage.lblDepartingReturning,WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
				Click.on(FlighDepartingPage.btnContinue),
				Click.on(FlighDepartingPage.btnNoThanks)	);
				/**WaitUntil.the(FlighDepartingPage.lblPriceSummary,WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds()

			//	WaitUntil.the(FlighDepartingPage.lblDepartingReturning,WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds()
				
				**/
			
		
		
	}

	

}
