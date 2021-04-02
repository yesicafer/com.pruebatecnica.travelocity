package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromBy;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import userinterface.FlighCheckOutPage;


import static net.serenitybdd.screenplay.Tasks.instrumented;


public class FlightCheckOutInformation implements Task {
	
	 
		private String firstname;
		private String lastname;
		private String phonenumber;
		private String date;
		private String month;
		private String year;
		
		public FlightCheckOutInformation (String firstname, String lastname, String phonenumber, String date, String month,
				String year){
			this.firstname =firstname;
			this.lastname =lastname;
			this.phonenumber =phonenumber;
			this.date =date;
			this.month =month;
			this.year =year;
		}
		
		public static FlightCheckOutInformation fill(String firstname, String lastname, String phonenumber, String date, String month,
				String year) {
			
			 return instrumented(FlightCheckOutInformation.class, firstname,  lastname,  phonenumber,  date, month, year);
		}

		

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(firstname).into(FlighCheckOutPage.txtFirstName),
		         Enter.theValue(lastname).into(FlighCheckOutPage.txtLastName),
		         Enter.theValue(phonenumber).into(FlighCheckOutPage.txtPhone),
		         Click.on(FlighCheckOutPage.txtMonth),
		         SelectFromOptions.byVisibleText(month).from(FlighCheckOutPage.txtMonth),
		         Click.on(FlighCheckOutPage.txtDay),
		         SelectFromOptions.byVisibleText(date).from(FlighCheckOutPage.txtDay),
		         Click.on(FlighCheckOutPage.txtYear),
		         SelectFromOptions.byVisibleText(year).from(FlighCheckOutPage.txtYear),
		         Click.on(FlighCheckOutPage.rbtFemale)
		);
		
	}
	}
