public class Usuario implements Observer {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void inscrever(Genero genero) {
        genero.adicionarObserver(this);
        System.out.println(nome + " se inscreveu no gênero " + genero.getNome());
    }

    public void desinscrever(Genero genero) {
        genero.removerObserver(this);
        System.out.println(nome + " cancelou inscrição do gênero " + genero.getNome());
    }

    @Override
    public void update(String genero, String conteudo) {
        System.out.println("[" + nome + "] Notificação: Novo conteúdo em " + genero + " → " + conteudo);
    }
}
