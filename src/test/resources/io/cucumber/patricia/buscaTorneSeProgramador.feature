# language: pt
Funcionalidade: Busca no site Torne-se
Criacao de um teste para verificar da busca do site Torne-se

    Cenario: Entrar no site do torne-se um programador e buscar pelo conteudo tdd
	    Quando eu acesso o site do Torne-se um programador
        E digito no campo de busca a palavra "tdd"
        Entao devo ver o resultado "tdd" na busca


    Cenario: Entrar no site do torne-se um programador e buscar pelo conteudo bdd
        Quando eu acesso o site do Torne-se um programador
        E digito no campo de busca a palavra "bdd"
        Entao devo ver o resultado da busca
