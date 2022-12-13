package classe.desafio;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        Data d2 = new Data();

        d1.data = 15;
        d1.mes = 02;
        d1.ano = 2022;

        d2.data = 21;
        d2.mes = 01;
        d2.ano = 2021;

        Data dataPadrao = new Data();

        Data parametros = new Data(10, 06, 1989);

        System.out.println("Na mão: ");
        System.out.printf("Primeira data %d/%d/%d\n", d1.data, d1.mes, d1.ano);
        System.out.printf("Segunda data %d/%d/%d\n", d2.data, d2.mes, d2.ano);
        System.out.println("-------------------");
        System.out.println("Método formatar data: ");
        System.out.println(d2.obterDataFormatada());
        System.out.println(d1.obterDataFormatada());
        System.out.println("-------------------");
        System.out.println("Método imprimir data formatada: ");
        d2.imprimirDataFormatada();
        d1.imprimirDataFormatada();
        System.out.println("-------------------");
        System.out.println("Construtor padrao: ");
        dataPadrao.imprimirDataFormatada();
        System.out.println("-------------------");
        System.out.println("Construtor com parametros: ");
        parametros.imprimirDataFormatada();
    }
}
