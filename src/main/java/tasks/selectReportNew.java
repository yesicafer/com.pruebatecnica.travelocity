package tasks;


import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import util.utils;

import static userinterface.selectReprotNewPage.*;




public class selectReportNew implements Task{
	
	
	utils Util;
	
	public selectReportNew() {
	}

	public static selectReportNew selectDay() {
		return  instrumented(selectReportNew.class);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				
				WaitUntil.the(btnReportDate, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
				Click.on(btnReportDate)

				);
		
		
		
		actor.attemptsTo(
				
				WaitUntil.the(BtnNew, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
				Click.on(BtnNew)

				);
		
		
		System.out.println(lblDatereport.getCssOrXPathSelector().toString());
		
		
		
	}

	

	

}
