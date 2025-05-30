public class ReservaPassagem {
    private String poltrona;
    private String classe; 

    public ReservaPassagem(String poltrona, String classe) {
        this.poltrona = poltrona;
        this.classe = classe;
    }

    public double calcularPreco() {
        double base = 500.0;
        return switch (classe) {
            case "Executiva" -> base * 2.5;
            case "Primeira" -> base * 2.5 * 2.5;
            default -> base;
        };
    }

    public String getInfo() {
        return "Classe: " + classe + ", Poltrona: " + poltrona;
    }
}
