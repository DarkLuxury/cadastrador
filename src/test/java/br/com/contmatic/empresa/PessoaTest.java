package br.com.contmatic.empresa;

import org.junit.*;
import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;


public class PessoaTest {

    private Endereco endereco;
    private Pessoa pessoa;

    @Before
    public void inicializacao() {
        endereco = new Endereco("Rua Padre Estevão Pernet", "215", "São Paulo", "SP", "03315-000", "Brasil");
        pessoa = new Pessoa("Teste", "teste", "teste", "teste", "teste", "teste", "teste", 99, endereco);
    }

    @After
    public void finalizacao() {
        endereco = null;
        pessoa = null;
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
    public void deve_retornar_verdadeiro_para_o_metodo_equals() {
        Pessoa pessoa1 = new Pessoa("Teste1", "teste", "teste1", "teste1", "teste1", "teste1", "teste1", 10, endereco);

        assertThat(pessoa.equals(pessoa1), is(true));
    }

    @Test
    public void deve_retornar_verdadeiro_para_o_metodo_hascode() {
        Pessoa pessoa1 = new Pessoa("Teste1", "teste", "teste1", "teste1", "teste1", "teste1", "teste1", 10, endereco);

        assertThat(pessoa.hashCode(), is(pessoa1.hashCode()));
    }

    @Test
    public void deve_retornar_tostring_diferente_null() {
        String tostring = pessoa.toString();

        assertNotEquals(tostring, null);
    }
}
