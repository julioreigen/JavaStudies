package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {
    public static void main(String[] args) throws SQLException, IOException {
        Conexao.getConexao();

        Connection conexao = Conexao.getConexao();
        String query = "SELECT * FROM pessoas";

        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(query);

        List<Pessoa> pessoas = new ArrayList<>();

        while(resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p: pessoas) {
            System.out.printf("%d ==> %s\n", p.getCodigo(), p.getNome());
        }

        stmt.close();
        Conexao.fecharConexao();
    }
}
