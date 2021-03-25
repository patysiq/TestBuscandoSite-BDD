package io.cucumber.patricia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;

public class BuscaTddBddSteps{
    public BuscaTddBddSteps(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        browser = new ChromeDriver();
    }

    public WebDriver browser;

    @Quando("eu acesso o site do Torne-se um programador")
    public void eu_acesso_o_site_do_Torne_se_um_programador() {
        browser.get("https://www.torneseumprogramador.com.br/");
    }
    
    @Quando("digito no campo de busca a palavra {string}")
    public void digito_no_campo_de_busca_a_palavra(String string) {
        WebElement input = browser.findElement(By.cssSelector(".form-pesquisa"));
        input.sendKeys(string);
        browser.findElement(By.cssSelector(".btn-pesquisa")).click();
    }
    
    @Entao("devo ver o resultado {string} na busca")
    public void devo_ver_o_resultado_na_busca(String string) {
        assertEquals(true, browser.findElements(By.cssSelector(".div-card-aulas")).size() > 0);
        browser.quit();
    }
    
}