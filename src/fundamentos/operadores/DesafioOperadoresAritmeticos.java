package fundamentos.operadores;

public class DesafioOperadoresAritmeticos {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double total;
        double totalD;
        double aD;
        double bD;

        a = 3+2;
        aD = Math.pow((6*a), 2);
        aD = aD/(3*2);
        b = ((1-5)*(2-7))/2;
        bD = Math.pow(b, 2);
        c = Math.pow(10, 3);
        total = aD - bD;
        totalD = Math.pow(total, 3);
        totalD = totalD/c;

        System.out.println((int) totalD);

    }

}
