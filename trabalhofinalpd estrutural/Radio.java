public class Radio implements Dispositivo {
    private boolean ligado = false;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Rádio ligado");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Rádio desligado");
    }

    @Override
    public boolean estaLigado() {
        return ligado;
    }
}
