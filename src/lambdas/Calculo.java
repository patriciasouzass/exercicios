package lambdas;

@FunctionalInterface
public interface Calculo {
    double executar(double a, double b);

    default String legal(){
        return "teste legal";
    }

    static String muitoLegal(){
        return "muito legal!";
    }
}
