package br.com.contmatic.empresa;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Endereco {
    @Size(min = 2, max = 32)
    @Pattern(regexp = "[a-zA-Z\\s]+")
    private String pais;
    @Pattern(regexp = "[a-zA-Z]{2}")
    private String uf;
    @Size(min = 2, max = 32)
    @Pattern(regexp = "[a-zA-Z\\s]+")
    private String cidade;
    @NotBlank
    @Pattern(regexp = "[0-9]{8}")
    private String cep;
    @NotBlank
    @Pattern(regexp = "[a-zA-Z0-9]+")
    private String numero;
    @Size(min = 2)
    @Pattern(regexp = "[a-zA-Z0-9\\s]+")
    private String logradouro;
    @NotNull
    private TipoEnderecoType tipo;

    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String cidade, String uf, String cep, String pais, TipoEnderecoType tipo) {
        this.pais = pais;
        this.uf = uf;
        this.cidade = cidade;
        this.cep = cep;
        this.numero = numero;
        this.logradouro = logradouro;
        this.tipo = tipo;
    }

    public TipoEnderecoType getTipo() {
        return tipo;
    }

    public void setTipo(TipoEnderecoType tipo){
        this.tipo = tipo;
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
        return new ToStringBuilder(this).append("pais", pais).append("uf", uf).append("cidade", cidade).append("cep", cep)
                .append("numero", numero).append("logradouro", logradouro).append("tipo", tipo).toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Endereco)) {
            return false;
        }
        Endereco other = (Endereco) obj;
        return new EqualsBuilder().append(this.getCep(), other.getCep()).append(this.getNumero(), other.getNumero()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.getCep()).append(this.getNumero()).toHashCode();
    }
    
    
}
