package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {
        double nota = 7.3;

        String resultado = nota >= 7 ? " aprovado" : " em recuperação";
        System.out.println("O aluno está" + resultado);
    }
}
