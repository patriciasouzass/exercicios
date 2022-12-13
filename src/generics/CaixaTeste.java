package generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa();
        Caixa<Double> caixaB = new Caixa();

        caixaA.guardar("Qualquer coisa");
        caixaB.guardar(3.5);

        String coisaA = caixaA.abrir();
        Double coisaB = caixaB.abrir();

        System.out.println(coisaA);
        System.out.println(coisaB);
    }
}
