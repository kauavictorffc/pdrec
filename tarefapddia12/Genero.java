import java.util.ArrayList;
import java.util.List;

public class Genero {
    private String nome;
    private List<Observer> usuarios = new ArrayList<>();
    private List<String> conteudos = new ArrayList<>();

    public Genero(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarObserver(Observer usuario) {
        usuarios.add(usuario);
    }

    public void removerObserver(Observer usuario) {
        usuarios.remove(usuario);
    }

    public void adicionarConteudo(String conteudo) {
        conteudos.add(conteudo);
        System.out.println("Novo conteúdo adicionado em " + nome + ": " + conteudo);
        notificarObservers(conteudo);
    }

    private void notificarObservers(String conteudo) {
        for (Observer usuario : usuarios) {
            usuario.update(nome, conteudo);
        }
    }
}
