package br.com.contmatic.empresa;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmpresaTest {

    @Test
    public void setFuncionario() {
        Empresa empresa = new Empresa("0000");
        empresa.setFuncionario("Luiz", "65555555555", 17);

        boolean naoHaFuncionario = empresa.getFuncionario() == null;
        assertThat(naoHaFuncionario, is(false));

    }

    @Test
    public void setEndereco() {
        Empresa empresa = new Empresa("0000");
        empresa.setEndereco("Rua Padre Estevão Pernet", 215, "São Paulo - SP", "03315000",  "Brasil");

        boolean naoHaEndereco = empresa.getEndereco() == null;
        assertThat(naoHaEndereco, is(false));

    }

    @Ignore ("Teste desnecessário")
    @Test
    public void setRazaoSocial() {
        Empresa empresa = new Empresa("0000");
        empresa.setRazaoSocial("test");

        assertThat(empresa.getRazaoSocial(), is("test"));
    }
}