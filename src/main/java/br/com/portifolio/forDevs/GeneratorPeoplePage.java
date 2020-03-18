package br.com.portifolio.forDevs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneratorPeoplePage {

	private WebDriver driver;

	public GeneratorPeoplePage(WebDriver driver) {
		this.driver = driver;
	}

	public PeopleJson fill(String state, String city, String qttPeoples) throws InterruptedException {
		WebElement stateCbx = driver.findElement(By.id("cep_estado"));
		Select comboState = new Select(stateCbx);
		comboState.selectByValue(state);
		Thread.sleep(3000);
		WebElement cityCbx = driver.findElement(By.id("cep_cidade"));
		Select comboCity = new Select(cityCbx);
		comboCity.selectByValue(city);
//		comboCidade.selectByValue("9668");

		WebElement qttPeopleTxt = driver.findElement(By.id("txt_qtde"));
		qttPeopleTxt.clear();
		qttPeopleTxt.sendKeys(qttPeoples);
		driver.findElement(By.id("bt_gerar_pessoa")).click();
		Thread.sleep(2000);
		if (qttPeoples == "1") 
			driver.findElement(By.id("btn_json_tab")).click();
		
		WebElement element = driver.findElement(By.id("dados_json"));
		Thread.sleep(8000);
		String json = element.getText();
		return new PeopleJson(json , qttPeoples);
	}	
}








