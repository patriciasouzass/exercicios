package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Beatriz", 6.1);
        Aluno a2 = new Aluno("Carolina", 8.1);
        Aluno a3 = new Aluno("Ana", 5.1);
        Aluno a4 = new Aluno("Andreza", 6.1);
        Aluno a5 = new Aluno("Débora", 8.1);
        Aluno a6 = new Aluno("Carla", 8.1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> saudacaoAprovado = a -> "Parabéns, " + a.nome + " voce foi aprovado(a)!";

        alunos.stream()
                .filter(aprovado)
                .map(saudacaoAprovado)
                .forEach(System.out::println);

//        Um tipo de soluçao
//        alunos.stream()
//                .filter(a -> a.nota >= 7)
//                .map(a -> "Parabéns, " + a.nome + " voce foi aprovado(a)!")
//                .forEach(System.out::println);
    }
}
