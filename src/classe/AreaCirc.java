package classe;

public class AreaCirc {
    double raio;
    static double pi;

    AreaCirc(double raioInicial){
        raio = raioInicial;
        pi = Math.PI;
    }

    double area(){
        return Math.pow(raio, 2) * pi;
    }
}
