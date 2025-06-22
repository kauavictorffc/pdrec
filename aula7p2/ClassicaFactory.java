public class ClassicaFactory implements MovelFactory {
    public Cadeira criarCadeira() {
        return new CadeiraClassica();
    }

    public Mesa criarMesa() {
        return new MesaClassica();
    }
}
