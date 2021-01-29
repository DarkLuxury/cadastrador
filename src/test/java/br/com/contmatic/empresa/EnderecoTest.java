package br.com.contmatic.empresa;

import br.com.contmatic.empresa.endereco.Cidade;
import br.com.contmatic.empresa.endereco.Endereco;
import br.com.contmatic.empresa.endereco.Uf;
import org.joda.time.DateTime;
import org.junit.*;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EnderecoTest {

    public Endereco endereco;

    public Uf uf;

    public Cidade cidade;

    @Before
    public void inicializacao() {
        endereco = new Endereco("03315000", 215, "luiz");
        uf = new Uf("sp", "Brasil");
        cidade = new Cidade("são paulo", uf);
    }

    @Test
    public void deve_retornar_cidade_esperada() {
        endereco.setCidade(cidade);
        assertThat(cidade, is(endereco.getCidade()));
    }

    @Test
    public void deve_retornar_cep_esperado() {
        String cep = "07075180";
        endereco.setCep(cep);
        assertThat(cep, is(endereco.getCep()));
    }

    @Test
    public void deve_retornar_numero_esperado() {
        Integer numero = 128;
        endereco.setNumero(numero);
        assertThat(numero, is(endereco.getNumero()));
    }

    @Test
    public void deve_retornar_logradouro_esperado() {
        String logradouro = "rua do teste";
        endereco.setLogradouro(logradouro);
        assertThat(logradouro, is(endereco.getLogradouro()));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void deve_retornar_index_out_of_bounds_exception() {
        new ArrayList<Object>().get(0);
    }

    @Test
    public void deve_retornar_usuariocriador_esperado() {
        String usuarioCriador = "luiz";
        endereco.setUsuarioCriador(usuarioCriador);
        assertThat(usuarioCriador, is(endereco.getUsuarioCriador()));
    }

    @Test
    public void deve_retornar_data_criacao_esperada() {
        DateTime data = new DateTime();
        endereco.setDataCriacao(data);
        assertThat(data, is(endereco.getDataCriação()));
    }

    @Test
    public void deve_retornar_verdadeiro_para_o_metodo_equals() {
        Endereco endereco1 = new Endereco("03315000", 215, "luiz");
        assertThat(endereco.equals(endereco1), is(true));
        endereco1 = new Endereco("03315000", 218, "luiz");
        assertThat(endereco.equals(endereco1), is(false));
        endereco1 = null;
        assertThat(endereco.equals(endereco1), is(false));
        endereco1 = endereco;
        assertThat(endereco.equals(endereco1), is(true));
    }

    @Test
    public void deve_retornar_verdadeiro_para_o_metodo_hashcode() {
        Endereco endereco1 = new Endereco("03315000", 215, "luiz");
        assertThat(endereco.hashCode(), is(endereco1.hashCode()));
    }

    @Test
    public void deve_retornar_tostring_diferente_null() {
        String tostring = endereco.toString();
        assertNotEquals(tostring, null);
    }


}
