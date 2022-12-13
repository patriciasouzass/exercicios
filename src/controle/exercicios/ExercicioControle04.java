package controle.exercicios;

import java.util.Scanner;

public class ExercicioControle04 {
    public static void main(String[] args) {
        int valor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        valor = sc.nextInt();

        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0);
            System.out.println(valor + " é um número primo");
        }
    }
}
