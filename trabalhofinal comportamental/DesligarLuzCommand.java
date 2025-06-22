public class DesligarLuzCommand implements Command {
    private Luz luz;

    public DesligarLuzCommand(Luz luz) {
        this.luz = luz;
    }

    public void executar() {
        luz.desligar();
    }
}
