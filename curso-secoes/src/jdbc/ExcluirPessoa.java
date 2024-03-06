package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException, IOException {
        Connection conexao = Conexao.getConexao();

        Scanner input = new Scanner(System.in);
        System.out.print("Insira o código: ");
        var codigo = Integer.parseInt(input.nextLine());

        String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
        String delete = "DELETE FROM pessoas WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(select);
        stmt.setInt(1, codigo);
        var resultado = stmt.executeQuery();

        if (resultado.next()) {
            Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));

            System.out.printf("A pessoa com o nome '%s' está prestes a ser deletada\nVocê confirma? ['S' para SIM e qualquer outra letra para NÃO]: ", p.getNome());
            if (input.nextLine().equalsIgnoreCase("s")) {
                stmt.close();
                stmt = conexao.prepareStatement(delete);
                stmt.setInt(1, codigo);
                if (stmt.executeUpdate() > 0)
                    System.out.println("\nDados apagados com sucesso!");
            } else {
                System.out.println("\nAção cancelada!");
            }
        } else {
            System.out.println("Código não encontrado no banco de dados!");
        }

        Conexao.fecharConexao();
        stmt.close();
        input.close();
    }
}
