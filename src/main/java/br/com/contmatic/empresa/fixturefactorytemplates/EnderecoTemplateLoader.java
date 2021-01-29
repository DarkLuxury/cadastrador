package br.com.contmatic.empresa.fixturefactorytemplates;

import br.com.contmatic.empresa.endereco.Cidade;
import br.com.contmatic.empresa.endereco.Endereco;
import br.com.contmatic.empresa.endereco.Uf;
import br.com.contmatic.empresa.util.TipoEnderecoType;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class EnderecoTemplateLoader implements TemplateLoader {
    @Override
    public void load() {
        Fixture.of(Endereco.class).addTemplate("endereco", new Rule(){{
            add("cidade", one(Cidade.class, "cidade"));
            add("cep", "07075170");
            add("numero", 129);
            add("logradouro", "Rua dos anjos");
            add("usuarioCriador", "luiz c silva");
            add("tipo", TipoEnderecoType.CASA);
        }});

        Fixture.of(Endereco.class).addTemplate("endereco1", new Rule(){{
            add("cidade", one(Cidade.class, "cidade"));
            add("cep", "07075170");
            add("numero", 129);
            add("logradouro", "Rua dos anjos1");
            add("usuarioCriador", "luiz c silva");
            add("tipo", TipoEnderecoType.CASA);
        }});
    }
}
