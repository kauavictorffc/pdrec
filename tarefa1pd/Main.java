public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Toni", 30, "123.456.789-00", "Rua A, 123", "5555-1234");
        Engenheiro engenheiro = new Engenheiro("Ana", 40, "987.654.321-00", "Rua B, 456", "5555-5678");
        Gerente gerente = new Gerente("Carlos", 50, "111.222.333-44", "Rua C, 789", "5555-9101");

        System.out.println("Informações do Cliente:");
        cliente.mostrarInformacoes();

        System.out.println("\nInformações do Engenheiro:");
        engenheiro.mostrarInformacoes();

        System.out.println("\nInformações do Gerente:");
        gerente.mostrarInformacoes();

        System.out.println("\nAções do Engenheiro:");
        engenheiro.realizarPedido();

        System.out.println("\nAções do Gerente:");
        gerente.realizarPedido();
        gerente.criarDepartamento();
        gerente.cadastrarFuncionarios();
    }
}
