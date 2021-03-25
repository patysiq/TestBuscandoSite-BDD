package io.cucumber.patricia;

import io.cucumber.patricia.servicos.Configuracao;
import io.cucumber.java.pt.*;

public class BuscaConteudoCacheSteps{
	
    @Quando("cliquei no curso de cache")
    public void cliquei_no_curso_de_cache() {
        Configuracao.cssSelector("a[href='/aulas/cache'] img").click();	
    }

    @Entao("devo clicar no curso de varnish para poder assistir")
    public void devo_clicar_no_curso_de_varnish_para_poder_assistir() {
        Configuracao.cssSelector(".div-card-aulas:last-child a").click();	    
	    Configuracao.fechar();
    }

}