package br.com.contmatic.empresa;

import br.com.contmatic.empresa.endereco.Endereco;
import br.com.contmatic.empresa.util.Validation;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import org.junit.*;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;


public class PessoaTest {

    private Endereco endereco;
    private Telefone telefone;
    private Pessoa pessoa;
    private Validation validation;

    @Before
    public void inicializacao() {
        FixtureFactoryLoader.loadTemplates("br.com.contmatic.empresa");
        validation = new Validation();
        endereco = Fixture.from(Endereco.class).gimme("endereco");
        telefone = Fixture.from(Telefone.class).gimme("telefone");
        pessoa = Fixture.from(Pessoa.class).gimme("pessoa");
    }

    @After
    public void finalizacao() {
        endereco = null;
        pessoa = null;
        validation = null;
    }

    @Test
    public void deve_retornar_true_para_a_validacao() {
        assertTrue(validation.validate(pessoa));
    }

    @Test
    public void deve_retornar_constructor_esperado() {
        Pessoa pes = new Pessoa("luiz", "53962962590", "sp", "São Paulo", "Roberta", "561272359", "M", 21, endereco, "luizhenrique@gmail.com", telefone);
        assertThat(pes, is(pessoa));
    }

    @Test
    public void deve_retornar_nome_esperado() {
        String nome = "testee";
        pessoa.setNome(nome);
        assertThat(nome, is(pessoa.getNome()));
    }

    @Test
    public void deve_retornar_rg_esperado() {
        String rg = "testee";
        pessoa.setRg(rg);
        assertThat(rg, is(pessoa.getRg()));
    }

    @Test
    public void deve_retornar_cpf_esperado() {
        String cpf = "testee";
        pessoa.setCpf(cpf);
        assertThat(cpf, is(pessoa.getCpf()));
    }

    @Test
    public void deve_retornar_ufnasc_esperado() {
        String ufnasc = "testee";
        pessoa.setUfNasc(ufnasc);
        assertThat(ufnasc, is(pessoa.getUfNasc()));
    }

    @Test
    public void deve_retornar_cidadenasc_esperado() {
        String cidadenasc = "testee";
        pessoa.setCidadeNasc(cidadenasc);
        assertThat(cidadenasc, is(pessoa.getCidadeNasc()));
    }

    @Test
    public void deve_retornar_nomemae_esperado() {
        String nomeMae = "testee";
        pessoa.setNomeMae(nomeMae);
        assertThat(nomeMae, is(pessoa.getNomeMae()));
    }

    @Test
    public void deve_retornar_sexo_esperado() {
        String sexo = "testee";
        pessoa.setSexo(sexo);
        assertThat(sexo, is(pessoa.getSexo()));
    }

    @Test
    public void deve_retornar_idade_esperada() {
        int idade = 99;
        pessoa.setIdade(idade);
        assertThat(idade, is(pessoa.getIdade()));
    }

    @Test
    public void deve_retornar_endereco_esperado() {
        pessoa.setEndereco(endereco);
        assertThat(endereco, is(pessoa.getEndereco()));
    }

    @Test
    public void deve_retornar_email_esperado() {
        String email = "luiz@gmail.com";
        pessoa.setEmail(email);
        assertThat(email, is(pessoa.getEmail()));
    }

    @Test
    public void deve_retornar_telefone_esperado() {
        pessoa.setTelefone(telefone);
        assertThat(telefone, is(pessoa.getTelefone()));
    }

    @Test
    public void deve_retornar_lista_telefone_esperada() {
        Set<Telefone> telefones = new HashSet<Telefone>();
        telefones.add(telefone);
        pessoa.setTelefones(telefones);
        assertThat(telefones, is(pessoa.getTelefones()));
    }

    @Test
    public void deve_retornar_verdadeiro_para_o_metodo_equals() {
        assertThat(pessoa.equals(pessoa), is(true));
    }

    @Test
    public void deve_retornar_verdadeiro_para_o_metodo_hashcode() {
        assertThat(pessoa.hashCode(), is(pessoa.hashCode()));
    }

    @Test
    public void deve_retornar_tostring_diferente_null() {
        String tostring = pessoa.toString();
        assertNotEquals(tostring, null);
    }
}
