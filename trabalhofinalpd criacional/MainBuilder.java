public class MainBuilder {
    public static void main(String[] args) {
        Builder builder = new BuilderConcreto();
        builder.buildParteA();
        builder.buildParteB();
        Produto produto = builder.getResultado();
        produto.mostrar();
    }
}
