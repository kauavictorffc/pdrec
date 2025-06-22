public class SamsungFactory implements EletronicosFactory {
    @Override
    public Smartphone criarSmartphone() {
        return new Galaxy();
    }

    @Override
    public Notebook criarNotebook() {
        return new GalaxyBook();
    }
}
