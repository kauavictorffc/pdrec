import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Caixa {
    private String nivel;
    private List<Item> itens;
    private static final String[] ITENS_DISPONIVEIS = {
        "Quadrinho", "Chaveiro", "Busto", "Adesivo", "Poster", "Camiseta", "Caneta", "Miniatura"
    };

    public Caixa(String nivel) {
        this.nivel = nivel;
        this.itens = new ArrayList<>();
        preencherCaixa();
    }

    private void preencherCaixa() {
        int quantidade = switch (nivel) {
            case "Bronze" -> 3;
            case "Prata" -> 5;
            case "Ouro" -> 7;
            case "Platina" -> 10;
            default -> 0;
        };

        Random random = new Random();

        for (int i = 0; i < quantidade; i++) {
            String nomeItem = ITENS_DISPONIVEIS[random.nextInt(ITENS_DISPONIVEIS.length)];
            double preco = getPrecoPorItem(nomeItem);
            itens.add(new Item(nomeItem, preco));
        }
    }

    private double getPrecoPorItem(String nome) {
        return switch (nome) {
            case "Quadrinho" -> 15.00;
            case "Chaveiro" -> 5.00;
            case "Busto" -> 10.00;
            case "Adesivo" -> 1.00;
            case "Poster" -> 25.00;
            case "Camiseta" -> 25.00;
            case "Caneta" -> 3.00;
            case "Miniatura" -> 20.00;
            default -> 0.00;
        };
    }

    public void mostrarItens() {
        for (Item item : itens) {
            System.out.println(item);
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}
