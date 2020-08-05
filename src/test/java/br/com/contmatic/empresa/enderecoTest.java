package br.com.contmatic.empresa;

import org.junit.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

class EnderecoTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test (timeout = 100)
    public void setLocal() {
        Endereco endereco = new Endereco("03315000");
        endereco.setLocal("Rua Padre Estevão Pernet", 215, "São Paulo - SP", "Brasil");
        assertThat("Rua Padre Estevão Pernet, 215 - São Paulo - SP, 03315000/Brasil", is(endereco.toString()));

    }

}