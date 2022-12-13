package fundamentos;

import java.util.Scanner;

public class Temperatura_C_F {
    public static void main(String[] args) {
        final int number1 = 32;
        final double number2 = 5.0/9.0;
        double fahrenheit;
        double conv;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        fahrenheit = sc.nextDouble();

        conv = (fahrenheit - number1) * number2;

        System.out.println("A conversão de fahrenheit para Celsius ficou: " + (int)conv + "C");
    }
}
