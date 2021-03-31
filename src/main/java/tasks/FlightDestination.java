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
import org.openqa.selenium.Keys;
import userinterface.FlightDestinationPage;
import userinterface.TravelocityPage;

public class FlightDestination implements Task {
	private String stgyendosePara;
	private String irA;
	private String partiendo;
	private String regresando;





	public FlightDestination(String yendosePara, String ira, String partiendo, String regresando){
		this.stgyendosePara =yendosePara;
		this.irA =ira;
		this.partiendo =partiendo;
		this.regresando =regresando;

	}
	public static FlightDestination fill(String yendosePara, String ira, String partiendo, String regresando) {

		return instrumented(FlightDestination.class,  yendosePara,  ira,  partiendo,  regresando);
	}

	

	@Override
	public <T extends Actor> void performAs(T actor) {
	
	
		actor.attemptsTo(
				Click.on(FlightDestinationPage.txtyendosePara));
		actor.attemptsTo(Enter.theValue(stgyendosePara).into(FlightDestinationPage.txtDesdeDonde).thenHit(Keys.ENTER));
		actor.attemptsTo(
				Click.on(FlightDestinationPage.btnGoTO),
				Enter.theValue(irA).into(FlightDestinationPage.txtGOTO).thenHit(Keys.ENTER));

		

		System.out.println("Hola");
		
	}

	

}
