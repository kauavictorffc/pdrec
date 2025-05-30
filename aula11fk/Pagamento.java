public class Pagamento {
    private String metodo; 
    private double valorBase;
    private int parcelas;

    public Pagamento(String metodo, double valorBase, int parcelas) {
        this.metodo = metodo;
        this.valorBase = valorBase;
        this.parcelas = parcelas;
    }

    public double calcularTotal() {
        return switch (metodo) {
            case "Pix" -> valorBase * 0.9;
            case "Boleto" -> valorBase * 0.95;
            case "Crédito" -> {
                if (parcelas <= 1) yield valorBase;
                double acrescimo = 1 + (0.0399 * (parcelas - 1));
                yield valorBase * acrescimo;
            }
            default -> valorBase; // Débito
        };
    }

    public String getInfo() {
        return "Método: " + metodo + ", Parcelas: " + parcelas;
    }
}
