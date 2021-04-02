package userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FlighDepartingPage extends PageObject{
	

	
	public static  final Target lblDepartingFlight = Target.the("label departing fligh").located(By.xpath("//*[@class='uitk-flex uitk-flex-gap-two uitk-type-heading-300']//legend[contains(text(),'Flexible change policies')]"));
	public static  final Target lblMessageCovid = Target.the("Message covid").located(By.xpath("//*[@class='uitk-experimental-banner-body' and contains(text(),'COVID-19 alert: Travel requirements are changing rapidly, including need for pre-travel COVID-19 testing and quarantine on arrival.' )]"));
	public static  final Target lblFirstOption = Target.the("label price").located(By.xpath("//*[@data-test-id='listings']//li[1]//button"));
	//public static  By lblFirstOption1 = By.xpath("//*[@data-test-id='listings']//li[1]//span[@class='uitk-price-a11y is-visually-hidden']//following-sibling::span");
	public static  By lblRoundtripTraveler = By.xpath("//*[@class='uitk-sheet uitk-sheet-position-right uitk-sheet-columns-4 uitk-sheet-layout-side']//div//b");
	public static  final Target lblDepartingReturning = Target.the("label departing returning").located(By.xpath("//*[@class='uitk-heading-4']"));
	public static  final Target btnContinue = Target.the("button continue").located(By.xpath("//*[@class='uitk-sheet uitk-sheet-position-right uitk-sheet-columns-4 uitk-sheet-layout-side']//button[@data-test-id='select-button']"));
	//public static  final Target lblChooseReturning = Target.the("label choose departing returning").located(By.xpath(""));
	public static  final Target btnNoThanks = Target.the("button no thanks").located(By.xpath("//*[@class='uitk-dialog uitk-spacing uitk-spacing-padding-inline-two uitk-spacing-padding-block-two']//*[@class='uitk-flex uitk-flex-gap-three uitk-flex-wrap']//following-sibling::a"));
	public static  final Target lblPriceSummary = Target.the("label price summary").located(By.xpath("//*[@class='uitk-layout-grid-item uitk-layout-grid-item-columnspan-1']//table[@class='uitk-table experimental-pricing']//td[2]//span"));
	public static  final Target lbltripTotal = Target.the("label trip total").located(By.xpath("//*[@class='uitk-layout-grid-item uitk-layout-grid-item-columnspan-1']//*[@class='uitk-heading-4']"));



}
