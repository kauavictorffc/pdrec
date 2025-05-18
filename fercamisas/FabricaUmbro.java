public class FabricaUmbro implements FabricaEsportiva {
    public CamisaEsportiva criarCamisa() {
        return new CamisaUmbro();
    }
}
