package template.relatorio.intro;

import java.util.List;

public class GeradorRelatorioVendasMensais extends GeradorRelatorioTemplate{

    private Integer ano;
    private Integer mes;

    public GeradorRelatorioVendasMensais(Integer ano, Integer mes) {
        this.ano = ano;
        this.mes = mes;
    }
    @Override
    public List<String> getConteudo() {
        List<String> conteudo = ServicoRelatorio.getInstance().getVendasMensal(ano, mes);
        return conteudo;
    }
}
