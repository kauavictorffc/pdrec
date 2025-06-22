public class BuilderConcreto implements Builder {
    private Produto produto = new Produto();

    public void buildParteA() {
        produto.setParteA("Componente A montado");
    }

    public void buildParteB() {
        produto.setParteB("Componente B montado");
    }

    public Produto getResultado() {
        return produto;
    }
}
