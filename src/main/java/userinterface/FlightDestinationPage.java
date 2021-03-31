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


}
