import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Kauã", "123.456.789-00");
        Cliente c2 = new Cliente("Ryan", "987.654.321-00");

        ReservaPassagem passagem = new ReservaPassagem("2A", "Primeira");
        ReservaHotel hotel = new ReservaHotel("Suite", 2);
        AluguelCarro carro = new AluguelCarro("Luxo");
        Pagamento pagamento = new Pagamento("Crédito", 
            passagem.calcularPreco() + hotel.calcularPreco() + carro.calcularPreco(), 
            3);

        PacoteViagemFacade pacote = new PacoteViagemFacade(
            Arrays.asList(c1, c2), passagem, hotel, carro, pagamento
        );

        pacote.reservarPacote();
    }
}
