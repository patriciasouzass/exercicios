package controle;

public class SwitchSemBreak {
    public static void main(String[] args) {
        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("faixa preta");

            case "amarela":
                System.out.println("faixa amarela");

            case "vermelha":
                System.out.println("faixa vermelha");
                break;
            default:
                System.out.println("nao sei de nada");

        }
    }
}
