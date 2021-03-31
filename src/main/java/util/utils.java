package util;


import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.util.SystemEnvironmentVariables;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class utils extends  PageObject{
	
	private String highlighRed="arguments[0].style.border='3px dashed red'";
	
	
	
	public void scrollingHighligElement(By btnLogin) {
		Scroll.to(btnLogin).andAlignToBottom();
		
		int quitaXpath = btnLogin.toString().indexOf("/");
		
		System.out.println(btnLogin.toString().substring(quitaXpath-1));
		WebElement elemt2 = find(By.xpath(btnLogin.toString().substring(quitaXpath-1)));
		

		((JavascriptExecutor) getDriver()).executeScript(highlighRed, elemt2);
	}
	
	public void scrollingHighligElementString(String elemto) {
		//Scroll.to(elemto).andAlignToBottom();
		
		System.out.println(elemto);
		WebElement elemt2 = find(By.xpath(elemto));

		((JavascriptExecutor) getDriver()).executeScript(highlighRed, elemt2);
	}
	
	public void scrollingHighligElementWebelemet(WebElementFacade elemto) {
		

		((JavascriptExecutor) getDriver()).executeScript(highlighRed, elemto);
	}
	
	public void scrollingElement(Target Elemet) {
		Scroll.to(Elemet).andAlignToBottom();
		
	}
	
	public void downoUpScroll (String x, String y) {
		((JavascriptExecutor) getDriver()).executeScript("window.scrollBy("+x+","+y+")");
	}
	
	
	public static void  setupDriver() {

		
		switch (SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.driver")) {
		case "chrome":			
			//WebDriverManager.chromedriver().forceDownload();
			    WebDriverManager.chromedriver().useBetaVersions().setup();
			   
			break;
		case "ie":case "iexplorer":
			//activar WebDriverManager.iedriver().setup();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			break;
		default:
			
			
			
			
			WebDriverManager.chromedriver().setup();
			
			
			break;
		}
	}

	public void clik() {
	WebElementFacade btn =find(By.xpath("//*[@id='form2']//tr[contains(@id,'Vertical_v1_LE_v2_DXDataRow')]//span[contains(@id,'Vertical_v1_LE_v2_cell0_0_xaf_Fecha')]"));
	
	btn.click();
	System.out.println("1");
	}

	public WebElement converToWebELemet(By selectproyecto) {
		
		return element(selectproyecto);
	}
	
	
	public WebElementFacade SerchonTabletwebelemt(By selectproyecto, String stgProyecto) {
		List<WebElementFacade>	select = find(selectproyecto);
		System.out.println(select.size());
		
		for (int i = 0; i < select.size(); i++) {
			if(select.get(i).getText().contains(stgProyecto)) {
				scrollingHighligElementWebelemet(select.get(i));
				return select.get(i);
			}
		}
		
		return null;
	}


	public String generarFecha() {
		Date fecha = new Date();
		String strDateFormat = "dd/MM/yyyy";
		SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
		return String.valueOf(objSDF.format(fecha));
	}

}
