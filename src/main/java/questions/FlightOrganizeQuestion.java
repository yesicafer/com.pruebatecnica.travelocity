package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.FlighDepartingPage;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FlightOrganizeQuestion implements Question<Boolean> {

    public static FlightOrganizeQuestion organizeHighestValidate() {
        return new FlightOrganizeQuestion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> precios = Text.of(FlighDepartingPage.listPrice)
                .viewedBy(actor)
                .asList();
        
        List<Integer> intPrecio = new ArrayList<>();
        for(String precio:precios){
            intPrecio.add(Integer.parseInt(precio.replace("$","").trim()));
        }
        for (int i = 0; i<intPrecio.size()-1; i++){
            
            if(intPrecio.get(i)<intPrecio.get(i+1)){

                return false;

            }
        }

        return true;
    }
}
