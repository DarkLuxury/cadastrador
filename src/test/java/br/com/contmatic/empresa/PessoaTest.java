package br.com.contmatic.empresa;

import org.junit.Test;

import static org.junit.Assert.*;

public class PessoaTest {

    @Test
    public void setIdade() {
        Pessoa pessoa = new Pessoa("test");
        pessoa.setIdade(99);

        assertEquals(99, pessoa.getIdade());
    }

    @Test
    public void setCpf() {
        Pessoa pessoa = new Pessoa("test");
        pessoa.setCpf("65555555555");

        assertEquals("65555555555", pessoa.getCpf());
    }
}