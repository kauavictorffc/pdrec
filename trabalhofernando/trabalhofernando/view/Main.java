package view;

import controller.AlunoController;
import controller.CursoController;
import controller.MatriculaController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlunoController alunoCtrl = new AlunoController();
        CursoController cursoCtrl = new CursoController();
        MatriculaController matriculaCtrl = new MatriculaController();

        int opcao;
        do {
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar curso");
            System.out.println("3 - Matricular aluno");
            System.out.println("4 - Listar alunos");
            System.out.println("5 - Listar cursos");
            System.out.println("6 - Listar matrículas");
            System.out.println("0 - Sair");
            opcao = sc.nextInt(); sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    alunoCtrl.cadastrarAluno(id, nome);
                }
                case 2 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    cursoCtrl.cadastrarCurso(id, nome);
                }
                case 3 -> {
                    System.out.print("ID Aluno: ");
                    int aId = sc.nextInt();
                    System.out.print("ID Curso: ");
                    int cId = sc.nextInt();
                    matriculaCtrl.matricular(aId, cId);
                }
                case 4 -> alunoCtrl.listarAlunos();
                case 5 -> cursoCtrl.listarCursos();
                case 6 -> matriculaCtrl.listarMatriculas();
            }

        } while (opcao != 0);
    }
}
