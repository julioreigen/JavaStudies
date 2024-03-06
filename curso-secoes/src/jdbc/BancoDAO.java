package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BancoDAO {
    private Connection conexao;

    public void criarBanco(String nomeDB) {

        if (validarNomes(1, nomeDB)) {
            String query = "CREATE DATABASE " + nomeDB;

            try (Statement stmt = getConexao().createStatement()){
                int exec = stmt.executeUpdate(query);

                if (exec > 0)
                    System.out.println("Banco de dados criado com sucesso!");
                else
                    System.out.println("Nada foi alterado!");

                System.out.println("Linhas afetadas: " + stmt.getUpdateCount());
            } catch (SQLException e) {
                throw new RuntimeException();
            }
        } else
            System.out.println("Nome inválido!");
    }

    public void eliminarBanco(String nomeDB) {

        if (validarNomes(1, nomeDB)) {
            String query = "DROP DATABASE IF EXISTS " + nomeDB;

            try (Statement stmt = getConexao().createStatement()){
                int exec = stmt.executeUpdate(query);

                if (exec > 0)
                    System.out.println("Banco de dados eliminado com sucesso!");

                System.out.println("Linhas afetadas: " + stmt.getUpdateCount());
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else
            System.out.println("Nome inválido!");
    }

    public void criarTabela(String nomeTabela, String atributos) {

        if (validarNomes(2, nomeTabela)) {
            String query = "CREATE TABLE IF NOT EXISTS " + nomeTabela + " (" + atributos + ")";

            try (Statement stmt = getConexao().createStatement()){
                stmt.executeUpdate(query);
                System.out.println("Query executada com sucesso! Verifique o banco de dados.");
                System.out.println("Linhas afetadas: " + stmt.getUpdateCount());

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else
            System.out.println("Nome inválido!");
    }

    public void eliminarTabela(String nomeTabela) {
        if (validarNomes(2, nomeTabela)) {
            try (Statement stmt = getConexao().createStatement()) {
                String query = "DROP TABLE IF EXISTS " + nomeTabela;

                stmt.executeUpdate(query);

                System.out.println("Query executada com sucesso! Verifique o banco de dados.");
                System.out.println("Linhas afetadas: " + stmt.getUpdateCount());
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else
            System.out.println("Nome inválido!");
    }

    private boolean validarNomes(int tipo, String nomeDB) {
        String padrao;
        // 1 = database | 2 = tabela
        if (tipo == 1)
            padrao = "^[a-zA-Z0-9_]{1,64}$";
        else
            padrao = "^[a-zA-Z_][a-zA-Z0-9_]{0,63}$";

        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(nomeDB);

        return matcher.matches();
    }

    private Connection getConexao() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                return conexao;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        conexao = Conexao.getConexao();
        return conexao;
    }

    public void close() {
        try {
            getConexao().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conexao = null;
        }
    }

}
