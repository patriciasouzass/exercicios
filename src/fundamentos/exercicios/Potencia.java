package fundamentos.exercicios;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        double valor, quadrado, cubo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");

        valor = sc.nextDouble();

        quadrado = Math.pow(valor, 2);
        cubo = Math.pow(valor, 3);

        System.out.println("O quadrado desse valor: " + quadrado);
        System.out.println("O cubo desse valor: " + cubo);

        sc.close();
    }
}
