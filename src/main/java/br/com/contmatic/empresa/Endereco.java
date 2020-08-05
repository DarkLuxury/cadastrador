package br.com.contmatic.empresa;

import java.util.Objects;

public class Endereco {
    private int numero;
    private String cep, pais, cidadeComUF, rua;

    Endereco(String cep){
        this.cep = cep;
    }

    public void setLocal(String rua, int numero, String cidadeComUF, String pais) {
        this.rua = rua;
        this.numero = numero;
        this.cidadeComUF = cidadeComUF;
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    @Override
    public String toString() {
        return "" + rua + ", " + numero + " - " + cidadeComUF + ", " + cep + "/" + pais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return cep == endereco.cep;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cep);
    }



}
