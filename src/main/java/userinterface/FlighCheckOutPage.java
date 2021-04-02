package userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FlighCheckOutPage extends PageObject{
	
	public static  final Target btnCheckOut = Target.the("button check out").located(By.xpath("//section[@class='uitk-layout-grid-item uitk-layout-grid-item-columnspan-1']//button[contains(text(),'Check out')]"));
	public static  final Target lblWhoTraveling = Target.the("label who's traveling").located(By.xpath("//*[@id='site-content']//span[contains(text(),'First name')]"));
	public static  final Target txtFirstName = Target.the("field first name").located(By.xpath("//*[@id='firstname[0]']"));
	public static  final Target txtLastName = Target.the("field last name").located(By.xpath("//*[@id='lastname[0]']"));
	public static  final Target txtPhone= Target.the("field phone number").located(By.xpath("//*[@id='phone-number[0]']"));
	public static  final Target txtMonth= Target.the("field month").located(By.xpath("//select[@id='date_of_birth_month0']"));
	public static  final Target txtDay= Target.the("field month").located(By.xpath("//select[@id='date_of_birth_day[0]']"));
	public static  final Target txtYear= Target.the("field year").located(By.xpath("//select[@id='date_of_birth_year[0]']"));
	public static  final Target rbtFemale= Target.the("radio button female").located(By.xpath("//*[@class='group-validation gender-select' ]//label[@for='gender_female[0]']"));
	public static  final Target msnError= Target.the("radio button female").located(By.xpath("//*[@class='group-label' ]//following-sibling::p[contains(text(),'This traveler must be 18 or older.')]"));




}
