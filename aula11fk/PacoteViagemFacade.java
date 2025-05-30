import java.util.List;

public class PacoteViagemFacade {
    private List<Cliente> clientes;
    private ReservaPassagem passagem;
    private ReservaHotel hotel;
    private AluguelCarro carro;
    private Pagamento pagamento;

    public PacoteViagemFacade(List<Cliente> clientes,
                               ReservaPassagem passagem,
                               ReservaHotel hotel,
                               AluguelCarro carro,
                               Pagamento pagamento) {
        this.clientes = clientes;
        this.passagem = passagem;
        this.hotel = hotel;
        this.carro = carro;
        this.pagamento = pagamento;
    }

    public void reservarPacote() {
        System.out.println("=== Dados dos Clientes ===");
        for (Cliente c : clientes) {
            System.out.println(c.getDados());
        }

        System.out.println("\n=== Detalhes da Viagem ===");
        System.out.println(passagem.getInfo());
        System.out.println(hotel.getInfo());
        System.out.println(carro.getInfo());
        System.out.println(pagamento.getInfo());

        double totalBase = passagem.calcularPreco() + hotel.calcularPreco() + carro.calcularPreco();
        double totalFinal = pagamento.calcularTotal();

        System.out.printf("\nValor base do pacote: R$ %.2f\n", totalBase);
        System.out.printf("Valor final com forma de pagamento: R$ %.2f\n", totalFinal);
    }
}
