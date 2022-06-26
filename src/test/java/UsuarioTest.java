import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UsuarioTest {

    @Test
    void deveNotificarUmUsuario() {
        Tema tema = new Tema("Informática");
        Noticia noticia = new Noticia("Google Duplex é lançado oficialmente no Brasil","14/06/2022", tema);
        Usuario usuario = new Usuario("Anna");
        usuario.setTema(tema);
        tema.atualizarNoticiasDoTema();
        assertEquals("Anna, temos uma nova notícia sobre Informática que pode lhe interessar.", usuario.getUltimaNotificacao());
    }

    @Test
    void deveNotificarUsuarios() {
        Tema tema = new Tema("Informática");
        Noticia noticia = new Noticia("Google Duplex é lançado oficialmente no Brasil","14/06/2022", tema);
        Usuario usuario1 = new Usuario("Anna");
        Usuario usuario2 = new Usuario("Rodrigo");
        usuario1.setTema(tema);
        usuario2.setTema(tema);
        tema.atualizarNoticiasDoTema();
        assertEquals("Anna, temos uma nova notícia sobre Informática que pode lhe interessar.", usuario1.getUltimaNotificacao());
        assertEquals("Rodrigo, temos uma nova notícia sobre Informática que pode lhe interessar.", usuario2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarusuario() {
        Tema tema = new Tema("Informática");
        Noticia noticia = new Noticia("Google Duplex é lançado oficialmente no Brasil","14/06/2022", tema);
        Usuario usuario = new Usuario("Anna");
        tema.atualizarNoticiasDoTema();
        assertEquals(null,usuario.getUltimaNotificacao());
    }

    @Test
    void deveNotificarUsuarioQueTemInteresseNoTema1() {
        Tema tema1 = new Tema("Informática");
        Noticia noticia1 = new Noticia("Google Duplex é lançado oficialmente no Brasil","14/06/2022", tema1);

        Tema tema2 = new Tema("Esportes");
        Noticia noticia2 = new Noticia("Ferrari revela chamada frenética por trás do pit stop de Sainz no Canadá","21/06/2022", tema2);

        Usuario usuario1 = new Usuario("Anna");
        Usuario usuario2 = new Usuario("Rodrigo");

        usuario1.setTema(tema1);
        usuario2.setTema(tema2);

        tema1.atualizarNoticiasDoTema();

        assertEquals("Anna, temos uma nova notícia sobre Informática que pode lhe interessar.", usuario1.getUltimaNotificacao());
        assertEquals(null,usuario2.getUltimaNotificacao());
    }
}