public class ReservaHotel {
    private String tipoQuarto; 
    private int numPessoas;

    public ReservaHotel(String tipoQuarto, int numPessoas) {
        this.tipoQuarto = tipoQuarto;
        this.numPessoas = numPessoas;
    }

    public double calcularPreco() {
        double base = 200.0;
        double precoPorPessoa = switch (tipoQuarto) {
            case "Executivo" -> base * 1.5;
            case "Suite" -> base * 1.5 * 3.0;
            default -> base;
        };
        return precoPorPessoa * numPessoas;
    }

    public String getInfo() {
        return "Quarto: " + tipoQuarto + ", Pessoas: " + numPessoas;
    }
}
