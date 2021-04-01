package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.FlighLoginPage;

public class FlighDestinationLogin implements Task {
	
	private String user,pass;


	public FlighDestinationLogin (String  user, String pass ) {
		this.user=user;
		this.pass=pass;
	}
	
	public static FlighDestinationLogin the(String user, String pass) {
		
		return instrumented(FlighDestinationLogin.class, user, pass);
	}
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(FlighLoginPage.btnSignIn),
				Click.on(FlighLoginPage.btnSignInMenu),
				Enter.theValue(user).into(FlighLoginPage.txtUser),
				Enter.theValue(pass).into(FlighLoginPage.txtPass),
				Click.on(FlighLoginPage.btnSignInEnd)
				);
	
		
	}

	

}
