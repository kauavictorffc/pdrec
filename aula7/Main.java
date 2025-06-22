public class Main {
    public static void main(String[] args) {
        EletronicosFactory apple = new AppleFactory();
        Smartphone iphone = apple.criarSmartphone();
        Notebook macbook = apple.criarNotebook();
        iphone.exibirInfo();
        macbook.exibirInfo();

        System.out.println();

        EletronicosFactory samsung = new SamsungFactory();
        Smartphone galaxy = samsung.criarSmartphone();
        Notebook galaxyBook = samsung.criarNotebook();
        galaxy.exibirInfo();
        galaxyBook.exibirInfo();
    }
}
