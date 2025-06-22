public class Televisao implements Dispositivo {
    private boolean ligado = false;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("TV ligada");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("TV desligada");
    }

    @Override
    public boolean estaLigado() {
        return ligado;
    }
}
