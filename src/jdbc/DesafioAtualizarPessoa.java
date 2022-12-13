package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioAtualizarPessoa {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o código da pessoa: ");
        int codigo = sc.nextInt();

        String selectSQL = "SELECT codigo, nome FROM pessoas WHERE codigo LIKE ?";
        String updateSQL = "UPDATE pessoas set nome = ? WHERE codigo = ?";


        PreparedStatement stmt = conexao.prepareStatement(selectSQL);
        stmt.setInt(1, codigo);
        ResultSet resultado = stmt.executeQuery();

        if (resultado.next()) {
            Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));

            System.out.println("O nome atual é " + p.getNome());
            sc.nextLine();

            System.out.print("Digite o novo nome: ");
            String novoNome = sc.nextLine();

            stmt.close();
            stmt = conexao.prepareStatement(updateSQL);
            stmt.setString(1, novoNome);
            stmt.setInt(2, codigo);
            stmt.execute();

            System.out.println("Pessoa alterada com sucesso!");
        } else System.out.println("Pessoa nao encontrada.");

        sc.close();
        stmt.close();
        conexao.close();
    }
}
