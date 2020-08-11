package br.com.contmatic.empresa;

import org.junit.*;
import org.junit.runners.MethodSorters;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmpresaTest {

    @Before
    public void setUp() throws Exception {
        Empresa empresa = new Empresa("0000");
        empresa.setRazaoSocial("test");

        assertThat(empresa.getRazaoSocial(), is("test"));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void assertThatFuncionarioEqualsExpected() {
        Empresa empresa = new Empresa("0000");
        empresa.setFuncionario("Luiz", "65555555555", 17);

        boolean naoHaFuncionario = empresa.getFuncionario() == null;
        assertThat(naoHaFuncionario, is(false));

    }

    @Test
    public void assertThatEnderecoEqualsExpected() {
        Empresa empresa = new Empresa("0000");
        empresa.setEndereco("Rua Padre Estevão Pernet", 215, "São Paulo - SP", "03315000",  "Brasil");

        boolean naoHaEndereco = empresa.getEndereco() == null;
        assertThat(naoHaEndereco, is(false));

    }

    @Test
    public void equalsMethodTest(){
        String cnpj = "1234";
        Empresa empresa = new Empresa(cnpj);
        Empresa empresa1 = empresa;

        assertThat(empresa.equals(empresa1), is(true));
    }

    @Ignore ("Teste desnecessário")
    @Test
    public void assertThatRazaoSocialEqualsExpected() {
        Empresa empresa = new Empresa("0000");
        empresa.setRazaoSocial("test");

        assertThat(empresa.getRazaoSocial(), is("test"));
    }
}