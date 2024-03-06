package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Conexao {

    private static Connection conexao;

    public static Connection getConexao() {
        try {
            conectar();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return conexao;
    }


    private static void conectar() throws IOException {
        Properties prop = getProperties();
        String url = prop.getProperty("banco.url");
        String usuario = prop.getProperty("banco.user");
        String senha = prop.getProperty("banco.pass");
        try {
            conexao = DriverManager
                    .getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() throws IOException {
        Properties prop = new Properties();
        String caminho = System.getProperty("user.dir") + "/conexaoJavaStudies.properties";
        File properties = new File(caminho);
        try {
            if (!properties.exists()){
                properties.createNewFile();
                FileWriter writer = new FileWriter(properties);
                writer.write("""
                        banco.url=jdbc:mysql://localhost/?verifyServerCertificate=false&useSSL=true
                        banco.user=root
                        banco.pass=root""");
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo .properties");
            throw new RuntimeException();
        }

        FileInputStream fis = new FileInputStream(caminho);
        prop.load(fis);
        prop.stringPropertyNames();
        return prop;
    }

    static void fecharConexao()  {
        try {
            conexao.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
