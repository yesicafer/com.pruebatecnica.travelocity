package userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class loginform extends PageObject{


	public static  final Target txtUsername = Target.the("Se escribe el ususario de choucair").located(By.xpath("//*[@id='Logon_v0_MainLayoutEdit_xaf_l30_xaf_dviUserName_Edit']//input"));
	public static  final Target txtPassword = Target.the("Se escribe la contraseña de choucair").located(By.xpath("//*[@id='Logon_v0_MainLayoutEdit_xaf_l35_xaf_dviPassword_Edit']//input"));
	//public static  final Target btnLogin = Target.the("Se escribe el ususario de choucair").located(By.xpath("//*[@id='Logon_PopupActions_Menu_DXI0_T']"));
	
	public static  final  By btnLogin = By.xpath("//*[@id='Logon_PopupActions_Menu_DXI0_T']");
	
} 
