public class DesligarTVCommand implements Command {
    private TV tv;

    public DesligarTVCommand(TV tv) {
        this.tv = tv;
    }

    public void executar() {
        tv.desligar();
    }
}
