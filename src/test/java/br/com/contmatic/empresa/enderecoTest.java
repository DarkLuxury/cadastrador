package br.com.contmatic.empresa;

import org.junit.*;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EnderecoTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test (timeout = 100)
    public void assertThatEnderecoEqualsExpected() {
        Endereco endereco = new Endereco("03315000");
        endereco.setLocal("Rua Padre Estevão Pernet", 215, "São Paulo - SP", "Brasil");
        assertThat("Rua Padre Estevão Pernet, 215 - São Paulo - SP, 03315000/Brasil", is(endereco.toString()));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void indexOutOfBoundsExceptionTest() {
        new ArrayList<Object>().get(0);
    }

    @Test
    public void equalsMethodTest(){
        String cep = "1234";
        Endereco endereco = new Endereco(cep);
        Endereco endereco1 = endereco;

        assertThat(endereco.equals(endereco1), is(true));
    }

}