package Base;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import pages.FormPage;

public class BaseTests {

	private static WebDriver driver;
	protected FormPage formulariopage;
	
		
	@BeforeAll
	public static void inicializar() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\83\\chromedriver.exe");
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
				
		driver = new ChromeDriver();
	}
	
	
	
	@BeforeEach
	public void  carregarPaginaInicial() {
		driver.get("http://localhost:8080/");
		formulariopage = new FormPage(driver);
	}
	
	//@AfterAll
	// static void finalizar() {
	//	driver.quit();
	//}
}
