package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double notas, total, media;
        int notasValidas = 0;
        total = 0;
        notas = 0;

        while (notas != -1) {
            System.out.println("Digite uma nota: ");
            notas = sc.nextDouble();

            if (notas >= 0 && notas <= 10) {
                total = total + notas;
                notasValidas = notasValidas + 1;
            }

        }
        media = total / notasValidas;
        System.out.printf("Foram digitadas %s notas válidas e a média das notas é %.2f", notasValidas, media);
    }
}
