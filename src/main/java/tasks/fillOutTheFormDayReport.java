package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilBuilder;
import net.serenitybdd.screenplay.waits.WithTimeout;
import userinterface.fillOutTheFormDayReportPage;
import util.utils;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.fillOutTheFormDayReportPage.*;


import groovy.time.Duration;
import io.vavr.API.For1;

public class fillOutTheFormDayReport implements Task {

	utils util;
	fillOutTheFormDayReportPage FillOutTheFormDayReportPage;
	private String stgProyecto;
	private String stgTipoHora;
	private String stgServicio;
	private String stgActividad;
	private String stgCausaaOcioso;
	private String stgHorasEjecutadas;
	private String stgHorasaPagar;
	private String stgHorasAdicionales;
	private String stgComentario;
	
	
	public fillOutTheFormDayReport(String stgProyecto, String stgTipoHora, String stgServicio, String stgActividad,
			String stgCausaaOcioso, String stgHorasEjecutadas, String stgHorasaPagar, String stgHorasAdicionales,
			String stgComentario) {
		
		this.stgProyecto = stgProyecto;
		this.stgTipoHora = stgTipoHora;
		this.stgServicio = stgServicio;
		this.stgActividad = stgActividad;
		this.stgCausaaOcioso = stgCausaaOcioso;
		this.stgHorasEjecutadas = stgHorasEjecutadas;
		this.stgHorasaPagar = stgHorasaPagar;
		this.stgHorasAdicionales = stgHorasAdicionales;
		this.stgComentario = stgComentario;
	}
	
	public static fillOutTheFormDayReport fill(String proyecto, String tipoHora, String servicio, String actividad, String causaaOcioso,
			String HorasEjecutadas, String HorasaPagar, String HorasAdicionales, String Comentario) {
		
		return instrumented(fillOutTheFormDayReport.class,  proyecto,  tipoHora,  servicio,  actividad,  causaaOcioso,
				 HorasEjecutadas,  HorasaPagar,  HorasAdicionales,  Comentario);
	}
	
	
	


	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			System.out.println(btnBusquedaProyecto.getCssOrXPathSelector());
			actor.attemptsTo(
					
					Click.on(btnBusquedaProyecto)
					
					);
			actor.attemptsTo(			
					Switch.toFrame(util.converToWebELemet(iFrame))
					);
			
			actor.attemptsTo(
					Click.on(util.SerchonTabletwebelemt(selectProyecto,stgProyecto))
			)	;
			
			
			actor.attemptsTo(
					SelectFromOptions.byVisibleText(stgTipoHora).from(drdTipoHora)
					
					);
			
			System.out.println("ola");
		} catch (Exception e) {
			System.out.println("Errro");
		}
		
		
		
	}

	

}
