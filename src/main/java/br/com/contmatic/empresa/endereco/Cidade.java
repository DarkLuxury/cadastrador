package br.com.contmatic.empresa.endereco;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Cidade {

    @Size(min = 2, max = 32)
    @Pattern(regexp = "[a-zA-Z\\s]+")
    private String cidade;

    @NotNull
    private Uf uf;

    public Cidade() {
    }

    public Cidade(String cidade, Uf uf) {
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Cidade cidade1 = (Cidade) o;

        return new EqualsBuilder().append(cidade, cidade1.cidade).append(uf, cidade1.uf).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cidade).append(uf).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cidade", cidade).append("uf", uf).toString();
    }
}
