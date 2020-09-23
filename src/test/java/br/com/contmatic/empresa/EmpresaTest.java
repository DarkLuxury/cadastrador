package br.com.contmatic.empresa;

import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmpresaTest {

    private Endereco endereco;
    private Empresa empresa;
    private Pessoa pessoa;
    private List<Pessoa> funcionarios;
    private List<Endereco> enderecos;

    @Before
    public void inicializacao() {
        endereco = new Endereco("03315000", 215);
        empresa = new Empresa("18688133000168");
        pessoa = new Pessoa("53558971000");
        funcionarios = new ArrayList<>();
        funcionarios.add(pessoa);
    }

    @After
    public void finalizacao() {
        endereco = null;
        empresa = null;
        pessoa = null;
        funcionarios = null;
    }

    @Test
    public void deve_retornar_cnpj_esperado() {
        String cnpj = "18688133000168";
        empresa.setCnpj(cnpj);
        assertThat(cnpj, is(empresa.getCnpj()));
    }

    @Test
    public void deve_retornar_razaosocial_esperada() {
        String razao = "1234";
        empresa.setRazaoSocial(razao);
        assertThat(razao, is(empresa.getRazaoSocial()));
    }

    @Test
    public void deve_retornar_nomefantasia_esperado() {
        String nomefantasia = "1234";
        empresa.setNomeFantasia(nomefantasia);
        assertThat(nomefantasia, is(empresa.getNomeFantasia()));
    }

    @Test
    public void deve_retornar_tamanho_esperado() {
        String tamanho = "1234";
        empresa.setTamanho(tamanho);
        assertThat(tamanho, is(empresa.getTamanho()));
    }

    @Test
    public void deve_retornar_endereco_esperado() {
        enderecos.add(endereco);
        empresa.setEnderecos(enderecos);
        assertThat(enderecos, is(empresa.getEnderecos()));
    }

    @Test
    public void deve_retornar_valuation_esperada() {
        Double valuation = 1234.0;
        empresa.setValorEmpresa(valuation);
        assertThat(valuation, is(empresa.getValorEmpresa()));
    }

    @Test
    public void deve_retornar_titularidadecapital_esperada() {
        String titularidade = "1234";
        empresa.setTitularidadeCapital(titularidade);
        assertThat(titularidade, is(empresa.getTitularidadeCapital()));
    }

    @Test
    public void deve_retornar_capitalaberto_esperado() {
        Boolean capitalAberto = true;
        empresa.setCapitalAberto(capitalAberto);
        assertThat(capitalAberto, is(empresa.getCapitalAberto()));
    }

    @Test
    public void deve_retornar_setor_esperado() {
        String setor = "1234";
        empresa.setSetor(setor);
        assertThat(setor, is(empresa.getSetor()));
    }

    @Test
    public void deve_retornar_funcionarios_esperado() {
        empresa.setFuncionarios(funcionarios);
        assertThat(funcionarios, is(empresa.getFuncionarios()));
    }


    @Test
    public void deve_retornar_verdadeiro_para_o_metodo_equals() {
        Empresa empresa1 = new Empresa("18688133000168");
        assertThat(empresa.equals(empresa1), is(true));
        empresa1 = null;
        assertThat(empresa.equals(empresa1), is(false));
        empresa1 = empresa;
        assertThat(empresa.equals(empresa1), is(true));
    }

    @Test
    public void deve_retornar_verdadeiro_para_o_metodo_hascode() {
        Empresa empresa1 = new Empresa("18688133000168");
        assertThat(empresa.hashCode(), is(empresa1.hashCode()));
    }

    @Test
    public void deve_retornar_tostring_diferente_null() {
        String tostring = empresa.toString();
        assertNotEquals(tostring, null);
    }

    @Ignore ("Teste desnecessário")
    @Test
    public void deve_retornar_razaosocial_declarada() {
        empresa.setRazaoSocial("test");
        assertThat(empresa.getRazaoSocial(), is("test"));
    }
}
