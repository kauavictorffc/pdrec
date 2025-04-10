package bo;

import dao.AlunoDAO;
import model.Aluno;
import java.io.IOException;
import java.util.List;

public class AlunoBO {
    private AlunoDAO alunoDAO = new AlunoDAO();

    public void cadastrarAluno(int id, String nome) throws IOException {
        if (nome.length() < 3) throw new IllegalArgumentException("Nome inválido");
        Aluno aluno = new Aluno(id, nome);
        alunoDAO.salvar(aluno);
    }

    public List<Aluno> listarAlunos() throws IOException {
        return alunoDAO.listar();
    }
}
