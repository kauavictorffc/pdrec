// ❌ Viola OCP: A classe precisa ser alterada para adicionar novos descontos
class ProdutoErrado {
    private double preco;
    private String tipoDesconto;

    public ProdutoErrado(double preco, String tipoDesconto) {
        this.preco = preco;
        this.tipoDesconto = tipoDesconto;
    }

    public double calcularPreco() {
        if (tipoDesconto.equals("Natal")) {
            return preco * 0.9; // 10% de desconto
        } else if (tipoDesconto.equals("Ano Novo")) {
            return preco * 0.85; // 15% de desconto
        }
        return preco;
    }
}

// ✅ Correto: Usando uma interface para permitir novos descontos sem modificar a classe Produto
interface Desconto {
    double aplicarDesconto(double preco);
}

class DescontoNatal implements Desconto {
    public double aplicarDesconto(double preco) {
        return preco * 0.9;
    }
}

class DescontoAnoNovo implements Desconto {
    public double aplicarDesconto(double preco) {
        return preco * 0.85;
    }
}

class Produto {
    private double preco;
    private Desconto desconto;

    public Produto(double preco, Desconto desconto) {
        this.preco = preco;
        this.desconto = desconto;
    }

    public double calcularPreco() {
        return desconto.aplicarDesconto(preco);
    }
}
