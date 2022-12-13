package oo.heranca.desafio;

public class Carro {
    public int velocidadeAtual;
    private int delta = 5;
    protected final int VELOCIDADE_MAXIMA;

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public void acelerar() {
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else
            velocidadeAtual += getDelta();
    }

    public void frear() {
        velocidadeAtual -= 5;
        if (velocidadeAtual <= 0) velocidadeAtual = 0;
    }

    @Override
    public String toString() {
        return "A velocidade atual do carro é " + velocidadeAtual + "Km/h";
    }
}
