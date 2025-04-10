package dao;

import model.Curso;
import java.io.*;
import java.util.*;

public class CursoDAO {
    private final String arquivo = "database/cursos.txt";

    public void salvar(Curso curso) throws IOException {
        File f = new File(arquivo);
        f.getParentFile().mkdirs(); // cria pasta se não existir
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true));
        writer.write(curso.getId() + ";" + curso.getNome());
        writer.newLine();
        writer.close();
    }

    public List<Curso> listar() throws IOException {
        List<Curso> cursos = new ArrayList<>();
        File f = new File(arquivo);
        if (!f.exists()) return cursos;

        BufferedReader reader = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = reader.readLine()) != null) {
            String[] partes = linha.split(";");
            if (partes.length == 2) {
                Curso curso = new Curso(Integer.parseInt(partes[0]), partes[1]);
                cursos.add(curso);
            }
        }
        reader.close();
        return cursos;
    }
}
