public class Main {
    public static void main(String[] args) {
        Luz luz = new Luz();
        TV tv = new TV();

        Command ligarLuz = new LigarLuzCommand(luz);
        Command desligarLuz = new DesligarLuzCommand(luz);
        Command ligarTV = new LigarTVCommand(tv);
        Command desligarTV = new DesligarTVCommand(tv);

        ControleRemoto controle = new ControleRemoto();

        controle.setCommand(ligarLuz);
        controle.apertarBotao();

        controle.setCommand(desligarLuz);
        controle.apertarBotao();

        controle.setCommand(ligarTV);
        controle.apertarBotao();

        controle.setCommand(desligarTV);
        controle.apertarBotao();
    }
}
