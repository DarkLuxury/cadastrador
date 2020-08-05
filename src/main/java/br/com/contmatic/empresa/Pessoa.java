package br.com.contmatic.empresa;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;

    Pessoa(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome + "\n" +
                "Cpf: " + cpf + "\n" +
                "Idade: " + idade + "\n" +
                "====================================== \n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade &&
                nome.equals(pessoa.nome) &&
                Objects.equals(cpf, pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf.charAt(0));
    }

}
