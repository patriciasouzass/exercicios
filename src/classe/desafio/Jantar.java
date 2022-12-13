package classe.desafio;

public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Joao", 54.00);
        Pessoa p2 = new Pessoa("Monica", 59.00);

        Comida c1 = new Comida("Macarrao", 300.00);
        Comida c2 = new Comida("Bife", 500.00);

        System.out.printf("O peso de %s antes de comer é %.2fKg e depois de comer é %.2fKg\n", p1.nome, p1.peso, p1.comer(c1));
        System.out.printf("O peso de %s antes de comer é %.2fKg e depois de comer é %.2fKg\n", p1.nome, p1.peso, p1.comer(c2));
        System.out.printf("O peso de %s antes de comer é %.2fKg e depois de comer é %.2fKg", p2.nome, p2.peso, p2.comer(c2));
    }
}
