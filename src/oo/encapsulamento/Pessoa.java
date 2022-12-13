package oo.encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }

    @Override
    public String toString() {
        return "Olá, meu nome é " + getNome() + " e tenho " + getIdade() + " anos.";
    }
}
