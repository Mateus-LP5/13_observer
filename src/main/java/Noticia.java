public class Noticia {

    private String titulo;
    private String dataPublicacao;
    private Tema tema;

    public Noticia(String titulo, String dataPublicacao, Tema tema) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.tema = tema;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public Tema getTema() {
        return tema;
    }


}
