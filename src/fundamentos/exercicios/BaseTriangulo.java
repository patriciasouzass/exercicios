package fundamentos.exercicios;

import java.util.Scanner;

public class BaseTriangulo {
    public static void main(String[] args) {
        int base, altura, area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a altura do triangulo: ");
        altura = sc.nextInt();
        System.out.println("Informe a base do tiangulo: ");
        base = sc.nextInt();

        area = (base*altura)/2;

        System.out.println("A área do triangulo é: " + area);

        sc.close();
    }
}
