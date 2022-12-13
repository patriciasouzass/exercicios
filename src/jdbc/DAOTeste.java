package jdbc;

public class DAOTeste {
    public static void main(String[] args) {
        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        dao.incluir(sql, "Carlos");
        dao.incluir(sql, "Mariana");
        dao.incluir(sql, "José");

        System.out.println("Pessoas incluídas com sucesso!");

        dao.fechar();
    }
}
