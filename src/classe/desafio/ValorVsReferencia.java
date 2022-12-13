package classe.desafio;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a;

        a ++;
        b --;

        System.out.println(a + " " + b);

        Data d1 = new Data(1, 6, 2021);
        Data d2 = d1;

        d1.data = 31;
        d1.mes = 12;

        d1.ano = 2025;

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();

        voltarDataPadrao(d1);

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();

        int num = 5;
        alterarPrimitivo(num);
        System.out.println(num);

    }
    static void voltarDataPadrao(Data d){
        d.data = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a){
        a ++;
    }
}
