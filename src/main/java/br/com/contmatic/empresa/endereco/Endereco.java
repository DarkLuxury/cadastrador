package br.com.contmatic.empresa.endereco;

import br.com.contmatic.empresa.util.TipoEnderecoType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.joda.time.DateTime;

import javax.validation.constraints.*;

public class Endereco {

    @NotBlank
    @Pattern(regexp = "[0-9]{8}")
    private String cep;

    @Max(99999)
    private Integer numero;

    @Size(min = 2)
    @Pattern(regexp = "[a-zA-Z0-9\\s]+")
    private String logradouro;

    @Size(min = 2, max = 32)
    @Pattern(regexp = "[a-zA-Z0-9\\s]+")
    private String usuarioCriador;

    @NotNull
    private DateTime dataCriacao;

    @NotNull
    private Cidade cidade;

    @NotNull
    private TipoEnderecoType tipo;

    public Endereco(){
        this.dataCriacao = new DateTime();
    }

    public Endereco(String cep, Integer numero, String logradouro, String usuarioCriador, Cidade cidade, TipoEnderecoType tipo) {
        this.cep = cep;
        this.numero = numero;
        this.logradouro = logradouro;
        this.usuarioCriador = usuarioCriador;
        this.dataCriacao = new DateTime();
        this.cidade = cidade;
        this.tipo = tipo;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
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
        this.usuarioCriador = usuarioCriador;
    }

    public DateTime getDataCriação() {
        return dataCriacao;
    }

    public void setDataCriacao(DateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public DateTime getDataCriacao() {
        return dataCriacao;
    }

    public TipoEnderecoType getTipo() {
        return tipo;
    }

    public void setTipo(TipoEnderecoType tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Endereco endereco = (Endereco) o;
        return new EqualsBuilder().append(cep, endereco.cep).append(numero, endereco.numero).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cep).append(numero).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cep", cep).append("numero", numero).append("logradouro", logradouro).append("usuarioCriador", usuarioCriador).append("dataCriacao", dataCriacao)
                .append("cidade", cidade).toString();
    }
}
