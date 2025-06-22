public class AppleFactory implements EletronicosFactory {
    @Override
    public Smartphone criarSmartphone() {
        return new Iphone();
    }

    @Override
    public Notebook criarNotebook() {
        return new Macbook();
    }
}
