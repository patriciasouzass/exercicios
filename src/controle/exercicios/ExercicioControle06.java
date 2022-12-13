package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class ExercicioControle06 {
    public static void main(String[] args) {
        int valor, aleatorio;
        Random rdm = new Random();
        Scanner sc = new Scanner(System.in);

        aleatorio = rdm.nextInt(100);
        System.out.println(aleatorio);
        valor = sc.nextInt();

        for (int j = 10; j >= 1; j--) {
            if (valor == aleatorio) {
                System.out.println("Voce acertou o número!");
                break;
            }
            System.out.println("Digite um número: ");
            valor = sc.nextInt();
            System.out.printf("\nVoce tem %d tentativas\n", j);
        }
    }
}
