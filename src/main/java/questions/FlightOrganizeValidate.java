package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.FlighDepartingPage;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FlightOrganizeValidate implements Question<Boolean> {

    public static FlightOrganizeValidate organizeHighestValidate() {
        return new FlightOrganizeValidate();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> precios = Text.of(FlighDepartingPage.listPrice)
                .viewedBy(actor)
                .asList();
        System.out.println("precio "+precios.get(0).replace("$","") );
        List<Integer> intPrecio = new ArrayList<>();
        for(String precio:precios){
            intPrecio.add(Integer.parseInt(precio.replace("$","").trim()));
        }
        for (int i = 0; i<intPrecio.size()-1; i++){
            System.out.println("Hola"+intPrecio.get(i) +intPrecio.get(i+1));
            if(intPrecio.get(i)<intPrecio.get(i+1)){

                return false;

            }
        }

        return true;
    }
}
