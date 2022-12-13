package fundamentos.exercicios;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        double peso, altura, imc;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a sua altura?");
        altura = sc.nextDouble();
        System.out.println("Qual o seu peso?");
        peso = sc.nextDouble();

        imc = peso / (Math.pow(altura, 2));

        System.out.printf("O seu IMC é: %.2f", imc);

        sc.close();
    }
}
