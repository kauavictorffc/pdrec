package bo;

import dao.CursoDAO;
import model.Curso;
import java.io.IOException;
import java.util.List;

public class CursoBO {
    private CursoDAO cursoDAO = new CursoDAO();

    public void cadastrarCurso(int id, String nome) throws IOException {
        if (nome == null || nome.length() < 3) {
            throw new IllegalArgumentException("Nome do curso inválido (mínimo 3 caracteres).");
        }

        Curso curso = new Curso(id, nome);
        cursoDAO.salvar(curso);
    }

    public List<Curso> listarCursos() throws IOException {
        return cursoDAO.listar();
    }
}
