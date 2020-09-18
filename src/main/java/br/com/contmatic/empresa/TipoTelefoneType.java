package br.com.contmatic.empresa;

public enum TipoTelefoneType {
    FIXO("fixo"), MOVEL("movel");

    private final String tipo;

    TipoTelefoneType(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }
}
