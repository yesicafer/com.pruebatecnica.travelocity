package questions;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.selectReprotNewPage.*;


public class seeTodayDate implements Question<Boolean>{
	
	
	
	public static seeTodayDate tothe() {

		return new seeTodayDate();
	}


	@Override
	public Boolean answeredBy(Actor actor) {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/MM/dd"); 
		LocalDate todayDate = LocalDate.now(); 
		
		System.out.println(lblDatereport.resolveFor(actor).getText());
		LocalDate date = LocalDate.parse(lblDatereport.resolveFor(actor).getText(), formatter);
		
		System.out.println(date);
		
		if(todayDate.isBefore(date) || todayDate.isEqual(date)) {
			return true;
		}else {
		
			return false;
		}


	}

}
