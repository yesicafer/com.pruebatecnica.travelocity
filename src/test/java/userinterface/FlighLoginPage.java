package userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class FlighLoginPage extends PageObject{
	
	public static  final Target btnSignIn = Target.the("button sign in").located(By.xpath("//*[@class='uitk-type-300' and contains(text(),'Sign in')]"));
	public static  final Target btnSignInMenu = Target.the("button sign in menu").located(By.xpath("//*[@class='uitk-menu-container uitk-menu-open uitk-menu-pos-right uitk-menu-container-autoposition']//*[@class='actions']//a[contains(text(),'Sign in')]"));
	public static  final Target txtUser = Target.the("field name").located(By.xpath("//*[@id='login-form-email-label2']//*[@name='signin-loginid']"));
	public static  final Target txtPass = Target.the("field pass").located(By.xpath("//*[@id='login-form-password-label2']//*[@name='signin-password']"));
	public static  final Target btnSignInEnd = Target.the("Button Sign In end").located(By.id("submitButton"));
	public static  final Target btnActorSignIn = Target.the("button actor name").located(By.xpath("//*[@class='uitk-type-300' and contains(text(),'Yesica')]"));



}
