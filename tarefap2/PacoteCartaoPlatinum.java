public class PacoteCartaoPlatinum extends PacoteAdicional {
    public PacoteCartaoPlatinum(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Cartão Platinum";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 49.99;
    }
}
