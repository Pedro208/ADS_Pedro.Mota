package template.relatorio.intro;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeradorRelatorioVendasMensaisTest {

    @Test
    void deveGerarRelatorioVendasMensais(){
        GeradorRelatorioTemplate template = new GeradorRelatorioVendasMensais(2022, 10);
        String pagina = template.criarPagina();
        System.out.printf(pagina);
    }

}