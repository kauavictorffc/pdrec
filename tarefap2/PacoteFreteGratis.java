public class PacoteFreteGratis extends PacoteAdicional {
    public PacoteFreteGratis(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Frete Grátis";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 9.99;
    }
}
