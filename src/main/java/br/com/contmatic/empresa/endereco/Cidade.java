package br.com.contmatic.empresa.endereco;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import static br.com.contmatic.util.Validator.*;

public class Cidade {

    private String cidade;

    private Uf uf;

    public Cidade(String cidade, Uf uf) {
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        naoNulo(cidade, "cidade");
        tamanhoStringMinMax(cidade, "cidade", 2, 32);
        stringContemSomenteLetrasEspacos(cidade, "pais");
        this.cidade = cidade;
    }

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        naoNulo(uf, "uf");
        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Cidade cidade1 = (Cidade) o;

        return new EqualsBuilder().append(cidade, cidade1.cidade).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(cidade).toHashCode();
    }

    @Override
    public String toString() {
        return "Cidade{" + "cidade='" + cidade + '\'' + '}';
    }
}
