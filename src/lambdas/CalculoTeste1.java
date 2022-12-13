package lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {
        Somar calcular1 = new Somar();
        System.out.println(calcular1.executar(5, 3));

        Multiplicar calcular2 = new Multiplicar();
        System.out.println(calcular2.executar(5, 3));
    }
}
