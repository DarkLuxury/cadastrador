package br.com.contmatic.empresa;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.Valid;
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
    @Valid
    private Endereco endereco;
    @NotNull
    private List<Pessoa> funcionarios;
    @Min(1)
    private double valuation;
    @Pattern(regexp = "[a-zA-Z]+")
    private String titularidadeCapital;
    @NotNull
    private Boolean capitalAberto;
    @Pattern(regexp = "[a-zA-Z]+")
    private String setor;
    @Future
    private DateTime dataCadastro;

    private Telefone telefone;
    private Set<Telefone> telefones;
    private Set<Endereco> enderecos;

    @Null
    private String nula;

    public Empresa() {
    };

    public Empresa(String cnpj, String razaoSocial, String tamanho, Endereco endereco, String nomeFantasia, double valuation, String titularidadeCapital, Boolean capitalAberto, String setor, String site) {
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
        this.site = site;
        this.dataCadastro = new DateTime();
        enderecos = new HashSet<Endereco>();
        telefones = new HashSet<Telefone>();
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
                .append("endereco", endereco).append("funcionarios", funcionarios).append("valuation", valuation).append("titularidadeCapital", titularidadeCapital)
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
