package br.com.contmatic.empresa;

import org.junit.*;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EnderecoTest {

    public Endereco endereco;

    @Before
    public void inicializacao() {
        endereco = new Endereco("Rua Padre Estevão Pernet", "215", "São Paulo", "SP", "03315-000", "Brasil");
    }

    @After
    public void finalizacao() {
        endereco = null;
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

    @Test(expected = IndexOutOfBoundsException.class)
    public void deve_retornar_index_out_of_bounds_exception() {
        new ArrayList<Object>().get(0);
    }

    @Test
    public void deve_retornar_verdadeiro_para_o_metodo_equals() {
        Endereco endereco1 = new Endereco("Rua Padre", "215", "Salvador", "BA", "03315-000", "Italia");
        assertThat(endereco.equals(endereco1), is(true));
        endereco1 = null;
        assertThat(endereco.equals(endereco1), is(false));
        endereco1 = endereco;
        assertThat(endereco.equals(endereco1), is(true));
    }

    @Test
    public void deve_retornar_verdadeiro_para_o_metodo_hashcode() {
        Endereco endereco1 = new Endereco("Rua Padre", "215", "Salvador", "BA", "03315-000", "Italia");
        assertThat(endereco.hashCode(), is(endereco1.hashCode()));
    }

    @Test
    public void deve_retornar_tostring_diferente_null() {
        String tostring = endereco.toString();
        assertNotEquals(tostring, null);
    }


}
