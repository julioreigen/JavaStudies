package jdbc;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException, IOException {
        Conexao.getConexao();

        Connection conexao = Conexao.getConexao();
        String query = "SELECT * FROM pessoas WHERE nome LIKE ?";

        Scanner input = new Scanner(System.in);
        System.out.print("Nome a ser pesquisado: ");
        String nomeBuscado = input.nextLine();
        input.close();

        PreparedStatement stmt = conexao.prepareStatement(query);
        stmt.setString(1, "%" + nomeBuscado + "%");
        ResultSet resultado = stmt.executeQuery();

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
