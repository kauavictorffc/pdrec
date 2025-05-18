public class Main {
    public static void main(String[] args) {
        Violao v1 = ViolaoFactory.getViolao("classico");
        Violao v2 = ViolaoFactory.getViolao("folk");
        Violao v3 = ViolaoFactory.getViolao("000");
        Violao v4 = ViolaoFactory.getViolao("7cordas");

        v1.exibirInformacoes();
        v2.exibirInformacoes();
        v3.exibirInformacoes();
        v4.exibirInformacoes();
    }
}
