// ❌ Viola ISP: Interface única obriga classes a implementarem métodos desnecessários
interface Acoes {
    void voar();
    void nadar();
    void correr();
}

class CachorroErrado implements Acoes {
    public void voar() { /* Não faz sentido */ }
    public void nadar() { System.out.println("Cachorro nadando"); }
    public void correr() { System.out.println("Cachorro correndo"); }
}

// ✅ Correto: Interfaces menores e mais específicas
interface Corredor {
    void correr();
}

interface Nadador {
    void nadar();
}

class Cachorro implements Corredor, Nadador {
    public void correr() { System.out.println("Cachorro correndo"); }
    public void nadar() { System.out.println("Cachorro nadando"); }
}
