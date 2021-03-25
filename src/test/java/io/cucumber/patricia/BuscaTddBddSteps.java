package io.cucumber.patricia;


import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.patricia.servicos.Configuracao;

public class BuscaTddBddSteps{
 
    @Quando("digito no campo de busca a palavra {string}")
    public void digito_no_campo_de_busca_a_palavra(String string) {
        Configuracao.cssSelector(".form-pesquisa").sendKeys(string);
        Configuracao.cssSelector(".btn-pesquisa").click();
    }
    
    @Entao("devo ver o resultado {string} na busca")
    public void devo_ver_o_resultado_na_busca(String string) {
        assertEquals(true, Configuracao.browser.findElements(By.cssSelector(".div-card-aulas")).size() > 0);
        Configuracao.fechar();
    }
    
}