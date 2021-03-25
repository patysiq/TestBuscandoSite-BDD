package io.cucumber.patricia;

import io.cucumber.patricia.servicos.Configuracao;
import io.cucumber.java.pt.*;

public class CompartilhadoSteps{
    @Quando("eu acesso o site do Torne-se um programador")
    public void eu_acesso_o_site_do_Torne_se_um_programador() {
        Configuracao.abrir("https://www.torneseumprogramador.com.br/");
    }
    
}