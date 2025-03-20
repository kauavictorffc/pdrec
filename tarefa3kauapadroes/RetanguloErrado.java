// ❌ Viola LSP: Quadrado altera o comportamento do Retangulo
class RetanguloErrado {
    protected int largura, altura;

    public void setLargura(int largura) { this.largura = largura; }
    public void setAltura(int altura) { this.altura = altura; }
    public int getArea() { return largura * altura; }
}

class QuadradoErrado extends RetanguloErrado {
    @Override
    public void setLargura(int largura) {
        this.largura = largura;
        this.altura = largura;
    }

    @Override
    public void setAltura(int altura) {
        this.largura = altura;
        this.altura = altura;
    }
}

// ✅ Correto: Criando uma interface "Forma" para garantir substituição correta
interface Forma {
    int getArea();
}

class Retangulo implements Forma {
    protected int largura, altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public int getArea() { return largura * altura; }
}

class Quadrado implements Forma {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getArea() { return lado * lado; }
}
