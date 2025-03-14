public abstract class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private String telefone;

    public Pessoa(String nome, int idade, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public abstract void mostrarInformacoes();
    public abstract void atualizarInformacoes();

    public String getNome() {
        return nome;
    }

}
