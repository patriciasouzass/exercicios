package controle.exercicios;

import java.util.Scanner;

public class ExercicioControle01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.print("Digite um número: ");
        valor = sc.nextInt();

        if (valor >= 0 && valor <= 10) {
            if (valor % 2 == 0) {
                System.out.printf("%d está entre 0 e 10 e é par", valor);
            }
        } else
            System.out.printf("%d não atende as condições", valor);
        sc.close();
    }
}
