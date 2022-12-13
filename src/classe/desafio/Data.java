package classe.desafio;

public class Data {
    int data;
    int mes;
    int ano;

    String obterDataFormatada(){
        return String.format("%d/%d/%d", data, mes, ano);
    }

    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }

    Data(){
        this(01, 01, 1970);
    }

    public Data(int diaP, int mesP, int anoP){
        this.data = diaP;
        this.mes = mesP;
        this.ano = anoP;
    }
}
