package controller;

import bo.MatriculaBO;
import java.io.IOException;

public class MatriculaController {
    private MatriculaBO matriculaBO = new MatriculaBO();

    public void matricular(int alunoId, int cursoId) {
        try {
            matriculaBO.matricularAluno(alunoId, cursoId);
            System.out.println("Aluno matriculado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao matricular: " + e.getMessage());
        }
    }

    public void listarMatriculas() {
        try {
            System.out.println("Lista de matrículas:");
            matriculaBO.listarMatriculas().forEach(m ->
                System.out.println("Aluno ID: " + m.getAlunoId() + " -> Curso ID: " + m.getCursoId()));
        } catch (IOException e) {
            System.out.println("Erro ao listar matrículas: " + e.getMessage());
        }
    }
}
