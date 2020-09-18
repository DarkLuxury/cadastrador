package br.com.contmatic.empresa;

import br.com.caelum.stella.bean.validation.CNPJ;
import br.com.caelum.stella.bean.validation.CPF;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.Length;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Pessoa {
    @NotEmpty
    @Size(min = 2, max = 32, message = "Nome deve conter de 2 a 32 caracteres")
    @Pattern(regexp = "[a-zA-Z]+")
    private String nome;
    @CPF
    private String cpf;
    @Size(max = 9)
    @Pattern(regexp = "[0-9]{8}[0-9xX]")
    private String rg;
    @Email
    private String email;
    @Pattern(regexp = "[a-zA-Z]{2}")
    private String ufNasc;
    @Size(min = 2, max = 32, message = "Nome da cidade deve conter de 2 a 32 caracteres")
    @Pattern(regexp = "[a-zA-Z\\s]+")
    private String cidadeNasc;
    @Size(min = 2, max = 32, message = "Nome da mãe deve conter de 2 a 32 caracteres")
    @Pattern(regexp = "[a-zA-Z\\s]+")
    private String nomeMae;
    @Length(max = 1)
    @Pattern(regexp = "[MFmf]")
    private String sexo;
    @Min(1)
    @Max(150)
    private int idade;
    @Valid
    private Endereco endereco;
    @Valid
    private Telefone telefone;

    private Set<Telefone> telefones;

    public Pessoa() {
    };

    public Pessoa(String nome, String cpf, String ufNasc, String cidadeNasc, String nomeMae, String rg, String sexo, int idade, Endereco endereco, String email, Telefone telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.idade = idade;
        this.endereco = endereco;
        this.rg = rg;
        this.ufNasc = ufNasc;
        this.cidadeNasc = cidadeNasc;
        this.nomeMae = nomeMae;
        this.email = email;
        this.telefone = telefone;
        Set<Telefone> telefones = new HashSet<Telefone>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getUfNasc() {
        return ufNasc;
    }

    public void setUfNasc(String ufNasc) {
        this.ufNasc = ufNasc;
    }

    public String getCidadeNasc() {
        return cidadeNasc;
    }

    public void setCidadeNasc(String cidadeNasc) {
        this.cidadeNasc = cidadeNasc;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Set<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(Set<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("nome", nome).append("cpf", cpf).append("rg", rg).append("ufNasc", ufNasc).append("cidadeNasc", cidadeNasc).append("nomeMae", nomeMae)
                .append("sexo", sexo).append("idade", idade).append("endereco", endereco).append("email", email).append("telefone", telefone).append("telefones", telefones).toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) obj;
        return new EqualsBuilder().append(this.getCpf(), other.getCpf()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.getCpf()).toHashCode();
    }
}
