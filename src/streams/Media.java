package streams;

public class Media {

    private double valorTotal;
    private int quantidade;

    public Media adicionar(double valor) {
        valorTotal += valor;
        quantidade++;
        return this;
    }

    public double getValor() {
        return valorTotal / quantidade;
    }

    public static Media combinar(Media m1, Media m2){
        Media resultante = new Media();
        resultante.quantidade = m1.quantidade + m2.quantidade;
        resultante.valorTotal = m1.valorTotal + m2.valorTotal;
        return resultante;
    }
}
