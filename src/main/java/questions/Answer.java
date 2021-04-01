package questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.FlighDepartingPage;

public class Answer implements Question<Boolean>  {
	
	private String msn;

	public Answer (String msn) {
		this.msn=msn;
	}

	public static Answer  toThe(String msn) {
		return new Answer(msn);
	}

	@Override
	public Boolean answeredBy(Actor actor) {
	 boolean result;
	 String Message=Text.of(FlighDepartingPage.lblMessageCovid).viewedBy(actor).asString();
	 if (msn.equals(Message)) {
		 result= true;
	
	 } else {
		 result=false;
		
	 }
	 return result;
	
	}

}
