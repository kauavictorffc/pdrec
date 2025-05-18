public abstract class ViolaoPrototype implements Violao {
    protected String descricao;
    protected String cordas;
    protected String tipoSom;

    @Override
    public Violao clone() {
        try {
            return (Violao) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void exibirInformacoes() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Cordas: " + cordas);
        System.out.println("Som: " + tipoSom);
        System.out.println("----------------------------------");
    }
}
