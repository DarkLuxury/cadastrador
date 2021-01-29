package br.com.contmatic.empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa {
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String tamanho;
    private Endereco endereco;
    private List <Pessoa> funcionarios;
    private double valuation;
    private String titularidadeCapital;
    private Boolean capitalAberto;
    private String setor;

    public Empresa(String cnpj, String razaoSocial, String tamanho, Endereco endereco, String nomeFantasia, double valuation, String titularidadeCapital, Boolean capitalAberto, String setor){
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.tamanho = tamanho;
        this.endereco = endereco;
        this.nomeFantasia = nomeFantasia;
        this.valuation = valuation;
        this.titularidadeCapital = titularidadeCapital;
        this.capitalAberto = capitalAberto;
        this.setor = setor;

        this.funcionarios = new ArrayList<>();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getValuation() {
        return valuation;
    }

    public void setValuation(double valuation) {
        this.valuation = valuation;
    }

    public String getTitularidadeCapital() {
        return titularidadeCapital;
    }

    public void setTitularidadeCapital(String titularidadeCapital) {
        this.titularidadeCapital = titularidadeCapital;
    }

    public Boolean getCapitalAberto() {
        return capitalAberto;
    }

    public void setCapitalAberto(Boolean capitalAberto) {
        this.capitalAberto = capitalAberto;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public List<Pessoa> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Pessoa> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override public String toString() {
        return "Empresa{" + "cnpj='" + cnpj + '\'' + ", razaoSocial='" + razaoSocial + '\'' + ", nomeFantasia='" + nomeFantasia + '\'' + ", tamanho='" + tamanho + '\'' + ", endereco=" + endereco +
                ", funcionarios=" + funcionarios + ", valuation=" + valuation + ", titularidadeCapital='" + titularidadeCapital + '\'' + ", capitalAberto=" + capitalAberto + ", setor='" + setor +
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
