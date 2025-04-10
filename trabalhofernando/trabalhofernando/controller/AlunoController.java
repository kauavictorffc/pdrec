package controller;

import bo.AlunoBO;
import java.io.IOException;

public class AlunoController {
    private AlunoBO alunoBO = new AlunoBO();

    public void cadastrarAluno(int id, String nome) {
        try {
            alunoBO.cadastrarAluno(id, nome);
            System.out.println("Aluno cadastrado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void listarAlunos() {
        try {
            alunoBO.listarAlunos().forEach(a ->
                System.out.println("ID: " + a.getId() + ", Nome: " + a.getNome()));
        } catch (IOException e) {
            System.out.println("Erro ao listar alunos: " + e.getMessage());
        }
    }
}
