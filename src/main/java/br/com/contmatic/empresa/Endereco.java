package br.com.contmatic.empresa;

import java.util.Objects;

public class Endereco {
    private String pais;

    private String uf;

    private String cidade;

    private String cep;

    private String numero;

    private String logradouro;

    public Endereco(String cep, String numero){
        this.setCep(cep);
        this.setNumero(numero);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "pais='" + pais + '\'' +
                ", uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                ", numero='" + numero + '\'' +
                ", logradouro='" + logradouro + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Endereco endereco = (Endereco) o;
        return cep.equals(endereco.cep) &&
                numero.equals(endereco.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cep, numero);
    }
}
