package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        double num1, num2, total;
        String operador;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite um operador: ");
        operador = sc.next();
        System.out.println("Digite um número");
        num2 = sc.nextDouble();

        total = "+".equals(operador) ? num1 + num2 : 0;
        total = "-".equals(operador) ? num1 - num2 : total;
        total = "*".equals(operador) ? num1 * num2 : total;
        total = "/".equals(operador) ? num1 * num2 : total;
        total = "%".equals(operador) ? num1 % num2 : total;
        System.out.printf("O resultado de %.2f %s %.2f é: %.2f", num1, operador, num2, total);

        sc.close();
    }
}
