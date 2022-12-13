package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        double a = 2.3;
        String s = "Bom dia, X";
        s = s.toUpperCase();
        s = s.replace("X", "senhora");
        s = s.concat("!!!!");

        String x = "Bom dia, X"
                .replace("X", "Jessica")
                .toUpperCase()
                .concat("!!");

        System.out.println("Patricia".toUpperCase());
        System.out.println(s);
        System.out.println(x);

        // tipos primitivos nao tem o operador ".", como o usado em String
    }
}
