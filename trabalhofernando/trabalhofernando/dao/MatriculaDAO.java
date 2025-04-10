package dao;

import model.Matricula;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MatriculaDAO {
    private final String ARQUIVO = "database/matriculas.txt";

    public void salvar(Matricula m) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO, true));
        writer.write(m.getAlunoId() + ";" + m.getCursoId());
        writer.newLine();
        writer.close();
    }

    public List<Matricula> listar() throws IOException {
        List<Matricula> lista = new ArrayList<>();
        File file = new File(ARQUIVO);
        if (!file.exists()) return lista;

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String linha;
        while ((linha = reader.readLine()) != null) {
            String[] partes = linha.split(";");
            int alunoId = Integer.parseInt(partes[0]);
            int cursoId = Integer.parseInt(partes[1]);
            lista.add(new Matricula(alunoId, cursoId));
        }
        reader.close();
        return lista;
    }
}
