public class PacoteCashBack extends PacoteAdicional {
    public PacoteCashBack(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Compra com CashBack";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 19.99;
    }
}
