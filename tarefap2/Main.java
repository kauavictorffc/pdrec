public class Main {
    public static void main(String[] args) {
        Assinatura assinatura = new AssinaturaBase();

        assinatura = new PacoteMultiplosDispositivos(assinatura);
        assinatura = new PacoteCashBack(assinatura);
        assinatura = new PacoteFreteGratis(assinatura);

        System.out.println("Assinatura selecionada:");
        System.out.println(assinatura.getDescricao());
        System.out.printf("Preço total: R$ %.2f\n", assinatura.getPreco());
    }
}
