package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {

    String nomeAtributo;

    public NumeroForaIntervaloException(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage(){
        return String.format("O atributo '%s' está fora do intervalo válido.", nomeAtributo);
    }
}
