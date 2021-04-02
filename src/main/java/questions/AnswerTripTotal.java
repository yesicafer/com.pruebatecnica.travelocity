package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.FlighDepartingPage;
import questions.FlightDepartingReturningAnswer;




public class AnswerTripTotal implements Question<Boolean>  {

	public static AnswerTripTotal toThe() {
		return new AnswerTripTotal();
	}

	@Override
	public Boolean answeredBy(Actor actor) {
	    String getDataTask =FlightDepartingReturningAnswer.getSaveData();
		 boolean result;
		 String tripTotal=Text.of(FlighDepartingPage.lbltripTotal).viewedBy(actor).asString();
		// String substr = tripTotal.substring(1,7);
		// System.out.println("asfasdfsf substr"+substr);
		 if (tripTotal.equals(getDataTask)) {
			 result= true;
		
		 } else {
			 result=false;
			
		 }
		 return result;
		
		}

}
