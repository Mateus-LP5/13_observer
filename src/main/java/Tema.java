import java.util.Observable;

public class Tema extends Observable {

    private String descricao;

    public Tema(String descricao) {
        this.descricao = descricao;
    }

    public void atualizarNoticiasDoTema() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
