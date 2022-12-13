package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String valor;

        System.out.println("Digite um valor: ");
        valor = sc.nextLine();

        while (!valor.equalsIgnoreCase("sair")){
            System.out.println("Digite um valor: ");
            valor = sc.nextLine();
        }

    }
}
