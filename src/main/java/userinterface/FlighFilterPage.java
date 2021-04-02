package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlighFilterPage extends PageObject {
    public static  final Target Filter1Stop = Target.the("label departing fligh").located(By.xpath("//input[@id='stops-1']"));
    public static  final Target filterAlaskaAirlenes = Target.the("Message covid").located(By.xpath("//input[@id='preferred-airline-AS']"));
    public static  final Target lblFilter1Stop = Target.the("label departing fligh").located(By.xpath("//*[@data-test-id='journey-duration']"));
    public static  final Target lblfilterAlaskaAirlenes = Target.the("Message covid").located(By.xpath("//*[@data-test-id='flight-operated']"));

}
