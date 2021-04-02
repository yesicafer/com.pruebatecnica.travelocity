package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import org.openqa.selenium.Keys;
import userinterface.FlightDestinationPage;
import userinterface.FlighDepartingPage;
import userinterface.TravelocityPage;

public class FlightDestination implements Task {
	
	private String stgleavingFrom;
	private String stgGoingTo;
	private String stgdeparting;
	private String stgreturning;


	public FlightDestination(String leavingFrom, String goingTo, String departing, String returning){
		this.stgleavingFrom =leavingFrom;
		this.stgGoingTo =goingTo;
		this.stgdeparting =departing;
		this.stgreturning =returning;

	}
	public static FlightDestination fill(String leavingFrom, String goingTo, String departing, String returning) {

		return instrumented(FlightDestination.class, leavingFrom,  goingTo,  departing,  returning);
	}
	

	@Override
	public <T extends Actor> void performAs(T actor) {
	
	
		actor.attemptsTo(
				Click.on(FlightDestinationPage.btnleavingFrom));
		actor.attemptsTo(Enter.theValue(stgleavingFrom).into(FlightDestinationPage.txtleavingFrom).thenHit(Keys.ENTER));
		actor.attemptsTo(
				Click.on(FlightDestinationPage.btnGoTO),
				Enter.theValue(stgGoingTo).into(FlightDestinationPage.txtGOTO).thenHit(Keys.ENTER));		
		actor.attemptsTo(Click.on(FlightDestinationPage.btnStarDate));
		
		while (!FlightDestinationPage.lblMonth.resolveFor(actor).getText().contains(stgdeparting.substring(stgdeparting.indexOf(" ")+1,stgdeparting.lastIndexOf(" ")))){
			actor.attemptsTo(Click.on(FlightDestinationPage.BtnNext));
		}
		
		String day = stgdeparting.substring(0,stgdeparting.indexOf(" ")).trim();
		FlightDestinationPage.setBtnDay(day);
		actor.attemptsTo(Click.on(FlightDestinationPage.getBtnDay()));

		while (!FlightDestinationPage.lblMonth.resolveFor(actor).getText().contains(stgreturning.substring(stgreturning.indexOf(" ")+1,stgreturning.lastIndexOf(" ")))){
			actor.attemptsTo(Click.on(FlightDestinationPage.BtnNext));
		}
		
		day = stgreturning.substring(0,stgreturning.indexOf(" ")).trim();
		FlightDestinationPage.setBtnDay(day);
		actor.attemptsTo(Click.on(FlightDestinationPage.getBtnDay()) ,Click.on( FlightDestinationPage.BtnDone));
		actor.attemptsTo(Click.on(FlightDestinationPage.BtnSearch),WaitUntil.the(FlighDepartingPage.lblDepartingFlight,WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds());
			
		
	}


	

}
