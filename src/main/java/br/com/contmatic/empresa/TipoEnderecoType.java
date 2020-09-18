package br.com.contmatic.empresa;

public enum TipoEnderecoType {
    CASA("casa"), APARTAMENTO("apartamento");

    private final String tipo;

    TipoEnderecoType(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }
}
