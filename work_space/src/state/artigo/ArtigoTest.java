package state.artigo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArtigoTest {

    @Test
    void deveArtigoTransportarDeRascunhoAteAprovado(){
        GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstante();

        Artigo artigo = new Artigo();

        gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
        artigo.publicar();

        assertEquals("REVISANDO", artigo.getEstado());

        gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
        artigo.publicar();

        assertEquals("APROVADO", artigo.getEstado());

        artigo.getLogHistorico().forEach(System.out::println);
    }

}