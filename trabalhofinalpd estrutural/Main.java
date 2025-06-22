public class Main {
    public static void main(String[] args) {
        Dispositivo tv = new Televisao();
        Controle controleSimples = new ControleSimples(tv);
        controleSimples.alternarPower();

        Dispositivo radio = new Radio();
        Controle controleAvancado = new ControleAvancado(radio);
        controleAvancado.alternarPower();
    }
}
