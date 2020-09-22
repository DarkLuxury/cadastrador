package br.com.contmatic.empresa;

import br.com.contmatic.Validator;

import java.util.Objects;

import static br.com.contmatic.Validator.*;

public class Pessoa {
    private String nome;

    private String cpf;

    private String rg;

    private String ufNasc;

    private String cidadeNasc;

    private String nomeMae;

    private String sexo;

    private int idade;

    private Endereco endereco;

    private Validator validator = new Validator();

    public Pessoa(String cpf){
        setCpf(cpf);
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
        validarCpf(cpf);
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

    @Override public String toString() {
        return "Pessoa{" + "nome='" + nome + '\'' + ", cpf='" + cpf + '\'' + ", rg='" + rg + '\'' + ", ufNasc='" + ufNasc + '\'' + ", cidadeNasc='" + cidadeNasc + '\'' + ", nomeMae='" + nomeMae +
                '\'' + ", sexo='" + sexo + '\'' + ", idade=" + idade + ", endereco=" + endereco + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pessoa pessoa = (Pessoa) o;
        return cpf.equals(pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }


}
