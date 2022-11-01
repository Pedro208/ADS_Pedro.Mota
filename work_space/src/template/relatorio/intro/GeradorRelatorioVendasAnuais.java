package template.relatorio.intro;

import java.util.List;

public class GeradorRelatorioVendasAnuais  extends GeradorRelatorioTemplate{

    private Integer ano;

    public GeradorRelatorioVendasAnuais(Integer ano) {
        this.ano = ano;
    }
    @Override
    public List<String> getConteudo() {
        List<String> conteudo = ServicoRelatorio.getInstance().getVendasAnual(this.ano);
        return conteudo;
    }
}
