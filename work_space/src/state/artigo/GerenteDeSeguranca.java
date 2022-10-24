package state.artigo;

public class GerenteDeSeguranca {

    private static GerenteDeSeguranca instante;
     private GerenteDeSeguranca(){

     }
    private String usuarioCorrente;

    public String getUsuarioCorrente() {
        return usuarioCorrente;
    }
    public void setUsuarioCorrente(String usuarioCorrente) {
        this.usuarioCorrente = usuarioCorrente;
    }public boolean ehUsuarioModerador(){
        return "MODERADOR".equals(usuarioCorrente);
    }
    public boolean ehUsuarioAutor(){
        return "AUTOR".equals(usuarioCorrente);
    }


    public static GerenteDeSeguranca getInstante() {
         if(instante == null){
             instante = new GerenteDeSeguranca();
         }
        return instante;
    }
}
