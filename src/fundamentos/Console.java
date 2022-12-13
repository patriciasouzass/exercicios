package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia! \n\n");
        System.out.println("Bom ");
        System.out.println("Dia");

        System.out.printf("Megasena: %d, %d, %d, %d e %d %n", 1, 2, 8, 6, 9);
        System.out.printf("Salário R$ %.2f", 1574.35487);

        Scanner entrada = new Scanner(System.in);
        System.out.print("\nDigite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("Seu nome é %s %s e sua idade é %d anos", nome, sobrenome, idade);

        entrada.close();

    }
}
