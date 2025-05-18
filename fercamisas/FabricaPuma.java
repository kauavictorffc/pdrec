public class FabricaPuma implements FabricaEsportiva {
    public CamisaEsportiva criarCamisa() {
        return new CamisaPuma();
    }
}
