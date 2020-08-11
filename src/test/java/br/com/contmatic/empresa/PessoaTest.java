package br.com.contmatic.empresa;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PessoaTest {

    @Test
    public void assertThatIdadeEqualsExpected() {
        Pessoa pessoa = new Pessoa("test");
        pessoa.setIdade(99);

        assertEquals(99, pessoa.getIdade());
    }

    @Test
    public void assertThatCpfEqualsExpected() {
        Pessoa pessoa = new Pessoa("test");
        pessoa.setCpf("65555555555");

        assertEquals("65555555555", pessoa.getCpf());
    }

    @Test
    public void equalsMethodTest(){
        String nome = "luiz";
        Pessoa pessoa = new Pessoa(nome);
        Pessoa pessoa1 = pessoa;

        assertThat(pessoa.equals(pessoa1), is(true));
    }
}