package state.artigo;

import java.util.ArrayList;
import java.util.List;

public class ZzzArtigo {

    private Estado estado;
    private List<String> logHistorico = new ArrayList<>();

    public void publicar(){
        estado.publicar();
    }
    public void reprovar(){
        estado.reprovar();
    }
    protected void transitarEstadoPara(Estado estado){
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
    public List<String> getLogHistorico() {
        return logHistorico;
    }

}
