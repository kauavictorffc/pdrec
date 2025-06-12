public class Main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();

        Genero acao = plataforma.obterGenero("Ação");
        Genero comedia = plataforma.obterGenero("Comédia");
        Genero terror = plataforma.obterGenero("Terror");
        Genero anime = plataforma.obterGenero("Anime");
        Genero ficcao = plataforma.obterGenero("Ficção Científica");

        Usuario u1 = new Usuario("Kauã");
        Usuario u2 = new Usuario("Nathany");
        Usuario u3 = new Usuario("Carlos");
        Usuario u4 = new Usuario("Lúcia");
        Usuario u5 = new Usuario("Fernanda");

        u1.inscrever(acao);
        u1.inscrever(terror);

        u2.inscrever(anime);
        u2.inscrever(ficcao);

        u3.inscrever(comedia);

        u4.inscrever(acao);
        u4.inscrever(comedia);
        u4.inscrever(ficcao);

        u5.inscrever(terror);

        plataforma.adicionarConteudo("Ação", "Missão Impossível 8");
        plataforma.adicionarConteudo("Comédia", "Todo Mundo em Pânico");
        plataforma.adicionarConteudo("Terror", "Invocação do Mal");
        plataforma.adicionarConteudo("Anime", "Naruto Shippuden");
        plataforma.adicionarConteudo("Ficção Científica", "Interestelar");
    }
}
