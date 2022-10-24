package state.artigo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Artigo {

    private String estado;
    private List<String> logHistorico = new ArrayList<>();

    public Artigo() {
        this.estado = "RASCUNHO";
    }

    public String getEstado() {
        return estado;
    }
    public List<String> getLogHistorico() {
        return logHistorico;
    }

    public void publicar(){
        GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstante();

        if("RASCUNHO".equals(this.estado)){
            if(gerenteDeSeguranca.ehUsuarioAutor()){
                this.estado = "REVISANDO";
                this.logHistorico.add("Transitando para REVISANDO em " + LocalDate.now());
                return;
            }else{
                throw new RuntimeException("Usuário não tem permissão para publicar");
            }
        }
        if("REVISANDO".equals(this.estado)){
            if(gerenteDeSeguranca.ehUsuarioModerador()){
                this.estado = "APROVADO";
                this.logHistorico.add("Transitado para APROVADO em " + LocalDate.now());
                return;

            }else{
                throw new RuntimeException("Usuário não tem permissão para publicar");
            }
        }
        if("APROVADO".equals(this.estado)){
            return;
        }
    }

    public void reprovar(){

    }
}
