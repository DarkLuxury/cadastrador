package br.com.contmatic.empresa;

import static br.com.contmatic.util.Validator.*;
import java.util.Objects;

public class Endereco {

    private String pais;

    private String uf;

    private String cidade;

    private String cep;

    private Integer numero;

    private String logradouro;

    public Endereco(String cep, Integer numero){
        setCep(cep);
        setNumero(numero);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        naoNulo(this.pais, "país");
        tamanhoStringMinMax(this.pais, "país", 2,32);
        stringContemSomenteLetrasEspacos(this.pais, "país");
        this.pais = pais;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        naoNulo(this.uf, "uf");
        tamanhoStringIgual(this.uf, "uf", 2);
        stringContemSomenteLetras(uf, "uf");
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        naoNulo(this.cidade, "cidade");
        stringContemSomenteLetrasEspacos(this.cidade, "cidade");
        tamanhoStringMinMax(this.cidade, "cidade", 2, 32);
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        naoNulo(this.cep, "cep");
        stringContemSomenteNumeros(this.cep, "cep");
        tamanhoStringIgual(this.cep, "cep", 8);
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        naoNulo(this.numero, "numero");
        integerTamanhoMin(this.numero, 1);
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
