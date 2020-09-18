package br.com.contmatic.empresa;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import org.junit.*;
import static org.junit.Assert.*;
public class TelefoneTest {

    Validation validation;
    Telefone telefone;

    @Before
    public void inicializacao() throws Exception {
        FixtureFactoryLoader.loadTemplates("br.com.contmatic.empresa");
        validation = new Validation();
        telefone = Fixture.from(Telefone.class).gimme("telefone");
    }

    @After
    public void finalizacao() throws Exception {
        validation = null;
    }

    @Test
    public void deve_retornar_true_para_a_validacao(){
        assertTrue(validation.validate(telefone));
    }

}
