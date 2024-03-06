package jdbc;

import java.io.IOException;
import java.sql.SQLException;

//String query = "CREATE TABLE IF NOT EXISTS " + nomeTabela + " (" + atributos + ")";

public class Testes {
    public static void main(String[] args) throws SQLException, IOException {

        PessoaDAO pessoas = new PessoaDAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        System.out.println(pessoas.incluir(sql, "João da Silva"));
        System.out.println(pessoas.incluir(sql, "Ana Julia"));
        System.out.println(pessoas.incluir(sql, "Djalma Pereira"));

        pessoas.close();
    }
}
