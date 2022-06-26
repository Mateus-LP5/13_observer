import java.util.Observable;
import java.util.Observer;

public class Usuario implements Observer{

    private String nome;
    private String ultimaNotificacao;

    public Usuario(String nome){
        this.nome = nome;
    }

    public String getUltimaNotificacao(){
        return this.ultimaNotificacao;
    }

    public void setTema(Tema tema){
        tema.addObserver(this);
    }

    public void update(Observable tema, Object arg1) {
        this.ultimaNotificacao = this.nome + ", temos uma nova notícia sobre " + tema.toString() +
                " que pode lhe interessar.";
    }
}
