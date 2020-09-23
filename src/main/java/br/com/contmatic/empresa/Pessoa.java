package br.com.contmatic.empresa;

import static br.com.contmatic.util.Validator.*;
import static br.com.contmatic.util.CpfValidator.*;

import java.util.Objects;

public class Pessoa {

    private String nome;

    private String cpf;

    private String rg;

    private String ufNasc;

    private String cidadeNasc;

    private String nomeMae;

    private String sexo;

    private Integer idade;

    private Endereco endereco;

    public Pessoa(String cpf){
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        naoNulo(this.nome, "nome");
        tamanhoStringMinMax(this.nome, "nome", 2, 32);
        stringContemSomenteLetrasEspacos(this.nome, "nome");
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
        naoNulo(this.rg, "rg");
        stringContemSomenteNumeros(this.rg, "rg");
        tamanhoStringIgual(this.rg, "rg", 9);
        this.rg = rg;
    }

    public String getUfNasc() {
        return ufNasc;
    }

    public void setUfNasc(String ufNasc) {
        naoNulo(this.rg, "rg");
        stringContemSomenteLetras(this.ufNasc, "uf de nascimento");
        tamanhoStringIgual(this.ufNasc, "uf de nascimento", 2);
        this.ufNasc = ufNasc;
    }

    public String getCidadeNasc() {
        return cidadeNasc;
    }

    public void setCidadeNasc(String cidadeNasc) {
        naoNulo(this.cidadeNasc, "cidade de nascimento");
        stringContemSomenteLetrasEspacos(this.cidadeNasc, "cidade de nascimento");
        tamanhoStringMinMax(this.cidadeNasc, "cidade de nascimento", 2, 32);
        this.cidadeNasc = cidadeNasc;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        naoNulo(this.nomeMae, "nome da mãe");
        stringContemSomenteLetrasEspacos(this.nomeMae, "nome da mãe");
        tamanhoStringMinMax(this.nomeMae, "nome da mãe", 2, 32);
        this.nomeMae = nomeMae;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        naoNulo(this.sexo, "sexo");
        stringContemSomenteLetras(this.sexo, "sexo");
        tamanhoStringIgual(this.sexo, "sexo", 1);
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        naoNulo(this.idade, "idade");
        integerTamanhoMaxMin(this.idade, 1, 150);
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        naoNulo(this.endereco, "endereco");
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
