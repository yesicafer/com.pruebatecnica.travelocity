package questions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.FlighDepartingPage;

import static userinterface.FlighFilterPage.lblFilter1Stop;
import static userinterface.FlighFilterPage.lblfilterAlaskaAirlenes;

public class FlightFilterDepartingQuestions implements Question<Boolean> {



    public static FlightFilterDepartingQuestions validate(){
        return new FlightFilterDepartingQuestions();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       String stops = Text.of(lblFilter1Stop)
                .viewedBy(actor).asString();
        String aeroline = Text.of(lblfilterAlaskaAirlenes)
                .viewedBy(actor).asString();

          if(aeroline.contains("Alaska ") && stops.contains("1 stop")){
            return true;
        }else{
            return false;
        }


    }
}
