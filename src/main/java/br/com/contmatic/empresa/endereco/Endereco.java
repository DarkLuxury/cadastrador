package br.com.contmatic.empresa.endereco;

import org.joda.time.DateTime;

import static br.com.contmatic.util.Validator.*;
import java.util.Objects;

public class Endereco {

    private String cep;

    private Integer numero;

    private String logradouro;

    private String usuarioCriador;

    private DateTime dataCriacao;

    private Cidade cidade;

    public Endereco(String cep, Integer numero, String usuarioCriador){
        this.setCep(cep);
        this.setNumero(numero);
        this.setUsuarioCriador(usuarioCriador);
        this.dataCriacao = new DateTime();
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        naoNulo(cidade, "cidade");
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        naoNulo(cep, "cep");
        stringContemSomenteNumeros(cep, "cep");
        tamanhoStringIgual(cep, "cep", 8);
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        naoNulo(numero, "numero");
        integerTamanhoMin(numero, 1);
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getUsuarioCriador() {
        return usuarioCriador;
    }

    public void setUsuarioCriador(String usuarioCriador) {
        naoNulo(usuarioCriador, "usuário criador");
        stringContemSomenteLetras(usuarioCriador, "usuario criador");
        tamanhoStringMinMax(usuarioCriador, "usuario criador", 2, 32);
        this.usuarioCriador = usuarioCriador;
    }

    public DateTime getDataCriação() {
        return dataCriacao;
    }

    public void setDataCriacao(DateTime dataCriacao) {
        naoNulo(dataCriacao, "data de criação");
        this.dataCriacao = dataCriacao;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Endereco endereco = (Endereco) o;
        return new org.apache.commons.lang3.builder.EqualsBuilder().append(numero, endereco.numero).append(cep, endereco.cep).isEquals();
    }

    @Override
    public int hashCode() {
        return Objects.hash(cep, numero);
    }

    @Override
    public String toString() {
        return "Endereco{" +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                ", numero='" + numero + '\'' +
                ", logradouro='" + logradouro + '\'' +
                '}';
    }
}
