package classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(2.0);
        a1.pi = 2.0;
        System.out.println(a1.area());

        AreaCirc a2 = new AreaCirc(3.5);
        System.out.printf("%.3f", a2.area());
    }
}
