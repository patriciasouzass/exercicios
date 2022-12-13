package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Sergio", -142);
        p1.setIdade(230);
        //p1.idade = -10;

        System.out.println(p1.getIdade());
        System.out.println(p1);
    }
}
