package br.com.contmatic.empresa.fixturefactorytemplates;

import br.com.contmatic.empresa.Telefone;
import br.com.contmatic.empresa.endereco.Cidade;
import br.com.contmatic.empresa.endereco.Endereco;
import br.com.contmatic.empresa.endereco.Uf;
import br.com.contmatic.empresa.util.TipoEnderecoType;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class CidadeTemplateLoader implements TemplateLoader {
    @Override
    public void load() {
        Fixture.of(Cidade.class).addTemplate("cidade", new Rule(){{
            add("cidade", "São Paulo");
            add("uf", one(Uf.class, "uf"));
        }});
    }
}
