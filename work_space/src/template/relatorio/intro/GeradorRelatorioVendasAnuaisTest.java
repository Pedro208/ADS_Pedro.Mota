package template.relatorio.intro;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeradorRelatorioVendasAnuaisTest {

    @Test
    void deveGerarRelatorioVendasAnuais(){
        GeradorRelatorioTemplate template = new GeradorRelatorioVendasAnuais(2022);
        String pagina = template.criarPagina();
        System.out.printf(pagina);
    }
}