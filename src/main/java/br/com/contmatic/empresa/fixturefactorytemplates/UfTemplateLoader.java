package br.com.contmatic.empresa.fixturefactorytemplates;

import br.com.contmatic.empresa.endereco.Uf;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class UfTemplateLoader implements TemplateLoader {
    @Override
    public void load() {
        Fixture.of(Uf.class).addTemplate("uf", new Rule(){{
            add("uf", "sp");
            add("pais", "Brasil");
        }});
    }
}
