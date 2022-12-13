package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notaAlunoA = new double[3];

        System.out.println(Arrays.toString(notaAlunoA)); // ainda nao iniciado, inicia com valor padrao

        notaAlunoA[0] = 7.9;
        notaAlunoA[1] = 6;
        notaAlunoA[2] = 5.8;

        System.out.println(Arrays.toString(notaAlunoA));

        double total = 0;
        for (int i = 0; i < notaAlunoA.length; i++) {
            total = total + notaAlunoA[i];
        }

        System.out.println(total);
    }
}
