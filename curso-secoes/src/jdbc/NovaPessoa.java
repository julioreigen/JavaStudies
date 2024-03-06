package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException, IOException {
        Conexao.getConexao();

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = input.nextLine();

        Connection conexao = Conexao.getConexao();

        String query = "INSERT INTO pessoas (nome) VALUES (?)";
        PreparedStatement stmt = conexao.prepareStatement(query);
        stmt.setString(1, nome);

        stmt.execute();

        System.out.println("Pessoa incluída com sucesso!");
        stmt.close();
        input.close();
        Conexao.fecharConexao();
    }
}
