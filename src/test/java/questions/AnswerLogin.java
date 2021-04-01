package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
//import userinterface.
import userinterface.FlighLoginPage;
public class AnswerLogin implements Question<Boolean> {
	
	private String name;

	public AnswerLogin (String name) {
		this.name=name;
	}
	public static AnswerLogin toThe(String name) {
		
		return new AnswerLogin(name);
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
