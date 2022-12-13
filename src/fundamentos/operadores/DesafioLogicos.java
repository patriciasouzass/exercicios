package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean TV50 = trabalho1 && trabalho2;
        boolean TV32 = trabalho1^trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV de 50? " + TV50);
        System.out.println("Comprou TV de 32? " + TV32);
        System.out.println("Comprou TV de sorvete? " + comprouSorvete);
        System.out.println("Mais saudável? " + maisSaudavel);
    }
}
