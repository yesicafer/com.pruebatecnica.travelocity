package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import util.utils;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.loginform.*;


public class login implements Task {

	utils Util;
	private String username;
	private String password;

	public login(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public static login credenciales(String username, String password) {

		return instrumented(login.class, username, password);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(

				Enter.theValue(username).into(txtUsername), 
				Enter.theValue(password).into(txtPassword)

		);

		
		Util.scrollingHighligElement(btnLogin);

		actor.attemptsTo(Click.on(btnLogin));
	//	actor.attemptsTo(Click.on(btnReportDate));
		
		
	}

}
