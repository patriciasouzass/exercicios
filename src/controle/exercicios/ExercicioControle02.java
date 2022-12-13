package controle.exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class ExercicioControle02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate localDate = LocalDate.now();

        int ano = localDate.getYear();

        if (ano % 4 == 0){
            if (ano % 100 == 0){
                if (ano % 400 == 0){
                    System.out.println(ano + " é um ano bissexto");
                }
            }
        }

        System.out.println("Digite um ano: ");
        int valor;
        valor = sc.nextInt();

        if (valor % 4 == 0){
            if (valor % 100 == 0){
                if (valor % 400 == 0){
                    System.out.println(valor + " é um ano bissexto");
                }
            }
        }
    }
}
