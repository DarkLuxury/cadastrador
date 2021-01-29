package br.com.contmatic.empresa;

import br.com.contmatic.empresa.endereco.Endereco;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.*;
import br.com.caelum.stella.bean.validation.*;
import org.hibernate.validator.constraints.URL;

import java.util.*;

import org.joda.time.*;

public class Empresa {

    @CNPJ
    private String cnpj;

    @URL
    private String site;

    @NotBlank
    @Pattern(regexp = "[a-zA-Z]+")
    private String razaoSocial;

    @NotBlank
    @Pattern(regexp = "[a-zA-Z\\s]+")
    private String nomeFantasia;

    @NotBlank
    @Pattern(regexp = "[a-zA-Z]+")
    private String tamanho;

    @Min(1)
    private double valuation;

    @Pattern(regexp = "[a-zA-Z]+")
    private String titularidadeCapital;

    @NotNull
    private Boolean capitalAberto;

    @Pattern(regexp = "[a-zA-Z]+")
    private String setor;

    @NotNull
    @Future
    private DateTime dataCadastro;

    @NotNull
    private Telefone telefone;

    @NotNull
    private Set<Telefone> telefones;

    @NotNull
    private Set<Endereco> enderecos;

    @NotNull
    private Set<Pessoa> funcionarios;

    @Null
    private String nula;

    public Empresa() {
        this.dataCadastro = new DateTime();
    }

    public Empresa(String cnpj, String razaoSocial, String tamanho, Set<Endereco> enderecos, String nomeFantasia, double valuation, String titularidadeCapital, Boolean capitalAberto, String setor, String site, Set<Pessoa> funcionarios) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.tamanho = tamanho;
        this.nomeFantasia = nomeFantasia;
        this.valuation = valuation;
        this.titularidadeCapital = titularidadeCapital;
        this.capitalAberto = capitalAberto;
        this.setor = setor;
        this.site = site;
        this.enderecos = enderecos;
        this.funcionarios = funcionarios;
        this.dataCadastro = new DateTime();
        this.telefones = new HashSet<Telefone>();
    }

    public Set<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Set<Endereco> enderecos) {
        this.enderecos = enderecos;
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

    public Set<Pessoa> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Set<Pessoa> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public DateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(DateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
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
    
    @Override public String toString() {
        return new ToStringBuilder(this).append("cnpj", cnpj).append("site", site).append("razaoSocial", razaoSocial).append("nomeFantasia", nomeFantasia).append("tamanho", tamanho)
                .append("funcionarios", funcionarios).append("valuation", valuation).append("titularidadeCapital", titularidadeCapital)
                .append("capitalAberto", capitalAberto).append("setor", setor).append("dataCadastro", dataCadastro).append("telefone", telefone).append("telefones", telefones)
                .append("enderecos", enderecos).toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) obj;
        return new EqualsBuilder().append(this.getCnpj(), other.getCnpj()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.getCnpj()).toHashCode();
    }
}
