public class ModernaFactory implements MovelFactory {
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }

    public Mesa criarMesa() {
        return new MesaModerna();
    }
}
