package br.com.portifolio.forDevs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForDevsPage {
	
	private WebDriver driver;
	
	public ForDevsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void visit() {
		driver.get("http://www.4devs.com.br/");
		driver.manage().window().maximize();
	}
	
	public GeneratorPeoplePage newGeneratorPeolple() {
		driver.findElement(By.linkText("Gerador de Pessoas")).click();
		return new GeneratorPeoplePage(driver);
	}
	
	
	
	
}
