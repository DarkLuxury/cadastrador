package br.com.contmatic.empresa;

import java.util.Objects;

public class Empresa {
    private String cnpj;
    private String razaoSocial, tamanho;
    private String funcionario;
    StringBuffer funcionarios = new StringBuffer();

    private String endereco;

    public Empresa(String cnpj){
        this.cnpj = cnpj;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setEndereco(String rua, int numero, String cidadeComUF, String cep, String pais){
        Endereco local = new Endereco(cep);
        local.setLocal(rua, numero, cidadeComUF, pais);
        endereco = local.toString();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setFuncionario(String nome, String cpf, int idade){
        Pessoa pessoa = new Pessoa(nome);
        pessoa.setCpf(cpf);
        pessoa.setIdade(idade);
        funcionario = pessoa.toString();
        funcionarios.append(funcionario);
    }

    public String getFuncionario() {
        return funcionario;
    }

    @Override
    public String toString() {
        return "Empresa: " + razaoSocial + " - " + cnpj + "\n" +
                "Endereço: " + endereco + "\n" +
                "Tamanho: " + tamanho + "\n" +
                "Funcionarios: \n" + funcionarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return cnpj.equals(empresa.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj);
    }
}
