package br.com.contmatic.empresa;

import br.com.contmatic.empresa.endereco.Cidade;
import br.com.contmatic.empresa.endereco.Endereco;
import br.com.contmatic.empresa.endereco.Uf;
import br.com.contmatic.empresa.util.TipoEnderecoType;
import br.com.contmatic.empresa.util.Validation;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import org.junit.*;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EnderecoTest {

    private Uf uf;
    private Cidade cidade;
    private Endereco endereco;
    private Validation validation;
    private TipoEnderecoType tipo;

    @Before
    public void inicializacao() {
        FixtureFactoryLoader.loadTemplates("br.com.contmatic.empresa");
        validation = new Validation();
        tipo = TipoEnderecoType.CASA;
        uf = Fixture.from(Uf.class).gimme("uf");
        cidade = Fixture.from(Cidade.class).gimme("cidade");
        endereco = Fixture.from(Endereco.class).gimme("endereco");
    }

    @After
    public void finalizacao() {
        endereco = null;
        validation = null;
    }

    @Test
    public void deve_retornar_true_para_a_validacao() {
        assertTrue(validation.validate(endereco));
    }

    @Test
    public void deve_retornar_constructor_esperado() {
        Endereco end = new Endereco("07075170", 129, "Rua dos anjos", "luiz.csilva", Fixture.from(Cidade.class).gimme("cidade"), tipo);
        assertThat(end, is(endereco));
    }

    @Test (timeout = 100)
    public void deve_retornar_pais_esperado() {
        String pais = "teste";
        uf.setPais(pais);
        assertThat(pais, is(uf.getPais()));
    }

    @Test
    public void deve_retornar_uf_esperada() {
        String ufTeste = "teste";
        uf.setUf(ufTeste);
        assertThat(ufTeste, is(uf.getUf()));
    }

    @Test
    public void deve_retornar_cidade_esperada() {
        String cidadeTeste = "teste";
        cidade.setCidade(cidadeTeste);
        assertThat(cidadeTeste, is(cidade.getCidade()));
    }

    @Test
    public void deve_retornar_cep_esperado() {
        String cep = "teste";
        endereco.setCep(cep);
        assertThat(cep, is(endereco.getCep()));
    }

    @Test
    public void deve_retornar_numero_esperado() {
        Integer numero = 30;
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
        assertThat(endereco.equals(endereco), is(true));
    }

    @Test
    public void deve_retornar_verdadeiro_para_o_metodo_hashcode() {
        assertThat(endereco.hashCode(), is(endereco.hashCode()));
    }

    @Test
    public void deve_retornar_tostring_diferente_null() {
        String tostring = endereco.toString();
        assertNotEquals(tostring, null);
    }


}
