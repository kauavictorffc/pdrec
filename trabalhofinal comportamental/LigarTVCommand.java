public class LigarTVCommand implements Command {
    private TV tv;

    public LigarTVCommand(TV tv) {
        this.tv = tv;
    }

    public void executar() {
        tv.ligar();
    }
}
