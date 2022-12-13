package arrays;

import java.util.Scanner;

public class DesafioNotas {
    public static void main(String[] args) {
        int quantidadeNotas;
        double media = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas notas voce quer informar? ");
        quantidadeNotas = sc.nextInt();
        double[] notas = new double[quantidadeNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota %d: ", i + 1);
            notas[i] = sc.nextDouble();
        }

        for (double nota : notas) {
            media = media + nota;
        }
        System.out.printf("A média das notas é %.2f", media / notas.length);
        sc.close();
    }
}
