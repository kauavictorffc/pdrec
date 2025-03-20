// ❌ Viola DIP: Computador depende diretamente das classes concretas Teclado e Monitor
class Teclado {}
class Monitor {}

class ComputadorErrado {
    private Teclado teclado;
    private Monitor monitor;

    public ComputadorErrado() {
        this.teclado = new Teclado();
        this.monitor = new Monitor();
    }
}

// ✅ Correto: Computador depende de interfaces ao invés de implementações concretas
interface DispositivoEntrada {}
interface DispositivoSaida {}



class Computador {
    private DispositivoEntrada entrada;
    private DispositivoSaida saida;

    public Computador(DispositivoEntrada entrada, DispositivoSaida saida) {
        this.entrada = entrada;
        this.saida = saida;
    }
}
