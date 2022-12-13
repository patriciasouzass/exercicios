package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {

    String nomeAtributo;

    public NumeroForaIntervaloException(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage(){
        return String.format("O atributo '%s' está fora do intervalo válido.", nomeAtributo);
    }
}
