import java.util.HashMap;
import java.util.Map;

public class Plataforma {
    private Map<String, Genero> generos = new HashMap<>();

    public Genero obterGenero(String nome) {
        return generos.computeIfAbsent(nome, Genero::new);
    }

    public void adicionarConteudo(String generoNome, String conteudo) {
        Genero genero = obterGenero(generoNome);
        genero.adicionarConteudo(conteudo);
    }
}
