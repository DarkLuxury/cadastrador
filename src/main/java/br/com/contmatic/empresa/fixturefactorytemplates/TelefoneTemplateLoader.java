package br.com.contmatic.empresa.fixturefactorytemplates;

import br.com.contmatic.empresa.Telefone;
import br.com.contmatic.empresa.TipoTelefoneType;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class TelefoneTemplateLoader implements TemplateLoader {

    @Override public void load() {
        Fixture.of(Telefone.class).addTemplate("telefone", new Rule(){{
            add("ddi", "+55");
            add("ddd", "11");
            add("numero", "930493749");
            add("tipo", TipoTelefoneType.FIXO);
        }});

        Fixture.of(Telefone.class).addTemplate("telefone1", new Rule(){{
            add("ddi", "+55");
            add("ddd", "11");
            add("numero", "930493749");
            add("tipo", TipoTelefoneType.MOVEL);
        }});
    }
}
