package controle.exercicios;

import java.util.Scanner;

public class ExercicioControle03 {
    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 7.0){
            System.out.println("Aprovado =)");
        } else if (media < 7.0 && media >= 4.0) {
            System.out.println("Recuperaçao =/");
        } else System.out.println("Reprovado =(");
    }
}
