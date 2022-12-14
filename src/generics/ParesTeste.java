package generics;

public class ParesTeste {
    public static void main(String[] args) {

        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Carla");
        resultadoConcurso.adicionar(2, "Joana");
        resultadoConcurso.adicionar(3, "Marcela");
        resultadoConcurso.adicionar(4, "Patricia");
        resultadoConcurso.adicionar(2, "Raquel");

        System.out.println(resultadoConcurso.getValor(2));
        System.out.println(resultadoConcurso.getValor(4));
        System.out.println(resultadoConcurso.getValor(3));
    }
}
