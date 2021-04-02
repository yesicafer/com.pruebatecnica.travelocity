package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
//import userinterface.
import userinterface.FlighLoginPage;
public class FlightLoginQuestion implements Question<Boolean> {
	
	private String name;

	public FlightLoginQuestion (String name) {
		this.name=name;
	}
	public static FlightLoginQuestion toThe(String name) {
		
		return new FlightLoginQuestion(name);
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		boolean result;
		 String actorName=Text.of(FlighLoginPage.btnActorSignIn).viewedBy(actor).asString();
		 if (name.equals(actorName)) {
			 result= true;
		
		 } else {
			 result=false;
			
		 }
		 return result;
		
		}


}
