public class ControleSimples extends Controle {
    public ControleSimples(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void alternarPower() {
        if (dispositivo.estaLigado()) {
            dispositivo.desligar();
        } else {
            dispositivo.ligar();
        }
    }
}
