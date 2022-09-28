package JavaQuebec.TratamentoExcecoesJava;

public class DivisaoNaoExataException {
    private int numerado;
    private int denominador;

    public DivisaoNaoExataException(String message, int numerado, int denominador) {
        super(message);
        this.numerado = numerado;
        this.denominador = denominador;
    }
}

