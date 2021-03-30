package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.fillOutTheFormDayReportPage.drdTipoHora;
import static userinterface.loginform.txtUsername;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import userinterface.FlightDestinationPage;
import userinterface.TravelocityPage;

public class FlightDestination implements Task {
	private String stgyendosePara;
	private FlightDestinationPage flightDestinationPage;
	
	public static FlightDestination fill(String yendosePara, String irA, String partiendo, String regresando) {

		return instrumented(FlightDestination.class,  yendosePara,  irA,  partiendo,  regresando);
	}

	

	@Override
	public <T extends Actor> void performAs(T actor) {
	
	
		actor.attemptsTo(Enter.theValue(stgyendosePara).into(flightDestinationPage.txtyendosePara));
		
				
			
		
	}

	

}
