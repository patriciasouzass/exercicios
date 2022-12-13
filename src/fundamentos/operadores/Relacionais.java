package fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {
        int a = 97; // cada letra é associada a um número, se testar com outro número dá false
        int b = 'a';

        System.out.println(a == b);
        System.out.println(4 > 9);

        double nota = 9.8;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        System.out.println("Tem desconto? " + temDesconto);
    }
}
