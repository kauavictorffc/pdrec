public class PacoteCaixaSurpresa extends PacoteAdicional {
    public PacoteCaixaSurpresa(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Caixa Surpresa";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 29.99;
    }
}
