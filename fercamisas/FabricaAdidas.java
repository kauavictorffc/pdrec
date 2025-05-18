public class FabricaAdidas implements FabricaEsportiva {
    public CamisaEsportiva criarCamisa() {
        return new CamisaAdidas();
    }
}
