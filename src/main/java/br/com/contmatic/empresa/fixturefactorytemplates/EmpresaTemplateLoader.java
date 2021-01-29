package br.com.contmatic.empresa.fixturefactorytemplates;

import br.com.contmatic.empresa.Empresa;
import br.com.contmatic.empresa.Pessoa;
import br.com.contmatic.empresa.Telefone;
import br.com.contmatic.empresa.endereco.Endereco;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.function.AtomicFunction;
import br.com.six2six.fixturefactory.function.impl.AssociationFunctionImpl;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmpresaTemplateLoader implements TemplateLoader {
    @Override public void load() {
        List<Pessoa> funcionarios = new ArrayList<>();
        Set<Endereco> enderecos = new HashSet<Endereco>();

        Fixture.of(Empresa.class).addTemplate("empresa", new Rule(){{
            add("cnpj", "58119371000177");
            add("site", "http://www.contmatic.com.br");
            add("razaoSocial", "ltda");
            add("nomeFantasia", "Contmatic phoenix");
            add("tamanho", "medio");
            add("enderecos", enderecos);
            add("funcionarios", funcionarios);
            add("valuation", 12500000.0);
            add("titularidadeCapital", "privado");
            add("capitalAberto", false);
            add("setor", "terciario");
            add("telefone", one(Telefone.class, "telefone"));
        }});

        Fixture.of(Empresa.class).addTemplate("empresa1", new Rule(){{
            add("cnpj", "58119371000177");
            add("razaoSocial", "Softmatic phoenix1");
            add("nomeFantasia", "Contmatic phoenix1");
            add("tamanho", "medio/grande1");
            add("endereco", one(Endereco.class, "endereco"));
            add("funcionarios", funcionarios);
            add("valuation", 125000000.0);
            add("titularidadeCapital", "privado1");
            add("capitalAberto", true);
            add("setor", "terciario1");
            add("telefone", one(Telefone.class, "telefone"));
        }});
    }
}
