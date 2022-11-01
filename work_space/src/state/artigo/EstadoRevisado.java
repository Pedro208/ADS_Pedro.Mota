package state.artigo;

public class EstadoRevisado implements Estado{

    private Artigo artigo;

    public EstadoRevisado(Artigo artigo){
        this.artigo = artigo;
    }

    @Override
    public void publicar() {
        //Implementar
    }

    @Override
    public void reprovar() {
        //Implementar
    }
}
