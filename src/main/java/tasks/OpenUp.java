package tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.TravelocityPage;

public class OpenUp implements Task {
	private TravelocityPage travelocityPage;

	public static OpenUp thePage() {
		return Tasks.instrumented(OpenUp.class);
		
	}



	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(travelocityPage));
		
	}

}
