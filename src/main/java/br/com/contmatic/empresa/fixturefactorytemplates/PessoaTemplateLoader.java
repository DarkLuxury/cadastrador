package br.com.contmatic.empresa.fixturefactorytemplates;

import br.com.contmatic.empresa.Pessoa;
import br.com.contmatic.empresa.Telefone;
import br.com.contmatic.empresa.endereco.Endereco;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class PessoaTemplateLoader implements TemplateLoader {

    @Override public void load() {
        Fixture.of(Pessoa.class).addTemplate("pessoa", new Rule(){{
            add("nome", "luiz");
            add("email", "luizhenrique@gmail.com");
            add("cpf", "53962962590");
            add("rg", "561272359");
            add("ufNasc", "sp");
            add("cidadeNasc", "Sao Paulo");
            add("nomeMae", "Roberta");
            add("sexo", "M");
            add("idade", 21);
            add("endereco", one(Endereco.class, "endereco"));
            add("telefone", one(Telefone.class, "telefone"));
        }});

        Fixture.of(Pessoa.class).addTemplate("pessoa1", new Rule(){{
            add("nome", "luiz1");
            add("cpf", "53962962590");
            add("rg", "5612723591");
            add("ufNasc", "sp1");
            add("cidadeNasc", "Sao Paulo1");
            add("nomeMae", "Roberta1");
            add("sexo", "M1");
            add("idade", 211);
            add("endereco", one(Endereco.class, "endereco"));
            add("telefone", one(Telefone.class, "telefone"));
        }});
    }
}
