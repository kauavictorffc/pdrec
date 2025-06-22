public class Main {
    public static void main(String[] args) {
        MovelFactory moderna = new ModernaFactory();
        Cadeira cadeira1 = moderna.criarCadeira();
        Mesa mesa1 = moderna.criarMesa();
        cadeira1.exibirInfo();
        mesa1.exibirInfo();

        System.out.println();

        MovelFactory classica = new ClassicaFactory();
        Cadeira cadeira2 = classica.criarCadeira();
        Mesa mesa2 = classica.criarMesa();
        cadeira2.exibirInfo();
        mesa2.exibirInfo();
    }
}
