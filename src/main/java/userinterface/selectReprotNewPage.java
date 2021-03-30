package userinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;

public class selectReprotNewPage extends PageObject{
	
	//public static  final  By btnReportDate = By.xpath("//*[@id='Vertical_v1_LE_v2_DXMainTable']//tr[contains(@id,'Vertical_v1_LE_v2_DXDataRow')]//input[contains(@id,'Vertical_v1_LE_v2_DXSelBtn')]");
	public static  final Target btnReportDate = Target.the("btn reporte ").locatedBy("//*[@id='Vertical_v1_LE_v2_DXMainTable']//tr[contains(@id,'Vertical_v1_LE_v2_DXDataRow')]//span[contains(@id,'Vertical_v1_LE_v2_cell0_0_xaf_Fecha_View')]");
	public static  final  By bteditar = By.xpath("//*[@id='Vertical_TB_Menu_DXI0_']");
	public static  final Target lblDatereport =  Target.the("lable of date").locatedBy("//a[contains(@id,'Vertical_') and contains(text(),'2021')]//self::a[@class='Current']");
	public static  final  By BtnNew = By.xpath("//*[contains(@id,'iReporteDetallado_ToolBar_Menu') and contains(@title,'Nuevo')]");

	
	

}
