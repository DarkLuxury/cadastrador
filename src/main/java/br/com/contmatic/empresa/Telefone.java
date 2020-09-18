package br.com.contmatic.empresa;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Telefone {
    @Size(min = 3, max = 5)
    @Pattern(regexp = "[+][0-9]+")
    private String ddi;
    @Size(min = 2, max = 3)
    @Pattern(regexp = "[0-9]+")
    private String ddd;
    @Size(min = 8, max = 9)
    @Pattern(regexp = "[0-9]+")
    private String numero;
    @NotNull
    private TipoTelefoneType tipo;

    public Telefone(){
    };

    public Telefone(String ddi, String ddd, String numero, TipoTelefoneType tipo) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public TipoTelefoneType getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefoneType tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ddi", ddi).append("ddd", ddd).append("numero", numero).append("tipo", tipo).toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Telefone)) {
            return false;
        }

        Telefone telefone = (Telefone) o;
        return new EqualsBuilder().append(numero, telefone.numero).append(ddi, telefone.ddi).append(ddd, telefone.ddd).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(numero).append(ddi).append(ddd).toHashCode();
    }
}
