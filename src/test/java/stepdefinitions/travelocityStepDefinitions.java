package stepdefinitions;

import java.util.List;
import java.util.Map;

import javax.accessibility.AccessibleIcon;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.FlighUp;
import tasks.FlightDestination;
import tasks.OpenUp;
import tasks.fillOutTheFormDayReport;

public class travelocityStepDefinitions {

	public travelocityStepDefinitions() {
		// TODO Auto-generated constructor stub
	}

	@Before
	public void setTheStage() {
	    OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("como cliente ingreso a la url de travelocity")
	public void como_cliente_ingreso_a_la_url_de_travelocity() {
	 OnStage.theActorCalled("cliente").wasAbleTo(OpenUp.thePage(),FlighUp.theFligh());
	}
	@When("cliente selecciona")
	public void cliente_selecciona(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>> rows = dataTable.asMaps();
		 for (Map<String, String> columns: rows) {
	    	 OnStage.theActorInTheSpotlight().wasAbleTo(FlightDestination.fill(columns.get("yendosePara"), columns.get("irA"), columns.get("partiendo"), columns.get("regresando")));
	    }
	    
	}

	@Then("cliente selecciona el vuelo de menos costo")
	public void cliente_selecciona_el_vuelo_de_menos_costo() {
	    
	}

}
