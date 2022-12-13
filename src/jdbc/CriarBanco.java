package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {
//        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
//        final String usuario = "user";
//        final String senha = "123456";
//
//        Connection conexao = DriverManager
//                .getConnection(url, usuario, senha);

        Connection conexao = FabricaConexao.getConexao();

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE curso_udemy");

        System.out.println("Banco criado com sucesso!");

        conexao.close();
    }
}
