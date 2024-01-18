package excecao_09.personalizadaB;

public class StringVaziaException extends Exception{
    private final String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo '%s' está vazio.", nomeDoAtributo);
    }

}
