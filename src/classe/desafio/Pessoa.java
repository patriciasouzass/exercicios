package classe.desafio;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }
    double comer(Comida novaComida) {
        return this.peso = this.peso + novaComida.peso;
    }
}
