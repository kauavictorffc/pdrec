// ❌ Viola SRP: A classe tem mais de uma responsabilidade (gerenciar dados e gerar relatórios)
class FuncionarioErrado {
    private String nome;
    private double salario;

    public FuncionarioErrado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100);
    }

    public void gerarRelatorio() {
        System.out.println("Nome: " + nome + ", Salário: " + salario);
    }
}

// ✅ Correto: Separando responsabilidades
class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100);
    }

    public double getSalario() {
        return salario;
    }
}

// Classe separada para gerar relatórios
class Relatorio {
    public static void gerar(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.getSalario());
    }
}
