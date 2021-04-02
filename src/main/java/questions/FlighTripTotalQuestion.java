package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.FlighDepartingPage;
import questions.FlightDepartingReturningQuestion;




public class FlighTripTotalQuestion implements Question<Boolean>  {

	public static FlighTripTotalQuestion toThe() {
		return new FlighTripTotalQuestion();
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		 boolean result;
		 String tripTotal=Text.of(FlighDepartingPage.lblPriceSummary).viewedBy(actor).asString();
		 String getDataTask =FlightDepartingReturningQuestion.getSaveData();

		
		 if (tripTotal.equals(getDataTask)) {
			 result= true;
		
		 } else {
			 result=false;
			
		 }
		 return result;
		
		}

}
