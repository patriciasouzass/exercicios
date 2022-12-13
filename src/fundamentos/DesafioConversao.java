package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        String salario1, salario2, salario3;
        Scanner sc = new Scanner(System.in);
        double soma;
        double media;

        System.out.println("Digite seu primeiro salário: ");
        salario1 = sc.nextLine().replace(",", ".");
        System.out.println("Digite seu segundo salário: ");
        salario2 = sc.nextLine().replace(",", ".");
        System.out.println("Digite seu terceiro salário: ");
        salario3 = sc.nextLine().replace(",", ".");
        soma = Double.parseDouble(salario1) + Double.parseDouble(salario2) + Double.parseDouble(salario3);
        media = soma/3;

        System.out.printf("A soma dos seus 3 últimos salários é R$ %.2f e a média é R$ %.2f", soma, media);
    }
}
