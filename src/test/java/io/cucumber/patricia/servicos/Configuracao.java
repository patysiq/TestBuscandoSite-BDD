package io.cucumber.patricia.servicos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuracao {

	public static WebDriver browser;
	
	public static void abrir(String url) {
		
		if(browser == null) {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver");		
			browser = new ChromeDriver();
		}
		
		browser.get(url);		
	}
	
	public static void fechar() {
		browser.quit();
		browser = null;
	}
	
	public static WebElement cssSelector(String selector) {
		return browser.findElement(By.cssSelector(selector));
	}
	
	public static List<WebElement> cssSelectors(String selector) {
		return browser.findElements(By.cssSelector(selector));
	}
}