public class Main {
    public static void main(String[] args) {
        Caixa caixa = new Caixa("Ouro");

        System.out.println("Itens da caixa nível Ouro:");
        caixa.mostrarItens();

        System.out.printf("Valor total: R$ %.2f\n", caixa.calcularValorTotal());
    }
}
