package userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FlightDestinationPage extends PageObject {
    
	public static  final Target btnFligh = Target.the("seccion vuelo").located(By.xpath("//*[@href='?pwaLob=wizard-flight-pwa' and @class='uitk-tab-anchor']"));
	public static  final Target txtyendosePara = Target.the("selector de ida").located(By.xpath("//button[@data-stid='location-field-leg1-origin-menu-trigger']"));
	public static  final Target txtDesdeDonde = Target.the("selector de ida").located(By.xpath("//input[@id='location-field-leg1-origin']"));
	public static  final Target btnGoTO = Target.the("selector de ida").located(By.xpath("//button[@data-stid='location-field-leg1-destination-menu-trigger']"));
	public static  final Target txtGOTO = Target.the("selector de ida").located(By.xpath("//input[@id='location-field-leg1-destination']"));
	public static  final Target btnStarDate = Target.the("selector de ida").located(By.xpath("//button[@id='d1-btn']"));
	public static  final Target lblMonth = Target.the("selector de ida").located(By.xpath("//h2[@class='uitk-date-picker-month-name uitk-type-medium']"));

	public static   By btnDay = By.xpath("");
	public static  final Target BtnNext = Target.the("selector de ida").located(By.xpath("//*[@aria-labelledby='nextMonth-title']//parent::button"));
	public static  final Target BtnDone = Target.the("selector de ida").located(By.xpath("//button[@data-stid='apply-date-picker']"));
	public static  final Target BtnSearch= Target.the("selector de ida").located(By.xpath("//button[@data-testid='submit-button']"));


	public static By getBtnDay() {
		return btnDay;
	}

	public static void setBtnDay(String strDay) {
		btnDay = By.xpath("//button[@type='button' and @data-day='$']".replace("$",strDay.trim()));
	}

}
