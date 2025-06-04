public abstract class PacoteAdicional implements Assinatura {
    protected Assinatura assinatura;

    public PacoteAdicional(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao();
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco();
    }
}
