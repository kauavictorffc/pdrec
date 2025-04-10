package bo;

import dao.MatriculaDAO;
import dao.AlunoDAO;
import dao.CursoDAO;
import model.Matricula;
import model.Aluno;
import model.Curso;

import java.io.IOException;
import java.util.List;

public class MatriculaBO {
    private MatriculaDAO matriculaDAO = new MatriculaDAO();
    private AlunoDAO alunoDAO = new AlunoDAO();
    private CursoDAO cursoDAO = new CursoDAO();

    public void matricularAluno(int alunoId, int cursoId) throws IOException {
        boolean alunoExiste = alunoDAO.listar().stream().anyMatch(a -> a.getId() == alunoId);
        boolean cursoExiste = cursoDAO.listar().stream().anyMatch(c -> c.getId() == cursoId);

        if (!alunoExiste) throw new IllegalArgumentException("Aluno com ID " + alunoId + " não existe.");
        if (!cursoExiste) throw new IllegalArgumentException("Curso com ID " + cursoId + " não existe.");

        Matricula matricula = new Matricula(alunoId, cursoId);
        matriculaDAO.salvar(matricula);
    }

    public List<Matricula> listarMatriculas() throws IOException {
        return matriculaDAO.listar();
    }
}
