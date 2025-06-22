public class ControleAvancado extends Controle {
    public ControleAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void alternarPower() {
        if (dispositivo.estaLigado()) {
            System.out.println("Desligando com temporizador...");
            dispositivo.desligar();
        } else {
            System.out.println("Ligando com verificação...");
            dispositivo.ligar();
        }
    }
}
