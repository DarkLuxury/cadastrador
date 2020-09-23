package br.com.contmatic.empresa;

import static br.com.contmatic.util.Validator.*;
import static br.com.contmatic.util.CnpjValidator.*;

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

    private List <Endereco> enderecos = new ArrayList<>();

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
        naoNulo(razaoSocial, "razão social");
        tamanhoStringMinMax(razaoSocial, "razão social", 2, 200);
        stringContemSomenteLetrasEspacos(razaoSocial, "razão social");
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        naoNulo(nomeFantasia, "nome fantasia");
        tamanhoStringMinMax(nomeFantasia,"nome fantasia", 2, 200);
        stringContemSomenteLetrasEspacos(nomeFantasia, "nome fantasia");
        this.nomeFantasia = nomeFantasia;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        naoNulo(tamanho, "tamanho");
        tamanhoStringMinMax(tamanho, "tamanho", 5, 7);
        stringContemSomenteLetras(tamanho, "tamanho");
        this.tamanho = tamanho;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        naoNulo(enderecos, "enderecos");
        tamanhoListaMin(enderecos, "enderecos", 1);
        this.enderecos = enderecos;
    }

    public double getValorEmpresa() {
        return valorEmpresa;
    }

    public void setValorEmpresa(double valorEmpresa) {
        this.valorEmpresa = valorEmpresa;
    }

    public String getTitularidadeCapital() {
        return titularidadeCapital;
    }

    public void setTitularidadeCapital(String titularidadeCapital) {
        naoNulo(titularidadeCapital, "titularidade do capital");
        stringContemSomenteLetras(titularidadeCapital, "titularidade do capital");
        tamanhoStringIgual(titularidadeCapital, "titularidade do capital", 7);
        this.titularidadeCapital = titularidadeCapital;
    }

    public Boolean getCapitalAberto() {
        return capitalAberto;
    }

    public void setCapitalAberto(Boolean capitalAberto) {
        naoNulo(capitalAberto, "capital aberto");
        this.capitalAberto = capitalAberto;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        naoNulo(setor, "setor");
        tamanhoStringMinMax(setor, "setor", 8, 10);
        stringContemSomenteLetras(setor, "setor");
        this.setor = setor;
    }

    public List<Pessoa> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Pessoa> funcionarios) {
        naoNulo(funcionarios, "funcionarios");
        tamanhoListaMin(funcionarios, "funcionarios", 1);
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "Empresa{" + "cnpj='" + cnpj + '\'' + ", razaoSocial='" + razaoSocial + '\'' + ", nomeFantasia='" + nomeFantasia + '\'' + ", tamanho='" + tamanho + '\'' + ", enderecos=" + enderecos +
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
