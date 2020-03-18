package br.com.portifolio.forDevs;

import java.io.FileNotFoundException;
//import java.lang.reflect.Type;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.reflect.TypeToken;

public class ForDevs {
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException{
		
		WebDriver driver = new ChromeDriver();
		
		String qttPeoples = "1";
		
		ForDevsPage forDevsPage = new ForDevsPage(driver);
		forDevsPage.visit();
		
		GeneratorPeoplePage peoplePage = forDevsPage.newGeneratorPeolple();
		PeopleJson peopleJson = peoplePage.fill("SP", "9668", qttPeoples);
		
		List<People> peoples = peopleJson.convert();
		
		OutUtils.writePeoples("Pessoas", ".csv", peoples);
		
		System.out.println("Fim!!!");
		
	}
	
	

}
