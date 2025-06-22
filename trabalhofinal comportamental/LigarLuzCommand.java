public class LigarLuzCommand implements Command {
    private Luz luz;

    public LigarLuzCommand(Luz luz) {
        this.luz = luz;
    }

    public void executar() {
        luz.ligar();
    }
}
