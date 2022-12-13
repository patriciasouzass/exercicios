package arrays;

public class ForEach {
    public static void main(String[] args) {
        double[] notas = {7.2, 6.0, 7.5, 9.4};

        // for tradicional
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }

        System.out.println();

        // foreach
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
    }
}
