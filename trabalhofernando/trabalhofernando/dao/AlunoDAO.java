package dao;

import model.Aluno;
import java.io.*;
import java.util.*;

public class AlunoDAO {
    private final String arquivo = "database/alunos.txt";

    public void salvar(Aluno aluno) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true));
        writer.write(aluno.getId() + ";" + aluno.getNome());
        writer.newLine();
        writer.close();
    }

    public List<Aluno> listar() throws IOException {
        List<Aluno> alunos = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = reader.readLine()) != null) {
            String[] partes = linha.split(";");
            Aluno aluno = new Aluno(Integer.parseInt(partes[0]), partes[1]);
            alunos.add(aluno);
        }
        reader.close();
        return alunos;
    }
}
