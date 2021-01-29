package br.com.contmatic.empresa.endereco;

import static br.com.contmatic.util.Validator.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Uf {

    private String uf;

    private String pais;

    public Uf(String uf, String pais) {
        this.pais = pais;
        this.uf = uf;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        naoNulo(pais, "pais");
        tamanhoStringMinMax(pais, "pais", 2, 32);
        stringContemSomenteLetrasEspacos(pais, "pais");
        this.pais = pais;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        naoNulo(uf, "uf");
        tamanhoStringIgual(uf, "uf", 2);
        stringContemSomenteLetras(uf, "uf");
        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Uf uf1 = (Uf) o;

        return new EqualsBuilder().append(uf, uf1.uf).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(uf).toHashCode();
    }
}
