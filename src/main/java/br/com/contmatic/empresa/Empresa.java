package br.com.contmatic.empresa;

import static br.com.contmatic.Validator.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa {

    private String cnpj;

    private String razaoSocial;
    
    private String nomeFantasia;
    
    private String tamanho;

    private String titularidadeCapital;
    
    private Boolean capitalAberto;
    
    private String setor;

    private double valorEmpresa;

    private Endereco endereco;
    
    private List <Pessoa> funcionarios = new ArrayList<>();
    
    public Empresa(String cnpj) {
		setCnpj(cnpj);
	}

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        validarCnpj(cnpj);
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        naoNulo(this.razaoSocial, "razão social");
        tamanhoString(this.razaoSocial, "razão social", 2, 200);
        stringContemSomenteLetrasEspacos(this.razaoSocial, "razão social");
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        naoNulo(this.nomeFantasia, "nome fantasia");
        tamanhoString(this.nomeFantasia,"nome fantasia", 2, 200);
        stringContemSomenteLetrasEspacos(this.nomeFantasia, "nome fantasia");
        this.nomeFantasia = nomeFantasia;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        naoNulo(this.tamanho, "tamanho");
        tamanhoString(this.tamanho, "tamanho", 5, 7);
        stringContemSomenteLetras(this.tamanho, "tamanho");
        this.tamanho = tamanho;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        naoNulo(this.endereco, "endereço");
        this.endereco = endereco;
    }

    public double getValorEmpresa() {
        return valorEmpresa;
    }

    public void setValorEmpresa(double valorEmpresa) {
        naoNulo(this.valorEmpresa, "valuation");
        this.valorEmpresa = valorEmpresa;
    }

    public String getTitularidadeCapital() {
        return titularidadeCapital;
    }

    public void setTitularidadeCapital(String titularidadeCapital) {
        naoNulo(this.titularidadeCapital, "titularidade do capital");
        stringContemSomenteLetras(this.titularidadeCapital, "titularidade do capital");
        tamanhoString(this.titularidadeCapital, "titularidade do capital", 7, 7);
        this.titularidadeCapital = titularidadeCapital;
    }

    public Boolean getCapitalAberto() {
        return capitalAberto;
    }

    public void setCapitalAberto(Boolean capitalAberto) {
        naoNulo(this.capitalAberto, "capital aberto");
        this.capitalAberto = capitalAberto;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        naoNulo(this.setor, "setor");
        tamanhoString(this.setor, "setor", 8, 10);
        stringContemSomenteLetras(this.setor, "setor");
        this.setor = setor;
    }

    public List<Pessoa> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Pessoa> funcionarios) {
        naoNulo(this.funcionarios, "funcionarios");
        this.funcionarios = funcionarios;
    }

    @Override public String toString() {
        return "Empresa{" + "cnpj='" + cnpj + '\'' + ", razaoSocial='" + razaoSocial + '\'' + ", nomeFantasia='" + nomeFantasia + '\'' + ", tamanho='" + tamanho + '\'' + ", endereco=" + endereco +
                ", funcionarios=" + funcionarios + ", valuation=" + valorEmpresa + ", titularidadeCapital='" + titularidadeCapital + '\'' + ", capitalAberto=" + capitalAberto + ", setor='" + setor +
                '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Empresa empresa = (Empresa) o;
        return cnpj.equals(empresa.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj);
    }
}
