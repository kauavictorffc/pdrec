package controller;

import bo.CursoBO;
import java.io.IOException;

public class CursoController {
    private CursoBO cursoBO = new CursoBO();

    public void cadastrarCurso(int id, String nome) {
        try {
            cursoBO.cadastrarCurso(id, nome);
            System.out.println("Curso cadastrado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar curso: " + e.getMessage());
        }
    }

    public void listarCursos() {
        try {
            cursoBO.listarCursos().forEach(c ->
                System.out.println("ID: " + c.getId() + ", Nome: " + c.getNome()));
        } catch (IOException e) {
            System.out.println("Erro ao listar cursos: " + e.getMessage());
        }
    }
}
