package br.com.contmatic.empresa;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import org.junit.*;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EnderecoTest {

    private Endereco endereco;
    private Endereco endereco1;
    private Validation validation;
    private TipoEnderecoType tipo = TipoEnderecoType.CASA;

    @Before
    public void inicializacao() {
        FixtureFactoryLoader.loadTemplates("br.com.contmatic.empresa");
        validation = new Validation();
        endereco = Fixture.from(Endereco.class).gimme("endereco");
        endereco1 = Fixture.from(Endereco.class).gimme("endereco1");
    }

    @After
    public void finalizacao() {
        endereco = null;
        endereco1 = null;
        validation = null;
    }

    @Test
    public void deve_retornar_true_para_a_validacao() {
        assertTrue(validation.validate(endereco));
    }

    @Test
    public void deve_retornar_constructor_esperado() {
        Endereco end = new Endereco("Rua dos anjos", "129", "São Paulo", "SP", "07075170", "Brasil", tipo);
        assertThat(end, is(endereco));
    }

    @Test (timeout = 100)
    public void deve_retornar_pais_esperado() {
        String pais = "teste";
        endereco.setPais(pais);
        assertThat(pais, is(endereco.getPais()));
    }

    @Test
    public void deve_retornar_uf_esperada() {
        String uf = "teste";
        endereco.setUf(uf);
        assertThat(uf, is(endereco.getUf()));
    }

    @Test
    public void deve_retornar_cidade_esperada() {
        String cidade = "teste";
        endereco.setCidade(cidade);
        assertThat(cidade, is(endereco.getCidade()));
    }

    @Test
    public void deve_retornar_cep_esperado() {
        String cep = "teste";
        endereco.setCep(cep);
        assertThat(cep, is(endereco.getCep()));
    }

    @Test
    public void deve_retornar_numero_esperado() {
        String numero = "teste";
        endereco.setNumero(numero);
        assertThat(numero, is(endereco.getNumero()));
    }

    @Test
    public void deve_retornar_logradouro_esperado() {
        String logradouro = "teste";
        endereco.setLogradouro(logradouro);
        assertThat(logradouro, is(endereco.getLogradouro()));
    }

    @Test
    public void deve_retornar_tipo_endereco_esperado() {
        TipoEnderecoType tipo = TipoEnderecoType.CASA;
        endereco.setTipo(tipo);
        assertThat(tipo, is(endereco.getTipo()));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void deve_retornar_index_out_of_bounds_exception() {
        new ArrayList<Object>().get(0);
    }

    @Test
    public void deve_retornar_verdadeiro_para_o_metodo_equals() {
        assertThat(endereco.equals(endereco1), is(true));
        endereco1 = null;
        assertThat(endereco.equals(endereco1), is(false));
        endereco1 = endereco;
        assertThat(endereco.equals(endereco1), is(true));
    }

    @Test
    public void deve_retornar_verdadeiro_para_o_metodo_hashcode() {
        assertThat(endereco.hashCode(), is(endereco1.hashCode()));
    }

    @Test
    public void deve_retornar_tostring_diferente_null() {
        String tostring = endereco.toString();
        assertNotEquals(tostring, null);
    }


}
