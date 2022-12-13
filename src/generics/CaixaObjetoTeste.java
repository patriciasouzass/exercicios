package generics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        CaixaObjeto caixaB = new CaixaObjeto();
        caixaA.guardar(3.2);
        caixaB.guardar("Olá, mundo!");

        Double coisaA = (Double) caixaA.abrir();
        System.out.println(coisaA);

        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);
    }
}
