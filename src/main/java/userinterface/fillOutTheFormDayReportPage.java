package userinterface;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;

public class fillOutTheFormDayReportPage extends PageObject{
	
	public static  final Target btnBusquedaProyecto = Target.the("btn reporte ").locatedBy("//td[contains(@id,'MainLayoutEdit') and contains(@id,'Proyecto_Edit_Fin')]");
	public static  final  By iFrame =  By.xpath("//iframe[@class='dxpc-iFrame']");
	

	public  static final By selectProyecto=  By.xpath("//tr[contains(@id,'DXDataRow')]//span[contains(@id,'Nombre_')]");
	//public   List<WebElement>  selectProyecto =  find(By.xpath("//tr[contains(@id,'Dialog_v6_LE_v7_DXDataRow')]//span[contains(@id,'Nombre_') ]"));
	
	//opcional
	public static  final Target btnAceptarProyecto = Target.the("boton aceptar el proyecto seleccionado ").locatedBy("//*[contains(@id,'Dialog_actionContainerHolder_Menu')]//a[contains(@title,'Aceptar')]");
	//tipo de hora 
	
	public static  final Target drdTipoHora = Target.the("selector del tipo de hora ").locatedBy("//*[@id='Vertical_v11_MainLayoutEdit_xaf_l155_xaf_dviTipoHora_Edit_DD_DDD_L_LBT']");
	public static  final Target btnBusquedaServicio = Target.the("btn busqueda del servicio ").locatedBy("//*[@id='Vertical_v11_MainLayoutEdit_xaf_l160_xaf_dviServicio_Edit_Find_CD']");
	public static  final Target txtBusquedaServicio = Target.the("text de busqueda de servicio ").locatedBy("//*[@id='Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed']");
	public static  final Target selectservico =  Target.the("seleccion de servicio ").locatedBy("//*[contains(@id,'Dialog_v8_LE_v9_DXDataRow')]//span[contains(@id,'Nombre')]");
	public static  final Target drdActividad = Target.the("selector de actividades ").locatedBy("//*[@id ='Vertical_v11_MainLayoutEdit_xaf_l165_xaf_dviActividad_Edit_DD_DDD_L_LBT']");
	public static  final Target btnCausaOcioso = Target.the("boton de causa de ocioso ").locatedBy("//*[@id ='Vertical_v11_MainLayoutEdit_xaf_l170_xaf_dviCausalOcioso_Edit_DD_DDD_L_LBT']");
	public static  final Target txtHorasEjecutadas = Target.the(" horas ejecutadas ").locatedBy("//*[@id ='Vertical_v11_MainLayoutEdit_xaf_l189_xaf_dviHoras_Edit_I']");
	public static  final Target txtHorasAdicionalesAPagar = Target.the("campo de oras adicionales ").locatedBy("//*[@id ='Vertical_v11_MainLayoutEdit_xaf_l199_xaf_dviHorasAdicionalesAPagar_Edit_I']");
	public static  final Target Comentario = Target.the(" campo de comentario  ").locatedBy("//*[@id ='Vertical_v11_MainLayoutEdit_xaf_l214_xaf_dviComentario_Edit_I']");
	

	

}
