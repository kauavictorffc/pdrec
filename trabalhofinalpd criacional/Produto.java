public class Produto {
    private String parteA;
    private String parteB;

    public void setParteA(String parteA) {
        this.parteA = parteA;
    }

    public void setParteB(String parteB) {
        this.parteB = parteB;
    }

    public void mostrar() {
        System.out.println("Parte A: " + parteA);
        System.out.println("Parte B: " + parteB);
    }
}
