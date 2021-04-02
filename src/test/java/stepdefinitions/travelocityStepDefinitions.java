package stepdefinitions;

import java.util.List;
import java.util.Map;

import javax.accessibility.AccessibleIcon;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.*;
import tasks.*;

public class travelocityStepDefinitions {

	public travelocityStepDefinitions() {
		// TODO Auto-generated constructor stub
	}

	@Before
	public void setTheStage() {
	    OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("than yesica enter the url travelocity")
	public void than_yesica_enter_the_url_travelocity() {
	 OnStage.theActorCalled("cliente").wasAbleTo(OpenUp.thePage(),FlighUp.theFligh());

	}
	@When("she choose")
	public void she_choose(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> rows = dataTable.asMaps();
		 for (Map<String, String> columns: rows) {
	    	 OnStage.theActorInTheSpotlight().wasAbleTo(FlightDestination.fill(columns.get("leavingFrom"), columns.get("goingTo"), columns.get("departing"), columns.get("returning")));

	    }
	    
	}

	@Then("she observe important message in the page {string}")
	public void she_observe_important_message_in_the_page(String msn) {
	    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(msn)));
	}
	
	@When("she want login with user {string} pass {string}")
	public void she_want_login_with_user_pass(String user, String pass) {
	    OnStage.theActorInTheSpotlight().attemptsTo(FlighDestinationLogin.the(user,pass));
	   
	}

	@Then("she observe your name in the page {string}")
	public void she_observe_your_name_in_the_page(String name) {
		 OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerLogin.toThe(name)));
	}
	
	@When("she choose departing flight firts option")
	public void she_choose_departing_flight_firts_option() {
	     OnStage.theActorInTheSpotlight().attemptsTo(FlightDeparting.theFirstElement());
	    
	}

	@When("she obsereve price")
	public void she_obsereve_price() {
		
		OnStage.theActorInTheSpotlight().attemptsTo(FlightDepartingReturningAnswer.theGetText());
	}

	@When("she choose returning flight")
	public void she_choose_returning_flight() {
		 OnStage.theActorInTheSpotlight().attemptsTo(FlightReturning.theFirstElement());
	}

	@When("she review your trip continue")
	public void she_review_your_trip_continue() {
	   
	}

	@When("she check out")
	public void she_check_out() {
	  
	}

	@When("she organizes for the highest price of the flight")
	public void she_organizes_for_the_highest_price_of_the_flight() {
		OnStage.theActorInTheSpotlight().wasAbleTo(FlightOrganize.organizeHighest());
	}
	@When("she selects  {int} stop with Alaska Airlines")
	public void she_selects_stop_with_alaska_airlines(Integer int1) {
		OnStage.theActorInTheSpotlight().wasAbleTo(FlighFilter.selectFilter());
	}

	@Then("she validates that the filter of a stop with the airline Alaska Airlenes")
	public void she_validates_that_the_filter_of_a_stop_with_the_airline_alaska_airlenes() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(FlightFilterQuestions.validate()));
	}



	@Then("She validates that the flights are organized for the highest price")
	public void She_validates_that_the_flights_are_organized_for_the_highest_price() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(FlightOrganizeValidate.organizeHighestValidate()));
	}
	@Then("she observe trip total")
	public void she_observe_trip_total() {
	    
	}

}
