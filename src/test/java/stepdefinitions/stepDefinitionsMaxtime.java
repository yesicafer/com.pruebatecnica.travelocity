package stepdefinitions;


import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.seeTodayDate;
import tasks.FlightOrganize;
import tasks.fillOutTheFormDayReport;
import tasks.login;
import tasks.selectReportNew;
import userinterface.openUpPageEwe;
import util.utils;

public class stepDefinitionsMaxtime {
	
	private String name;
	openUpPageEwe Openpage;
	utils Util;
	
	@Before
	public void setTheStage() {
	    OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{word} Ingresa a la url Maxtime")
	public void ingresa_a_la_url_maxtime(String name) {
		this.name = name;
		OnStage.theActorCalled(name).wasAbleTo(Open.browserOn(Openpage));
		System.out.println("hola"+name);
	}

	@Given("el realiza el loguin con el usuario {string} y la contraseña {string}")
	public void el_realiza_el_loguin_con_el_usuario_y_la_contraseña(String username, String password) {
	  OnStage.theActorCalled(name).wasAbleTo(login.credenciales(username,password));
	}

	@When("Crea un nuevo reporte del dia")
	public void el_selecciona_el_dia_a_registar() {
		
		 OnStage.theActorInTheSpotlight().wasAbleTo(selectReportNew.selectDay());
	
		 OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(seeTodayDate.tothe()));
	}



	@When("Diligencia el dealle del reporte de dia")
	public void diligencia_el_dealle_del_reporte_de_dia(DataTable dataTable) {
	   List<Map<String, String>> rows = dataTable.asMaps();
	   
	    for (Map<String, String> columns: rows) {
	    	 OnStage.theActorInTheSpotlight().wasAbleTo(fillOutTheFormDayReport.fill(columns.get("proyecto"), columns.get("tipoHora"), columns.get("servicio"), columns.get("actividad"), columns.get("causaaOcioso"),
	    			 															columns.get("HorasEjecutadas"), columns.get("HorasaPagar"), columns.get("HorasAdicionales"), columns.get("Comentario")));
	    }
	}



	@Then("el guardar y cierra al dia del reporte")
	public void el_guardar_y_cierra_al_dia_del_reporte() {
	
	}

	@Then("valida la creacion")
	public void valida_la_creacion() {
	   
	}
}
