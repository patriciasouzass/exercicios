package fundamentos.exercicios;

import java.util.Scanner;

public class Temperatura_F_C {
    public static void main(String[] args) {
        double fahrenheit, celsius;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fahrenheit: ");
        fahrenheit = sc.nextDouble();

        celsius = (fahrenheit - 32.0) * (5.0 / 9.0);

        System.out.printf("A conversão da temperatura para Celsius é: %.2f", celsius);

        sc.close();
    }
}
