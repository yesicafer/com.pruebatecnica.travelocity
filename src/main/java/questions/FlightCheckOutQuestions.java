package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.FlighCheckOutPage;
import userinterface.FlighDepartingPage;

public class FlightCheckOutQuestions implements Question<Boolean>{

	public static FlightCheckOutQuestions theMessageError() {
		return new FlightCheckOutQuestions();
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		 boolean result;
		 String Message="This traveler must be 18 or older.";
		 String MessageField=Text.of(FlighCheckOutPage.msnError).viewedBy(actor).asString();
		 if (Message.equals(MessageField)) {
			 result= true;
		
		 } else {
			 result=false;
			
		 }
		 return result;
		
		}


	}

