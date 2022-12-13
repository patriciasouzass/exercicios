package excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) throws Exception {

        try {
            gerarErro1();
        } catch (RuntimeException runtimeException) {
            System.out.println(runtimeException.getMessage());
        }

        try {
            gerarErro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim =)");
    }

    static void gerarErro1() {
        throw new RuntimeException("Ocorreu um erro #01");
    }

    static void gerarErro2() throws Exception {
        throw new Exception("Ocorreu um erro #02");
    }
}
