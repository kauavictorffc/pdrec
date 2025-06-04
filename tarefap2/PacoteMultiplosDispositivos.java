public class PacoteMultiplosDispositivos extends PacoteAdicional {
    public PacoteMultiplosDispositivos(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Pacote Múltiplos Dispositivos";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 19.99;
    }
}
