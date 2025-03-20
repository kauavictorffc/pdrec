public class Main {
    public static void main(String[] args) {
        // ❌ Testando código INCORRETO (viola DIP)
        System.out.println("Testando ComputadorErrado...");
        ComputadorErrado computadorErrado = new ComputadorErrado();
        System.out.println("ComputadorErrado criado com dependências concretas.\n");

        // ✅ Testando código CORRETO (segue DIP)
        System.out.println("Testando Computador...");
        DispositivoEntrada teclado = (DispositivoEntrada) new Teclado();
        DispositivoSaida monitor = (DispositivoSaida) new Monitor();
        Computador computador = new Computador(teclado, monitor);
        System.out.println("Computador criado com dependências injetadas por interfaces.");
    }
}
