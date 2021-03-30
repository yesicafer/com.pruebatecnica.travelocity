package userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FlightDestinationPage extends PageObject {
    
	public static  final Target btnFligh = Target.the("seccion vuelo").located(By.xpath("//*[@class='uitk-tab-anchor']//*[contains(text(),'Flights')]"));
	public static  final Target txtyendosePara = Target.the("selector de ida").located(By.xpath("//input[@data-stid='location-field-leg1-origin-input']"));


}
