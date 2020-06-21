package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class FormPage {

	private WebDriver driver;
	
		
	private By nome = By.cssSelector("div:nth-child(2) > div > input[type=text]");
	
	private By sobrenome = By.cssSelector("div:nth-child(3) > div > input[type=text]");
			
	private By email = By.cssSelector("div:nth-child(4) > div > input[type=text]");
					
	private By senha = By.cssSelector("div:nth-child(5) > div > input[type=password]");
	
	private By botaoEnviar = By.cssSelector("#app > div > form > button");
	
	private By obterNome = By.cssSelector("div:nth-child(2) > span");
			
	private By obterSobrenome = By.cssSelector("div:nth-child(3) > span");
	
	private By obterEmail = By.cssSelector("div:nth-child(4) > span");
	
	private By obterSenha = By.cssSelector("div:nth-child(5) > span");
			
	
	public FormPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void preencherNome(String texto) {
		driver.findElement(nome).sendKeys(texto);
	}
	
	public void preencherSobrenome(String texto) {
		driver.findElement(sobrenome).sendKeys(texto);
	}
	
	public void preencherEmail(String texto) {
		driver.findElement(email).sendKeys(texto);
	}
	
	public void preencherSenha(String texto) {
		driver.findElement(senha).sendKeys(texto);
	}
	
	public void clicarBotaoEnviar() {
		driver.findElement(botaoEnviar).click();
		
	}
	
	public String obterNome() {
		return driver.findElement(nome).getText();
	}
	
	public String obterSobrenome() {
		return driver.findElement(sobrenome).getText();
	}
	
	public String obterEmail() {
		return driver.findElement(email).getText();
	}
	
	public String obterSenha() {
		return driver.findElement(senha).getText();
	}
}

