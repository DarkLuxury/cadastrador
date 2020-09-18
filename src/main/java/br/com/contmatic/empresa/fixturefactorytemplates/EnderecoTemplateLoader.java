package br.com.contmatic.empresa.fixturefactorytemplates;

import br.com.contmatic.empresa.Endereco;
import br.com.contmatic.empresa.TipoEnderecoType;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class EnderecoTemplateLoader implements TemplateLoader {
    @Override
    public void load() {
        Fixture.of(Endereco.class).addTemplate("endereco", new Rule(){{
            add("pais", "Brasil");
            add("uf", "SP");
            add("cidade", "Sao Paulo");
            add("cep", "07075170");
            add("numero", "129");
            add("logradouro", "Rua dos anjos");
            add("tipo", TipoEnderecoType.CASA);
        }});

        Fixture.of(Endereco.class).addTemplate("endereco1", new Rule(){{
            add("pais", "Brasil1");
            add("uf", "SP1");
            add("cidade", "Sao Paulo");
            add("cep", "07075170");
            add("numero", "129");
            add("logradouro", "Rua dos anjos1");
            add("tipo", TipoEnderecoType.CASA);
        }});
    }
}
