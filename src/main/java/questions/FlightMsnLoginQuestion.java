package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.FlighDepartingPage;

public class FlightMsnLoginQuestion implements Question <Boolean> {
	private String msn;
	public static FlightMsnLoginQuestion toTheMsn(String msn) {
		
		return new FlightMsnLoginQuestion(msn);
	}

		
	public FlightMsnLoginQuestion(String msn) {
		this.msn=msn;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		boolean result;
		 String MessagePass=Text.of(FlighDepartingPage.lblMessagePassNull).viewedBy(actor).asString();

		if (msn.equals(MessagePass)) {
			 result= true;
		
		 } else {
			 result=false;
			
		 }
		 return result;
		
		}

		
	


}
