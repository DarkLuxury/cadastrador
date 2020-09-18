package br.com.contmatic.empresa;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import org.joda.time.DateTime;
import org.junit.*;
import org.junit.runners.MethodSorters;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmpresaTest {

    private Endereco endereco;
    private Empresa empresa;
    private Telefone telefone;
    private Empresa empresa1;
    private Pessoa pessoa;
    private List<Pessoa> funcionarios;
    private Validation validation;

    @Before
    public void inicializacao() {
        FixtureFactoryLoader.loadTemplates("br.com.contmatic.empresa");
        validation = new Validation();
        endereco = Fixture.from(Endereco.class).gimme("endereco");
        pessoa = Fixture.from(Pessoa.class).gimme("pessoa");
        telefone = Fixture.from(Telefone.class).gimme("telefone");
        empresa = Fixture.from(Empresa.class).gimme("empresa");
        empresa1 = Fixture.from(Empresa.class).gimme("empresa1");
    }

    @After
    public void finalizacao() {
        endereco = null;
        empresa = null;
        empresa1 = null;
        pessoa = null;
        validation = null;
    }

    @Test
    public void deve_retornar_true_para_a_validacao() {
        assertTrue(validation.validate(empresa));
    }

    @Test
    public void deve_retornar_constructor_esperado() {
        Empresa emp = new Empresa("58119371000177", "Softmatic phoenix", "medio/grande", endereco, "Contmatic phoenix", 12500000.0, "privado", false, "terciario", "www.contmatic.com.br");
        assertThat(emp, is(empresa));
    }

    @Test
    public void deve_retornar_cnpj_esperado() {
        String cnpj = "1234";
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
    public void deve_retornar_site_esperado() {
        String site = "teste.com";
        empresa.setSite(site);
        assertThat(site, is(empresa.getSite()));
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
        Endereco enderecoTeste = endereco;
        empresa.setEndereco(enderecoTeste);
        assertThat(enderecoTeste, is(empresa.getEndereco()));
    }

    @Test
    public void deve_retornar_valuation_esperada() {
        Double valuation = 1234.0;
        empresa.setValuation(valuation);
        assertThat(valuation, is(empresa.getValuation()));
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
    public void deve_retornar_data_cadastro_esperada() {
        DateTime data = new DateTime();
        empresa.setDataCadastro(data);
        assertThat(data, is(empresa.getDataCadastro()));
    }

    @Test
    public void deve_retornar_telefone_esperado() {
        empresa.setTelefone(telefone);
        assertThat(telefone, is(empresa.getTelefone()));
    }

    @Test
    public void deve_retornar_lista_telefone_esperada() {
        Set<Telefone> telefones = new HashSet<Telefone>();
        telefones.add(telefone);
        empresa.setTelefones(telefones);
        assertThat(telefones, is(empresa.getTelefones()));
    }

    @Test
    public void deve_retornar_lista_endereco_esperada() {
        Set<Endereco> enderecos = new HashSet<Endereco>();
        enderecos.add(endereco);
        empresa.setEnderecos(enderecos);
        assertThat(enderecos, is(empresa.getEnderecos()));
    }


    @Test
    public void deve_retornar_verdadeiro_para_o_metodo_equals() {
        assertThat(empresa.equals(empresa1), is(true));
        empresa1 = null;
        assertThat(empresa.equals(empresa1), is(false));
        empresa1 = empresa;
        assertThat(empresa.equals(empresa1), is(true));
    }

    @Test
    public void deve_retornar_verdadeiro_para_o_metodo_hashcode() {
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
