package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
//        final String url = "jdbc:mysql://localhost:3306/?verifyServerCertificate=false&useSSL=true";
//        final String usuario = "user";
//        final String senha = "123456";
//
//        Connection conexao = DriverManager
//                .getConnection(url, usuario, senha);

        Connection conexao = FabricaConexao.getConexao();

        System.out.println("Conexao efetuada com sucesso!");
        conexao.close();
    }
}
