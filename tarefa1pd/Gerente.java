public class Gerente extends Pessoa implements Fornecedor, Departamento {
    public Gerente(String nome, int idade, String cpf, String endereco, String telefone) {
        super(nome, idade, cpf, endereco, telefone);
    }

    @Override
    public void realizarPedido() {
        System.out.println("Gerente realizando pedido...");
    }

    @Override
    public void criarDepartamento() {
        System.out.println("Departamento criado pelo Gerente.");
    }

    @Override
    public void cadastrarFuncionarios() {
        System.out.println("Funcionários cadastrados pelo Gerente.");
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Gerente: " + getNome());
    }

    @Override
    public void atualizarInformacoes() {
        System.out.println("Informações do Gerente atualizadas.");
    }
}
