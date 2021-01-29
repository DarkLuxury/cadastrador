package br.com.contmatic.empresa.endereco;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Uf {

    @Pattern(regexp = "[a-zA-Z]{2}")
    private String uf;

    @Size(min = 2, max = 32)
    @Pattern(regexp = "[a-zA-Z\\s]+")
    private String pais;

    public Uf(String uf, String pais) {
        this.pais = pais;
        this.uf = uf;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Uf uf1 = (Uf) o;

        return new EqualsBuilder().append(uf, uf1.uf).append(pais, uf1.pais).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(uf).append(pais).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("uf", uf).append("pais", pais).toString();
    }
}
