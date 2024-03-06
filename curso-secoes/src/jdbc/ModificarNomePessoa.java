package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Pede para o usuário o id do nome
 * Pede um novo nome
 */


public class ModificarNomePessoa {
    public static void main(String[] args) throws SQLException, IOException {
        Conexao.getConexao();
        Connection conexao = Conexao.getConexao();

        String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
        String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        Scanner input = new Scanner(System.in);
        System.out.print("Insira o código da pessoa: ");
        var codigo = Integer.parseInt(input.nextLine());

        PreparedStatement stmt = conexao.prepareStatement(select);
        stmt.setInt(1, codigo);
        var resultado = stmt.executeQuery();

        if (resultado.next()) {
            Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));

            System.out.printf("O nome atual é: %s\n", p.getNome());

            System.out.print("Insira o novo nome: ");
            var novoNome = input.nextLine();

            stmt.close();
            stmt = conexao.prepareStatement(update);
            stmt.setString(1, novoNome);
            stmt.setInt(2, codigo);
            stmt.execute();
            stmt.close();

            System.out.println("Nome alterado com sucesso! Verifique a nova tabela.");
        } else {
            System.out.println("Código não encontrado no banco de dados!");
        }

        Conexao.fecharConexao();
        input.close();
    }
}
