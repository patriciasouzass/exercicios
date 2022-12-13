package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa2 {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();

        Scanner sc = new Scanner(System.in);
        System.out.println("Voce deseja buscar resultados com quais caracteres?");
        String letras = sc.next();

        String sql = "SELECT * FROM pessoas WHERE nome LIKE '%" + letras + "%'";
//        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?"; //outra forma de fazer

        Statement stmt = conexao.createStatement();
//        PreparedStatement stmt = conexao.prepareStatement(sql); //outra forma de fazer
//        stmt.setString(1, "%" + letras + "%");
        ResultSet resultado = stmt.executeQuery(sql);

        List<Pessoa> listaPessoas = new ArrayList<>();

        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            listaPessoas.add(new Pessoa(codigo, " " + nome));
        }

        for (Pessoa p : listaPessoas) {
            System.out.println(p.getCodigo() + p.getNome());
        }
        if (listaPessoas.isEmpty()) System.out.println("Nao foram localizados nomes com esses caracteres");

        sc.close();
        stmt.close();
        conexao.close();
    }
}
