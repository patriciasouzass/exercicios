package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Jorge", 6.1);
        Aluno a3 = new Aluno("Joaquim", 8.1);
        Aluno a4 = new Aluno("Paula", 10);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Jorge", 6.1);
        Aluno a7 = new Aluno("Joaquim", 8.1);
        Aluno a8 = new Aluno("Paula", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("distinct: ");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("\ntakeWhile");
        alunos.stream()
                .distinct()
                .skip(1)
                .takeWhile(a -> a.nota > 6)
                .forEach(System.out::println);
    }
}
