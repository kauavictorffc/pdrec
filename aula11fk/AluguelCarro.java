public class AluguelCarro {
    private String tipoCarro; 

    public AluguelCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public double calcularPreco() {
        double base = 150.0;
        return switch (tipoCarro) {
            case "Executivo" -> base * 2;
            case "Luxo" -> base * 4;
            default -> base;
        };
    }

    public String getInfo() {
        return "Tipo do carro: " + tipoCarro;
    }
}
